package phanngocnam;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CRUD extends JFrame {
	JPanel p1;
	JPanel p2;
	JPanel p3;
	private JLabel lblTitle;
	private JLabel lblHoTen;
	private TextField txtHoTen;
	private JLabel lblHo;
	private TextField txtHo;

	public CRUD() {
		setTitle("^_^");
		setSize(500, 400);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		this.add(p1 = new JPanel());
		p1.add(lblTitle = new JLabel("Thông tin nhân viên"));
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Serif", Font.BOLD, 20));
		this.add(p2 = new JPanel());
		p2.add(lblHoTen = new JLabel("Họ và tên: "));
		lblHoTen.setBounds(10, 10, 60, 10);
		
		p2.add(txtHoTen = new TextField());
		txtHoTen.setBounds(70, 10, 300, 20);
		
		p2.setBackground(Color.cyan);
		p2.setLayout(null);
		
		this.add(p3 = new JPanel());
		p3.add(lblHo = new JLabel("Họ :"));
		lblHo.setBounds(10, 10, 200, 10);
		p3.add(txtHo = new TextField(40));
		p3.setBackground(Color.BLUE);
		p3.setLayout(null);
	}

	public static void main(String[] args) {
		new CRUD().setVisible(true);
	}
}
