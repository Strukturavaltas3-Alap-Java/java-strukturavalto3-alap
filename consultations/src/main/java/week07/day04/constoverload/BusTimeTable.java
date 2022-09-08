package week07.day04.constoverload;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime>  startTimes;

    public BusTimeTable(List<SimpleTime> startTimes) {
        this.startTimes = startTimes;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute){
        List<SimpleTime> result = new ArrayList<>();
        for(int i=firstHour;i<=lastHour;i++){
            SimpleTime simpleTime = new SimpleTime(i, everyMinute);
            result.add(simpleTime);
        }
        startTimes = result;
    }

    public SimpleTime nextBus(SimpleTime actual){
        for(SimpleTime st : startTimes){
            if(actual.getDifference(st)<0){
                return st;
            }
        }
        throw new IllegalArgumentException("No more Bus!");
    }
}
