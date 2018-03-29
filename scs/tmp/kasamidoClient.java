import java.net.*;
import java.io.*;

public class kasamidoClient{
    public static void main(String[] args) throws IOException {
        byte [] output = new byte[4];
        Socket sock;
        int port;
        String nomMach;
        String nomJoueur="";
        int idReq = -1;
        int pion = -1;

        if(args.length != 2){
            System.out.println("Error : Maching name and Port missing.");
            System.exit(1);
        }
        
        try{
            nomMach = args[0];
            port = Integer.parseInt(args[1]);
            sock = new Socket(nomMach, port);
            if(sock != null){
                System.out.println("socket ok.");
                System.out.println("Please enter your name and the color that you want(NAME COLOR(BLANC_NOIR)):");
                //PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
                //BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
                //OutputStream outputStream = sock.getOutputStream();
                String input;
                //System.out.println("Input move(separated by space): coup");
                input = stdIn.readLine();
                output = input.getBytes();
                OutputStream outputStream = sock.getOutputStream();
                outputStream.write(output);
                //OutputStreamWriter ops = new OutputStreamWriter(sock.getOutputStream());
                
                //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
                
                System.out.println(input);
                
                //out.println(input);
                //System.out.println("Please enter your name and the color that you want(NAME COLOR(BLANC_NOIR)):");
                //input = stdIn.readLine();
                //ops.write(input);
                //ops.write(input);
                //ops.flush();
                //in.close();
                stdIn.close();
                sock.close();
            }
        }catch(UnknownHostException e){
            System.out.println("Unknown Host."+e);
        }
    }
}
