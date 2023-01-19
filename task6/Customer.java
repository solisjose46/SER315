import java.lang.Integer;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Random;

public class Customer extends User {
    public ArrayList<SportClass> sportClasses = new ArrayList<SportClass>();

    Customer(String name, String username, String password, String creditCard) {
        super(name, username, password, creditCard);
    }
}