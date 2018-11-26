import java.io.*;
import java.applet.*;
import java.awt.*;
/*
<applet code="app6.java" width=500 height=1000>
</applet>
*/
public class app6 extends Applet 
{
public void init()
{
setBackground(Color.black);
setForeground(Color.red);
Label ob=new Label("Name");
TextField ob1=new TextField(20);
Button bt=new Button("submit");
add(ob);
add(ob1);
add(bt);
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
}
}