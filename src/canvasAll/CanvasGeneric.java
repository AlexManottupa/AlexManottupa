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

public class CanvasGeneric extends JPanel
{ 
	private final static Toolkit TK = Toolkit.getDefaultToolkit();
	private final static Dimension DIM = TK .getScreenSize();
	private final static int ANCHO_PANTALLA = DIM.width;
	private final static int ALTO_PANTALLA = DIM.width;
	 
	private static final double ALTO_DEF = (ANCHO_PANTALLA / 2) - 100;
	private static final int ANCHO_DEF = (ALTO_PANTALLA / 2) - 100;
	private static final int Alto_DEF = 0;
	
	
	private final JButton btnRed = new JButton("Rojo");
    private final JButton btnGreen = new JButton("Verde");
    private final JButton btnBlue = new JButton("Azul");
    
    public CanvasGeneric()
    {
    	super();
    	add(btnRed);
    	add(btnGreen);
    	add(btnBlue);
    	
    	ColorFondo fondoRojo = new ColorFondo(Color.RED);
    	ColorFondo fondoVerde = new ColorFondo(Color.GREEN);
    	ColorFondo fondoAzul = new ColorFondo(Color.BLUE);
    	
    	btnRed.addActionListener(fondoRojo);
    	btnRed.addActionListener(fondoVerde);
    	btnRed.addActionListener(fondoAzul);
    	
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
		return CanvasGeneric.ANCHO_PANTALLA;
	}

	public static int getAltoPantalla() {
		return CanvasGeneric.ALTO_PANTALLA;
	}

	public static int getAnchoDef() {
		return CanvasGeneric.ANCHO_DEF;
	}
	
	public static int getAltoDef() {
		return CanvasGeneric.Alto_DEF;
	}
	
	private class ColorFondo implements ActionListener
	{
		private Color color;
		public ColorFondo(Color color) {
			this.color = color;
		}
		  
		public void actionPerformed(ActionEvent e) {
			setBackground(color);
		}
		
	}
	
}
