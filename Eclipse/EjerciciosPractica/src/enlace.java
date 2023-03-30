import java.awt.Desktop;
import java.io.IOException;
 import java.net.URI;
 import java.net.URISyntaxException;
public class enlace {
	public static void main(String []args) {
	 private void Abrir_URL() throws URISyntaxException {
		 if (Desktop.isDesktopSupported()) {
		 Desktop desktop = Desktop.getDesktop();
		 try {
		 URI uri = new URI("http://www.byspel.com");
		 desktop.browse(uri);
		 } catch (IOException e) {
		 System.err.println("Error: No se pudo abrir el enlace" + e.getMessage() );
		 }
		 } else {
		 System.err.println("Error: No se puede abrir enlaces web.");
		 }
	 }					
	
	}

}
