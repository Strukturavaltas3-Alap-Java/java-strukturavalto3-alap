package week06.day02;

import java.util.List;

public class UserRepository {

    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    public User findUserByUsername(String username){
        for(User actual : users){
            if(actual.getUsername().equals(username)){
                return actual;
            }
        }
        throw new IllegalArgumentException("Cannot find user with username:" + username);
    }

}
