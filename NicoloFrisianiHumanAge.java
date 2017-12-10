
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class NicoloFrisianiHumanAge extends JFrame
  implements ActionListener
{
  JTextField inputDogYears, displayHumanAge;


  public void actionPerformed(ActionEvent e)
  {
	  
	int humanage = 0;
    int DogYears = Integer.parseInt(inputDogYears.getText());
    int HumanAge = calculateHumanAge(DogYears, humanage);
    DecimalFormat df = new DecimalFormat("0");
    displayHumanAge.setText(df.format(HumanAge));
    
   
  }

  
  
  private int calculateHumanAge(int DogYears, int humanage)
  {
	 
   if (DogYears == 1) {
	   
	  humanage = 13;
   }else{
	   
	   humanage = 13 + (((DogYears - 1) *16) / 3);
   }
return humanage;
   
  }
  
  
  public NicoloFrisianiHumanAge()
  {
    super("Human Age Converter");
    JLabel labelDogYears = new JLabel("Dog Years:", SwingConstants.RIGHT);
    inputDogYears = new JTextField(5);
    JLabel labelHumanAge = new JLabel("Human Age = ", SwingConstants.RIGHT);
    displayHumanAge = new JTextField(5);
    displayHumanAge.setEditable(false);
    JButton go = new JButton("Compute");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setBackground(Color.white);
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(3, 2, 5, 5));
    p.add(labelDogYears);
    p.add(inputDogYears);
    p.add(labelHumanAge);
    p.add(displayHumanAge);
    c.add(p, BorderLayout.CENTER);
    c.add(go, BorderLayout.SOUTH);
  }



  public static void main(String[] args)
  {
    NicoloFrisianiHumanAge w = new NicoloFrisianiHumanAge();
    w.setBounds(300, 300, 300, 160);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

