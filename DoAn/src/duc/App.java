package duc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

public class App extends JFrame {

	private JPanel contentPane;
	private JButton btnd;
	private JButton btnd_1;
	private JLabel lbln;
	private JLabel lblThnhVinNhm;
	private JPanel panel_1;
	private JLabel lblnCa;
	private JLabel lblNewLabel;
	private JLabel lblHongVnc;
	private JLabel lblNguynVnHu;
	private JLabel lblHunhNgcHn;
	private JLabel lblNguynThLinh;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(117, 127, 327, 173);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel(" Nguy\u1EC5n Th\u1ECB Linh Chi - N16DCCN020");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 0, 327, 34);
		panel.add(lblNewLabel);
		
		lblHongVnc = new JLabel(" Ho\u00E0ng V\u0103n \u0110\u1EE9c - N16DCCN043");
		lblHongVnc.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHongVnc.setBounds(0, 33, 327, 34);
		panel.add(lblHongVnc);
		
		lblNguynVnHu = new JLabel(" Nguy\u1EC5n V\u0103n H\u1EADu - N16DCCN054");
		lblNguynVnHu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNguynVnHu.setBounds(0, 70, 327, 34);
		panel.add(lblNguynVnHu);
		
		lblHunhNgcHn = new JLabel(" Hu\u1EF3nh Ng\u1ECDc H\u1EB9n - N16DCCN055");
		lblHunhNgcHn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHunhNgcHn.setBounds(0, 104, 327, 34);
		panel.add(lblHunhNgcHn);
		
		lblNguynThLinh = new JLabel(" Nguy\u1EC5n Th\u1ECB Linh Chi - N16DCCN020");
		lblNguynThLinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNguynThLinh.setBounds(0, 139, 327, 34);
		panel.add(lblNguynThLinh);
		
		btnd = new JButton("2D");
		btnd.setBackground(Color.GREEN);
		btnd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnd.setBounds(190, 391, 210, 48);
		contentPane.add(btnd);
		
		btnd_1 = new JButton("3D");
		btnd_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnd_1.setBackground(Color.CYAN);
		btnd_1.setBounds(524, 391, 210, 48);
		contentPane.add(btnd_1);
		
		lblThnhVinNhm = new JLabel("Th\u00E0nh Vi\u00EAn Nh\u00F3m :");
		lblThnhVinNhm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblThnhVinNhm.setBounds(117, 86, 334, 30);
		contentPane.add(lblThnhVinNhm);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(117, 319, 704, 48);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblnCa = new JLabel("\u0110\u1ED3 \u00C1n C\u1EE7a Nh\u00F3m");
		lblnCa.setHorizontalAlignment(SwingConstants.CENTER);
		lblnCa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblnCa.setBounds(0, 0, 688, 48);
		panel_1.add(lblnCa);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(117, 22, 694, 53);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lbln = new JLabel("\u0110\u1ED3 \u00C1n : K\u1EF9 Thu\u1EADt \u0110\u1ED3 H\u1ECDa");
		lbln.setBounds(10, 11, 688, 40);
		panel_2.add(lbln);
		lbln.setBackground(Color.RED);
		lbln.setHorizontalAlignment(SwingConstants.CENTER);
		lbln.setFont(new Font("Tahoma", Font.BOLD, 22));
	}
}
