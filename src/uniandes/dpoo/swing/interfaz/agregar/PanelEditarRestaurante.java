package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	
    	setLayout(new GridLayout(3,2));
    	
    	JLabel labNombre = new JLabel("Nombre:");
    	labNombre.setAlignmentX(LEFT_ALIGNMENT);
        labNombre.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
        
    	txtNombre = new JTextField();
    	txtNombre.setPreferredSize(new Dimension(200, 20));
    	
    	JLabel labCalificacion = new JLabel("Calificacion:");
    	labCalificacion.setAlignmentX(LEFT_ALIGNMENT);
    	labCalificacion.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
    	
    	cbbCalificacion = new JComboBox();
    	cbbCalificacion.addItem("1");
    	cbbCalificacion.addItem("2");
    	cbbCalificacion.addItem("3");
    	cbbCalificacion.addItem("4");
    	cbbCalificacion.addItem("5");
    	cbbCalificacion.setSize(new Dimension(20, 20));
    	
    	JLabel labVisitado = new JLabel("Visitado:");
    	labVisitado.setAlignmentX(LEFT_ALIGNMENT);
    	labVisitado.setBorder(BorderFactory.createEmptyBorder(5, 10, 15, 10));
    	
    	cbbVisitado = new JComboBox();
    	cbbVisitado.addItem("Si");
    	cbbVisitado.addItem("No");
    	
        add(labNombre);
    	add(txtNombre);
    	add(labCalificacion);
    	add(cbbCalificacion);
    	add(labVisitado);
    	add(cbbVisitado);	


    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
    	String vis = ( String )cbbVisitado.getSelectedItem();
    	boolean selected = false;
    	
    	if (vis.equals("si")) {
    		selected = true;
    	}
    	
        return selected;
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
    	String text = txtNombre.getText();
        return text;
    }
}
