package CV;

import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Conocimiento {
	public static void main() {
		Tab tab_1 = new Tab("Conocimiento");
		HBox a=new HBox();
		TableView<String> tabla=new TableView<String>();
		TableColumn<String,String> Denominacion= new TableColumn<String, String>("Denominacion");
		TableColumn<String,String> Nivel = new TableColumn<String, String>("Nivel");
		tabla.getColumns().add(Denominacion);
		tabla.getColumns().add(Nivel);
	    Button añadir=new Button("Añadir conocimiento");
		Button idioma=new Button("Añadir idioma");
		Button menos=new Button("Eliminar");
		VBox botones=new VBox();
		botones.getChildren().addAll(añadir,idioma,menos);
		a.getChildren().addAll(tabla,botones);
		
		tab_1.setContent(a);
        Controlador.tabPane.getTabs().add(tab_1);
	}

}
