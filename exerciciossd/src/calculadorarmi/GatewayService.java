package calculadorarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GatewayService extends Remote{
    
    public double soma(double numero1, double numero2) throws RemoteException;
    
}
