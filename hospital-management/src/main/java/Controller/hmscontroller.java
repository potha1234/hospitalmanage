package Hospital.controller;
import org.springframework.web.blind.annotation.GetMapping;
import org.springframework.web.blind.annotation.RequestMapping;
import org.springframework.web.blind.annotation.RestController;
@RestController

@Requestmapping("/api/hms")
public class hmscontroller {

    @Getmapping("/health")
    public String health() {
        return "Hospital management system isscmv,jvhs running";

        System.out.println("yuvaraju");
        System.out.println("rajugit ");
        System.out.println("raju");
        System.out.println("ra");
        System.out.println("ju");


        System.out.println("hello word");

    }

}

