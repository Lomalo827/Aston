package Module1.Ex2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyHashSet<T> {

    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTORY = 0.75f;
    private Node[] bucket;
    private int size;
    private int threshold ;


    MyHashSet(){
        this.bucket = new Node[INITIAL_CAPACITY];
        this.threshold= (int)(INITIAL_CAPACITY*LOAD_FACTORY);
    }
    public static class Node<T>{
        final T value;
        final int hash;
        Node<T> next;

        Node (T value, int hash, Node<T> next){
            this.value=value;
            this.hash=hash;
            this.next=next;
        }

    }
    public boolean remove(T element){
        int hash = hash(element);
        int index = (bucket.length-1)& hash;
        Node<T> node = bucket[index];
        Node<T> prev = null;

        while (node!=null){
            if (node.hash == hash && node.value==element ||
                    element!=null && element.equals(node.value)){
                if (prev==null){
                    bucket[index]= node.next;
                }else{prev.next=node.next;}
                size--;
                return true;
            }
            prev=node;
            node=node.next;
        }
        return false;
    }

    public boolean add(T element){
        int hash=hash(element);
        int index = (bucket.length-1) & hash;
        Node<T> node = bucket[index];

        while (node!=null){
            if (node.hash == hash && node.value == element ||
                    element!=null && element.equals(node.value)){
                return false;
            }
            node=node.next;
        }

        bucket[index] = new Node<>(element,hash,node);
        size++;

        if (size>threshold){
            resize();
        }
        return true;
    }

    private void resize(){
        Node<T>[] oldBucket = bucket;
        int newCapacity = oldBucket.length*2;
        bucket = new Node[newCapacity];
        threshold = (int)(newCapacity*LOAD_FACTORY);

        for (int i = 0; i<oldBucket.length;i++){
            Node<T> node = oldBucket[i];
            while (node!=null){
                Node<T> next = node.next;
                int newIndex= (bucket.length-1) & node.hash;
                node.next=bucket[newIndex];
                bucket[newIndex]=node;
                node=next;
            }
        }

    }

    private int hash(Object key){
        if (key==null){
            return 0;
        }
        int h = key.hashCode();
        return h ^(h>>16);
    }


    public int size(){
        return size;
    }

    @Override
    public String toString() {
        if (size==0){
            return "[]";
        }
        Iterator<T> iterator = new HashSetIterator();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        while (iterator.hasNext()){
            T element = iterator.next();
            stringBuilder.append(element);
            if (iterator.hasNext()){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private class HashSetIterator<E> implements Iterator<E>{

        private int index;
        private Node<E> current;
        private Node<E> next;

        HashSetIterator(){
            index=0;
            next=findNext();
        }

        @Override
        public boolean hasNext() {
            return next!=null;
        }


        @Override
        public E next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            current=next;
            next=findNext();
            return current.value;
        }

        private Node<E> findNext(){
            if (current!=null && current.next!=null){
                return current.next;
            }
            while (index<bucket.length){
                if (bucket[index]!=null){
                    return bucket[index++];
                }
                index++;
            }
            return null;
        }
    }
}