package shifeiqi;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test1_2_01 {

	public static void main(String[] args) {
		LabelFrame l = new LabelFrame();
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setVisible(true);
	}

}

class LabelFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final int DEFAULT_WIDTH = 600;
	public static final int DEFAULT_HEIGHT = 300;

	public LabelFrame() {
		setTitle("ʵ��һ.1");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		JPanel panel = new JPanel();

		JLabel l1 = new JLabel();
		l1.setBackground(Color.red);
		// ���ñ�����ɫΪ��ʾ״̬
		l1.setOpaque(true);
		// ����label��size��ע��setSize���������Ե��ڴ�С
		Dimension d = getPreferredSize();
		d.height = DEFAULT_WIDTH;
		d.width = DEFAULT_HEIGHT / 3;
		l1.setPreferredSize(d);

		JLabel l2 = new JLabel();
		l2.setBackground(Color.yellow);
		// ���ñ�����ɫΪ��ʾ״̬
		l2.setOpaque(true);
		// ����label��size��ע��setSize���������Ե��ڴ�С
		Dimension d2 = getPreferredSize();
		d2.height = DEFAULT_WIDTH;
		d2.width = DEFAULT_HEIGHT / 3;
		l2.setPreferredSize(d2);

		JLabel l3 = new JLabel();
		l3.setBackground(Color.blue);
		// ���ñ�����ɫΪ��ʾ״̬
		l3.setOpaque(true);
		// ����label��size��ע��setSize���������Ե��ڴ�С
		Dimension d3 = getPreferredSize();
		d3.height = DEFAULT_WIDTH;
		d3.width = DEFAULT_HEIGHT / 3;
		l3.setPreferredSize(d3);

		panel.add(l1);
		panel.add(l2);
		panel.add(l3);

		this.setContentPane(panel);
	}
}