package laba09.ex2;

import java.util.ArrayList;

public class LabClassDriver {
    public static void main(String[] args) {
        ArrayList<Student> s=new LabClass().inputs();
        /*ArrayList<Student> s = new ArrayList<>();
        s.add(new Student(12,67,"Селиверстов Наум Никитевич"));
        s.add(new Student(10,65,"Миронов Осип Тимурович"));
        s.add(new Student(1,61,"Егоров Агафон Николаевич"));
        s.add(new Student(25,47,"Орехов Ким Германнович"));
        s.add(new Student(8,37,"Баранов Мечеслав Онисимович"));*/

        new LabClassUI(s);
    }
}
