/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;
import java.awt.*;
/**
 *
 * @author sandy
 */
public class la5_inputfromkey2 extends Panel {
    public la5_inputfromkey2() {
setBackground(Color.black);
}
    @Override
public void paint(Graphics g) {
g.setColor(new Color(0,255,0)); //green
g.setFont(new Font("Helvetica",Font.PLAIN,16));
g.drawString("Hello GUI World!", 30, 100);
g.setColor(new Color(1.0f,0,0)); //red
g.fillRect(30, 100, 150, 10);
}
public static void main(String args[]) {
Frame f = new Frame("Testing Graphics Panel");
la5_inputfromkey2 gp = new la5_inputfromkey2();
f.add(gp);
f.setSize(600, 300);
f.setVisible(true);
}
}

