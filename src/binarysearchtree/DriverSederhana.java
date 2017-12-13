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
public class DriverSederhana {
    public static void main(String[] args) {
        BinarySearchTree bt =new BinarySearchTree();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        System.out.println(bt.contains(2));
        
    }
}