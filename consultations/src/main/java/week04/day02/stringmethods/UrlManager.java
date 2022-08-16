package week04.day02.stringmethods;

import java.util.Locale;

public class UrlManager {

    //  https://earthquake.usgs.gov:33012/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url){

    }


    private String findProtocolInUrl(String url){
        //url.spit("://")[0].toLowerCase();
        return url.substring(0,url.indexOf("://")).toLowerCase();
    }

    //earthquake.usgs.gov:33012/fdsnws

    private String findHostInUrl(String url){
        String[] temp = url.split("://");
        int perIndex = temp[1].indexOf("/");
        int colonIndex = temp[1].indexOf(":");
        if(colonIndex > 0){
            return temp[1].substring(0,colonIndex);
        }
        if(perIndex > 0){
            return temp[1].substring(0,perIndex);
        }
        return temp[1];
    }


}
