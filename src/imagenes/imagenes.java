package imagenes;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public abstract class imagenes {

	public static ImageIcon getImgAusente(){
		
		ImageIcon icon = new ImageIcon("src\\imagenes\\no_image.jpg");
		return icon;
	}
	
	public static Image getIconoAplicacion(){
		Image imagen = Toolkit.getDefaultToolkit().getImage("src\\imagenes\\logos.jpg");
		return imagen;
	}
	
}
