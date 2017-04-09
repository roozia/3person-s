package form;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import joinMember.*;


public class JoinUI {

	
	JTextField namefield, phonenumberfield, idfield, 
				carfield1, carfield2, carfield3;
	
	JRadioButton joinyes;
	
	String nameReal, phoneReal, idReal, car1Real, car2Real, car3Real;
	
	class JoinAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			nameReal = namefield.getText();
			phoneReal = phonenumberfield.getText();
			idReal = idfield.getText();
			car1Real = carfield1.getText();
			car2Real = carfield2.getText();
			car3Real = carfield3.getText();
			
			
			System.out.println("name:"+nameReal);
			System.out.println("phone:"+phoneReal);
			System.out.println("id:"+idReal);
			System.out.println("car info:"+car1Real+" "+car2Real+" "+car3Real);

			memberDAO memberdao;
			try {
				memberdao = new memberDAO();
				memberdao.insert(new memberDTO(nameReal, phoneReal, idReal,
						car1Real, car2Real,car3Real));
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
	} 
	
   public void work() {
      // TODO Auto-generated method stub
      
      /*
      �ʿ�����: 
      
      */
      
      JFrame join = new JFrame("ȸ������â: 10*15");
      join.setBounds(600, 200, 284, 426);
      join.setLayout(null);
      join.setBackground(Color.WHITE);
      
      JLabel jointitle = new JLabel("ȸ������");
//      jointitle.setFont(new Font("Serif", Font.BOLD, 20));
      jointitle.setBounds(20,10,80,40);
      join.add(jointitle);
      
      JLabel joinline1label = new JLabel("-----------------------------------------------------");
      joinline1label.setBounds(30,40,224,30);
      join.add(joinline1label);
      
      JLabel namelabel = new JLabel("�̸�");
      namelabel.setBounds(30,70,80,30);
      join.add(namelabel);
      
      namefield = new JTextField("������");
      namefield.setBounds(110, 70, 134, 30);
      join.add(namefield);
      
      
      JLabel phonelabel = new JLabel("��ȭ��ȣ");
      phonelabel.setBounds(30,140,80,30);
      join.add(phonelabel);
      
      phonenumberfield = new JTextField("01000000000");
      phonenumberfield.setBounds(110, 140, 134, 30);
      join.add(phonenumberfield);
      
      
      JLabel idlabel = new JLabel("ID");
      idlabel.setBounds(30,105,80,30);
      join.add(idlabel);
      
      idfield = new JTextField("����");
      idfield.setBounds(110, 105, 134, 30);
      join.add(idfield);
      
      
      JLabel joinline2label = new JLabel("-----------------------------------------------------");
      joinline2label.setBounds(30,170,224,30);
      join.add(joinline2label);
      
      JLabel carlabel = new JLabel("��������");
      carlabel.setBounds(30,210,80,30);
      join.add(carlabel);
      
      carfield1 = new JTextField("����");
      carfield1.setBounds(110, 210, 55, 30);
      join.add(carfield1);
      
      
      carfield2 = new JTextField("��");
      carfield2.setBounds(167, 210, 20, 30);
      join.add(carfield2);
      
      carfield3 = new JTextField("1234");
      carfield3.setBounds(189, 210, 55, 30);
      join.add(carfield3);
      
      JLabel pollabel = new JLabel("�������� ��޹�ħ�� �����մϴ�.");
      pollabel.setBounds(30,255,224,30);
      join.add(pollabel);
      
      joinyes = new JRadioButton("��", true);
      joinyes.setBounds(70,285,65,30);
      join.add(joinyes);
      
      JRadioButton joinno = new JRadioButton("�ƴϿ�");
      joinno.setBounds(134,285,70,30);
      join.add(joinno);
      
      
      JButton joinsubmit = new JButton("����");
      joinsubmit.setBounds(65,330,65,30);
      join.add(joinsubmit);
      joinsubmit.addActionListener(new JoinAction());
      
      JButton joinsubmitcancel = new JButton("���");
      joinsubmitcancel.setBounds(139,330,70,30);
      join.add(joinsubmitcancel);
      
      
      join.setVisible(true);
        join.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }
   
   
   

}