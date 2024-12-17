package Gestion_De_Reparation.App.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	 public boolean login(String username, String password) {
	        // Simuler une vérification utilisateur
	        // Dans une vraie application, vérifiez dans la base de données
	        if (username.equals("admin") && password.equals("admin")) {
	            return true;
	        }
	        return false;
	    }

	    public void logout() {
	        // Logique de déconnexion (ex : invalider une session)
	        System.out.println("Utilisateur déconnecté.");
	    }

}
