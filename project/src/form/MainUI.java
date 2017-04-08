package form;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainUI {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      JFrame jf = new JFrame("�����������α׷�");
      jf.setBounds(300, 200, 825, 510);
      jf.setLayout(null);
      jf.setBackground(Color.WHITE);
      
      JMenuBar jmb = new JMenuBar();
      jf.setJMenuBar(jmb);
      
      ////////////////////////////////////////////
      
      JMenu main1 = new JMenu("�޴�1");
      jmb.add(main1);
      JMenuItem item1_1 = new JMenuItem("1_1");
      main1.add(item1_1);
      JMenuItem item1_2 = new JMenuItem("1_2");
      main1.add(item1_2);
      JMenuItem item1_3 = new JMenuItem("1_3");
      main1.add(item1_3);
      
      
      JMenu main2 = new JMenu("�޴�2");
      jmb.add(main2);
      JMenuItem item2_1 = new JMenuItem("2_1");
      main2.add(item2_1);
      JMenuItem item2_2 = new JMenuItem("2_2");
      main2.add(item2_2);
      
      JMenu main3 = new JMenu("�޴�3");
      jmb.add(main3);
      JMenuItem item3_1 = new JMenuItem("3_1");
      main3.add(item3_1);

      jmb.setVisible(true);
      
      ///////////////////////////////////////////
      
      JLabel title = new JLabel("�����������α׷�");
      title.setFont(new Font("Serif", Font.BOLD, 20));
      title.setBounds(30, 15, 180, 45);
      jf.add(title);
      
      /////////////////////////////////////////// ��ư��
      
      JButton join = new JButton("ȸ������");
      join.setBounds(700, 15, 80, 30);
      jf.add(join);
      
      JButton login = new JButton("�α���");
      login.setBounds(620, 15, 80, 30);
      jf.add(login);
      
      
      
      
      
      JButton reservation = new JButton("�����ϱ�");
      reservation.setBounds(30,60,180,30);
      JMenu reserv = new JMenu();
      reserv.setBounds(30,60,180,30);
      reservation.add(reserv);
      
      jf.add(reservation);
      
      JButton parkin = new JButton("����");
      parkin.setBounds(30,90,180,30);
      jf.add(parkin);
      
      JButton parkout = new JButton("����");
      parkout.setBounds(30,120,180,30);
      jf.add(parkout);
      
      JButton notice = new JButton("��������");
      notice.setBounds(30,150,180,30);
      jf.add(notice);
      
      //////////////////////////////////////////// ä��â
      
      JTextField jtf = new JTextField();
      jtf.setBounds(30, 360, 180, 50);
      jtf.setBackground(Color.white);
      jf.add(jtf);
      
      
      
      JButton btsend = new JButton("��");//����Ű
      btsend.setBounds(140,10,30,30);
      jtf.add(btsend);
      
      JPanel jpchat = new JPanel();
      jpchat.setBounds(30, 195, 180, 165);
      jpchat.setBackground(Color.WHITE);
      jf.add(jpchat);
      
      ////////////////////////////////////////////���κ���
      
      //���� ������ UI
      
      JPanel jpboard = new JPanel();
      jpboard.setBounds(225,60,555,350);
      jpboard.setLayout(null);
      jpboard.setBackground(Color.white);
      
      /*JPanel aaa = new JPanel();
      aaa.setBounds(240,60,555,350);
      aaa.setBackground(Color.gray);
      */
      
      
      JButton fstfl = new JButton("1��");
      fstfl.setBounds(0, 0, 80, 30);
      jpboard.add(fstfl);
      
      JButton sndfl = new JButton("2��");
      sndfl.setBounds(80, 0, 80, 30);
      jpboard.add(sndfl);
      
      JButton trdfl = new JButton("3��");
      trdfl.setBounds(160, 0, 80, 30);
      jpboard.add(trdfl);
      
      JPanel exit = new JPanel();
      exit.setBounds(515, 135, 30, 120);
      jpboard.add(exit);
      
      JPanel a1 = new JPanel();
      a1.setBounds(10,50,40,70);
      a1.setBackground(Color.BLUE);
      jpboard.add(a1);
      
      JPanel a2 = new JPanel();
      a2.setBounds(60,50,40,70);
      a2.setBackground(Color.BLUE);
      jpboard.add(a2);
      
      JPanel a3 = new JPanel();
      a3.setBounds(110,50,40,70);
      a3.setBackground(Color.RED);
      jpboard.add(a3);
      
      JPanel a4 = new JPanel();
      a4.setBounds(160,50,40,70);
      a4.setBackground(Color.BLUE);
      jpboard.add(a4);
      
      JPanel a5 = new JPanel();
      a5.setBounds(210,50,40,70);
      a5.setBackground(Color.RED);
      jpboard.add(a5);
      
      JPanel a6 = new JPanel();
      a6.setBounds(260,50,40,70);
      a6.setBackground(Color.BLUE);
      jpboard.add(a6);
      
      JPanel a7 = new JPanel();
      a7.setBounds(310,50,40,70);
      a7.setBackground(Color.RED);
      jpboard.add(a7);
      
      JPanel a8 = new JPanel();
      a8.setBounds(360,50,40,70);
      a8.setBackground(Color.RED);
      jpboard.add(a8);
      
      JPanel a9 = new JPanel();
      a9.setBounds(410,50,40,70);
      a9.setBackground(Color.RED);
      jpboard.add(a9);
      
      JPanel a10 = new JPanel();
      a10.setBounds(460,50,40,70);
      a10.setBackground(Color.RED);
      jpboard.add(a10);
      
      
      JPanel b1 = new JPanel();
      b1.setBounds(10,265,40,70);
      b1.setBackground(Color.BLUE);
      jpboard.add(b1);
      
      JPanel b2 = new JPanel();
      b2.setBounds(60,265,40,70);
      b2.setBackground(Color.RED);
      jpboard.add(b2);
      
      JPanel b3 = new JPanel();
      b3.setBounds(110,265,40,70);
      b3.setBackground(Color.BLUE);
      jpboard.add(b3);
      
      JPanel b4 = new JPanel();
      b4.setBounds(160,265,40,70);
      b4.setBackground(Color.BLUE);
      jpboard.add(b4);
      
      JPanel b5 = new JPanel();
      b5.setBounds(210,265,40,70);
      b5.setBackground(Color.RED);
      jpboard.add(b5);
      
      JPanel b6 = new JPanel();
      b6.setBounds(260,265,40,70);
      b6.setBackground(Color.RED);
      jpboard.add(b6);
      
      JPanel b7 = new JPanel();
      b7.setBounds(310,265,40,70);
      b7.setBackground(Color.BLUE);
      jpboard.add(b7);
      
      JPanel b8 = new JPanel();
      b8.setBounds(360,265,40,70);
      b8.setBackground(Color.RED);
      jpboard.add(b8);
      
      JPanel b9 = new JPanel();
      b9.setBounds(410,265,40,70);
      b9.setBackground(Color.BLUE);
      jpboard.add(b9);
      
      JPanel b10 = new JPanel();
      b10.setBounds(460,265,40,70);
      b10.setBackground(Color.RED);
      jpboard.add(b10);
      
      
      
      //���� ���忡 ���ο� ���带 �����ؼ� ȭ����ȯ.
      
      //jpboard = aaa;

      jf.add(jpboard);
      
      ////////////////////////////////////////////
      
      ////////////////////////////////////////////
      
      jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}