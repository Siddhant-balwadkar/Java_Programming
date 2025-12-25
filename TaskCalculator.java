import.java.awt.*;
import.javax.swing.*;

class Calculator implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton Addobj, Subobj, Mulobj, Divobj;
    JLabel Number1label, Number2label, Resultlabel;
    JTextField N1obj, N2obj;

    public Calculator(String title, int width, int height)
    {
        JFrame fobj = new JFrame(title);
        fobj.setSize(width,height);

        Number1label = new JLabel("Number 1");
        Number1label.setBounds();

        Number2label = new JLabel("Number 2");
        Number2label.setBounds();

        Resultlabel = new JLabel("Result:");
        Resultlabel.setBounds();

        N1obj = new Textfield();
        N1obj.setBounds();

        N2obj = new Textfield();
        N2obj.setBounds();

        Addobj = new JButton("+");
        Addobj.setBounds();

        Subobj = new JButton("-");
        Subobj.setBounds();

        Mulobj = new JButton("*");
        Mulobj.setBounds();

        Divobj = new JButton("/");
        Divobj.setBounds();

        fobj.add(N1obj);
        fobj.add(N2obj);
        fobj.add(Number1label);
        fobj.add(Number2label);
        fobj.add(Resultlabel);
        fobj.add(Addobj);
        fobj.add(Subobj);
        fobj.add(Mulobj);
        fobj.add(Divobj);

        Addobj.addActionListener(this);
        Subobj.addActionListener(this);
        Mulobj.addActionListener(this);
        Divobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent aobj)
    { 
        if()
    }

}

class TaskCalculator
{
    public static void main(String A[])
    {
        TaskCalculator tcobj = new TaskCalculator("Calculator",600,500);
    }


}