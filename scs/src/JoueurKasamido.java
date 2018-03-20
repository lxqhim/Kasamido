import java.net.*;
import java.io.*;

public class JoueurKasamido{
    public static void main(String[] args) {

        Socket sock;
        int port;
        String nomMach;

        if(args.length != 2){
            System.out.println("Error : Maching name and Port missing.");
            System.exit(1);
        }
        
        try{
            nomMach = args[0];
            port = Integer.parseInt(args[1]);
            sock = new Socket(nomMach, port);
            
        }catch(UnknownHostException e){
            System.out.println("Unknown Host."+e);
        }
    }
}