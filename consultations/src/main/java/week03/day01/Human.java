package week03.day01;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void introduction(){
        System.out.println("HY my name is: "+name);
    }

    public String getName() {
        return name;
    }
}
