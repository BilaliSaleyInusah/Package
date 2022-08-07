import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.plaf.ColorUIResource;

import java.awt.Color;

public class MyWindow  extends Frame {
    
    public MyWindow(String title) {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                // super.windowClosed(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("My First Complete Java Programming Course", 60, 60);
        g.setFont(sansSerifSmall);
        // g.setColor(new ColorUIResource(000));
        g.drawString("By Gh Zoolian", 60, 100);
    }

}
