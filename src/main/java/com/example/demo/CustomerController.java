package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/list")
    public List<CustomerModel> getModel() {
        try {
            return Collections.singletonList(new CustomerModel(
                    1L,
                    "87677",
                    "Test",
                    "Test",
                    new address(
                            "98788",
                            "Test",
                            "Test",
                            "Test",
                            "Test"),
                    new CustomerContactDetail(
                    1L,
                    98L,
                    "Test",
                    "Test",
                    "Test",
                    "Test",
                    "Test",
                    "Test",
                    "Test",
                    "Test",
                    false),
                    true,
                    "Test"));
        } catch (ExceptionHandling ignored) {
            throw new ExceptionHandling("Null Return by Function", ignored);
        }
    }
}
