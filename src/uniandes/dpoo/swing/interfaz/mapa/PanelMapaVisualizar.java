package uniandes.dpoo.swing.interfaz.mapa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelMapaVisualizar extends JPanel
{
    /**
     * La etiqueta donde se dibuja el mapa y se hacen las señales de los restaurantes
     */
    private JLabel labMapa;
    
    //private ImageIcon mapa;

    /**
     * La lista de restaurantes que se están dibujando en el mapa
     */
    private List<Restaurante> restaurantes;

    public PanelMapaVisualizar( )
    {
        this.labMapa = new JLabel( new ImageIcon( "./imagenes/mapa.png" ) );
        labMapa.setBorder( new LineBorder( Color.DARK_GRAY ) );
        add( labMapa, BorderLayout.CENTER );
    	//this.mapa = new ImageIcon( "./imagenes/mapa.png");
    }

    @Override
    public void paint( Graphics g )
    {
        super.paint( g );
        Graphics2D g2d = ( Graphics2D )g;
        
        if(restaurantes != null) {
        	for (Restaurante rest : restaurantes) {
                
        		g2d.setColor( Color.red );
        		g2d.fillOval( rest.getX() - 3, rest.getY()- 3, 7, 7 );
        		
        		g2d.setColor(Color.red);
        		g2d.drawString(rest.getNombre(), rest.getX() + 6, rest.getY());		
        		
        	}
       }
     // Completar y hacer que se vean los nombres de todos los restaurantes en el mapa
        
    	/*super.paintComponent(g);
    	Graphics2D g2d = (Graphics2D)g;
    	
    	if (mapa != null) {
    		g2d.drawImage(mapa.getImage(),0,0, getWidth(), getHeight(), this);
    	}
    	
    	if (restaurantes != null) {
    		for (Restaurante rest : restaurantes) {
    			g2d.setColor(Color.red);
                g2d.fillOval(rest.getX() - 3, rest.getY() - 3, 7, 7);
                g2d.drawString(rest.getNombre(), rest.getX() + 6, rest.getY());
    		}
    	}*/
        
    }

    /**
     * Actualiza la lista de restaurantes y llama al método repaint() para que se actualice el mapa
     * @param nuevosRestaurantes
     */
    public void actualizarMapa( List<Restaurante> nuevosRestaurantes )
    {
        //if( restaurantes != null )
       // {
          //  this.restaurantes.clear( );
          //  this.restaurantes.addAll( nuevosRestaurantes );
       // }
        //else
        //{
         //   this.restaurantes = nuevosRestaurantes;
        //}
    	this.restaurantes = nuevosRestaurantes;
        repaint( );
    }
}