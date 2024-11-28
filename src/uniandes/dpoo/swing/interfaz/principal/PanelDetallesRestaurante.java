package uniandes.dpoo.swing.interfaz.principal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelDetallesRestaurante extends JPanel
{
    /**
     * La etiqueta donde se muestra el nombre de un restaurante
     */
    private JLabel labNombre;

    /**
     * La etiqueta donde se muestra la calificación de un restaurante, usando imágenes de estrellas
     */
    private JLabel labCalificacion;

    /**
     * Un checkbox en el que se muestra si un restaurante fue visitado o no
     */
    private JCheckBox chkVisitado;

    public PanelDetallesRestaurante( )
    {
    	setLayout(new GridLayout(3,1));
    	//setLayout(new BoxLayout(this, GridLayout.));
        
    	// Configura la etiqueta para el nombre
        // TODO completar el constructor
    	labNombre = new JLabel("Nombre:");
    	labNombre.setAlignmentX(LEFT_ALIGNMENT);
        labNombre.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10)); // Top, left, bottom, right
    	add(labNombre);
 
    	
        // Configura la etiqueta para la calificación
        // TODO completar el constructor
    	labCalificacion = new JLabel("Calificacion:");
    	labCalificacion.setAlignmentX(LEFT_ALIGNMENT);
        labCalificacion.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10)); // Top, left, bottom, right
    	add(labCalificacion);
    	
    	
        // Configura el checkbox para indicar si ya se visitaó o no el restaurante
        // TODO completar el constructor
    	chkVisitado = new JCheckBox("Visitado:");
    	chkVisitado.setAlignmentX(LEFT_ALIGNMENT);
        chkVisitado.setBorder(BorderFactory.createEmptyBorder(5, 10, 15, 10));
        chkVisitado.setHorizontalTextPosition(SwingConstants.LEADING);// Top, left, bottom, right
    	add(chkVisitado);
    	
    	
        // Organiza los elementos en la ventana
        // TODO completar el constructor
    	
    	
    }

    /**
     * Actualiza los datos mostrados del restaurante, indicando los valores por separado.
     * @param nombre
     * @param calificacion
     * @param visitado
     */
    private void actualizarRestaurante( String nombre, int calificacion, boolean visitado )
    {
     // TODO completar actualizarRestaurante
    labNombre.setText("Nombre: " + nombre);
    
    labCalificacion.setText("Calificacion: ");
    labCalificacion.setIcon(buscarIconoCalificacion(calificacion));
    labCalificacion.setHorizontalTextPosition(SwingConstants.LEADING);
    
    chkVisitado.setSelected(visitado);
    }

    /**
     * Actualiza los datos que se muestran de un restaurante
     * @param r El restaurante que se debe mostrar
     */
    public void actualizarRestaurante( Restaurante r )
    {
        this.actualizarRestaurante( r.getNombre( ), r.getCalificacion( ), r.isVisitado( ) );
    }

    /**
     * Dada una calificación, retorna una imagen para utilizar en la etiqueta que muestra la calificación
     * @param calificacion La calificación del restaurante, que debe ser un numero entre 1 y 5.
     * @return Una imagen a la que corresponde la calificación
     */
    private ImageIcon buscarIconoCalificacion( int calificacion )
    {
        String imagen = "./imagenes/stars" + calificacion + ".png";
        return new ImageIcon( imagen );
    }
}
