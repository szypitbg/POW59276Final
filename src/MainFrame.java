import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MainFrame extends JPanel implements ActionListener {

    JLabel lGetData, lNameDays, lGetNameDays;
    JButton bAddFilm, bAddSong, bAddOrder, bDeleteFilm, bDeleteSong, bDeleteOrder;

    public MainFrame() {


        lGetData = new JLabel("Data : "+ new Date(), JLabel.LEFT);


        JScrollPane jps = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"Wydarzenia - "+ new Date()}
                ,
                new String[][]{{"Kupić prezent Julce"},{"Wynieść śmieci"},{"Iść na zakupy"}}));


        JScrollPane jps1 = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"Tytuł filmu","Reżyser","Komentarz"}
                ,
                new String[][]{{"Tytuł 1", "Reżyser 1", "Uwagi 1"},
                        {"Tytuł 2", "Reżyser 2", "Uwagi 2"},
                        {"Tytuł 3", "Reżyser 3", "Uwagi 3"}}));


        JScrollPane jps2 = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"Tytuł piosenki","Autor","Komentarz"}
                ,
                new String[][]{{"Tytuł 1", "Reżyser 1", "Uwagi 1"},
                        {"Tytuł 2", "Reżyser 2", "Uwagi 2"},
                        {"Tytuł 3", "Reżyser 3", "Uwagi 3"}}));

        JScrollPane jps3 = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"Przedmiot do kupienia","Komentarz"}
                ,
                new String[][]{{"Artykuł 1", "Uwagi 1"},
                        {"Artykuł 2", "Uwagi 2"},
                        {"Artykuł 3", "Uwagi 3"}}));
        add(jps);
        add(jps1);
        add(jps2);
        add(jps3);
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
