import java.io.*;
import java.applet.*;
import java.awt.*;
/*
<applet code="app1.java" width=500 height=1000>
</applet>
*/
public class app1 extends Applet
{
public void init()
{
Label ob=new Label("name");
TextField ob1=new TextField(20);
Button bt=new Button("submit");
Label ob2=new Label("age");
TextField ob3=new TextField(2);
Button bt1=new Button("ok");
add(ob);
add(ob1);
add(bt);
add(ob2);
add(ob3);
add(bt1);
}
}