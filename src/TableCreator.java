import javax.swing.*;
import java.awt.*;

public class TableCreator extends JPanel {
    public static JTable tableCreatorCreate(String[]array, String[][]rows)
    {
        JTable table = new JTable(rows, array);
        table.setPreferredScrollableViewportSize(new Dimension(600,60));
        table.setFillsViewportHeight(true);
        return table;
    }
}
