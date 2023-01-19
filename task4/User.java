import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public abstract class User {
    public String name;
    public String username;
    public String password;
    public String creditCard;
    public int hours;

    User(String name, String username, String password, String creditCard) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.creditCard = creditCard;
        this.hours = 0;
    }
}