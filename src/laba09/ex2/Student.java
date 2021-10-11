package laba09.ex2;

public class Student implements Comparable<Student>{
    private int idNumber;
    private int mark;
    private String surname;

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student(int idNumber, int mark, String surname) {
        this.idNumber = idNumber;
        this.mark = mark;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", mark=" + mark +
                ", surname='" + surname + '\'' +
                '}';
    }
    public void outputS() {
        System.out.print("idNumber=" + idNumber);
        System.out.print(", mark=" + mark);
        System.out.println(", surname=" + surname);
    }


    @Override
    public int compareTo(Student o1) {
        return o1.getMark();
    }
}

