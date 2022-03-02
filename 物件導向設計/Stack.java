


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuchi
 */
public class Stack<E> extends ArrayList<E> {
    private int numOfStack=4;
    private int topIndex=0;

    public Stack(int numOfStack) {
    }
    public Stack() {
    }   
    public boolean push(E e) {
        return false;
    }
    public E pop() {
        return null;
    }
    public E peek() {
        return null;
    }        
    public boolean isFull() {
        return false;                
    }     
    public boolean isEmpty() {
        return false;
    }
}
