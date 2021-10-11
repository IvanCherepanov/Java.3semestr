package laba09.ex2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LabClassUI extends JFrame {
    private JTable studTable;
    private ArrayList<Student> studentsss;
    public LabClassUI(ArrayList<Student> students) throws HeadlessException {

        super("Студенты");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);

        studentsss=students;
        JPanel panel = new JPanel(new FlowLayout());
        JButton addStudentBtn = new JButton("Добавить студента");
        JButton removeStudentBtn = new JButton("Удалить студента");
        JButton findStudentBtn = new JButton("Найти студента");
        //JButton sortStudentBtn = new JButton("Сортировать");

        panel.add(addStudentBtn);
        panel.add(removeStudentBtn);
        panel.add(findStudentBtn);
        //panel.add(sortStudentBtn);

        //обработчик кнопок делаем
        addStudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    addStudent();
                }
                catch (Exception exception){
                    JOptionPane.showMessageDialog(null,exception.getMessage());
                }
            }
        });
        removeStudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{removeStudent();}
                catch (StudentNotFoundException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        findStudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    findBtnClicked();
                }catch (StudentNotFoundException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        // JTable
        //Object[] columns = new String[] {"ID","Средний балл","ФИО"};
        Object[] columns = {"ID","Средний балл","ФИО"};
        Object [][] startStudents = new Object[students.size()][3];
        for(int i = 0; i < students.size(); i++){
            //startStudents[i][0] = ((Integer)(students.get(i).getIdNumber())).toString();
            startStudents[i][0] = ((students.get(i).getIdNumber()));
            System.out.println(startStudents[i][0].getClass());
            startStudents[i][1] = ((Integer)(students.get(i).getMark())).toString();
            System.out.println(startStudents[i][1].getClass());
            startStudents[i][2] = students.get(i).getSurname();
        }
        studTable = new JTable( new DefaultTableModel(startStudents, columns)){
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Integer.class; //работает с багом
                    case 1:
                        return Integer.class;
                    case 2:
                    default:
                        return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = studTable.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);
        studTable.setAutoCreateRowSorter(true);

        // Adding comps
        getContentPane().add(new JScrollPane(studTable), BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.NORTH);
        setVisible(true);
    }

    private void findBtnClicked() throws StudentNotFoundException{
        String s = JOptionPane.showInputDialog("Введите искомый ФИО");
        for(int i = 0; i < studentsss.size(); i++){
            if(studentsss.get(i).getSurname().equals(s)){
                JOptionPane.showMessageDialog(this, "Найден студент: "+
                        studentsss.get(i).toString());
                return;
            }
        }
        throw new StudentNotFoundException(s);
    }

    private void removeStudent() throws StudentNotFoundException{
        String s = JOptionPane.showInputDialog("Введите искомый ФИО");
        for(int i = 0; i < studentsss.size(); i++){
            if(studentsss.get(i).getSurname().equals(s)){
                JOptionPane.showMessageDialog(this, "Найден студент: "+
                        studentsss.get(i).toString());
                studentsss.remove(i);
                DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

                dtm.removeRow(i);
            }
        }
        throw new StudentNotFoundException(s);
    }

    private void addStudent()  throws Exception {
        String id = JOptionPane.showInputDialog("Пожалуйста, введите ID!");
        String mark = JOptionPane.showInputDialog("Пожалуйста, введите средний балл!");
        String fio = JOptionPane.showInputDialog("Пожалуйста, введите фио!");
        if(fio.equals("")) throw new EmptyStringException();

        int inpID =0;
        int inpMark = 0;
        try {
            inpID = Integer.parseInt(id);
            inpMark = Integer.parseInt(mark);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Невозможно строку "+e.getMessage().substring(17) + " в число!");
        }

        studentsss.add(new Student(inpID,inpMark,fio));

        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        dtm.addRow(new Object[]{inpID,inpMark,fio});
    }

    private void sortStudents(Comparator<Student> comp){

        /*TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(studTable.getModel());
        studTable.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        //sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
        //sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);*/
    }

}
