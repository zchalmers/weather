package com.weather.server.ipStuff;

import com.maxmind.geoip2.WebServiceClient;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.model.CountryResponse;
import com.maxmind.geoip2.record.*;

import java.io.IOException;
import java.net.InetAddress;

public class IPService {


public static final int accountId = 831388;
public static final String licenseKey = "hvWnIxJLVftZ4vzX";


    public static void lookupIP() throws IOException, GeoIp2Exception {
        WebServiceClient client = new WebServiceClient.Builder(accountId, licenseKey)
                .build();

        InetAddress ipAddress = InetAddress.getByName("192.168.0.11");

// Do the lookup
        CountryResponse response = client.country(ipAddress);
        CityResponse cityResponse = client.city(ipAddress);

        Country country = response.getCountry();
        System.out.println(country.getIsoCode());            // 'US'
        System.out.println(country.getName());               // 'United States'
        System.out.println(country.getNames().get("zh-CN")); // '美国'

        Subdivision subdivision = cityResponse.getMostSpecificSubdivision();
        System.out.println(subdivision.getName());       // 'Minnesota'
        System.out.println(subdivision.getIsoCode());    // 'MN'

        City city = cityResponse.getCity();
        System.out.println(city.getName());       // 'Minneapolis'

        Postal postal = cityResponse.getPostal();
        System.out.println(postal.getCode());       // '55455'

        Location location = cityResponse.getLocation();
        System.out.println(location.getLatitude());        // 44.9733
        System.out.println(location.getLongitude());       // -93.2323
    }
}
