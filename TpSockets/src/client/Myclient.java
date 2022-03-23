package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Myclient {
	public static void main (String[] args ) throws Exception {
		System.out.println("Je me connecte au serveur");
		Socket socket = new Socket ("localhost",1234);
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		Scanner scanner = new Scanner(System.in);
		System.out.println("svp donner un nbre");
		int nb = scanner.nextInt();
		System.out.println("j'envoie"+nb+"au serveur");
		os.write(nb);
		System.out.println("J'attend la réponse");
		int rep = is.read();
		System.out.println(" la réponse est"+rep);




		
		
	}

}
