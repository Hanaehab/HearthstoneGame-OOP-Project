package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FinalPlayersWindow extends JFrame {

	private JPanel buttons = new JPanel(new GridLayout(1, 5, 15, 0));
	private JPanel upperPanel = new JPanel();
	private JPanel lowerPanel = new JPanel();
	private JTextArea blank; 
	private JLabel j = new JLabel();

	public FinalPlayersWindow() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		setSize(new Dimension(screenSize.width, screenSize.height));
//		setExtendedState(Frame.MAXIMIZED_BOTH);
		setBounds(70, 40, 1300, 731);
		setVisible(false);
		setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Hearthstone");
		
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("images/BackgroundForChooseHero2.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		j = new JLabel(imageIcon);
		setContentPane(j);

		// ----Buttons Panel-----//
		buttons.setPreferredSize(new Dimension(1350, 430));
		buttons.setOpaque(false);
		buttons.setBackground(Color.BLACK);
		buttons.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		// ----Buttons Panel-----//

		// ----upperPanel Panel-----//
		upperPanel.setPreferredSize(new Dimension(1350, 150));
		upperPanel.setOpaque(false);
		upperPanel.setBackground(Color.GREEN);
		// ----upperPanel Panel-----//

		// ----lowerPanel Panel-----//
		lowerPanel.setLayout(new FlowLayout());
		lowerPanel.setPreferredSize(new Dimension(1350, 150));
		lowerPanel.setOpaque(false);
		lowerPanel.setBackground(Color.CYAN);
		
		// ----lowerPanel Panel-----//

        j.setLayout(new BorderLayout());
        
		j.add(buttons, BorderLayout.CENTER);
		j.add(upperPanel, BorderLayout.NORTH);
		j.add(lowerPanel, BorderLayout.SOUTH);
		
		
		
		
				
		this.revalidate();
		this.repaint();
		

	}

	public JLabel getJ() {
		return j;
	}

	public static void main(String[] args) {
		new FinalPlayersWindow();

	}

	public JPanel getButtons() {
		return buttons;
	}

	public JPanel getUpperPanel() {
		return upperPanel;
	}

	public JPanel getLowerPanel() {
		return lowerPanel;
	}

}
