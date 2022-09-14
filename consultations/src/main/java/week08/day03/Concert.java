package week08.day03;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {


    private List<Person> audience = new ArrayList<>();

    public void addPerson(Person person, LocalTime actualTime){
        LocalTime entryTime = person.getTicket().entryTime();
        if(!actualTime.isAfter(entryTime)){
            throw new IllegalArgumentException("Your entry time is not valid: "+entryTime);
        }
        audience.add(person);
    }

    public List<Person> getAudience() {
        return audience;
    }
}
