import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class help {
    public static void main(String[] args) {
        Object[][] data = {
                {new Integer(12), "Don't Let Go", new Integer(179)},
                {new Integer(10), "Photograph", new Integer(29)},
                {new Integer(1), "Hash Pipe", new Integer(186)},
                {new Integer(25), "Island In The Sun", new Integer(200)},
                {new Integer(8), "Crab", new Integer(154)},

        };
        Object[] columns = {"Track #", "Title", "Length"};
        DefaultTableModel model = new DefaultTableModel(data,columns) {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Integer.class;
                    case 1:
                        return String.class;
                    case 2:
                        return Integer.class;
                    default:
                        return String.class;
                }
            }
        };
        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);
        table.setAutoCreateRowSorter(true);
        JOptionPane.showMessageDialog(null, scroll);
    }
}
