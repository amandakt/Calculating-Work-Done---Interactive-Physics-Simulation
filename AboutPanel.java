import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class AboutPanel extends JPanel{
	//properties
	BufferedImage staimg;
	
	//methods
	public void paintComponent(Graphics g){
		g.drawImage(staimg, 350, 100, this);
	}
	//constructor
	public AboutPanel(){	
		super();
		this.setLayout(null);
		try{
			staimg = ImageIO.read(new File("sta.png"));
		}
		catch(IOException e){
			System.out.println("Unable to load image");
		}
		
	}
}
