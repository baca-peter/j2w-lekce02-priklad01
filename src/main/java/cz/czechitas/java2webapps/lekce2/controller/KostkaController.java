package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Random;

@Controller
public class KostkaController {

    private final Random random;

    public KostkaController() {
        random = new Random();
    }

    @GetMapping("/")
    public ModelAndView hodKostkou() {
        ModelAndView result = new ModelAndView("kostka");
        int cislo = random.nextInt(6) + 1;
        result.addObject("cislo", cislo);
        result.addObject("obrazek", String.format("/images/kostka-%d.svg", cislo));
        return result;
    }
}
