package laba08;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
    }
    /**
     * Поскольку в очереди удаление в начало, доступ в конец, то
     * будем брать элементы и с помощью remove удаляемое значение возвращать в
     * временную переменную
     * и значение вставлять в конец

    public void remove(E element) {
        boolean flag = false;
        for(int i = 0; i < content.size(); i++){
            E el = content.remove();
            if(!flag && el.equals(element)){
                flag = true; // i--
            }else{
                content.add(el);
            }
        }
        if(flag){
            content.add(content.remove());
        }
    }*/
    public void remove(E element) {
        if (element==this.content.peek()) {
            moveToBack(element);
        }
        else this.content.remove(element);
    }
    //
    public void moveToBack(E element){
        boolean flag=content.contains(element);
        if(flag){
            remove();
            content.add(element);
        }
    }
}
