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
public class LinkedList {
    
    class Node{
        int data;
        int key;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
        public Node(int key, int data){
            this.key = key;
            this.data = data;
            this.next = null;
        }
    }
    
    Node head = null;
    Node last = null;
    
    public Boolean isEmpty(){
        return head==null;
    }
    
    public void add(int item){
        if(isEmpty()){
            head = new Node(item);
        }
        else{
            Node temp = new Node(item);
            temp.next = head; 
            head = temp; 
        }
    }
    
    public void addForHash(int key, int item){
        if(isEmpty()){
            head = new Node(key, item);
        }
        else{
            Node temp = new Node(key, item);
            temp.next = head; 
            head = temp; 
        }
    }
    
    public void remove(){
        if (isEmpty()){
            System.out.println("Sorry no data in the list.");
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }
    
    public int size(){
        int size = 0 ;
        Node p = head;
        while(p != null){
            size++;
            p = p.next;
        }
        return size;
    }
    
    public void insert(int index, int item){
        if(isEmpty()){
            head = new Node(item);
        }
        
        else if(index == 0){
            Node temp = new Node(item);
            temp.next = head; 
            head = temp; 
        }
         
        else{
            Node temp = new Node(item);
            Node p = head; 
            int count = 0;
            while(count != index-1 && p.next != null){
                count++;
                p = p.next;
            }
            
                temp.next = p.next;
                p.next = temp;
        }
    }
    
    public void printall(){
        Node p = head;
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
        System.out.println("*****************");
    }
    
    
    public void printForHash(int key){
        Node p = head;
        boolean found = false;
        while(p!= null){
            if(p.key == key){
                System.out.println(p.data);
                found = true;
                break; 
            }
            else{
                p = p.next; 
            } 
        }
        
        if(!found){
                System.out.println("Value not found.");
            }
    }
    
    public void indexRemove(int index){
        if(isEmpty()){
            System.out.println("Fuck Outta here");
        }
        
        else if(index == 0){
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        else{
            Node p = head;
            int count = 0;
            while(count != index-1){
                count++;
                p = p.next;
            }
            Node temp = p.next;
            p.next = p.next.next;
            temp.next = null;
        }
    }
    
    public void sort(){
        int max = 0;
        Node p = head;
        for(int i=0; i <size()-1;i++){
            while (p.next != null){
                if(p.data > p.next.data){
                    max = p.next.data;
                    p.next.data = p.data ;
                    p.data = max;
                }
                p = p.next;
            }
            
            p = head; 
        }
        printall();
    }
    
    public void removeDuplicate(){
        Node p = head;
        Node q = head; 
        for(int i=0; i <size()-1;i++){
            while (q.next != null){
                if(q.next.data ==  p.data){
                    q.next = q.next.next;
                }
                q = q.next;
            }
            p = p.next; 
            q= p; 
        }
        printall();
    }
}
