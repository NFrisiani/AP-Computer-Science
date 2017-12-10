// Chapter 6 Question 16

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class NicoloFrisianiBmi extends JFrame
  implements ActionListener
{
  JTextField inputLbs, inputInches, displayBmi;

  public NicoloFrisianiBmi()
  {
    super("BMI Calculator");
    JLabel labelLbs = new JLabel("Weight (lbs):", SwingConstants.RIGHT);
    inputLbs = new JTextField(5);
    JLabel labelInches = new JLabel("Height (inches):", SwingConstants.RIGHT);
    inputInches = new JTextField(5);
    JLabel labelBmi = new JLabel("BMI = ", SwingConstants.RIGHT);
    displayBmi = new JTextField(5);
    displayBmi.setEditable(false);
    JButton go = new JButton("Compute");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setBackground(Color.white);
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(3, 2, 5, 5));
    p.add(labelLbs);
    p.add(inputLbs);
    p.add(labelInches);
    p.add(inputInches);
    p.add(labelBmi);
    p.add(displayBmi);
    c.add(p, BorderLayout.CENTER);
    c.add(go, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e)
  {
    int lbs = Integer.parseInt(inputLbs.getText());
    int inches = Integer.parseInt(inputInches.getText());
    double bmi = calculateBmi(lbs, inches);
    DecimalFormat df = new DecimalFormat("00.0");
    displayBmi.setText(df.format(bmi));
  }

  // Returns BMI equal to weight in kilograms divided
  // over squared height in meters.
  private double calculateBmi(double lbs, double inches)
  {
   double bmi = (lbs * 0.454)/((inches * 0.0254) * (inches * 0.0254));
return bmi;
  }

  public static void main(String[] args)
  {
    NicoloFrisianiBmi w = new NicoloFrisianiBmi();
    w.setBounds(300, 300, 300, 160);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

