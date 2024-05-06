package framesAll;

import java.awt.Image;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

import canvasAll.CanvasGeneric;

public class MainFrameGeneric extends JFrame
{
	private final static Toolkit tk = Toolkit.getDefaultToolkit();
	public MainFrameGeneric()
	{ 
		super();  
		setTitle("Ventana De Gustos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(CanvasGeneric.getAnchoPantalla() / 4, 
				    CanvasGeneric.getAltoPantalla() / 9);
		setSize(CanvasGeneric.getAnchoPantalla() / 4,
				CanvasGeneric.getAltoPantalla() / 4);
		setVisible(true);
		Image myIcon = tk.createImage("src/Hw.jpg");
		setIconImage(myIcon);
		CanvasGeneric myCanvas = new CanvasGeneric();
		add(myCanvas);
		
		WindowsInterfaces myControl = new WindowsInterfaces();
		addWindowListener(myControl); 
		addWindowStateListener(myControl); 
		addWindowFocusListener(myControl);
	}
	
	private class WindowsInterfaces implements WindowListener, WindowStateListener, WindowFocusListener
	{

		public void windowGainedFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana principal ha sido abierta");
		}

		public void windowLostFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("El sistema se esta cerrando");
		}

		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana ha sido abierta");
		}

		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana principal ha dejado de estar minimizada");
		}

		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana principal esta activa");
		}

		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana principal ha dejado estar minimizado");
		} 

		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana principal esta activada");
		}

		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana principal esta desactivada");
		}
		
		public void windowStateChanged(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La ventana principal ha cambiado de estado:");
			if(e.getNewState() == Frame.MAXIMIZED_BOTH)
			{
				System.out.println("La ventana principal esta maximizada");
			}else if(e.getNewState() == Frame.ICONIFIED)
			{
				System.out.println("La ventana principal esta minimizada");
			}else if(e.getNewState() == Frame.NORMAL)
			{
				System.out.println("La ventana principal esta restaurada");
			}
		}

	}
}
