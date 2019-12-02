package server.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * 服务器ui的frame
 */

public class ServerFrame extends JFrame{
	
	private static final int WIDTH=200,HEIGHT=300;
	
	public ServerFrame(){
		super();
	}
	
	public void initServerFrame(){
		this.setSize(WIDTH, HEIGHT);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width - WIDTH) / 2 ,
				(screenSize.height - HEIGHT) / 2 );
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	
}
