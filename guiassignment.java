//Program: Work Formula Program
//Version: 1.0
//Created By: Amanda Tong

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

//formula for calculating work done on an object: W=d*F*costheta

public class guiassignment implements ActionListener, ChangeListener{
	//properties
	JFrame theFrame = new JFrame("Work Done on an Object");
	HelpPanel helpPanel = new HelpPanel();
	AboutPanel aboutPanel = new AboutPanel();
	AnimatePanel mainPanel = new AnimatePanel();
	Timer theTimer = new Timer(1000/48, this);
	JLabel theLabel = new JLabel("Calculating Work Done on an Object");
	JLabel labelA = new JLabel("Angle above horizontal(Degrees): ");
	JLabel labelDeg = new JLabel("45");
	JLabel labelF = new JLabel("Force applied (Newtons): ");
	JLabel labelD = new JLabel("Displacement (Meters): ");
	JLabel labelW = new JLabel("Work done: ");
	JSlider sliderA = new JSlider(0, 90, 45); //change the angle that the object moves
	JTextField txtF = new JTextField(); //enter the applied force
	JTextField txtD = new JTextField(); //enter the displacement of the object
	JTextField txtW = new JTextField(); //o work done
	JButton resetButton = new JButton("reset");
	JButton startButton = new JButton("start");
	JButton helpButton = new JButton("help");
	JButton aboutButton = new JButton("about");
	
	//about panel
	JButton mainButtonA = new JButton("back");
	JLabel labelAPanel = new JLabel("Calculating Work on an Object! This program is brought to you by Amanda Tong from St.Augustine CHS Computer Science.");
	
	//help panel
	JButton mainButtonH = new JButton("back");
	JLabel labelHPanel = new JLabel("Help Page");
	JLabel labelHPanel1 = new JLabel("To calculate work, enter the force, displacement, and the angle that the force is applies to the object. ");
	JLabel labelHPanel2 = new JLabel("To enter the angle, click and drag the slider to the angle you want.");
	JLabel labelHPanel3 = new JLabel("To enter the force, type a number in the 1st textbox.");
	JLabel labelHPanel4 = new JLabel("To enter the displacement, type a number in the 2nd textbox.");
	JLabel labelHPanel5 = new JLabel("To calculate the work done when you finished entering your numbers, click on the 'start' button.");
	JLabel labelHPanel6 = new JLabel("To clear the page, click on the 'reset' button.");
	
	//methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == txtF){
			System.out.println("txtF changed");
			
			
		}else if(evt.getSource() == txtD){
			System.out.println("txtD changed");
			
			
		}else if(evt.getSource() == startButton){
			System.out.println("button pressed");
			//calculate work done
			double dblangle = sliderA.getValue();
			double dblWork = Double.parseDouble(txtD.getText())*Double.parseDouble(txtF.getText())*Math.cos(Math.toRadians(dblangle));
			//outputs the value
			txtW.setText(""+dblWork);
			theTimer.start();
					
		}else if(evt.getSource() == resetButton){
			System.out.println("button pressed");
			sliderA.setValue(45);
			txtF.setText("");
			txtD.setText("");
			txtW.setText("");
			theTimer.stop();
			mainPanel.intx = 500;
	
		}else if (evt.getSource() == aboutButton){
			System.out.println("button pressed");
			aboutPanel.setPreferredSize(new Dimension(960, 540));
			theFrame.setContentPane(aboutPanel);
			aboutPanel.setLayout(null);
			theFrame.pack();
			theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			theFrame.setVisible(true);
			theFrame.setResizable(false);
			theTimer.stop();
			
		}else if (evt.getSource() == helpButton){
			System.out.println("button pressed");
			helpPanel.setPreferredSize(new Dimension(960, 540));
			theFrame.setContentPane(helpPanel);
			helpPanel.setLayout(null);
			theFrame.pack();
			theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			theFrame.setVisible(true);
			theFrame.setResizable(false);
			theTimer.stop();
			
		}else if (evt.getSource() == mainButtonA){
			System.out.println("button pressed");
			theFrame.setContentPane(mainPanel);
			
		}else if (evt.getSource() == mainButtonH){
			System.out.println("button pressed");
			theFrame.setContentPane(mainPanel);
			
		}else if(evt.getSource() == theTimer){
			mainPanel.repaint();
			
		}
	}
	public void stateChanged(ChangeEvent evt){
		if(evt.getSource() == sliderA){
			int intValue = sliderA.getValue();
			labelDeg.setText(""+intValue); //requries a string, add "" to make intValue a string
		}
	}
	
	//constructor
	public guiassignment(){
		//about panel
		mainButtonA.setSize(70, 30);
		mainButtonA.setLocation(20, 10);
		mainButtonA.addActionListener(this);
		aboutPanel.add(mainButtonA);
		
		labelAPanel.setSize(700, 50);
		labelAPanel.setLocation(120, 350);
		aboutPanel.add(labelAPanel);
		
		//help panel
		mainButtonH.setSize(70, 30);
		mainButtonH.setLocation(20, 20);
		mainButtonH.addActionListener(this);
		helpPanel.add(mainButtonH);
		
		labelHPanel.setSize(70, 30);
		labelHPanel.setLocation(450, 20);
		helpPanel.add(labelHPanel);
		
		labelHPanel1.setSize(700, 50);
		labelHPanel1.setLocation(50, 100);
		helpPanel.add(labelHPanel1);
		
		labelHPanel2.setSize(700, 50);
		labelHPanel2.setLocation(50, 150);
		helpPanel.add(labelHPanel2);
		
		labelHPanel3.setSize(700, 50);
		labelHPanel3.setLocation(50, 200);
		helpPanel.add(labelHPanel3);
		
		labelHPanel4.setSize(700, 50);
		labelHPanel4.setLocation(50, 250);
		helpPanel.add(labelHPanel4);
		
		labelHPanel4.setSize(700, 50);
		labelHPanel4.setLocation(50, 300);
		helpPanel.add(labelHPanel4);
		
		labelHPanel5.setSize(700, 50);
		labelHPanel5.setLocation(50, 350);
		helpPanel.add(labelHPanel5);
		
		labelHPanel6.setSize(700, 50);
		labelHPanel6.setLocation(50, 400);
		helpPanel.add(labelHPanel6);
		
		//main panel
		mainPanel.setPreferredSize(new Dimension(960, 540));
		theFrame.setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		aboutButton.setSize(70, 30);
		aboutButton.setLocation(20, 10);
		aboutButton.addActionListener(this);
		mainPanel.add(aboutButton);
		
		helpButton.setSize(70, 30);
		helpButton.setLocation(400, 10);
		helpButton.addActionListener(this);
		mainPanel.add(helpButton);
		
		theLabel.setSize(250, 30);
		theLabel.setLocation(140, 10);
		mainPanel.add(theLabel);
		
		labelA.setSize(250, 50);
		labelA.setLocation(120, 80);
		mainPanel.add(labelA);
		
		labelDeg.setSize(100, 50);
		labelDeg.setLocation(320, 80);
		mainPanel.add(labelDeg);
		
		sliderA.setSize(250, 50);
		sliderA.setLocation(120, 120);
		sliderA.addChangeListener(this);
		mainPanel.add(sliderA);
		
		labelF.setSize(250, 50);
		labelF.setLocation(120, 170);
		mainPanel.add(labelF);
		
		txtF.setSize(250, 50);
		txtF.setLocation(120, 210);
		txtF.addActionListener(this);
		mainPanel.add(txtF);
		
		labelD.setSize(250, 50);
		labelD.setLocation(120, 260);
		mainPanel.add(labelD);
		
		txtD.setSize(250, 50);
		txtD.setLocation(120, 300);
		txtD.addActionListener(this);
		mainPanel.add(txtD);
		
		labelW.setSize(250, 50);
		labelW.setLocation(210, 350);
		mainPanel.add(labelW);
		
		txtW.setSize(180, 40);
		txtW.setLocation(160, 390);
		txtW.addActionListener(this);
		mainPanel.add(txtW);
		
		resetButton.setSize(70, 30);
		resetButton.setLocation(210, 450);
		resetButton.addActionListener(this);
		mainPanel.add(resetButton);
		
		startButton.setSize(70, 30);
		startButton.setLocation(20, 500);
		startButton.addActionListener(this);
		
		mainPanel.add(startButton);
		
		theFrame.pack();
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setVisible(true);
		theFrame.setResizable(false);
			
	}
	
	//main program
	public static void main (String[] args){
		new guiassignment();
	}

}
