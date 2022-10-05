package exerciciosocktettcp;

import java.io.*;
import java.net.Socket;
import java.util.Date;

public class Cliente {
      public static void main(String[] args) throws IOException {
        
        Socket socket = new Socket("localhost", 0214);
        System.out.println("Conectado!");

        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
       
        System.out.println("Enviando para o Servidor Socket");
        Person person = new Person(15L, "Alex", "Carneiro", "Não Consta", new Date());

        objectOutputStream.writeObject(person);

        System.out.println("Socket Fechado!");
        socket.close();
    }
    
}
