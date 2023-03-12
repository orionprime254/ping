import java.io.*;
import java.net.*;

//runs on server
public class ping {
    public static void main(String[] args){
        try{
            ServerSocket ss= new ServerSocket(6666);
            Socket s= ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("Client SaYS = "+str);
            ss.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
