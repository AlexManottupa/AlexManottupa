package canvasAll;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CanvasControlRemoto extends JPanel
{  
	private final static Toolkit TK = Toolkit.getDefaultToolkit();
	private final static Dimension DIM = TK .getScreenSize();
	private final static int ANCHO_PANTALLA = DIM.width;
	private final static int ALTO_PANTALLA = DIM.width;
	private static final double ALTO_DEF = 0;
	private static final int ANCHO_DEF = 0;
	
	
	private final static JButton btnRed = new JButton("Rojo");
    private final static JButton btnGreen = new JButton("Verde");
    private final static JButton btnBlue = new JButton("Azul");
    
    public CanvasControlRemoto()
    { 
    	super();
    	add(btnRed);
    	add(btnGreen);
    	add(btnBlue);
    }
    
    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	Graphics2D g2d = (Graphics2D)g;
    	Rectangle2D rectangle = new Rectangle2D.Double(5, 5, ALTO_DEF, ALTO_DEF);
    	g2d.setPaint(new Color(50, 175, 215));
    	g2d.draw(rectangle);
    }
    
	
	public static int getAnchoPantalla() {
		return CanvasControlRemoto.ANCHO_PANTALLA;
	}

	public static int getAltoPantalla() {
		return CanvasControlRemoto.ALTO_PANTALLA;
	}

	public static double getAltoDef() {
		return CanvasControlRemoto.ALTO_DEF;
	}

	public static int getAnchoDef() {
		return CanvasControlRemoto.ANCHO_DEF;
	}

	public static JButton getButtonCanvasRed() {
		return CanvasControlRemoto.btnRed;
	}

	public static JButton getButtonCanvasGreen() {
		return CanvasControlRemoto.btnGreen;
	}

	public static JButton getButtonCanvasBlue() {
		return CanvasControlRemoto.btnBlue;
	}

	
}
