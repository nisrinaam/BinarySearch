/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author TOSHIBA
 */
class Node{
     Node left;
     Node right;
     int data;
 
     public Node(int n){
         left = null;
         right = null;
         data = n;
     }
     
    public void setLeft(Node n){
        left = n;
    }
 
    public void setRight(Node n){
        right = n;
    }
 
    public Node getLeft(){
        return left;
    }
    
    public Node getRight(){
        return right;
    }

    public void setData(int d){
 
        data = d;
    }
 
    public int getData() {
        return data;
    }
 }