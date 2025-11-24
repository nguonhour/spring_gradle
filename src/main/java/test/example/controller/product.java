package test.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;
import test.example.repository.ProductRepository;

@Controller
@RequestMapping("/products")
public class product {

    @Autowired
    private ProductRepository productRepository;

    // List all products
    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        model.addAttribute("product", productRepository.findAll());
        model.addAttribute("product", new test.example.models.product());
        return "views/product";
    }

    // Show create form
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new test.example.models.product());
        return "index";
    }

    // Create product
    @PostMapping
    public String createProduct(@Valid @ModelAttribute("product") test.example.models.product product,
            BindingResult result,
            RedirectAttributes redirectAttributes,
            Model model) {
        if (result.hasErrors()) {
            return "index";
        }

        productRepository.save(product);
        redirectAttributes.addFlashAttribute("successMessage", "Product created successfully!");
        return "redirect:/";
    }

    // Show edit form
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Integer id, Model model, RedirectAttributes redirectAttributes) {
        test.example.models.product product = productRepository.findById(id)
                .orElse(null);

        if (product == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "Product not found!");
            return "redirect:/products";
        }

        model.addAttribute("product", product);
        model.addAttribute("products", productRepository.findAll());
        return "views/product";
    }

    // Update product
    @PostMapping("/{id}")
    public String updateProduct(@PathVariable Integer id,
            @Valid @ModelAttribute("product") test.example.models.product product,
            BindingResult result,
            RedirectAttributes redirectAttributes,
            Model model) {
        if (result.hasErrors()) {
            return "index";
        }

        test.example.models.product existingProduct = productRepository.findById(id)
                .orElse(null);

        if (existingProduct == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "Product not found!");
            return "redirect:/products";
        }

        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setImagePath(product.getImagePath());

        productRepository.save(existingProduct);
        redirectAttributes.addFlashAttribute("successMessage", "Product updated successfully!");
        return "redirect:/products";
    }

    // Delete product
    @PostMapping("/{id}/delete")
    public String deleteProduct(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        test.example.models.product product = productRepository.findById(id)
                .orElse(null);

        if (product == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "Product not found!");
            return "redirect:/products";
        }

        productRepository.delete(product);
        redirectAttributes.addFlashAttribute("successMessage", "Product deleted successfully!");
        return "redirect:/products";
    }
}
