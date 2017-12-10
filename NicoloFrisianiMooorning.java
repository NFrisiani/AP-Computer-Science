import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class NicoloFrisianiMooorning extends JFrame 
implements ActionListener

{
	 private NicoloFrisianiMooorning rooster;
	 private NicoloFrisianiMooorning moo;
	 private int counter;
	 private int time;

	 

  public NicoloFrisianiMooorning()
  {
	  
    super("Morning");
    time = 0;
    Timer clock = new Timer(5000, this); 
    clock.start();
    rooster = new EasySound("roost.wav"); 
    rooster.play();
    Container x = getContentPane();
    x.setBackground(Color.WHITE);
    
   }
  
  private void AnimalVerse() {

   if(counter%2 != 0) {
    moo = new EasySound("moo.wav");
    moo.play();
    Container x = getContentPane();
    x.setBackground(Color.BLACK);
    }else{
       rooster = new EasySound("roost.wav");
    	    rooster.play();
    	    Container x = getContentPane();
    	    x.setBackground(Color.WHITE);
    }
    
    

  
  }
  
  public void paintComponent(Graphics g)
  {
 
    int y = 130 - (int)(75 * Math.sin(0.005 * Math.PI * time));
    
    Color sky;
    if (y > 130) sky = Color.BLACK;
    else sky = Color.WHITE;
    setBackground(sky);
    super.paintComponents(g);

    
  }
  
  
  
  public void actionPerformed(ActionEvent e )
  {
    time++;
    repaint();
  }
  
  public static void main(String[] args)
  {
    NicoloFrisianiMooorning morning = new NicoloFrisianiMooorning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
