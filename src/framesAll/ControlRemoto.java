package framesAll;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JFrame;
import canvasAll.CanvasGeneric;


import javax.swing.*;

public class ControlRemoto extends JFrame 
{
	private final static Toolkit tk = Toolkit.getDefaultToolkit();
	
	private final static JButton BTN_Poem = new JButton("Poem");
	private final static JButton BTN_Music = new JButton("Music");
	private final static JButton BTN_Views = new JButton("Poem"); 
	
	
	public ControlRemoto()
	{
		super();
		add(BTN_Poem);
    	add(BTN_Poem);
    	add(BTN_Views);
		setTitle("Ventana Pincipal");
		setLocation(300, 256);
		
		setBounds(300, 200, 300, 50);
		setSize(500, 480);
		setVisible(true);
		
		Image myIcon = tk.createImage("src/Hw.jpg");
		setIconImage(myIcon);
		CanvasGeneric myCanvas = new CanvasGeneric();
		add(myCanvas);
		Font font = new Font("Arial", Font.PLAIN, 30);
		
	}
	public void paint(Graphics g) {
        g.setFont(getFont());
        g.setColor(Color.magenta);
        g.drawString("This was my Practice in Java Swing", 200, 200);}
}
