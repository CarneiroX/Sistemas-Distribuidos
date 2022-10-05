package exerciciosocktettcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

   
    public static void main(String[] args) throws Exception {
         
        ServerSocket ss = new ServerSocket(0214);
        System.out.println("Aguardando Conexão...");
        Socket socket = ss.accept();
        System.out.println("Conexão do " + socket);
        
        InputStream inputStream = socket.getInputStream();
        
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Person person = (Person) objectInputStream.readObject();
        System.out.println(person.toString());
     

      System.out.println("Sockets Fechado!");
        ss.close();
        socket.close();
    }
}
        
    

