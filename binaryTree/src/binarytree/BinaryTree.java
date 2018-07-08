/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author aamoshmacbook
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tree tree = new Tree(); 
        tree.add(15);
        tree.add(7);
        tree.add(9);
        tree.add(16);
        tree.add(1);
        tree.add(20);
        tree.add(17);
        tree.display();
    }
    
}
