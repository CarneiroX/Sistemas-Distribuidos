package calculadorarmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class Servidor {

    Servidor() {
        try {
            LocateRegistry.createRegistry(1099);
            GatewayService c = new GatewayServiceImpl();

            Naming.rebind("rmi://localhost:1099/Calculadora", c);

            System.out.println("Servidor Conectado, Aguardando...");
        } catch (Exception e) {
            System.out.println("Trouble: " + e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        new Servidor();
    }
}
    

