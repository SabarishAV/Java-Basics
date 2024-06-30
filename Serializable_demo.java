import java.io.*;

class Bike implements Serializable{
    int id=1;
    String brand="Royal Enfield";
    String model="Interceptor 650";
    int price=321000;
}

public class Serializable_demo {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        /*
           While serialization, FileOutputStream, ObjectOutputStream, etc throws different errors. These are
           all child classes of IO Exception. So main method only throws IO Exception
         */

        // serialization
        File file = new File("bike.ser");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Bike b1 = new Bike();
        oos.writeObject(b1);
        System.out.println("Serialization process completed");

        // deserialization
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        Bike b2 = (Bike) o; // Type casting, changing the type of o from Object to Bike
        System.out.println("Bike id: " + b2.id);
        System.out.println("Bike brand: " + b2.brand);
        System.out.println("Bike model: " + b2.model);
        System.out.println("Bike price: " + b2.price);
    }
}

/*
    Serialization in Java is the process of converting an object's state into a byte stream, which can be written
    to a file, sent over a network, or stored in a database. This allows the object to be reconstructed later,
    preserving its state.
 */
