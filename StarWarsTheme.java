

import javax.swing.*;
import java.awt.*;

/**
 * Created by Baptiste CHEVET on 10/01/2017.
 */
public class StarWarsTheme extends JButton implements IThemeFactory {
    @Override
    public JButton createButton() {
        JButton button = new JButton();
        button.setBackground(Color.BLUE);
        return button;
    }
}
