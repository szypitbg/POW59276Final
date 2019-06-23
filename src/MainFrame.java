import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MainFrame extends JPanel implements ActionListener {

    JLabel lGetData, lNameDays, lGetNameDays;
    JButton bAddFilm, bAddSong, bAddOrder, bDeleteFilm, bDeleteSong, bDeleteOrder;

    public MainFrame() {


        lGetData = new JLabel("Data : "+ new Date(), JLabel.LEFT);
        add(lGetData);




        JScrollPane jps = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"Wydarzenia - "+ new Date()}
                ,
                new String[][]{{"Kupić prezent Julce"},{"Wynieść śmieci"},{"Iść na zakupy"}}));

        add(jps);

        JScrollPane jps1 = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"Tytuł filmu","Reżyser","Komentarz"}
                ,
                new String[][]{{"Tytuł 1", "Reżyser 1", "Uwagi 1"},
                        {"Tytuł 2", "Reżyser 2", "Uwagi 2"},
                        {"Tytuł 3", "Reżyser 3", "Uwagi 3"}}));


        add(jps1);
        bAddFilm = new JButton("Dodaj film");
        bAddFilm.addActionListener(this);
        add(bAddFilm);
        bDeleteFilm = new JButton("Usuń film");
        bDeleteFilm.addActionListener(this);
        add(bDeleteFilm);


        JScrollPane jps2 = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"Tytuł piosenki","Autor","Komentarz"}
                ,
                new String[][]{{"Tytuł 1", "Autor 1", "Uwagi 1"},
                        {"Tytuł 2", "Autor 2", "Uwagi 2"},
                        {"Tytuł 3", "Autor 3", "Uwagi 3"}}));

        add(jps2);
        bAddSong = new JButton("Dodaj piosenkę");
        bAddSong.addActionListener(this);
        add(bAddSong);
        bDeleteSong = new JButton("Usuń piosenkę");
        bDeleteSong.addActionListener(this);
        add(bDeleteSong);

        JScrollPane jps3 = new JScrollPane(TableCreator.tableCreatorCreate(
                new String[]{"Przedmiot do kupienia","Komentarz"}
                ,
                new String[][]{{"Artykuł 1", "Uwagi 1"},
                        {"Artykuł 2", "Uwagi 2"},
                        {"Artykuł 3", "Uwagi 3"}}));

        add(jps3);
        bAddOrder = new JButton("Nowy przedmiot");
        bAddOrder.addActionListener(this);
        add(bAddOrder);
        bDeleteOrder = new JButton("Usuń przedmiot");
        bDeleteOrder.addActionListener(this);
        add(bDeleteOrder);




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
