package com.elswefi;

import java.io.*;
import java.util.List;

public class SerializationDemo {
    public void Serialize(List<Information> infoList, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(infoList);
        } catch (IOException ioe) {
            System.out.print("problem saving data .");
            System.out.print(ioe.getStackTrace());
        }

    }

    public List<Information> deSerialze(String fileName) {
        List<Information> infoList = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            infoList = (List<Information>) ois.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.printf("problem getting data from %s file %n", fileName);
            System.out.print(ex.getStackTrace());
        }
        return infoList;

    }
}
