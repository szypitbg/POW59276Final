import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MainFrame extends JPanel implements ActionListener {

    JLabel lGetData, lNameDays, lGetNameDays;

    public MainFrame() {


        lGetData = new JLabel("Data : "+ new Date(), JLabel.LEFT);


        JScrollPane jps = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"PROBAPROBA123"}
                ,
                new String[][]{{"PROBAPROBA123"}, {"PROBAPROBA123"}}));


        JScrollPane jps1 = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"PROBAPROBA123"}
                ,
                new String[][]{{"PROBAPROBA123"}, {"PROBAPROBA123"}}));


        JScrollPane jps2 = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"PROBAPROBA123"}
                ,
                new String[][]{{"PROBAPROBA123"}, {"PROBAPROBA123"}}));
        add(jps);
        add(jps1);
        add(jps2);
        add(lGetData);


    }
        public static void main(String[] args) {



            JFrame MainWindow = new JFrame();
            MainFrame f = new MainFrame();
            MainWindow.setTitle("Organizer");
            MainWindow.setSize(600,600);
            MainWindow.setVisible(true);
            MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            MainWindow.add(f);

        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
