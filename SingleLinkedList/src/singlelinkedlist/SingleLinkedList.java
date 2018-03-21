/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

/**
 *
 * @author aamoshdahal
 */
public class SingleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList l1 = new LinkedList();
        l1.add(6);
        l1.add(20);
        l1.add(9);
        l1.add(20);
        l1.insert(0, 10);
        l1.insert(1, 60);
        l1.insert(2, 30);
        l1.insert(3,20);
        l1.removeDuplicate();
    }
    
}
