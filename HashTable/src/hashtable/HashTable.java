/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.Scanner;
import singlelinkedlist.LinkedList;

/**
 *
 * @author aamoshdahal
 */
public class HashTable {
    static LinkedList[] array = new LinkedList[9];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        
        for(int i=0;i<9;i++){
            array[i] = new LinkedList();
        }
        
        Hashfunction(array,"3","20");
        Hashfunction(array,"0","11");
        Hashfunction(array,"1","5");
        Hashfunction(array,"2","14");
        Hashfunction(array,"4","10");
        Hashfunction(array,"5","9");
        Hashfunction(array,"6","89");
        Hashfunction(array,"7","54");
        Hashfunction(array,"8","8");
        Hashfunction(array,"9","77");
        Hashfunction(array,"10","87");
        Hashfunction(array,"85","76");
        Hashfunction(array,"54","6");
        Hashfunction(array,"32","98");
        Hashfunction(array,"11","35");
        Hashfunction(array,"13","37");
        Hashfunction(array,"88","1");
        Hashfunction(array,"14","5");
        Hashfunction(array,"18","20");
        Hashfunction(array,"19","35");
        Hashfunction(array,"17","3");
        System.out.println("*****************************");
        findValue("10");
        findValue("17");
        findValue("1");
        findValue("30");
    }
    
    public static void Hashfunction(LinkedList[]array,String key,String value){
        int index = Integer.parseInt(key) % 9;
        array[index].addForHash(Integer.parseInt(key),Integer.parseInt(value));
    }
    
    public static void findValue(String key){
        int index = Integer.parseInt(key)%9;
        array[index].printForHash(Integer.parseInt(key));
    }
}
