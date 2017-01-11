

import javax.swing.*;
import java.awt.*;

/**
 * Created by Baptiste CHEVET on 10/01/2017.
 */
public class MarioTheme extends JButton implements IThemeFactory {
    @Override
    public JButton createButton() {
        JButton button = new JButton();
        button.setBackground(Color.RED);
        return button;
    }
}
