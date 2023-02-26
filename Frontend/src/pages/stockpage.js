// * Copyright (c) 2022 All Rights Reserved
// * Title: Time Travel Trading
// * Authors: Scott Zastrow, Nichole Davidson, Alexander Bennett

import BaseClass from "../util/baseClass";
import DataStore from "../util/DataStore";
import StockClient from "../api/stockClient";
import ExampleClient from "../api/exampleClient";


class StockPage extends BaseClass{
    constructor() {
        super();
        this.bindClassMethods(['onGet', 'renderStock', 'generateTable', 'addUser', 'deleteUser'], this);
        this.dataStore = new DataStore();
    }
    async mount() {
        document.getElementById('form').addEventListener('submit', this.addUser);
        document.getElementById('sendWeather').addEventListener('click', this.onGet);
        document.getElementById('deleteUser').addEventListener('submit', this.deleteUser);
        this.client = new StockClient();

        this.dataStore.addChangeListener(this.renderStock)
    }
    async renderStock(){
        let resultArea = document.getElementById("stockresults");

        const data = this.dataStore.get("user");


        if (data){
        let table = document.querySelector("table");
        this.generateTable(table, Object.keys(data), Object.values(data));
        resultArea.innerHTML = data.conditionDesc;
        }
        else {
            resultArea.innerHTML = "Searching...";
        }
    }
    async generateTable(table, headers, data){
        let thead = document.createElement('thead');
        let tbody = document.createElement('tbody');
        table.appendChild(thead);
        table.appendChild(tbody);
        let headRow = document.createElement('tr');

        for (let header of headers){
            let head = document.createElement('th');
            head.innerHTML = header;
            headRow.appendChild(head);
        }

        thead.appendChild(headRow);

        let bodyRow = document.createElement('tr');

        for (let value of data){
            let bodyData = document.createElement('td');
            console.log(value);
            bodyData.innerHTML = value;
            bodyRow.appendChild(bodyData);
        }
        tbody.appendChild(bodyRow);

    }

    async addUser(event){
        event.preventDefault();

        let phoneNumber = document.getElementById("phoneNumber").value;
        let location = document.getElementById("location").value;
        let carrier = document.getElementById("carrier").value;

        const user = {
                phoneNumber: phoneNumber,
                location: location,
                carrier: carrier
                };
        this.dataStore.set("user", null);
        let result = await this.client.addUser(user);
        this.dataStore.set("user", result);

        if (result) {
            this.showMessage(`POST ${result.name}!`)
        } else {
            this.errorHandler("Error doing POST!  Try again...");
        }
    }
    async onGet(event){
        event.preventDefault();

        this.dataStore.set("weather", null);
        let result = await this.client.getWeather( this.errorHandler);
        this.dataStore.set("weather", result);
        console.log(result);

        if (result) {
            this.showMessage(`Got ${result.name}!`)
        } else {
            this.errorHandler("Error doing GET!  Try again...");
        }
    }

    async deleteUser(event){
        event.preventDefault();
        let phoneNumber = document.getElementById("deleteNumber").value;

        let result = await this.client.deleteUser(phoneNumber, this.errorHandler);

        if (result.valueOf() === new String("success").valueOf()){
            this.showMessage(`Successfully deleted ${phoneNumber}`);
        }
        else {
            this.showMessage(`That number is not subscribed`);
        }
    }

}

const main = async () => {
    const stockPage = new StockPage();
    await stockPage.mount();
};
window.addEventListener('DOMContentLoaded', main);