package pl.cwiczenie.demo;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    UserList userList = new UserList();

    public UserController(UserList userList) {  //kontroler
        this.userList = userList;

    }

    @GetMapping("/users")
    @ResponseBody
    public String users() {

        List<Person> person = userList.getUserList();
        String allUsers = "";
        for (int i = 0; i < person.size(); i++) {
            allUsers += ((person.get(i).toString()) + "<br/>");
        }
        return allUsers;
    }

    @GetMapping("/add")
    @ResponseBody
    public String add(@RequestParam String imie, @RequestParam String nazwisko, @RequestParam Integer wiek) {

        //HttpServletRequest request
//        String firstName = request.getParameter("imie");
//        String lastName = request.getParameter("nazwisko");
//        String age = request.getParameter("wiek");

///http://localhost:8080//add?imie=Daniel&nazwisko=Abacki&wiek=15

        if (StringUtils.isEmpty(imie)) {
            return "err.html";
        }
        Person person = new Person(imie, nazwisko, wiek);
        userList.addUser(person);

        return "success.html";
    }
    @GetMapping("AAA.html")
    @ResponseBody
    @RequestMapping("/addUser")
    public String addUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Integer age) {

        return firstName + lastName+ age;
    }


}
