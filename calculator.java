import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calculator implements ActionListener{
	String s0="";
	String s1="";
	String s2="";
    JFrame jf;
    JLabel j1;
    JButton sevenbutton;
    JButton eightbutton;
    JButton ninebutton;
    JButton fourbutton;
    JButton fivebutton;
    JButton sixbutton;
    JButton onebutton;
    JButton twobutton;
    JButton threebutton;
    JButton dotbutton;
    JButton zerobutton;
    JButton equalbutton;
    JButton divisionbutton;
    JButton mulbutton;
    JButton minusbutton;
    JButton plusbutton;
    JButton clearbutton;
	double te;
	
    public calculator(){
      jf = new JFrame("Calculator");
       jf.setLayout(null);
       jf.setSize(600,600);
       jf.setLocation(100,200);
       j1 =new JLabel();
       j1.setBounds(30,50,540,40);
       j1.setBackground(Color.gray);
       j1.setHorizontalAlignment(SwingConstants.RIGHT);
       j1.setForeground(Color.white);
       j1.setOpaque(true);
       jf.setVisible(true);
       jf.add(j1);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       sevenbutton =new JButton("7");
       sevenbutton.setBounds(30,130,80,80);
       sevenbutton.addActionListener(this);
       sevenbutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(sevenbutton);
       eightbutton =new JButton("8");
       eightbutton.setBounds(130,130,80,80);
       eightbutton.addActionListener(this);
       eightbutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(eightbutton);
       ninebutton =new JButton("9");
       ninebutton.setBounds(230,130,80,80);
       ninebutton.setFont(new Font("Arial",Font.PLAIN,40));
       ninebutton.addActionListener(this);
       jf.add(ninebutton);
       fourbutton =new JButton("4");
       fourbutton.setBounds(30,230,80,80);
       fourbutton.addActionListener(this);
       fourbutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(fourbutton);
       fivebutton =new JButton("5");
       fivebutton.setBounds(130,230,80,80);
       fivebutton.addActionListener(this);
       fivebutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(fivebutton);
       sixbutton =new JButton("6");
       sixbutton.setBounds(230,230,80,80);
        sixbutton.addActionListener(this);
       sixbutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(sixbutton);
       onebutton =new JButton("1");
       onebutton.setBounds(30,330,80,80);
        onebutton.addActionListener(this);
       onebutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(onebutton);
       twobutton =new JButton("2");
       twobutton.setBounds(130,330,80,80);
        twobutton.addActionListener(this);
       twobutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(twobutton);
       threebutton =new JButton("3");
       threebutton.setBounds(230,330,80,80);
        threebutton.addActionListener(this);
       threebutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(threebutton);
       dotbutton =new JButton(".");
       dotbutton.setBounds(30,430,80,80);
        dotbutton.addActionListener(this);
       jf.add(dotbutton);
       zerobutton =new JButton("0");
       zerobutton.setBounds(130,430,80,80);
        zerobutton.addActionListener(this);
       zerobutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(zerobutton);
       equalbutton =new JButton("=");
       equalbutton.setBounds(230,430,80,80);
        equalbutton.addActionListener(this);
       equalbutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(equalbutton);
       divisionbutton =new JButton("/");
       divisionbutton.setBounds(330,130,80,80);
       divisionbutton.addActionListener(this);
       divisionbutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(divisionbutton);
       mulbutton =new JButton("*");
       mulbutton.setBounds(330,230,80,80);
       mulbutton.addActionListener(this);
       mulbutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(mulbutton);
       minusbutton =new JButton("-");
       minusbutton.setBounds(330,330,80,80);
       minusbutton.addActionListener(this);
       minusbutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(minusbutton);
       plusbutton =new JButton("+");
       plusbutton.setBounds(330,430,80,80);
       plusbutton.addActionListener(this);
       plusbutton.setFont(new Font("Arial",Font.PLAIN,40));
       jf.add(plusbutton);
       clearbutton =new JButton("C");
       clearbutton.setBounds(430,430,80,80);
       clearbutton.addActionListener(this);
       jf.add(clearbutton);
    }

    
  public static void main(String args[]){
   new calculator();
  }

@Override
public void actionPerformed(ActionEvent e) {
	String s =e.getActionCommand();
if((s.charAt(0)>='0' && s.charAt(0)<='9' || s.charAt(0)=='.')){
	if(!s1.equals(""))
		s2 =s2+s;
	else
		s0 =s0+s;
	
	j1.setText(s0+s1+s2);
	}

else if(s.charAt(0)=='C'){
	s0=s1=s2="";
	j1.setText(s0+s1+s2);

}
else if(s.charAt(0)== '='){
	
	if(s1.equals("+"))
	te = (Double.parseDouble(s0)+Double.parseDouble(s2));
	else if(s1.equals("-"))
	te = (Double.parseDouble(s0)- Double.parseDouble(s2));
	else if(s1.equals("*"))
	te = (Double.parseDouble(s0)* Double.parseDouble(s2));
	else
	te = (Double.parseDouble(s0) / Double.parseDouble(s2));
	j1.setText(s0+s1+s2+"="+te);
	s0 = Double.toString(te);
	s1=s2="";
	}
	else{
		if(s1.equals("") || s2.equals(""))
		 s1=s;
		 else{
			if(s1.equals("+"))
	te = (Double.parseDouble(s0)+Double.parseDouble(s2));
	else if(s1.equals("-"))
	te = (Double.parseDouble(s0)- Double.parseDouble(s2));
	else if(s1.equals("*"))
	te = (Double.parseDouble(s0)* Double.parseDouble(s2));
	else
	te = (Double.parseDouble(s0) / Double.parseDouble(s2));
	s0 = Double.toString(te);
	s1=s;
	s2="";
	}
	j1.setText(s0+s1+s2);
	}

	}


}

