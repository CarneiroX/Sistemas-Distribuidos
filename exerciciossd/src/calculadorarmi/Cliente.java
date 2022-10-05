package calculadorarmi;

import java.rmi.Naming;


public class Cliente {

    public static void main(String[] args) {
        try{
            GatewayService c = (GatewayService) Naming.lookup("rmi://localhost:1099/Calculadora");
            System.out.println("Resultado da Operação é "+c.soma(80, 10));
            
        }catch (Exception e){
            System.out.println("GenericException: " + e.toString());
        }
    }
}
