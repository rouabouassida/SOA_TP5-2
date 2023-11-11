/*package client;

import proxy.BanqueServiceService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueWS proxy = new BanqueServiceService().getBanqueWSPort();
        System.out.println(proxy.convertEuroToDinar(1000));
        Compte compte = proxy.getCompte(5);
        compte.setSlode(80000);
        System.out.println(compte.getCode()+ " "+ compte.getSlode());
        List<Compte> comptes = proxy.getComptes();
        comptes.forEach(
                cp->{
                    System.out.println(cp.getCode()+ " "+ cp.getSlode());

                }
        );

    }
}
*/