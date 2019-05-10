package duc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import demo.MyLine;

public class D2 extends JFrame {

	private JPanel contentPane;
	static JPanel panel;
	static Point move_start;
	private Point localtionFrame = null;
	private MyLine myLine;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				// VẼ đường thẳng
				// vẽ đường thẳng
//				for ( int i = 0 ; i < 200 ; i++) {
//					g.fillRect(699, 150+i, size, size);
//				}
				
				try {			
					D2 frame = new D2();
					frame.setVisible(true);
					move_start = new Point(panel.getX() + 7, panel.getY() + 30);
					System.out.println(move_start);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
//		myLine = new MyLine();
//		myLine.init(startPoint, endPoint, size, color);
//		myLine.draw(g);
	}

	/**
	 * Create the frame.
	 */
	public D2() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentMoved(ComponentEvent e) {
				localtionFrame = new Point(getLocation()); // Cập nhật lại tọa độ mới của khung jFrame so với window
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 535, 342);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				System.out.println(e.getX() + " - " + e.getY());
			}

			public void mouseMoved(MouseEvent e) {
				
			}
		});
		
	};
	
	
}
