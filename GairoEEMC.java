package outreach;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;

public class GairoEEMC extends JFrame implements ActionListener {

    JLabel ujumbe, eujumbe, ujumbe1, ujumbe2, ujumbe3, ujumbe4, ujumbe5, ujumbe6, eujumbe1, eujumbe2, eujumbe3, eujumbe4, eujumbe5, eujumbe6;
    JLabel lab, lab1, lab2, lab3, lab4, lab5, lab6,logo1,logo2,logolab,logolab2;
    JRadioButton jumbe1, jumbe2, jumbe3, jumbe4, jumbe5, jumbe6;

    GairoEEMC() {
        setUndecorated(true);
        getContentPane().setBackground(new Color(0, 51, 102));
        setLayout(null);

        JLabel header = new JLabel("CASFETA TAYOMI-UDOM ");
        header.setBounds(420, 10, 700, 30);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Railway", Font.BOLD, 35));
        add(header);

        JLabel header2 = new JLabel("GAIRO MOROGORO-OUTREACH");
        header2.setBounds(450, 50, 400, 30);
        header2.setForeground(new Color(255, 153, 0));
        header2.setFont(new Font("Railway", Font.BOLD, 22));
        add(header2);

        JLabel w1 = new JLabel("2");
        w1.setBounds(180, 220, 30, 40);
        w1.setForeground(Color.WHITE);
        w1.setFont(new Font("SANS_SERIF", Font.BOLD, 42));
        add(w1);

        JLabel w2 = new JLabel("0");
        w2.setBounds(180, 290, 30, 40);
        w2.setForeground(Color.WHITE);
        w2.setFont(new Font("SANS_SERIF", Font.BOLD, 42));
        add(w2);

        JLabel w3 = new JLabel("2");
        w3.setBounds(180, 350, 30, 40);
        w3.setForeground(Color.WHITE);
        w3.setFont(new Font("SANS_SERIF", Font.BOLD, 42));
        add(w3);

        JLabel w4 = new JLabel("4");
        w4.setBounds(180, 420, 30, 40);
        w4.setForeground(Color.WHITE);
        w4.setFont(new Font("SANS_SERIF", Font.BOLD, 42));
        add(w4);

        JLabel g1 = new JLabel("-");
        g1.setBounds(1130, 160, 30, 40);
        g1.setForeground(new Color(255, 255, 255));
        g1.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        add(g1);

        JLabel g2 = new JLabel("E");
        g2.setBounds(1120, 220, 30, 40);
        g2.setForeground(new Color(255, 153, 0));
        g2.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        add(g2);

        JLabel g3 = new JLabel("E");
        g3.setBounds(1120, 280, 30, 40);
        g3.setForeground(new Color(255, 153, 0));
        g3.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        add(g3);

        JLabel g4 = new JLabel("M");
        g4.setBounds(1120, 340, 30, 40);
        g4.setForeground(new Color(255, 153, 0));
        g4.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        add(g4);

        JLabel g5 = new JLabel("C");
        g5.setBounds(1120, 400, 30, 40);
        g5.setForeground(new Color(255, 153, 0));
        g5.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        add(g5);

        JLabel g6 = new JLabel("-");
        g6.setBounds(1130, 460, 30, 40);
        g6.setForeground(new Color(255, 255, 255));
        g6.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        add(g6);

        JPanel pan1 = new JPanel();
        pan1.setBackground(Color.BLUE);
        pan1.setBounds(210, 90, 900, 500);
        add(pan1);

//        GroupLayout sideMenuLayout = new GroupLayout(pan1);
//        pan1.setLayout(sideMenuLayout);
//        sideMenuLayout.setHorizontalGroup(sideMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING));
//        sideMenuLayout.createSequentialGroup();
        lab = new JLabel();
        lab.setBounds(210, 90, 800, 500);
        lab.setBackground(Color.WHITE);
        pan1.add(lab);

        try {
            File file = new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\GairoOutreach\\src\\Image\\Students.jpg");
            ImageIO.read(file);
            Image profileadmin = ImageIO.read(file).getScaledInstance(lab.getWidth(), lab.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image = new ImageIcon(profileadmin);

            lab.setIcon(image);
            pan1.add(lab);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ///////////////////////
        lab1 = new JLabel();
        lab1.setBounds(210, 90, 800, 500);
        lab1.setBackground(Color.WHITE);
        pan1.add(lab1);

        try {
            File file = new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\GairoOutreach\\src\\Image\\hamsa.jpg");
            ImageIO.read(file);
            Image profileadmin = ImageIO.read(file).getScaledInstance(lab1.getWidth(), lab1.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image = new ImageIcon(profileadmin);

            lab1.setIcon(image);
            pan1.add(lab1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //////////////////
        lab2 = new JLabel();
        lab2.setBounds(210, 90, 800, 500);
        lab2.setBackground(Color.WHITE);
        pan1.add(lab2);

        try {
            File file = new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\GairoOutreach\\src\\Image\\walmuShule.jpg");
            ImageIO.read(file);
            Image profileadmin = ImageIO.read(file).getScaledInstance(lab2.getWidth(), lab2.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image = new ImageIcon(profileadmin);

            lab2.setIcon(image);
            pan1.add(lab2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /////////////////////////
        lab3 = new JLabel();
        lab3.setBounds(210, 90, 800, 500);
        lab3.setBackground(Color.WHITE);
        pan1.add(lab3);

        try {
            File file = new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\GairoOutreach\\src\\Image\\l2g.jpg");
            ImageIO.read(file);
            Image profileadmin = ImageIO.read(file).getScaledInstance(lab3.getWidth(), lab3.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image = new ImageIcon(profileadmin);

            lab3.setIcon(image);
            pan1.add(lab3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //////////////////////////
        lab4 = new JLabel();
        lab4.setBounds(210, 90, 800, 500);
        lab4.setBackground(Color.WHITE);
        pan1.add(lab4);

        try {
            File file = new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\GairoOutreach\\src\\Image\\walimuNawanafunzi.jpg");
            ImageIO.read(file);
            Image profileadmin = ImageIO.read(file).getScaledInstance(lab4.getWidth(), lab4.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image = new ImageIcon(profileadmin);

            lab4.setIcon(image);
            pan1.add(lab4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /////////////////////////////////
        lab5 = new JLabel();
        lab5.setBounds(210, 90, 800, 500);
        lab5.setBackground(Color.WHITE);
        pan1.add(lab5);

        try {
            File file = new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\GairoOutreach\\src\\Image\\leaderUDOM.jpg");
            ImageIO.read(file);
            Image profileadmin = ImageIO.read(file).getScaledInstance(lab5.getWidth(), lab5.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image = new ImageIcon(profileadmin);

            lab5.setIcon(image);
            pan1.add(lab5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /////////////////////////////////
        lab6 = new JLabel();
        lab6.setBounds(210, 90, 800, 500);
        lab6.setBackground(Color.WHITE);
        pan1.add(lab6);

        try {
            File file = new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\GairoOutreach\\src\\Image\\techsec.jpg");
            ImageIO.read(file);
            Image profileadmin = ImageIO.read(file).getScaledInstance(lab6.getWidth(), lab6.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image = new ImageIcon(profileadmin);

            lab6.setIcon(image);
            pan1.add(lab6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        logolab = new JLabel();
        logolab.setBounds(675, 410, 20, 20);
        logolab.setBackground(Color.WHITE);
        lab1.add(logolab);

        try {
            File file = new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\GairoOutreach\\src\\Image\\youtube.png");
            ImageIO.read(file);
            Image profileadmin = ImageIO.read(file).getScaledInstance(logolab.getWidth(), logolab.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image = new ImageIcon(profileadmin);

            logolab.setIcon(image);
            //pan1.add(lab1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        logo1 = new JLabel("UDOTA TV");
        logo1.setBounds(700, 405, 200, 30);
        logo1.setForeground(Color.WHITE);
        logo1.setFont(new Font("Railway", Font.BOLD, 16));
        lab1.add(logo1);
        

        logolab2 = new JLabel();
        logolab2.setBounds(595, 447, 20, 20);
        logolab2.setBackground(Color.WHITE);
        lab1.add(logolab);
        
       

        try {
            File file = new File("C:\\Users\\RAMSON\\Documents\\NetBeansProjects\\GairoOutreach\\src\\Image\\insta.png");
            ImageIO.read(file);
            Image profileadmin = ImageIO.read(file).getScaledInstance(logolab2.getWidth(), logolab2.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon image = new ImageIcon(profileadmin);

            logolab2.setIcon(image);
            //pan1.add(lab1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        logo2 = new JLabel("casfeta_tayomi_udom");
        logo2.setBounds(620, 440, 200, 30);
        logo2.setForeground(Color.WHITE);
        logo2.setFont(new Font("Railway", Font.BOLD, 16));
        lab1.add(logo2);
        
         ///////FOOTER//////////////
        lab.add(logo1);
        lab.add(logolab);
        lab.add(logo2);
        lab.add(logolab2);
        

        //////////////////////
        ujumbe = new JLabel("Wanafunzi wa secondary wakisikiliza walimu EEMC");
        ujumbe.setBounds(290, 590, 750, 30);
        ujumbe.setForeground(new Color(255, 255, 255));
        ujumbe.setFont(new Font("Railway", Font.BOLD, 20));
        add(ujumbe);

        eujumbe = new JLabel("Secondary Students  listen to the Teachers EEMC");
        eujumbe.setBounds(290, 620, 750, 30);
        eujumbe.setForeground(new Color(255, 153, 0));
        eujumbe.setFont(new Font("Railway", Font.BOLD, 18));
        add(eujumbe);

        /////////////////////////
        ujumbe1 = new JLabel("Walimu wa hamasa  wa EEMC");
        ujumbe1.setBounds(290, 590, 400, 30);
        ujumbe1.setForeground(new Color(255, 255, 255));
        ujumbe1.setFont(new Font("Railway", Font.BOLD, 20));
        ujumbe1.setVisible(false);
        add(ujumbe1);

        eujumbe1 = new JLabel("Teachers of Motives EEMC  ");
        eujumbe1.setBounds(290, 620, 400, 30);
        eujumbe1.setForeground(new Color(255, 153, 0));
        eujumbe1.setVisible(false);
        eujumbe1.setFont(new Font("Railway", Font.BOLD, 19));
        add(eujumbe1);

        ////////////////////
        ujumbe2 = new JLabel("Walimu wa hamasa EEMC wakiwa kwenye picha ya pamoja na wanafunzi");
        ujumbe2.setBounds(290, 590, 720, 30);
        ujumbe2.setForeground(new Color(255, 255, 255));
        ujumbe2.setFont(new Font("Railway", Font.BOLD, 20));
        ujumbe2.setVisible(false);
        add(ujumbe2);

        eujumbe2 = new JLabel("EEMC Teachers of Motives having a picture together with students");
        eujumbe2.setBounds(290, 620, 720, 30);
        eujumbe2.setForeground(new Color(255, 153, 0));
        eujumbe2.setVisible(false);
        eujumbe2.setFont(new Font("Railway", Font.BOLD, 19));
        add(eujumbe2);

        ///////////////////
        ujumbe3 = new JLabel("Baadhi ya Viongozi,walimu na wanachama wa EEMC");
        ujumbe3.setBounds(290, 590, 700, 30);
        ujumbe3.setForeground(new Color(255, 255, 255));
        ujumbe3.setVisible(false);
        ujumbe3.setFont(new Font("Railway", Font.BOLD, 20));
        add(ujumbe3);

        eujumbe3 = new JLabel("Some of the Leaders,teachers,and members of EEMC");
        eujumbe3.setBounds(290, 620, 700, 30);
        eujumbe3.setForeground(new Color(255, 153, 0));
        eujumbe3.setVisible(false);
        eujumbe3.setFont(new Font("Railway", Font.BOLD, 19));
        add(eujumbe3);

        ////////////////////
        ujumbe4 = new JLabel("Walimu(EEMC) na wanafunzi kwenye picha ya pamoja");
        ujumbe4.setBounds(290, 590, 700, 30);
        ujumbe4.setForeground(new Color(255, 255, 255));
        ujumbe4.setVisible(false);
        ujumbe4.setFont(new Font("Railway", Font.BOLD, 20));
        add(ujumbe4);

        eujumbe4 = new JLabel(" EEMC teachaers having a picture with students");
        eujumbe4.setBounds(290, 620, 700, 30);
        eujumbe4.setForeground(new Color(255, 153, 0));
        eujumbe4.setVisible(false);
        eujumbe4.setFont(new Font("Railway", Font.BOLD, 19));
        add(eujumbe4);

        ////////////////////////
        ujumbe5 = new JLabel("Mwenyekiti EEMC(UDOM) akiwa na baadhi ya viongozi na walimu na wanachama");
        ujumbe5.setBounds(290, 590, 780, 30);
        ujumbe5.setForeground(new Color(255, 255, 255));
        ujumbe5.setVisible(false);
        ujumbe5.setFont(new Font("Railway", Font.BOLD, 19));
        add(ujumbe5);

        eujumbe5 = new JLabel("Chairperson EEMC(UDOMWISE) having a picture with some of leaders and members");
        eujumbe5.setBounds(290, 620, 780, 30);
        eujumbe5.setForeground(new Color(255, 153, 0));
        eujumbe5.setVisible(false);
        eujumbe5.setFont(new Font("Railway", Font.BOLD, 19));
        add(eujumbe5);

        ////////////////////////
        ujumbe6 = new JLabel("Walimu(EEMC) na walimu wa secondary kwenye picha ya pamoja");
        ujumbe6.setBounds(290, 590, 700, 30);
        ujumbe6.setForeground(new Color(255, 255, 255));
        ujumbe6.setVisible(false);
        ujumbe6.setFont(new Font("Railway", Font.BOLD, 20));
        add(ujumbe6);

        eujumbe6 = new JLabel("Teachers (EEMC) having a picture with secondary teachers together ");
        eujumbe6.setBounds(290, 620, 700, 30);
        eujumbe6.setForeground(new Color(255, 153, 0));
        eujumbe6.setVisible(false);
        eujumbe6.setFont(new Font("Railway", Font.BOLD, 19));
        add(eujumbe6);

        jumbe1 = new JRadioButton();
        jumbe1.setBounds(1190, 670, 20, 20);
        jumbe1.setFont(new Font("Raleway", Font.BOLD, 12));
        jumbe1.addActionListener(this);
        add(jumbe1);

        jumbe2 = new JRadioButton();
        jumbe2.setBounds(1210, 670, 20, 20);
        jumbe2.setFont(new Font("Raleway", Font.BOLD, 16));
        jumbe2.addActionListener(this);
        add(jumbe2);

        jumbe3 = new JRadioButton();
        jumbe3.setBounds(1230, 670, 20, 20);
        jumbe3.setFont(new Font("Raleway", Font.BOLD, 16));
        jumbe3.addActionListener(this);
        add(jumbe3);

        jumbe4 = new JRadioButton();
        jumbe4.setBounds(1250, 670, 20, 20);
        jumbe4.setFont(new Font("Raleway", Font.BOLD, 16));
        jumbe4.addActionListener(this);
        add(jumbe4);

        jumbe5 = new JRadioButton();
        jumbe5.setBounds(1270, 670, 20, 20);
        jumbe5.setFont(new Font("Raleway", Font.BOLD, 16));
        jumbe5.addActionListener(this);
        add(jumbe5);

        jumbe6 = new JRadioButton();
        jumbe6.setBounds(1290, 670, 20, 20);
        jumbe6.setFont(new Font("Raleway", Font.BOLD, 16));
        jumbe6.addActionListener(this);
        add(jumbe6);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 740);
        setLocation(0, 18);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (jumbe1 == ae.getSource()) {
            ujumbe.setVisible(false);
            eujumbe.setVisible(false);
            lab.setVisible(false);
            ujumbe1.setVisible(true);
            eujumbe1.setVisible(true);
            lab1.setVisible(true);
            
             ///////FOOTER//////////////
        lab1.add(logo1);
        lab1.add(logolab);
        lab1.add(logo2);
        lab1.add(logolab2);

        } else if (jumbe2 == ae.getSource()) {
            ujumbe.setVisible(false);
            eujumbe.setVisible(false);
            lab.setVisible(false);

            ujumbe1.setVisible(false);
            eujumbe1.setVisible(false);
            lab1.setVisible(false);

            ujumbe2.setVisible(true);
            eujumbe2.setVisible(true);
            lab2.setVisible(true);
                 ///////FOOTER//////////////
        lab2.add(logo1);
        lab2.add(logolab);
        lab2.add(logo2);
        lab2.add(logolab2);
        } else if (jumbe3 == ae.getSource()) {
            ujumbe.setVisible(false);
            eujumbe.setVisible(false);
            lab.setVisible(false);

            ujumbe2.setVisible(false);
            eujumbe2.setVisible(false);
            lab2.setVisible(false);

            ujumbe3.setVisible(true);
            eujumbe3.setVisible(true);
            lab3.setVisible(true);
                   ///////FOOTER//////////////
        lab3.add(logo1);
        lab3.add(logolab);
        lab3.add(logo2);
        lab3.add(logolab2);
        } else if (jumbe4 == ae.getSource()) {
            ujumbe.setVisible(false);
            eujumbe.setVisible(false);
            lab.setVisible(false);

            ujumbe3.setVisible(false);
            eujumbe3.setVisible(false);
            lab3.setVisible(false);

            ujumbe4.setVisible(true);
            eujumbe4.setVisible(true);
            lab4.setVisible(true);
                       ///////FOOTER//////////////
        lab4.add(logo1);
        lab4.add(logolab);
        lab4.add(logo2);
        lab4.add(logolab2);
        } else if (jumbe5 == ae.getSource()) {
            ujumbe.setVisible(false);
            eujumbe.setVisible(false);
            lab.setVisible(false);

            ujumbe4.setVisible(false);
            eujumbe4.setVisible(false);
            lab4.setVisible(false);

            ujumbe5.setVisible(true);
            eujumbe5.setVisible(true);
            lab5.setVisible(true);
            
                           ///////FOOTER//////////////
        lab5.add(logo1);
        lab5.add(logolab);
        lab5.add(logo2);
        lab5.add(logolab2);
        } else if (jumbe6 == ae.getSource()) {
            ujumbe.setVisible(false);
            eujumbe.setVisible(false);
            lab.setVisible(false);

            ujumbe5.setVisible(false);
            eujumbe5.setVisible(false);
            lab5.setVisible(false);

            ujumbe6.setVisible(true);
            eujumbe6.setVisible(true);
            lab6.setVisible(true);
                               ///////FOOTER//////////////
        lab6.add(logo1);
        lab6.add(logolab);
        lab6.add(logo2);
        lab6.add(logolab2);
        }

    }

    public static void main(String[] args) {
        new GairoEEMC();
    }

}
