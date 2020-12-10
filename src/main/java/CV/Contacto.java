package CV;

import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Contacto {

	public static void main() {
		Tab tab_1 = new Tab("Contacto");
		HBox a=new HBox();
		TableView<String> tabla=new TableView<String>();
		TableColumn<String,String> numero= new TableColumn<String, String>("Numero");
		TableColumn<String,String> tipo = new TableColumn<String, String>("tipo");
		tabla.getColumns().add(numero);
		tabla.getColumns().add(tipo);
	    Button añadir=new Button("añadir");
		Button menos=new Button("quitar");
		VBox botones=new VBox();
		botones.getChildren().addAll(añadir,menos);
		a.getChildren().addAll(tabla,botones);
		
		HBox b=new HBox();
		TableView<String> tabla2=new TableView<String>();
		TableColumn<String,String> email= new TableColumn<String, String>("Email");
		tabla2.getColumns().add(email);
	    Button añadir2=new Button("añadir");
		Button menos2=new Button("quitar");
		VBox botones2=new VBox();
		botones2.getChildren().addAll(añadir2,menos2);
		b.getChildren().addAll(tabla2,botones2);
		
		HBox c=new HBox();
		TableView<String> tabla3=new TableView<String>();
		TableColumn<String,String> url= new TableColumn<String, String>("URL");
		tabla3.getColumns().add(url);
	    Button añadir3=new Button("añadir");
		Button menos3=new Button("quitar");
		VBox botones3=new VBox();
		botones3.getChildren().addAll(añadir3,menos3);
		c.getChildren().addAll(tabla3,botones3);
		
		VBox fin=new VBox();
		fin.getChildren().addAll(a,b,c);
		

		
		tab_1.setContent(fin);
        Controlador.tabPane.getTabs().add(tab_1);
	}
}
