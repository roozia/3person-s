package form;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FindInfoUI {

	FindInfoUI()	{
		
	}
	
	
   public void work() {
	// TODO Auto-generated method stub
	      
	      JFrame findinfo = new JFrame("ȸ������ã��: 12*10");
	      findinfo.setBounds(300, 200, 340, 284);
	      findinfo.setLayout(null);
	      findinfo.setBackground(Color.WHITE);
	      
	      
	      
	      JLabel findidtitle = new JLabel("ID ã��");
	      findidtitle.setBounds(10,15,80,30);
	      findinfo.add(findidtitle);
	      
	      
	      JLabel insertnamelabel = new JLabel("�̸�");
	      insertnamelabel.setBounds(20,50,80,30);
	      findinfo.add(insertnamelabel);
	      
	      JTextField insertnamefield = new JTextField("");
	      insertnamefield.setBounds(80,50,80,30);
	      findinfo.add(insertnamefield);
	      
	      JLabel inserttellabel = new JLabel("��ȭ��ȣ");
	      inserttellabel.setBounds(20,80,80,30);
	      findinfo.add(inserttellabel);
	      
	      JTextField inserttelfield = new JTextField("");
	      inserttelfield.setBounds(80,80,80,30);
	      findinfo.add(inserttelfield);
	      
	      
	      
	      ///////////////////////////////////////////////////////////
	      
	      
	      JLabel findpwtitle = new JLabel("PW ã��");
	      findpwtitle.setBounds(165,15,80,30);
	      findinfo.add(findpwtitle);
	      
	      
	      JLabel insertnamelabel2 = new JLabel("���̵�");
	      insertnamelabel2.setBounds(175,50,80,30);
	      findinfo.add(insertnamelabel2);
	      
	      JTextField insertnamefield2 = new JTextField("");
	      insertnamefield2.setBounds(235,50,80,30);
	      findinfo.add(insertnamefield2);
	      
	      JLabel inserttellabel2 = new JLabel("��ȭ��ȣ");
	      inserttellabel2.setBounds(175,80,80,30);
	      findinfo.add(inserttellabel2);
	      
	      JTextField inserttelfield2 = new JTextField("");
	      inserttelfield2.setBounds(235,80,80,30);
	      findinfo.add(inserttelfield2);
	      
	      
	      JButton findinfoconfirm = new JButton("��ȸ�ϱ�");
	      findinfoconfirm.setBounds(100, 120, 140, 30);
	      findinfo.add(findinfoconfirm);
	      
	      
	      
	      String foundinfo = "id/pw�� �޴� â�Դϴ�.";//��ȸ�� ����(id, pw) ���� ����
	      
	      JLabel searchedinfo = new JLabel("��ȸ�Ǿ���: "+ foundinfo);
	      searchedinfo.setBounds(20, 160, 280, 30);
	      findinfo.add(searchedinfo);
	      
	      
	      JLabel inputinfoask = new JLabel("�α��� ȭ�鿡 �Է��Ͻðڽ��ϱ�?");
	      inputinfoask.setBounds(20, 200, 200, 30);
	      findinfo.add(inputinfoask);
	      
	      
	      
	      JButton findinfook = new JButton("Ȯ��");
	      findinfook.setBounds(240, 200, 60, 30);
	      findinfo.add(findinfook);
	      
	      
	      
	      findinfo.setVisible(true);

        
      
      
   }

}