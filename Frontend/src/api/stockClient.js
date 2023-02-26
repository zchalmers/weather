// * Copyright (c) 2022 All Rights Reserved
// * Title: Time Travel Trading
// * Authors: Scott Zastrow, Nichole Davidson, Alexander Bennett


import BaseClass from "../util/baseClass";
import axios from 'axios'

export default class StockClient extends BaseClass{
    constructor(props = {}) {
        super();
        const methodsToBind = ['clientLoaded', 'getWeather', 'addUser', 'deleteUser'];
        this.bindClassMethods(methodsToBind, this);
        this.props = props;
        this.clientLoaded(axios);

    }
    clientLoaded(client) {
        this.client = client;
        if (this.props.hasOwnProperty("onReady")){
            this.props.onReady();
        }
    }
    async getWeather(errorCallback){
        try{
            const response = await this.client.get(`/weather/current`);
            console.log(response);
            return response.data;
        }catch (error){
            this.handleError("getStocks", error, errorCallback)
        }
    }
    async addUser(user, errorCallback){
        try {
            const response = await this.client.post(`/weather/user`, user);
            console.log(response);
            return response.data;
        }catch (error){
            this.handleError("addUser", error, errorCallback);
        }
    }
    async deleteUser(phoneNumber, errorCallback){
        try {
            const response = await this.client.post(`/weather/user/delete/${phoneNumber}`)
            console.log(response);
            return response.data;
        }
        catch (error){
            this.handleError("deleteUser", error, errorCallback);
        }
    }
    handleError(method, error, errorCallback) {
        console.error(method + " failed - " + error);
        if (error.response.data.message !== undefined) {
            console.error(error.response.data.message);
        }
        if (errorCallback) {
            errorCallback(method + " failed - " + error);
        }
    }

}