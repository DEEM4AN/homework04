package homework04;

import java.util.ArrayList;
import java.util.List;

public class DataContainer<T> {
    List<T> dataList = new ArrayList<>();

    public void add(T item) {
        dataList.add(item);
    }

    public T get(int index) {
        try {
            return dataList.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!!! Индекс выходит за границу массива");
        }
        return null;
    }

    public void remove(int index) {
        try {
            dataList.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!!! Индекс выходит за границу массива");
        }
    }

    public int getSize() {
        return dataList.size();
    }


}
