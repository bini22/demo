package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Binyam on 8/11/2015.
 */
@Controller
public class PortalController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/Bini's Project")
    public String welcome() {
        return "index";
    }
}
