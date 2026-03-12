import java.awt.*;
import javax.swing.*;

public class BorderFrame extends JFrame{
    public BorderFrame(String title){
        super(title);
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        

        this.setVisible(true);
    }
}
