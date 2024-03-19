package homework04;

import java.util.ArrayList;
import java.util.List;

public class Pair<T, U> {

    T ob1;
    U ob2;

    public Pair(T ob1, U ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getFirst() {
        return ob1;
    }

    public U getSecond() {
        return ob2;
    }

    public void setFirst(T first) {
        this.ob1 = first;
    }

    public void setSecond(U second) {
        this.ob2 = second;
    }
}
