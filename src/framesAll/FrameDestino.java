package framesAll;
import java.awt.*;

import canvasAll.CanvasGeneric;

import canvasAll.CanvasSimple;
import javax.swing.JFrame;

public class FrameDestino extends JFrame
{
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	public FrameDestino() 
	{  
		super(); 
		setTitle("Frame Destino");
		setLocation(CanvasSimple.getAnchoPantalla() / 4 + 350,
				    CanvasSimple.getAltoPantalla() / 4);
		setSize(CanvasSimple.getAnchoPantalla() / 2, 
				CanvasSimple.getAltoPantalla() / 2);
		setVisible(true);
		setResizable(true);
		Image myIcon = tk.createImage("src/Hw.jpg");
		setIconImage(myIcon);
		CanvasSimple myCanvas = new CanvasSimple();
		add(myCanvas);
	}
}
