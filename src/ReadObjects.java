import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by LordwolF on 8/12/2016.
 */
public class ReadObjects {
    public static void main(String[] args) {

        System.out.println("Reading Objects...");

        try (FileInputStream fi = new FileInputStream("people.bin"); ObjectInputStream oi = new ObjectInputStream(fi)) {

            Person person = (Person) oi.readObject();
            System.out.println(person);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
