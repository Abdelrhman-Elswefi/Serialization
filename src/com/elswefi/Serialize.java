package com.elswefi;

import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialize {
    public void Serialize(List<Information> infoList, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            oos.writeObject(infoList);
        } catch (IOException ioe) {
            System.out.print("problem saving data .");
            System.out.print(ioe.getStackTrace());
        }

    }
}
