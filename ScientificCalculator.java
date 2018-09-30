import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane; 

class ScientificCalculator implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton bl,bc,br,bslp,beqn,bdis,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bsclr,be,bo;
    static double a=0,b=0,result=0,r=0,s=0,o=0;
    static int operator=0;
 
    ScientificCalculator()
    {
        f=new JFrame("Point Calculator");
        t=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bslp=new JButton("slp");
        beqn=new JButton("eqn");
        bdis=new JButton("dist");
        bdel=new JButton("Del");
        bclr=new JButton("Clear");
        bl=new JButton("(");
        br=new JButton(")");
        bc=new JButton(",");
        bsclr = new JButton("Sclr");
        be = new JButton("Eqls");
        bo = new JButton("Org");

        
        t.setBounds(30,40,280,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        bsclr.setBounds(320,100,65,40);
        
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        be.setBounds(320,170,65,40);

        
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bo.setBounds(320,240,65,40);

        
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        
        bl.setBounds(40,380,50,40);
        bc.setBounds(110,380,50,40);
        br.setBounds(180,380,50,40);
        bdel.setBounds(250,380,60,40);
        

        bslp.setBounds(30,450,65,40);
        beqn.setBounds(105,450,60,40);
        bdis.setBounds(175,450,60,40);
        bclr.setBounds(245,450,65,40);
        f.add(bclr);
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bslp);
        f.add(beqn);
        f.add(bdis);
        f.add(bl);
        f.add(br);
        f.add(bc);
        f.add(bdel);
        f.add(bsclr);
        f.add(be);
        f.add(bo);
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,570);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);
        bdis.addActionListener(this);
        beqn.addActionListener(this);
        bslp.addActionListener(this);
        bl.addActionListener(this);
        br.addActionListener(this);
        bc.addActionListener(this);
        bdel.addActionListener(this);
        bsclr.addActionListener(this);
        be.addActionListener(this);
        bo.addActionListener(this);


    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));

        
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        
        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        
        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        
        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        
        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        
        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));
        
        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));
        if(e.getSource()==bl)
            t.setText(t.getText().concat("("));
        
        if(e.getSource()==bc)
            t.setText(t.getText().concat(", "));
        
        if(e.getSource()==br)
            t.setText(t.getText().concat(")"));
        
        if(e.getSource()==badd)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            
            operator=1;
            t.setText("");

        } 
        
        if(e.getSource()==bsub)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            operator=2;
            t.setText("");
        }
        
        if(e.getSource()==bmul)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            operator=3;
            t.setText("");
        }
        
        if(e.getSource()==bdiv)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            operator=4;
            t.setText("");
        }
        if(e.getSource()==bslp)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            operator=5;
            t.setText("");
        }
        if(e.getSource()==beqn)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            operator=6;
            t.setText("");
        }
        if(e.getSource()==bdis)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            operator=7;
            t.setText("");
        }
        if(e.getSource()==bsclr)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            String t= JOptionPane.showInputDialog("Please input scalar quantity to be mutiplied: ");
            o=Double.parseDouble(t);
            operator=8;
        }
        if(e.getSource()==bo)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            Point p = new Point(a,r);

            t.setText(p.isOrigin());

        }
        if(e.getSource()==be)
        {
        	String x= t.getText();
        	int cnt=0;
        	while(x.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x1 = x.substring(1, cnt);
        	String y=x.substring(cnt+2,x.length()-1); 
            a=Double.parseDouble(x1);
            r=Double.parseDouble(y);
            operator=9;
           
            }
        
        if(e.getSource()==beq)
        {
        	String z= t.getText();
        	int cnt=0;
        	while(z.charAt(cnt)!=',') {
        		cnt++;
        	}
        	String x2 = z.substring(1, cnt);
        	String y2=z.substring(cnt+2,z.length()-1); 
            b=Double.parseDouble(x2);
            s=Double.parseDouble(y2);
            Point p2 = new Point(b,s);
            Point p = new Point(a,r);


     
            switch(operator)
            {
                case 1: t.setText(p.sum(p2).print());
                    break;
                case 2:  t.setText(p.sub(p2).print());
                break;
                case 3: t.setText(p.mul(p2).print());
                break;
                case 4: t.setText(p.div(p2).print());
                break;
                case 5: t.setText(Float.toString(p.slope(p2)));
                break;
                case 6: t.setText(p.EoL(p2));
                break;
                case 7: t.setText(Double.toString(p.distance(p2)));
                break; 
                case 8: t.setText(p.scalarMultiply(o).print());
                break;  
                case 9: t.setText(p.equals(p2));
                break;
                
                default: result=(0);
            }
        
        }
        
        if(e.getSource()==bclr)
            t.setText("");   
        if(e.getSource()==bdel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        } 
    }
 
    public static void main(String[] args)
    {
        new ScientificCalculator();
    }
}