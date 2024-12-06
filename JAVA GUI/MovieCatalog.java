import javax.swing.*;
import java.awt.Font;
import java.awt.*;


class WelcomePage
{
   JFrame frame = new JFrame("Movie Catalog");
   
   
   WelcomePage()
   {
      ImageIcon img1 = new ImageIcon("C:/Users/Gabe/Downloads/Chaba.jpg");
      ImageIcon img2 = new ImageIcon("C:/Users/Gabe/Downloads/TLK.jpg");
   
      JLabel label1 = new JLabel();
      label1.setText("");
      label1.setIcon(img1);
      label1.setVerticalAlignment(JLabel.BOTTOM);
      label1.setHorizontalAlignment(JLabel.RIGHT);
      
      JLabel label2 = new JLabel();
      label2.setText("");
      label2.setIcon(img2);
      
      
      JPanel redPanel = new JPanel();
     // redPanel.setBackground(Color.red);
      redPanel.setBounds(0, 0, 250, 250);
      
      JPanel blackPanel = new JPanel();
      //blackPanel.setBackground(Color.black);
      blackPanel.setBounds(250, 0, 250, 250);
      
      JPanel greenPanel = new JPanel();
     // greenPanel.setBackground(Color.green);
      greenPanel.setBounds(0, 250, 250, 250);
      greenPanel.setLayout(new BorderLayout());

      
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(750, 750);
      frame.setLayout(null);
      frame.setVisible(true);
      frame.add(redPanel);
      redPanel.add(label1);
      frame.add(blackPanel);
      blackPanel.add(label2);   
      frame.add(greenPanel);   
   }
}

public class MovieCatalog
{
   public static void main(String[] args)
   {
      new WelcomePage();
   }
}