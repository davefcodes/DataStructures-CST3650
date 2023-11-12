package edu.citytech.cst3650.datastructure.singlylinkedlist;

import edu.learning.datatructure.java17.facade.AbstractLinkedList;
import edu.learning.datatructure.java17.facade.AbstractNode;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.IntFunction;

public class SinglyLinkedList<T> extends AbstractLinkedList<T> {

    private AbstractNode<T> first; // head
    private AbstractNode<T> last; // tail

    public SinglyLinkedList(IntFunction<T[]> intFunction){
        super.intFunction = intFunction;
        super.items = intFunction.apply(0);

    }

    @Override
    public boolean add(T item) {
        incrementSize();

        var node = new Node<T>(item);

        if (AbstractNode.isEmpty(first)){
            first = last = node;
        }
        else {
            last.setNext(node);
            last = node; // it makes the new tail
        }
        return true;
    }


    @Override
    protected AbstractNode<T> getFirstNode() {
        return first;
    }

    @Override
    public Optional<T> getFirstItem() {
        if (AbstractNode.isEmpty(first)) {
            return Optional.empty();
        } else {
            T value = first.getValue();
            return Optional.of(value);
        }
    }

    @Override
    public Optional<T> getLastItem() {
        if (AbstractNode.isEmpty(last)) {
            return Optional.empty();
        } else {
            T value = last.getValue();
            return Optional.of(value);
        }
    }

    @Override
    public T removeFirst() {

        if (AbstractNode.isEmpty(first))
            throw new NoSuchElementException("No more data size is: " + this.size());



        super.decrementSize();

        if (this.first == this.last){
            first = last = null;
            return null;
        }

        AbstractNode<T> secondNode = this.first.getNext();
        first.setNext(null);
        first = secondNode;

        return first.getValue();
    }

    @Override
    public T removeLast() {

        if (AbstractNode.isEmpty(first))
            throw new NoSuchElementException(this.getClass().getSimpleName() + "size is " + size());

        decrementSize();

        if (first == last){
            T value = first.getValue();
            first = last = null;
            return value;
        }


//        if (first == last){
//            first = last = null;
//            return null;
//        }

        AbstractNode<T> nextToLastNode = this.getPreviousNode(first, last);
        T value = last.getValue();
        last = nextToLastNode;
        last.setNext(null);

        return value;
    }

    private AbstractNode<T> getPreviousNode(AbstractNode<T> first, AbstractNode<T> node){

        AbstractNode<T> current = first;
        while(current != null){
            if (current.getNext() == node)
                return current;

            current = current.getNext();

        }

        return null;
    }
}
