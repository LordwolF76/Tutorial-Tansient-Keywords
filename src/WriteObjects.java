import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by LordwolF on 8/12/2016.
 */
public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing Objects");

        try (FileOutputStream fs = new FileOutputStream("people.bin"); ObjectOutputStream os = new ObjectOutputStream(fs)) {

            Person person = new Person(7, "Bob");
            Person.setCount(88);
            os.writeObject(person);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
