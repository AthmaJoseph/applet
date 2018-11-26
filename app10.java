import java.io.*;
import java.applet.*;
import java.awt.*;

import java.awt.event.*;
/*
<applet code="app10.java" width=1024 height=720>
</applet>
*/
public class app10 extends Applet implements ActionListener 
{
Button bt,bt1,bt2,bt3,bt4;
public void init()
{
setBackground(Color.black);
bt=new Button("yellow");
bt1=new Button("red");
bt2=new Button("green");
bt3=new Button("blue");
bt4=new Button("white");
add(bt);
bt.addActionListener(this);
add(bt1);
bt1.addActionListener(this);
add(bt2);
bt2.addActionListener(this);
add(bt3);
bt3.addActionListener(this);
add(bt4);
bt4.addActionListener(this);
}
public void paint(Graphics g)
{
}
public void actionPerformed(ActionEvent me )
{
if(me.getSource()==bt)
setBackground(Color.yellow);
else if(me.getSource()==bt1)
setBackground(Color.red);
else if(me.getSource()==bt2)
setBackground(Color.green);
else if(me.getSource()==bt3)
setBackground(Color.blue);
else if(me.getSource()==bt4)
setBackground(Color.white);
else
setBackground(Color.black);
}

}