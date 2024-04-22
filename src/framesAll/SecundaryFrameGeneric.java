package framesAll;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import canvasAll.CanvasGeneric;

public class SecundaryFrameGeneric extends JFrame
{
	private final static Toolkit tk = Toolkit.getDefaultToolkit();
	public SecundaryFrameGeneric()
	{ 
		super(); 
		setTitle("Ventana Secundaria");
		setLocation(CanvasGeneric.getAnchoPantalla() / 4, 
				    CanvasGeneric.getAltoPantalla() / 4);
		setSize(CanvasGeneric.getAnchoPantalla() / 2,
				CanvasGeneric.getAltoPantalla() / 2);
		setVisible(true);
		Image myIcon = tk.createImage("Hw");
		setIconImage(myIcon);
		CanvasGeneric myCanvas = new CanvasGeneric();
		add(myCanvas);
		
		WindowsInterfaces myControl = new WindowsInterfaces();
		addWindowListener(myControl); 
		addWindowStateListener(myControl); 
		addWindowFocusListener(myControl);
	}
	 
	private class WindowsInterfaces extends WindowAdapter
	{ 
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana principal a cerrado");
		}
        
		public void windowStateChanged(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana principal ha cambiado de estado:");
			if(e.getNewState() == Frame.MAXIMIZED_BOTH)
			    {
				    System.out.println("La ventana principal esta maximizada");
			    }
			else if(e.getNewState() == Frame.ICONIFIED)
			{
				System.out.println("La ventana principal esta minimizada");
			}
			else if(e.getNewState() == Frame.NORMAL)
			{
				System.out.println("La ventana principal esta restaurada");
			}
		}
	}
}
