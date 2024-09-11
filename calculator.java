import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
class Calculator implements ActionListener { 
     
      double input, result; 
      String Cal; 
     JFrame frame; 
     JLabel label = new JLabel(); 
     JTextField textView = new JTextField(); 
     
     JButton symclr = new JButton("CLR"); 
     JButton symdel = new JButton("DEL"); 
     JButton symmul = new JButton("*"); 
     JButton symdiv = new JButton("/"); 
     
     JButton numseven = new JButton("7"); 
     JButton numeight = new JButton("8"); 
     JButton numnine = new JButton("9"); 
     JButton symminus = new JButton("-"); 
     
     JButton numfour = new JButton("4"); 
     JButton numfive = new JButton("5"); 
     JButton numsix = new JButton("6"); 
     JButton symplus = new JButton("+"); 
       
     JButton numone = new JButton("1"); 
     JButton numtwo = new JButton("2"); 
     JButton numthree = new JButton("3"); 
     JButton symequal = new JButton("="); 
     
     JButton numzero = new JButton("0"); 
     JButton symdot = new JButton("."); 
     
     Calculator() { 
        CreateInterface(); 
        InterfaceComponents(); 
        AddInterfaceEventListener(); 
     } 
     
     public void CreateInterface() { 
        frame = new JFrame(); 
        frame.setTitle("Java Calculator"); 
        frame.getContentPane().setLayout(null); 
        frame.setLocationRelativeTo(null); 
        frame.setResizable(false); 
        frame.setSize(310, 400); 
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
       
     public void InterfaceComponents() { 
         label.setBounds(200, 0, 50, 50); 
        frame.add(label); 
        textView.setBounds(10, 50, 265, 40); 
        textView.setEditable(false); 
        textView.setHorizontalAlignment(SwingConstants.RIGHT); 
        frame.add(textView); 
         
        symclr.setBounds(10, 110, 60, 40); 
        frame.add(symclr); 
        symdel.setBounds(80, 110, 60, 40); 
        frame.add(symdel); 
        symmul.setBounds(150, 110, 60, 40); 
        frame.add(symmul); 
        symdiv.setBounds(220, 110, 60, 40); 
        frame.add(symdiv); 
         
        numseven.setBounds(10, 160, 60, 40); 
        frame.add(numseven); 
        numeight.setBounds(80, 160, 60, 40); 
        frame.add(numeight); 
        numnine.setBounds(150, 160, 60, 40); 
        frame.add(numnine); 
        symminus.setBounds(220, 160, 60, 40); 
        frame.add(symminus); 
         
        numfour.setBounds(10, 210, 60, 40); 
        frame.add(numfour); 
        numfive.setBounds(80, 210, 60, 40); 
        frame.add(numfive); 
        numsix.setBounds(150, 210, 60, 40); 
        frame.add(numsix); 
        symplus.setBounds(220, 210, 60, 40); 
        frame.add(symplus); 
         
        numone.setBounds(10, 260, 60, 40); 
        frame.add(numone); 
        numtwo.setBounds(80, 260, 60, 40); 
        frame.add(numtwo); 
        numthree.setBounds(150, 260, 60, 40); 
        frame.add(numthree); 
        symequal.setBounds(220, 260, 60, 90); 
        frame.add(symequal); 
         
        numzero.setBounds(10, 310, 130, 40); 
        frame.add(numzero); 
        symdot.setBounds(150, 310, 60, 40); 
        frame.add(symdot); 
     } 
 
      public void AddInterfaceEventListener() { 
        symclr.addActionListener(this); 
        symdel.addActionListener(this); 
        symmul.addActionListener(this); 
        symdiv.addActionListener(this); 
         
        numseven.addActionListener(this); 
        numeight.addActionListener(this); 
        numnine.addActionListener(this); 
        symminus.addActionListener(this); 
         
        numfour.addActionListener(this); 
        numfive.addActionListener(this); 
        numsix.addActionListener(this); 
        symplus.addActionListener(this); 
         
        numone.addActionListener(this); 
        numtwo.addActionListener(this); 
        numthree.addActionListener(this); 
        symequal.addActionListener(this); 
         
        numzero.addActionListener(this); 
        symdot.addActionListener(this); 
    } 
     
    public void actionPerformed(ActionEvent e) { 
        Object event = e.getSource(); 
        if (event == numone) { 
            textView.setText(textView.getText() + "1"); 
        } else if (event == numtwo) { 
            textView.setText(textView.getText() + "2"); 
        } else if (event == numthree) { 
            textView.setText(textView.getText() + "3"); 
        } else if (event == numfour) { 
            textView.setText(textView.getText() + "4"); 
        } else if (event == numfive) { 
            textView.setText(textView.getText() + "5"); 
        } else if (event == numsix) { 
            textView.setText(textView.getText() + "6"); 
        } else if (event == numseven) { 
            textView.setText(textView.getText() + "7"); 
        } else if (event == numeight) { 
            textView.setText(textView.getText() + "8"); 
        } else if (event == numnine) { 
            textView.setText(textView.getText() + "9"); 
        } else if (event == numzero) { 
            if (textView.getText().equals("0")) { 
                return; 
            } else { 
                textView.setText(textView.getText() + "0"); 
            } 
        } else if (event == symdot) { 
            if (textView.getText().contains(".")) { 
                return; 
            } else { 
                textView.setText(textView.getText() + "."); 
            } 
        } else if (event == symclr) { 
            label.setText(" "); 
            textView.setText("");     
        } else if (event == symdel) { 
            int length = textView.getText().length(); 
            int number = length - 1; 
            if (length > 0) { 
                StringBuilder numString=new StringBuilder(textView.getText()); 
                numString.deleteCharAt(number); 
                textView.setText(numString.toString());         
            }  
            if (textView.getText().endsWith(" ")) { 
                label.setText(" "); 
            } 
        } else if (event == symmul) { 
            String presentNumber = textView.getText(); 
            input = Double.parseDouble(textView.getText()); 
            textView.setText(" "); 
            label.setText(presentNumber + " * "); 
            Cal = "*"; 
        } else if (event == symdiv) { 
            String presentNumber = textView.getText(); 
            input = Double.parseDouble(textView.getText()); 
            textView.setText(" "); 
            label.setText(presentNumber + " / "); 
            Cal = "/"; 
        } else if (event == symminus) { 
            String presentNumber = textView.getText(); 
            input = Double.parseDouble(textView.getText()); 
            textView.setText(" "); 
            label.setText(presentNumber + " - "); 
            Cal = "-"; 
        } else if (event == symplus) { 
            String presentNumber = textView.getText(); 
            input = Double.parseDouble(textView.getText()); 
            textView.setText(" "); 
            label.setText(presentNumber + " + "); 
            Cal = "+"; 
        } else if (event == symequal) { 
            switch (Cal) { 
                case "*" : 
                    result = input * (Double.parseDouble(textView.getText())); 
                    if (Double.toString(result).endsWith(".0")) { 
                        textView.setText(Double.toString(result).replace(".0", "")); 
                    } else { 
                        textView.setText(Double.toString(result)); 
                    } 
                    label.setText(""); 
                    break; 
                case "/" :  
                    result = input / (Double.parseDouble(textView.getText())); 
                    if (Double.toString(result).endsWith(".0")) { 
                        textView.setText(Double.toString(result).replace(".0", "")); 
                    } else { 
                        textView.setText(Double.toString(result)); 
                    } 
                    label.setText(""); 
                    break; 
                case "-" :  
                    result = input - (Double.parseDouble(textView.getText())); 
                    if (Double.toString(result).endsWith(".0")) { 
                        textView.setText(Double.toString(result).replace(".0", "")); 
                    } else { 
                        textView.setText(Double.toString(result)); 
                    } 
                    label.setText(""); 
                    break; 
                case "+" :  
                    result = input + (Double.parseDouble(textView.getText())); 
                    if (Double.toString(result).endsWith(".0")) { 
                        textView.setText(Double.toString(result).replace(".0", "")); 
                    } else { 
                        textView.setText(Double.toString(result)); 
                    } 
                    label.setText(""); 
                    break; 
            } 
        } 
    } 
 
    public static void main(String[] args) { 
        new Calculator(); 
    } 
} 