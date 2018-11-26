import java.io.*;
import java.applet.*;
import java.awt.*;

import java.awt.event.*;
/*
<applet code="app7.java" width=1024 height=720>
</applet>
*/
public class app7 extends Applet implements ActionListener 
{
public void init()
{
setBackground(Color.black);
setForeground(Color.red);
Label ob=new Label("username");
TextField ob1=new TextField(20);
Label ob2=new Label("password");
TextField ob3=new TextField(20);
Button bt=new Button("submit");
add(ob);
add(ob1);
add(ob2);
add(ob3);
add(bt);
bt.addActionListener(this);
}
public void paint(Graphics g)
{
g.drawOval(100,200,400,300);
g.setColor(Color.yellow);
g.fillOval(100,200,400,300);
g.setColor(Color.green);
g.drawString("Hai",400,300);
g.drawRect(100,200,400,300);
g.drawLine(100,200,500,500);
g.drawLine(500,200,100,500);
g.setColor(Color.red);
g.fillOval(100,300,100,100);
g.setColor(Color.blue);
g.fillOval(250,200,100,100);
g.setColor(Color.blue);
g.fillOval(250,400,100,100);
g.setColor(Color.red);
g.fillOval(400,300,100,100);
g.setColor(Color.red);
g.setColor(Color.white);
g.fillRoundRect(150,70,300,100,50,200);
g.setColor(Color.red);
g.drawString("SAC",250,120);
g.setColor(Color.white);
g.fillOval(125,320,50,50);
g.fillOval(275,220,50,50);
}

public void actionPerformed(ActionEvent me )
{
setBackground(Color.red);
}
}