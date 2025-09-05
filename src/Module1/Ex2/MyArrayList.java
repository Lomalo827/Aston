package Module1.Ex2;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {

    private Object[] elementData;

    private static final int DEFAULT_CAPACITY = 10;;

    private static final Object[] EMPTY_ELEMENTDATA = {};

    private int size;

    MyArrayList(){
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    MyArrayList(int initialCapacity){
        if (initialCapacity>0){
            elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0){
            elementData = EMPTY_ELEMENTDATA;
        }
        else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public boolean add(T element){
        ensureCapacity(size+1);
        elementData[size++] = element;
        return true;
    }

    public boolean addAll(Collection<? extends T> c){
        Object[] a = c.toArray();
        int newLenght = a.length;

        if (newLenght==0){
            return false;
        }

        ensureCapacity(size+newLenght);
        System.arraycopy(a,0,elementData,size,newLenght);
        size+=newLenght;
        return true;
    }

    public Object get(int index){
        checkIndex(index);
        return elementData[index];
    }

    public void remove(int index){
        checkIndex(index);
        int numMoved = size - index -1;
        System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
    }


    private void checkIndex(int index){
        if(index>=size || index<0){
            throw new IndexOutOfBoundsException();
        }
    }

    private void ensureCapacity(int minCapacity){
        if (minCapacity- elementData.length>0){
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity){
        int oldCapacity = elementData.length;
        int newCapacity;
        newCapacity = oldCapacity+ (oldCapacity>>1);
        if (newCapacity-minCapacity<0){
            newCapacity=minCapacity;
        }
        elementData = Arrays.copyOf(elementData,newCapacity);
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}