/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cscountdown;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Utente
 */
public class GestioneClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Client c = new Client(InetAddress.getLocalHost(), 2000);
            
            String msgletto = c.leggi();
            System.out.println(msgletto);
        } catch (UnknownHostException ex) {
            Logger.getLogger(GestioneClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
