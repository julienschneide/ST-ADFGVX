/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.st;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
public class adfgvx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Character> table = new HashMap<>();
        String message = "objectif arras 15h28";
        String encryptedMessage;
        String cle = "MARCEL";
        
        table = initTable();        
        encryptedMessage = substitue(message, table);
        encryptedMessage = transposition(cle, encryptedMessage);
        
        System.out.println(encryptedMessage);
        

    }
    
    private static Map<String, Character> initTable(){     
        Map<String, Character> tempTable = new HashMap<>();
        
        tempTable.put("AA", 'c');
        tempTable.put("AD", '1');
        tempTable.put("AF", 'o');
        tempTable.put("AG", 'f');
        tempTable.put("AV", 'w');
        tempTable.put("AX", 'j');
        
        tempTable.put("DA", 'y');
        tempTable.put("DD", 'm');
        tempTable.put("DF", 't');
        tempTable.put("DG", '5');
        tempTable.put("DV", 'b');
        tempTable.put("DX", '4');
        
        tempTable.put("FA", 'i');
        tempTable.put("FD", '7');
        tempTable.put("FF", 'a');
        tempTable.put("FG", '2');
        tempTable.put("FV", '8');
        tempTable.put("FX", 's');
        
        tempTable.put("GA", 'p');
        tempTable.put("GD", '3');
        tempTable.put("GF", '0');
        tempTable.put("GG", 'q');
        tempTable.put("GV", 'h');
        tempTable.put("GX", 'x');
        
        tempTable.put("VA", 'k');
        tempTable.put("VD", 'e');
        tempTable.put("VF", 'u');
        tempTable.put("VG", 'l');
        tempTable.put("VV", '6');
        tempTable.put("VX", 'd');
        
        tempTable.put("VA", 'v');
        tempTable.put("VD", 'r');
        tempTable.put("VF", 'g');
        tempTable.put("VG", 'z');
        tempTable.put("VV", 'n');
        tempTable.put("VX", '9');
                
        return tempTable;
    }
    
    private static String substitue(String message, Map<String, Character> table){
        String encrpytedMessage = "";
        
        message = message.trim();
        for(int i=0; i<message.length(); i++){
            for(String c : table.keySet()){
                if(table.get(c) == message.charAt(i)){
                    
                    encrpytedMessage = encrpytedMessage + c ;
                }
            }
        }
        return encrpytedMessage;
    }
    
    private static String transposition(String cle, String message){
        
        return "-";
    }
    
    private static String decrypt(String message){
        return "-";
    }
    
}
