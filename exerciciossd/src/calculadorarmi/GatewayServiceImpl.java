package calculadorarmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class GatewayServiceImpl extends UnicastRemoteObject implements GatewayService  {
    
    public GatewayServiceImpl() throws RemoteException{
        super();
    }

    @Override
    public double soma(double numero1,double numero2) throws RemoteException{
        return numero1+numero2;
    }
    
}
