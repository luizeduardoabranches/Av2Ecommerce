package com.example.Ecommerce.controller;
import com.example.Ecommerce.model.LoginRequest;
import com.example.Ecommerce.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @GetMapping("/register")
    public String register(@RequestBody LoginRequest request) {
        return "Usuário cadastrado com sucesso: " +request.getUsername();
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        String token = authService.generateToken(request.getUsername(), request.getPassword(), request.getEmail());
        return token;
    }

    //Endpoints do ADMIN
    @Secured("ADMIN")
    @PostMapping("/admin/users")
    public String postUsersAdmin(Authentication authentication) {
        return "Admin post: " + authentication.getName();
    }

    @Secured("ADMIN")
    @PutMapping("/admin/users")
    public String putUsersAdmin(Authentication authentication) {
        return "Admin put: " + authentication.getName();
    }

    @Secured("ADMIN")
    @DeleteMapping("/admin/users")
    public String deleteUsersAdmin(Authentication authentication) {
        return "Admin delete: " + authentication.getName();
    }

    //Endpoints do GERENTE
    @Secured("MANAGER")
    @PostMapping("/manager/users")
    public String postUsersManager(Authentication authentication) {
        return "Manager post: " + authentication.getName();
    }

    @Secured("MANAGER")
    @PutMapping("/manager/users")
    public String putUsersManager(Authentication authentication) {
        return "Manager put: " + authentication.getName();
    }

    @Secured("MANAGER")
    @DeleteMapping("/manager/users")
    public String deleteUsersManager(Authentication authentication) {
        return "Manager delete: " + authentication.getName();
    }

    //Endpoints do VENDEDOR
    @Secured("SELLER")
    @PostMapping("/seller/users")
    public String postUsersSeller(Authentication authentication) {
        return "Seller post: " + authentication.getName();
    }

    @Secured("SELLER")
    @PutMapping("/seller/users")
    public String putUsersSeller(Authentication authentication) {
        return "Seller put: " + authentication.getName();
    }

    @Secured("SELLER")
    @DeleteMapping("/seller/users")
    public String deleteUsersSeller(Authentication authentication) {
        return "Seller delete: " + authentication.getName();
    }

    //Endpoints do CLIENTE
    @Secured("CUSTOMER")
    @PostMapping("/customer/users")
    public String postUsersCustomer(Authentication authentication) {
        return "Customer post: " + authentication.getName();
    }

    @Secured("SELLER")
    @PutMapping("/customer/users")
    public String putUsersCustomer(Authentication authentication) {
        return "Customer put: " + authentication.getName();
    }

    @Secured("SELLER")
    @DeleteMapping("/customer/users")
    public String deleteUsersCustomer(Authentication authentication) {
        return "Customer delete: " + authentication.getName();
    }
}
