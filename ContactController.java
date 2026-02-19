
package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ContactController {

    @PostMapping("/contact")
    public String handleContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        System.out.println("New Contact Form Submission:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);

        return "Form submitted successfully!";
    }
}
