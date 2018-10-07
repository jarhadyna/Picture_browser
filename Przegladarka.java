import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Przegladarka {
    public static void main(String[] args) {
        Okno okno=new Okno();
    }
}

class Okno extends JFrame implements ActionListener {
    int nrObrazka=1;
    Panel panel=null;
    public Okno(){
        setTitle("Obrazki");
        setSize(450,300);
        JButton przycisk=new JButton("Dalej");
        przycisk.addActionListener(this);
        panel=new Panel();
        panel.setNumer(1);
        getContentPane().add(przycisk,BorderLayout.SOUTH);
        getContentPane().add(panel,BorderLayout.CENTER);
        setDefaultCloseOperation(3);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent ae){
        if (nrObrazka<5) {nrObrazka++;}
        else nrObrazka=1;
        panel.setNumer(nrObrazka);
        panel.repaint();
    }

}

class Panel extends JPanel {
    int nrObrazka;
    public void paintComponent(Graphics g){
        ImageIcon im=new ImageIcon(nrObrazka+".jpg");
        Image ob=im.getImage();
        g.drawImage(ob,45,45,null,null);
    }
    public void setNumer(int nr){nrObrazka=nr;}
}