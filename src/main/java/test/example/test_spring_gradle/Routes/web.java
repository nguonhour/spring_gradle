package test.example.test_spring_gradle.Routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import test.example.repository.ProductRepository;

@Controller
public class web {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", productRepository.findAll());
        model.addAttribute("product", new test.example.models.product());
        return "index";
    }

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