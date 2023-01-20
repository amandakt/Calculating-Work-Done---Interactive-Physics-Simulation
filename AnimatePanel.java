import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class AnimatePanel extends JPanel{
	//properties
	BufferedImage workimg = null;
	BufferedImage crateimg = null;
	int intx = 500;
	int inty = 250;
	
	//methods
	public void paintComponent(Graphics g){
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 960, 540);
			
			if (intx == 500){
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, 960, 540);
			}
			g.drawImage(workimg, 500, 100, null);
			g.drawImage(crateimg, intx, inty, null);
			
			
			if (intx < 850){
				intx++;	
			}		
			
			
			
				
		
	}
	//constructor
	public AnimatePanel(){	
		super();
		this.setLayout(null);
		try{
			workimg = ImageIO.read(new File("Work.png"));
			crateimg = ImageIO.read(new File("crate.png"));
		}
		catch(IOException e){
			System.out.println("Unable to load image");
		}
		
	}
}

