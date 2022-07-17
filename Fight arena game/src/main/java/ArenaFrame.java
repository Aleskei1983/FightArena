import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;

public class ArenaFrame extends JPanel{
    private Timer timer;
    private Component grafic;
    private int healthUnit = 20;
    private int lifeBarWight = 400;
    private boolean inGame = true;
    private boolean next = false;
    private JLabel keyPressed = new JLabel("Key");
    private String text = "Probel: ";
    public ArenaFrame(){
        setBackground(Color.black);
        add(keyPressed);
        //changeHealthBar();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
        TimerListener timerListener = new TimerListener();
        timer = new Timer(10, timerListener);
        timer.start();


    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillRect(20, 20, lifeBarWight, 20);
        g.fillRect(getWidth()/2 +50, 20, lifeBarWight, 20);
    }
    public void changeHealthBar(){
        if (next == true) {
            lifeBarWight -= healthUnit;
            next = false;
            keyPressed.setText("Text");
        }
        //lifeBarWight -= 2;
    }
    private class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            changeHealthBar();
            repaint();
        }
    }

    private class FieldKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_SPACE) {
                keyPressed.setText(text);
                next = true;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
