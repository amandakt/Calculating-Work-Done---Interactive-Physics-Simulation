import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class HelpPanel extends JPanel{
	//properties
	BufferedImage workformimg;
	
	//methods
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 960, 540);
		g.drawImage(workformimg, 400, 150, this);
	}
	//constructor
	public HelpPanel(){	
		super();
		this.setLayout(null);
		try{
			workformimg = ImageIO.read(new File("workformula.png"));
		}
		catch(IOException e){
			System.out.println("Unable to load image");
		}
		
	}
}
