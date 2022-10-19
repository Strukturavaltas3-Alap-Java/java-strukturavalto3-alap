package week13.day02;

public class Generic<T> {

    private T att;

    public Generic(T att) {
        this.att = att;
    }

    public T getAtt() {
        return att;
    }
}
