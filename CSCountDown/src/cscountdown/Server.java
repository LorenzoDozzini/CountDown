/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cscountdown;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Utente
 */
public class Server {
    ServerSocket ss;
    Socket so;
    BufferedWriter bw;
    BufferedReader br;
    public Server(int porta){
        try {
            ss = new ServerSocket(porta);
            System.out.println("il server è in ascolto...");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void inAscolto(){
        try {
            so = ss.accept();
            System.out.println("Connessione stabilita");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void scrivi(String messaggio){
        try {
            bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
            bw.write(messaggio+"\n");
            bw.flush();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
