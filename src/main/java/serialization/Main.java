package serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("1", "1", "1", "1", "1");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
            oos.writeObject(p);
            oos.close();
           // Person p0 = new Person("2", "2", "2", "2", "2");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Person p2 = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"))) {
            p2 = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(p2.toString());

    }
}
