package laba08;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity; //неизменяемая

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < capacity){
            super.add(element);
        }
        else{
            System.out.println("Очередь заполнена!");
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                "; content=" + content+
                '}';
    }
}
