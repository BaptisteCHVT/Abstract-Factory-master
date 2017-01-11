
import javax.swing.*;

/**
 * Created by Baptiste CHEVET on 10/01/2017.
 */
public class MarioThemeButton extends JButton implements IButton{

    public JButton getButton(){
        return new MarioTheme().createButton();
    }
}
