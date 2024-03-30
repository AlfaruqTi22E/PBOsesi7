import java.util.ArrayList;
import java.util.List;

// Contoh generic class
class MyGenericClass<T> {
    private T value;

    public MyGenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan generic class
        MyGenericClass<Integer> intContainer = new MyGenericClass<>(42);
        MyGenericClass<String> stringContainer = new MyGenericClass<>("Hello, world!");

        System.out.println("Integer value: " + intContainer.getValue());
        System.out.println("String value: " + stringContainer.getValue());

        // Contoh generic method
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        printCollection(intList);
        printCollection(stringList);
    }

    // Generic method untuk mencetak elemen-elemen koleksi
    public static <E> void printCollection(List<E> collection) {
        for (E item : collection) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
