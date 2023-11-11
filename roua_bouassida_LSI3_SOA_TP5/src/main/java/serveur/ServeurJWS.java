package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;


public class ServeurJWS {
    public static void main(String[] args) {
        String url= "http://localhost:8083/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service deployé sur "+url);
    }
}
