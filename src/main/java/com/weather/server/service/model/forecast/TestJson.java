package com.weather.server.service.model.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TestJson {


    @JsonProperty("forecast")
    private Forecast forecast;
    @JsonProperty("current")
    private Current current;
    @JsonProperty("location")
    private Location location;

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "TestJson{" +
                "forecast=" + forecast.toString() +
                ", current=" + current.toString() +
                ", location=" + location.toString() +
                '}';
    }

    public static class Forecast {
        @JsonProperty("forecastday")
        private List<Forecastday> forecastday;

        public List<Forecastday> getForecastday() {
            return forecastday;
        }

        public void setForecastday(List<Forecastday> forecastday) {
            this.forecastday = forecastday;
        }

        @Override
        public String toString() {
            return "Forecast{" +
                    "forecastday=" + forecastday.toString() +
                    '}';
        }
    }

    public static class Forecastday {
        @JsonProperty("hour")
        private List<Hour> hour;
        @JsonProperty("astro")
        private Astro astro;
        @JsonProperty("day")
        private Day day;
        @JsonProperty("date_epoch")
        private int date_epoch;
        @JsonProperty("date")
        private String date;

        public List<Hour> getHour() {
            return hour;
        }

        public void setHour(List<Hour> hour) {
            this.hour = hour;
        }

        public Astro getAstro() {
            return astro;
        }

        public void setAstro(Astro astro) {
            this.astro = astro;
        }

        public Day getDay() {
            return day;
        }

        public void setDay(Day day) {
            this.day = day;
        }

        public int getDate_epoch() {
            return date_epoch;
        }

        public void setDate_epoch(int date_epoch) {
            this.date_epoch = date_epoch;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Forecastday{" +
                    "hour=" + hour +
                    ", astro=" + astro +
                    ", day=" + day +
                    ", date_epoch=" + date_epoch +
                    ", date='" + date + '\'' +
                    '}';
        }
    }

    public static class Hour {
        @JsonProperty("uv")
        private int uv;
        @JsonProperty("gust_kph")
        private double gust_kph;
        @JsonProperty("gust_mph")
        private double gust_mph;
        @JsonProperty("vis_miles")
        private int vis_miles;
        @JsonProperty("vis_km")
        private int vis_km;
        @JsonProperty("chance_of_snow")
        private int chance_of_snow;
        @JsonProperty("will_it_snow")
        private int will_it_snow;
        @JsonProperty("chance_of_rain")
        private int chance_of_rain;
        @JsonProperty("will_it_rain")
        private int will_it_rain;
        @JsonProperty("dewpoint_f")
        private double dewpoint_f;
        @JsonProperty("dewpoint_c")
        private double dewpoint_c;
        @JsonProperty("heatindex_f")
        private double heatindex_f;
        @JsonProperty("heatindex_c")
        private double heatindex_c;
        @JsonProperty("windchill_f")
        private double windchill_f;
        @JsonProperty("windchill_c")
        private double windchill_c;
        @JsonProperty("feelslike_f")
        private double feelslike_f;
        @JsonProperty("feelslike_c")
        private double feelslike_c;
        @JsonProperty("cloud")
        private int cloud;
        @JsonProperty("humidity")
        private int humidity;
        @JsonProperty("precip_in")
        private int precip_in;
        @JsonProperty("precip_mm")
        private int precip_mm;
        @JsonProperty("pressure_in")
        private double pressure_in;
        @JsonProperty("pressure_mb")
        private int pressure_mb;
        @JsonProperty("wind_dir")
        private String wind_dir;
        @JsonProperty("wind_degree")
        private int wind_degree;
        @JsonProperty("wind_kph")
        private double wind_kph;
        @JsonProperty("wind_mph")
        private double wind_mph;
        @JsonProperty("condition")
        private Condition condition;
        @JsonProperty("is_day")
        private int is_day;
        @JsonProperty("temp_f")
        private double temp_f;
        @JsonProperty("temp_c")
        private double temp_c;
        @JsonProperty("time")
        private String time;
        @JsonProperty("time_epoch")
        private int time_epoch;

        public int getUv() {
            return uv;
        }

        public void setUv(int uv) {
            this.uv = uv;
        }

        public double getGust_kph() {
            return gust_kph;
        }

        public void setGust_kph(double gust_kph) {
            this.gust_kph = gust_kph;
        }

        public double getGust_mph() {
            return gust_mph;
        }

        public void setGust_mph(double gust_mph) {
            this.gust_mph = gust_mph;
        }

        public int getVis_miles() {
            return vis_miles;
        }

        public void setVis_miles(int vis_miles) {
            this.vis_miles = vis_miles;
        }

        public int getVis_km() {
            return vis_km;
        }

        public void setVis_km(int vis_km) {
            this.vis_km = vis_km;
        }

        public int getChance_of_snow() {
            return chance_of_snow;
        }

        public void setChance_of_snow(int chance_of_snow) {
            this.chance_of_snow = chance_of_snow;
        }

        public int getWill_it_snow() {
            return will_it_snow;
        }

        public void setWill_it_snow(int will_it_snow) {
            this.will_it_snow = will_it_snow;
        }

        public int getChance_of_rain() {
            return chance_of_rain;
        }

        public void setChance_of_rain(int chance_of_rain) {
            this.chance_of_rain = chance_of_rain;
        }

        public int getWill_it_rain() {
            return will_it_rain;
        }

        public void setWill_it_rain(int will_it_rain) {
            this.will_it_rain = will_it_rain;
        }

        public double getDewpoint_f() {
            return dewpoint_f;
        }

        public void setDewpoint_f(double dewpoint_f) {
            this.dewpoint_f = dewpoint_f;
        }

        public double getDewpoint_c() {
            return dewpoint_c;
        }

        public void setDewpoint_c(double dewpoint_c) {
            this.dewpoint_c = dewpoint_c;
        }

        public double getHeatindex_f() {
            return heatindex_f;
        }

        public void setHeatindex_f(double heatindex_f) {
            this.heatindex_f = heatindex_f;
        }

        public double getHeatindex_c() {
            return heatindex_c;
        }

        public void setHeatindex_c(double heatindex_c) {
            this.heatindex_c = heatindex_c;
        }

        public double getWindchill_f() {
            return windchill_f;
        }

        public void setWindchill_f(double windchill_f) {
            this.windchill_f = windchill_f;
        }

        public double getWindchill_c() {
            return windchill_c;
        }

        public void setWindchill_c(double windchill_c) {
            this.windchill_c = windchill_c;
        }

        public double getFeelslike_f() {
            return feelslike_f;
        }

        public void setFeelslike_f(double feelslike_f) {
            this.feelslike_f = feelslike_f;
        }

        public double getFeelslike_c() {
            return feelslike_c;
        }

        public void setFeelslike_c(double feelslike_c) {
            this.feelslike_c = feelslike_c;
        }

        public int getCloud() {
            return cloud;
        }

        public void setCloud(int cloud) {
            this.cloud = cloud;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getPrecip_in() {
            return precip_in;
        }

        public void setPrecip_in(int precip_in) {
            this.precip_in = precip_in;
        }

        public int getPrecip_mm() {
            return precip_mm;
        }

        public void setPrecip_mm(int precip_mm) {
            this.precip_mm = precip_mm;
        }

        public double getPressure_in() {
            return pressure_in;
        }

        public void setPressure_in(double pressure_in) {
            this.pressure_in = pressure_in;
        }

        public int getPressure_mb() {
            return pressure_mb;
        }

        public void setPressure_mb(int pressure_mb) {
            this.pressure_mb = pressure_mb;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public int getWind_degree() {
            return wind_degree;
        }

        public void setWind_degree(int wind_degree) {
            this.wind_degree = wind_degree;
        }

        public double getWind_kph() {
            return wind_kph;
        }

        public void setWind_kph(double wind_kph) {
            this.wind_kph = wind_kph;
        }

        public double getWind_mph() {
            return wind_mph;
        }

        public void setWind_mph(double wind_mph) {
            this.wind_mph = wind_mph;
        }

        public Condition getCondition() {
            return condition;
        }

        public void setCondition(Condition condition) {
            this.condition = condition;
        }

        public int getIs_day() {
            return is_day;
        }

        public void setIs_day(int is_day) {
            this.is_day = is_day;
        }

        public double getTemp_f() {
            return temp_f;
        }

        public void setTemp_f(double temp_f) {
            this.temp_f = temp_f;
        }

        public double getTemp_c() {
            return temp_c;
        }

        public void setTemp_c(double temp_c) {
            this.temp_c = temp_c;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getTime_epoch() {
            return time_epoch;
        }

        public void setTime_epoch(int time_epoch) {
            this.time_epoch = time_epoch;
        }
    }

    public static class Condition {
        @JsonProperty("code")
        private int code;
        @JsonProperty("icon")
        private String icon;
        @JsonProperty("text")
        private String text;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class Astro {
        @JsonProperty("is_sun_up")
        private int is_sun_up;
        @JsonProperty("is_moon_up")
        private int is_moon_up;
        @JsonProperty("moon_illumination")
        private String moon_illumination;
        @JsonProperty("moon_phase")
        private String moon_phase;
        @JsonProperty("moonset")
        private String moonset;
        @JsonProperty("moonrise")
        private String moonrise;
        @JsonProperty("sunset")
        private String sunset;
        @JsonProperty("sunrise")
        private String sunrise;

        public int getIs_sun_up() {
            return is_sun_up;
        }

        public void setIs_sun_up(int is_sun_up) {
            this.is_sun_up = is_sun_up;
        }

        public int getIs_moon_up() {
            return is_moon_up;
        }

        public void setIs_moon_up(int is_moon_up) {
            this.is_moon_up = is_moon_up;
        }

        public String getMoon_illumination() {
            return moon_illumination;
        }

        public void setMoon_illumination(String moon_illumination) {
            this.moon_illumination = moon_illumination;
        }

        public String getMoon_phase() {
            return moon_phase;
        }

        public void setMoon_phase(String moon_phase) {
            this.moon_phase = moon_phase;
        }

        public String getMoonset() {
            return moonset;
        }

        public void setMoonset(String moonset) {
            this.moonset = moonset;
        }

        public String getMoonrise() {
            return moonrise;
        }

        public void setMoonrise(String moonrise) {
            this.moonrise = moonrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }
    }

    public static class Day {
        @JsonProperty("uv")
        private int uv;
        @JsonProperty("condition")
        private Condition condition;
        @JsonProperty("daily_chance_of_snow")
        private int daily_chance_of_snow;
        @JsonProperty("daily_will_it_snow")
        private int daily_will_it_snow;
        @JsonProperty("daily_chance_of_rain")
        private int daily_chance_of_rain;
        @JsonProperty("daily_will_it_rain")
        private int daily_will_it_rain;
        @JsonProperty("avghumidity")
        private int avghumidity;
        @JsonProperty("avgvis_miles")
        private int avgvis_miles;
        @JsonProperty("avgvis_km")
        private int avgvis_km;
        @JsonProperty("totalsnow_cm")
        private int totalsnow_cm;
        @JsonProperty("totalprecip_in")
        private int totalprecip_in;
        @JsonProperty("totalprecip_mm")
        private int totalprecip_mm;
        @JsonProperty("maxwind_kph")
        private double maxwind_kph;
        @JsonProperty("maxwind_mph")
        private double maxwind_mph;
        @JsonProperty("avgtemp_f")
        private double avgtemp_f;
        @JsonProperty("avgtemp_c")
        private double avgtemp_c;
        @JsonProperty("mintemp_f")
        private double mintemp_f;
        @JsonProperty("mintemp_c")
        private double mintemp_c;
        @JsonProperty("maxtemp_f")
        private double maxtemp_f;
        @JsonProperty("maxtemp_c")
        private int maxtemp_c;

        public int getUv() {
            return uv;
        }

        public void setUv(int uv) {
            this.uv = uv;
        }

        public Condition getCondition() {
            return condition;
        }

        public void setCondition(Condition condition) {
            this.condition = condition;
        }

        public int getDaily_chance_of_snow() {
            return daily_chance_of_snow;
        }

        public void setDaily_chance_of_snow(int daily_chance_of_snow) {
            this.daily_chance_of_snow = daily_chance_of_snow;
        }

        public int getDaily_will_it_snow() {
            return daily_will_it_snow;
        }

        public void setDaily_will_it_snow(int daily_will_it_snow) {
            this.daily_will_it_snow = daily_will_it_snow;
        }

        public int getDaily_chance_of_rain() {
            return daily_chance_of_rain;
        }

        public void setDaily_chance_of_rain(int daily_chance_of_rain) {
            this.daily_chance_of_rain = daily_chance_of_rain;
        }

        public int getDaily_will_it_rain() {
            return daily_will_it_rain;
        }

        public void setDaily_will_it_rain(int daily_will_it_rain) {
            this.daily_will_it_rain = daily_will_it_rain;
        }

        public int getAvghumidity() {
            return avghumidity;
        }

        public void setAvghumidity(int avghumidity) {
            this.avghumidity = avghumidity;
        }

        public int getAvgvis_miles() {
            return avgvis_miles;
        }

        public void setAvgvis_miles(int avgvis_miles) {
            this.avgvis_miles = avgvis_miles;
        }

        public int getAvgvis_km() {
            return avgvis_km;
        }

        public void setAvgvis_km(int avgvis_km) {
            this.avgvis_km = avgvis_km;
        }

        public int getTotalsnow_cm() {
            return totalsnow_cm;
        }

        public void setTotalsnow_cm(int totalsnow_cm) {
            this.totalsnow_cm = totalsnow_cm;
        }

        public int getTotalprecip_in() {
            return totalprecip_in;
        }

        public void setTotalprecip_in(int totalprecip_in) {
            this.totalprecip_in = totalprecip_in;
        }

        public int getTotalprecip_mm() {
            return totalprecip_mm;
        }

        public void setTotalprecip_mm(int totalprecip_mm) {
            this.totalprecip_mm = totalprecip_mm;
        }

        public double getMaxwind_kph() {
            return maxwind_kph;
        }

        public void setMaxwind_kph(double maxwind_kph) {
            this.maxwind_kph = maxwind_kph;
        }

        public double getMaxwind_mph() {
            return maxwind_mph;
        }

        public void setMaxwind_mph(double maxwind_mph) {
            this.maxwind_mph = maxwind_mph;
        }

        public double getAvgtemp_f() {
            return avgtemp_f;
        }

        public void setAvgtemp_f(double avgtemp_f) {
            this.avgtemp_f = avgtemp_f;
        }

        public double getAvgtemp_c() {
            return avgtemp_c;
        }

        public void setAvgtemp_c(double avgtemp_c) {
            this.avgtemp_c = avgtemp_c;
        }

        public double getMintemp_f() {
            return mintemp_f;
        }

        public void setMintemp_f(double mintemp_f) {
            this.mintemp_f = mintemp_f;
        }

        public double getMintemp_c() {
            return mintemp_c;
        }

        public void setMintemp_c(double mintemp_c) {
            this.mintemp_c = mintemp_c;
        }

        public double getMaxtemp_f() {
            return maxtemp_f;
        }

        public void setMaxtemp_f(double maxtemp_f) {
            this.maxtemp_f = maxtemp_f;
        }

        public int getMaxtemp_c() {
            return maxtemp_c;
        }

        public void setMaxtemp_c(int maxtemp_c) {
            this.maxtemp_c = maxtemp_c;
        }
    }


    public static class Current {
        @JsonProperty("gust_kph")
        private double gust_kph;
        @JsonProperty("gust_mph")
        private double gust_mph;
        @JsonProperty("uv")
        private int uv;
        @JsonProperty("vis_miles")
        private int vis_miles;
        @JsonProperty("vis_km")
        private int vis_km;
        @JsonProperty("feelslike_f")
        private double feelslike_f;
        @JsonProperty("feelslike_c")
        private double feelslike_c;
        @JsonProperty("cloud")
        private int cloud;
        @JsonProperty("humidity")
        private int humidity;
        @JsonProperty("precip_in")
        private int precip_in;
        @JsonProperty("precip_mm")
        private int precip_mm;
        @JsonProperty("pressure_in")
        private double pressure_in;
        @JsonProperty("pressure_mb")
        private int pressure_mb;
        @JsonProperty("wind_dir")
        private String wind_dir;
        @JsonProperty("wind_degree")
        private int wind_degree;
        @JsonProperty("wind_kph")
        private double wind_kph;
        @JsonProperty("wind_mph")
        private double wind_mph;
        @JsonProperty("condition")
        private Condition condition;
        @JsonProperty("is_day")
        private int is_day;
        @JsonProperty("temp_f")
        private int temp_f;
        @JsonProperty("temp_c")
        private double temp_c;
        @JsonProperty("last_updated")
        private String last_updated;
        @JsonProperty("last_updated_epoch")
        private int last_updated_epoch;

        public double getGust_kph() {
            return gust_kph;
        }

        public void setGust_kph(double gust_kph) {
            this.gust_kph = gust_kph;
        }

        public double getGust_mph() {
            return gust_mph;
        }

        public void setGust_mph(double gust_mph) {
            this.gust_mph = gust_mph;
        }

        public int getUv() {
            return uv;
        }

        public void setUv(int uv) {
            this.uv = uv;
        }

        public int getVis_miles() {
            return vis_miles;
        }

        public void setVis_miles(int vis_miles) {
            this.vis_miles = vis_miles;
        }

        public int getVis_km() {
            return vis_km;
        }

        public void setVis_km(int vis_km) {
            this.vis_km = vis_km;
        }

        public double getFeelslike_f() {
            return feelslike_f;
        }

        public void setFeelslike_f(double feelslike_f) {
            this.feelslike_f = feelslike_f;
        }

        public double getFeelslike_c() {
            return feelslike_c;
        }

        public void setFeelslike_c(double feelslike_c) {
            this.feelslike_c = feelslike_c;
        }

        public int getCloud() {
            return cloud;
        }

        public void setCloud(int cloud) {
            this.cloud = cloud;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getPrecip_in() {
            return precip_in;
        }

        public void setPrecip_in(int precip_in) {
            this.precip_in = precip_in;
        }

        public int getPrecip_mm() {
            return precip_mm;
        }

        public void setPrecip_mm(int precip_mm) {
            this.precip_mm = precip_mm;
        }

        public double getPressure_in() {
            return pressure_in;
        }

        public void setPressure_in(double pressure_in) {
            this.pressure_in = pressure_in;
        }

        public int getPressure_mb() {
            return pressure_mb;
        }

        public void setPressure_mb(int pressure_mb) {
            this.pressure_mb = pressure_mb;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public int getWind_degree() {
            return wind_degree;
        }

        public void setWind_degree(int wind_degree) {
            this.wind_degree = wind_degree;
        }

        public double getWind_kph() {
            return wind_kph;
        }

        public void setWind_kph(double wind_kph) {
            this.wind_kph = wind_kph;
        }

        public double getWind_mph() {
            return wind_mph;
        }

        public void setWind_mph(double wind_mph) {
            this.wind_mph = wind_mph;
        }

        public Condition getCondition() {
            return condition;
        }

        public void setCondition(Condition condition) {
            this.condition = condition;
        }

        public int getIs_day() {
            return is_day;
        }

        public void setIs_day(int is_day) {
            this.is_day = is_day;
        }

        public int getTemp_f() {
            return temp_f;
        }

        public void setTemp_f(int temp_f) {
            this.temp_f = temp_f;
        }

        public double getTemp_c() {
            return temp_c;
        }

        public void setTemp_c(double temp_c) {
            this.temp_c = temp_c;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }

        public int getLast_updated_epoch() {
            return last_updated_epoch;
        }

        public void setLast_updated_epoch(int last_updated_epoch) {
            this.last_updated_epoch = last_updated_epoch;
        }
    }


    public static class Location {
        @JsonProperty("localtime")
        private String localtime;
        @JsonProperty("localtime_epoch")
        private int localtime_epoch;
        @JsonProperty("tz_id")
        private String tz_id;
        @JsonProperty("lon")
        private double lon;
        @JsonProperty("lat")
        private double lat;
        @JsonProperty("country")
        private String country;
        @JsonProperty("region")
        private String region;
        @JsonProperty("name")
        private String name;

        public String getLocaltime() {
            return localtime;
        }

        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }

        public int getLocaltime_epoch() {
            return localtime_epoch;
        }

        public void setLocaltime_epoch(int localtime_epoch) {
            this.localtime_epoch = localtime_epoch;
        }

        public String getTz_id() {
            return tz_id;
        }

        public void setTz_id(String tz_id) {
            this.tz_id = tz_id;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
