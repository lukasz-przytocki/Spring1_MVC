package pl.cwiczenie.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
@RequestMapping("/testy")
public class HelloController {
    @RequestMapping(value = "/test1")
    public String example(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        System.out.println("Ktoś wywołał podstronę /testy/test1");
        System.out.println("Wszedł na stronę ip: " + ip);
        return "/test1.html";
        //      return "Hello";
    }

    @RequestMapping(value = "/test2")
    public String example2(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        return "/index.html";
    }

    @RequestMapping(value = "/test3")
    @ResponseBody                       //wrzuca bezpośrednio na stronę teskt z return
    public String example() {
        System.out.println("Ktoś wywołał podstronę /example");
        return "Masz tutaj losowąliczbę: " + new Random().nextInt();
    }

}
