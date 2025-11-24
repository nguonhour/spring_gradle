package test.example.test_spring_gradle.Routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ch.qos.logback.core.model.Model;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

// import com.fasterxml.jackson.annotation.JsonCreator.Mode;
// import com.fasterxml.jackson.databind.Module;

@Controller
public class web {

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    /**
     * @param model
     * @param name
     * @param price
     * @param id
     * @return
     */
    // @GetMapping("/product/{id}")
    // public String Product(Model model, @PathVariable Integer id) {
    // // Fetch product from database using id
    // return "views/product";
    // }
    @GetMapping({ "/product", "/product/{id}" })
    public String Product(Model model, @PathVariable(required = false) Integer id) {
        // Handle both cases
        return "views/product";
    }

    @GetMapping("/task1")
    public String Task1(Model model) {
        return "views/task1";
    }

    @GetMapping("/task2")
    public String Task2(Model model) {
        return "views/task2";
    }

    @GetMapping("/task3")
    public String Task3(Model model) {
        return "views/task3";
    }

    @GetMapping("/task4")
    public String Task4(Model model) {
        return "views/task4";
    }

}