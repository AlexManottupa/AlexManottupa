package framesAll;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import canvasAll.CanvasGeneric;

public class ControlRemoto extends JFrame
{
	private final static Toolkit tk = Toolkit.getDefaultToolkit();
	public ControlRemoto()
	{   
		super(); 
		setTitle("Ventana secundaria");
		setLocation(CanvasGeneric.getAnchoPantalla() / 4 + 450,
				    CanvasGeneric.getAltoPantalla() / 4);
		setSize(CanvasGeneric.getAltoDef() / 3, 
				CanvasGeneric.getAnchoDef() / 3);
		setVisible(true);
		setResizable(false);
		Image myIcon = tk.createImage("src/Hw.jpg");
		setIconImage(myIcon);
		CanvasGeneric myCanvas = new CanvasGeneric();
		add(myCanvas);
	}
}
