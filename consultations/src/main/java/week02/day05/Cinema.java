package week02.day05;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String city;
    private List<String> movies = new ArrayList<>();

    public Cinema(String city) {
        this.city = city;
    }
    public void somehting(){
        
    }

    public void addNewMovie(String movie){
        movies.add(movie);
    }


    public String findLongestTitledMovie(){
        String maxTitle = "";

        for(String actual : movies){
           if(actual.length()>maxTitle.length()){
               maxTitle = actual;
           }
        }
        return maxTitle;
    }


//    public String findLongestTitledMovie(){
//        int maxLength = 0;
//        String maxTitle = "";
//
//        for(int i=0;i<movies.size();i++){
//            if(movies.get(i).length()>maxLength){
//                maxLength = movies.get(i).length();
//                maxTitle = movies.get(i);
//            }
//        }
//        return  maxTitle;
//
//    }

}
