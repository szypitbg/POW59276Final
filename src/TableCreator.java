import javax.swing.*;
import java.awt.*;

public class TableCreator extends JPanel {
    public static JTable tableCreatorCreate(String[]array, String[][]rows)
    {
        JTable table = new JTable(rows, array);
        table.setPreferredScrollableViewportSize(new Dimension(500,48));
        table.setFillsViewportHeight(true);
        return table;
    }
}
