package chessProject;

import java.awt.EventQueue;

import javax.swing.UIManager;


public class ChessLauncher 
{

	public static void main(String[] args) 
	{
		//Draw 2d array of chess board. 
		//Create objects for ea. chess piece -> frame 
		try 
		{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					ChessGUI window = new ChessGUI();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

}
