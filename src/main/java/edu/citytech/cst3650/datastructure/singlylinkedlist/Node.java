package edu.citytech.cst3650.datastructure.singlylinkedlist;

import edu.learning.datatructure.java17.facade.AbstractNode;

class Node<T> extends AbstractNode<T>{
     private Node<T> next = null;

     public Node(T value){
         super.value = value;
     }

    @Override
    public void setValue(T value) {
        super.value = value;
    }

    @Override
    public AbstractNode   getNext() {
        return next;
    }

    @Override
    public void setNext(AbstractNode<T> node) {
        this.next = (Node<T>) node;
    }
}