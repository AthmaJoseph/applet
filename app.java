import java.io.*;
import java.applet.*;
import java.awt.*;
/*
<applet code="app.java" width=500 height=1000>
</applet>
*/
public class app extends Applet 
{
Label ob;
public void init()
{
setBackground(Color.yellow);
setForeground(Color.green);
ob=new Label("Name");
Label ob1=new Label("abc");
TextField ob2=new TextField();
TextField ob3=new TextField(20);
TextField ob4=new TextField("SAC");
Button bt=new Button("submit");
add(ob);
add(ob2);
add(ob1);
add(ob3);
add(ob4);
add(bt);
}
public void paint(Graphics g)
{
g.drawLine(100,100,100,500);
g.drawString("Hai",100,200);
g.drawRect(100,200,400,300);
g.drawOval(100,200,400,300);
g.drawRoundRect(10,10,10,20,30,10);
g.setColor(Color.red);
g.fillOval(100,200,400,300);
}
}