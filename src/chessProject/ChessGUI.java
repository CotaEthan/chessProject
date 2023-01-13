package chessProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;

public class ChessGUI 
{
	JFrame frame;

	/**
	 * Create initialize and create JFrame
	 */
	public ChessGUI() 
	{
		create();
	}
	
	private void create() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
	}

}

