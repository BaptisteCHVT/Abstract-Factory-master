

import javax.swing.*;


/**
 * Created by Baptiste CHEVET on 10/01/2017.
 */
public class StarWarsThemeButton extends JButton implements IButton {

    @Override
    public JButton getButton() {
        return new StarWarsTheme().createButton();
    }
}
