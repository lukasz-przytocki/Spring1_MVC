package pl.cwiczenie.demo;
import org.springframework.stereotype.Repository;
import java.util.LinkedList;

@Repository
public class UserList {
    private LinkedList<Person>usersList = new LinkedList<>();

    public UserList() {
        usersList.add(new Person("Jan", "Kowalski", 23));
        usersList.add(new Person("Joanna", "Smith", 25));
        usersList.add(new Person("Karol", "Nowak", 40));
        usersList.add(new Person("Krystyna", "Jabłońska", 35));
    }

    public LinkedList getUserList(){
        return usersList;
    }
    public void addUser(Person person){
        usersList.add(person);
    }
}
