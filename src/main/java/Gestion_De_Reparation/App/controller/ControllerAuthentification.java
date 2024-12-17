package Gestion_De_Reparation.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Gestion_De_Reparation.App.service.UserService;

@RestController
@RequestMapping("/auth")
public class ControllerAuthentification {
	@Autowired
	UserService Service;
	@PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        boolean isAuthenticated = Service.login(username, password);
        if (isAuthenticated) {
            return ResponseEntity.ok("Connexion réussie !");
        } else {
            return ResponseEntity.status(401).body("Nom d'utilisateur ou mot de passe incorrect.");
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
    	Service.logout();
        return ResponseEntity.ok("Déconnexion réussie !");
    }

}
