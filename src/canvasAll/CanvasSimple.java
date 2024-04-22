package canvasAll;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
 

public class CanvasSimple extends JPanel
{  
	private final static Toolkit TK = Toolkit.getDefaultToolkit();
	private final static Dimension DIM = TK .getScreenSize();
	private final static int ANCHO_PANTALLA = DIM.width;
	private final static int ALTO_PANTALLA = DIM.width;
	
	private static final double ALTO_DEF = (ANCHO_PANTALLA / 2) - 100;
	private static final int ANCHO_DEF = (ALTO_PANTALLA / 2) - 100;
	private static final int Alto_DEF = 0;
	
	public CanvasSimple() 
	{
		super();
		ColorFondo fondoRojo = new ColorFondo(Color.RED);
    	ColorFondo fondoVerde = new ColorFondo(Color.GREEN);
    	ColorFondo fondoAzul = new ColorFondo(Color.BLUE);
    	
    	CanvasControlRemoto.getButtonCanvasRed().addActionListener(fondoRojo);
    	CanvasControlRemoto.getButtonCanvasGreen().addActionListener(fondoVerde);
    	CanvasControlRemoto.getButtonCanvasBlue().addActionListener(fondoAzul);
	}
	
	public void paintComponet(Graphics g)
	{
		super.paintComponent(g);
	}
	public static int getAnchoPantalla() {
		return CanvasSimple.ANCHO_PANTALLA;
	}

	public static int getAltoPantalla() {
		return CanvasSimple.ALTO_PANTALLA;
	}

	public static int getAnchoDef() {
		return CanvasSimple.ANCHO_DEF;
	}
	
	public static int getAltoDef() {
		return CanvasSimple.Alto_DEF;
	}
	
	public class ColorFondo implements ActionListener
	{
        private Color color;
        public ColorFondo(Color color)
        {
        	this.color = color;
        }
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setBackground(color);
		}
		
	}
}
