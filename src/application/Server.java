package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	public Server() {
        try {
        	while(true) {
        	ServerSocket serverSocket = new ServerSocket(5000); 
			System.out.println("server start"); 
			Socket socket = serverSocket.accept();  
			System.out.println("[client] : " + socket.getInetAddress()); 
			InputStream is = socket.getInputStream(); 
			OutputStream os = socket.getOutputStream(); 
			ObjectInputStream ois = new ObjectInputStream(is); 
			ObjectOutputStream oos = new ObjectOutputStream(os); 
			TrashController tc = new TrashController();
			int pro = (int) ois.readObject();  
			switch (pro)
			{
			case 01:
				int key = (int) ois.readObject();
				SInformation trash = tc.TrashSelect(key);
				oos.writeObject(trash); 
				socket.close();
				break;
			case 02:
				String str = (String) ois.readObject();
				String str2 = (String) ois.readObject();
				String str3 = (String) ois.readObject();
				ArrayList<SInformation> trashAll = tc.TrashSearch(str,str2,str3);
				oos.writeObject(trashAll);
				socket.close();
				break;
			case 0x03:
				break;
			}						
			serverSocket.close();
			socket.close();
        	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) { 
			e.printStackTrace(); 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrashDao dao = new TrashDao();
		new Server();
		
	}
}
