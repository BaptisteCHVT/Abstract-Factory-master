

import javax.swing.*;
import javax.swing.text.html.Option;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Baptiste CHEVET on 10/01/2017.
 */


public class Main extends JFrame {
    public Main(){
        this.setTitle("Abstract Factory");
        this.setSize(300, 300);

        JPanel panel = new JPanel();

        JComboBox<String> box = new JComboBox<>();
        box.addItem("Star Wars");
        box.addItem("Mario");

        panel.add(box);

        IThemeFactory button= new StarWarsTheme();
        JButton jButton = button.createButton();

        panel.add(jButton);

        box.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jButton;
                if(box.getSelectedItem().equals("Star Wars")){
                    IThemeFactory button = new StarWarsTheme();
                    jButton = button.createButton();
                }
                else {
                    IThemeFactory button = new MarioTheme();
                    jButton = button.createButton();
                }

                panel.remove(1);
                panel.add(jButton);
                panel.repaint();
                panel.revalidate();

            }
        });

        this.setContentPane(panel);
        this.setVisible(true);
    }

    public static void main(String[] args){
        JFrame jFrame = new Main();
    }
}
