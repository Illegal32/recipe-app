package az.pashabank.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        System.out.println("hiiii 888 999 111");
        System.out.println("666");
        return "index";
    }

}