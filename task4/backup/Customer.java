import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

package task4;

public class Customer extends User {
    public ArrayList<SportClass> sportClasses = new ArrayList<SportClass>();

    Customer(String name, String username, String password, String creditCard) {
        super(name, username, password, creditCard);
    }
}