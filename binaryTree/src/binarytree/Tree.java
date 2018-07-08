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
public class Tree {
    
   public class Node{
        int data; 
        Node left; 
        Node right; 
        Node parent;
        
       public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }
   
   Node root = null;
   
   public boolean isEmpty(){
       return root == null;
   }
   
   public void add(int data){
       Node temp = root;
       if(isEmpty()){
           root = new Node(data);
       }
       else{
           while(true){
               if(data >= temp.data){
                   if(temp.right == null){
                       Node p = new Node(data);
                       temp.right = p;
                       p.parent = temp;
                       return;
                   }
                   else{
                       temp = temp.right;
                   }
                }
               else{
                   if(temp.left == null){
                       Node p = new Node(data);
                       temp.left = p;
                       p.parent = temp;
                       return;
                   }
                   else{
                       temp = temp.left;
                   }
               }
            }
        }
   }
   
   public void display(){
       System.out.println("Your Inorder tree traversal is: ");
       displayInOrder(this.root);
       System.out.println("***************************");
       System.out.println("Your Preorder tree traversal is: ");
       displayPreOrder(this.root);
       System.out.println("***************************");
       System.out.println("Your Postorder tree traversal is: ");
       displayPostOrder(this.root);
   }
   
   public void displayInOrder(Node p){
       if(p==null){
           return;
       }
       else{
           displayInOrder(p.left);
           System.out.println(p.data+ " ");
           displayInOrder(p.right);
       }
   }
   
   public void displayPreOrder(Node p){
       if(p == null){
           return;
       }
       else{
           System.out.println(p.data+ " ");
           displayPreOrder(p.left);
           displayPreOrder(p.right);
       }
   }
   
   public void displayPostOrder(Node p){
       if(p == null){
           return;
       }
       else{
           displayPostOrder(p.left);
           displayPostOrder(p.right);
           System.out.println(p.data+ " ");
       }
   }
}
