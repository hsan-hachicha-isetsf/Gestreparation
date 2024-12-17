package Gestion_De_Reparation.App;




import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import Gestion_De_Reparation.App.entities.Appareil;
import Gestion_De_Reparation.App.entities.Client;
import Gestion_De_Reparation.App.service.ImpAppareilService;
import Gestion_De_Reparation.App.service.ImpClientService;





@SpringBootApplication
public class GestionDeReparation3Application {
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("*"));
		configuration.setAllowedMethods(Arrays.asList("GET","POST"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;}

	public static void main(String[] args) {
		
		//SpringApplication.run(GestionDeReparation3Application.class, args);
	
		ApplicationContext ctx = SpringApplication.run(GestionDeReparation3Application.class, args);
//		ImpAppareilService cp=ctx.getBean(ImpAppareilService.class);
//		Appareil A1=new Appareil();
//		A1.setMarque("Samsung"); A1.setModele("Telephone");A1.setNumeroSerie("AYNG7845");
//		System.out.println(A1);
//		cp.ajouterAppareil(A1);
//		
//		ImpClientService cl=ctx.getBean(ImpClientService.class);
//		Client c2=new Client("route gremda","arij trigui","arij.trigui@gmail.com");
//		Client c1=new Client("raoute lafrane","chayma ghorbel","chayma.ghorbe@gmail.com");
//		cl.ajouterClient(c2);
//		cl.ajouterClient(c1);
//		System.out.println(c2);
//		System.out.println(c1);
		/*Client client = cl.chercherClientById(1);
		if (client != null) {
		    System.out.println("Client trouvé : " + client);
		} else {
		    System.out.println("Aucun client trouvé avec l'ID 1");
		}*/
		//System.out.println(cl.chercherClientById(1)); 
		
		;
	

}
}