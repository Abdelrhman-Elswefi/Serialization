package com.elswefi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Information> info = new ArrayList<Information>();
        info.add(new Information("Abdo", "Elswefi", 23));
        info.add(new Information("Ali", "Said", 24));
        info.add(new Information("Mohsen", "Mohammad", 33));
        info.add(new Information("Mohammad", "Barakat", 22));
        info.add(new Information("Nour", "Omar", 30));

        System.out.print(info);
        SerializationDemo demo = new SerializationDemo();
        demo.Serialize(info,"src/com/elswefi/info.ser");
        System.out.print("\nSerialization done !");
        List<Information> newlist = demo.deSerialze("src/com/elswefi/info.ser");
        System.out.printf("\n the new list is :%s",newlist);

    }
}
