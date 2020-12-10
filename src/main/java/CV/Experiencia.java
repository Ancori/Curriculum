package CV;

import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Experiencia {
	public static void main() {
		Tab tab_1 = new Tab("Experiencia");
		HBox a=new HBox();
		TableView<String> tabla=new TableView<String>();
		TableColumn<String,String> desde= new TableColumn<String, String>("Desde");
		TableColumn<String,String> hasta = new TableColumn<String, String>("Hasta");
		TableColumn<String,String> denominacion= new TableColumn<String, String>("Denominacion");
		TableColumn<String,String> empleador = new TableColumn<String, String>("Empleador");
		tabla.getColumns().add(desde);
		tabla.getColumns().add(hasta);
		tabla.getColumns().add(denominacion);
		tabla.getColumns().add(empleador);
	    Button añadir=new Button("añadir");
		Button menos=new Button("quitar");
		VBox botones=new VBox();
		botones.getChildren().addAll(añadir,menos);
		a.getChildren().addAll(tabla,botones);
		
		tab_1.setContent(a);
        Controlador.tabPane.getTabs().add(tab_1);
	}
}
