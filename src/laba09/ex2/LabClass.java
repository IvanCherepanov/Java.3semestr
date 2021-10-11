package laba09.ex2;

import java.util.ArrayList;
import java.util.Comparator;

public class LabClass implements Comparator<Student> {
    private Student[] ar;
    private ArrayList<Student> arrayList;
    private int index; // число элементов

    public LabClass() {
        this.arrayList = new ArrayList<Student>();
    }

    public LabClass(int maxSize) {
        this.ar = new Student[maxSize];
        this.index = 0;
    }
    public void insert(int idNumber, int mark, String surname){
        ar[index++]= new Student(idNumber,mark,surname);
    }
    public  void display(){
        for (int i=0;i<index;i++){
            ar[i].outputS();
        }
    }
    public void quickSort(Student arr[] , int left, int right){
        if (arr.length == 0)
            return;//при нулевой длине прекращаем

        if (left >= right)
            return;//границы встретились, нет элементов между ними

        // найдем середину списка по индексу и значение в этом индексе
        int middle = left + (right - left) / 2;
        int pivot = arr[middle].getMark();

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = left, j = right;
        while (i <= j) {
            //находим элемент, который больше граничного
            while (compare(arr[i],arr[middle])<0) {
                i++;
            }
            //находим элемент, который меньше граничного
            while (compare(arr[j],arr[middle])>1) {
                j--;
            }

            if (i <= j) {//меняем местами(аналог swap)
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (left < j)
            quickSort(arr, left, j);

        if (right > i)
            quickSort(arr, i, right);
    }


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMark()-o2.getMark();
    }
    public ArrayList<Student> inputs(){
        arrayList.add(new Student(12,67,"Селиверстов Наум Никитевич"));
        arrayList.add(new Student(10,65,"Миронов Осип Тимурович"));
        arrayList.add(new Student(1,61,"Егоров Агафон Николаевич"));
        arrayList.add(new Student(25,47,"Орехов Ким Германнович"));
        arrayList.add(new Student(8,37,"Баранов Мечеслав Онисимович"));
        return arrayList;
    }
    public static void main(String[] args) {
        LabClass labClass=new LabClass();
        labClass.inputs();
    }
}
