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
        Serialize serialize = new Serialize();
        serialize.Serialize(info,"src/com/elswefi/info.ser");
        System.out.print("\n done !");

    }
}
