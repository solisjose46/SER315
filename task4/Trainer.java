import java.util.ArrayList;
import java.util.Date;
import java.util.Random;



public class Trainer extends Customer {
    public ArrayList<SportClass> sportClasses = new ArrayList<SportClass>();

    Trainer(String name, String username, String password, String creditCard) {
        super(name, username, password, creditCard);
    }
}