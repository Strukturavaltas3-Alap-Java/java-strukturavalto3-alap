package week08.day05;

public interface Speak extends SayHy{


    @Override
    default void sayHy() {
        SayHy.super.sayHy();
    }
}
