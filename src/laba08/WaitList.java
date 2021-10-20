package laba08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        this.content=new ConcurrentLinkedQueue<>();
    }

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = new ConcurrentLinkedQueue<>(content);;
    }

    @Override
    public void add(E element) {
        this.content.add(element);
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            System.out.println("Pust");
            return null;
        }
        return this.content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     Параметры: параметр C является коллекцией. Этот параметр относится к набору,
     вхождение элементов которого необходимо проверить в этом наборе.

     Возвращаемое значение: метод возвращает True, если этот набор содержит все элементы другого набора,
     в противном случае он возвращает False.
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        ArrayList<E> arrayList = new ArrayList<>(c);
        for(int i = 0; i < c.size(); i++){
            boolean res = false;
            for(int j = 0; j < content.size(); j++){
                res=content.contains(arrayList.get(i));
            }
            if(!res) return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();//метод очереди
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
