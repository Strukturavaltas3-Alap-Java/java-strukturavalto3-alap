package abstraction;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;

    private List<Rentable> earlierRents = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public void addEarlierRent(Rentable rentable) {
        earlierRents.add(rentable);
    }

    public int countFreeInEarlierRent() {
        int count = 0;
        for (Rentable actual : earlierRents) {
            if (actual.isFree()) {
                count++;
            }
        }
        return count;
    }

    public List<Rentable> getEarlierRents() {
        return earlierRents;
    }

    public String getUserName() {
        return userName;
    }
}
