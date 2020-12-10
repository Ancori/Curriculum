package CV;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Personal {

	public static TextField DNI,Nombre,Apellidos,CodigoPostal,Localidad;
	public static DatePicker date;
	public static TextArea direccion,Nacionalidad;
	public static ComboBox<String> Paises;
	
	public static void main() {
		Tab tab_1 = new Tab("Personal");
		GridPane a = new GridPane();
		Label d = new Label("DNI");
		Label p = new Label("Nombre");
		Label ap = new Label("Apellidos");
		Label f = new Label("Fecha de nacimiento");
		Label dir = new Label("Direccion");
		Label cod = new Label("Codigo Postal");
		Label loca = new Label("Localidad");
		Label pa = new Label("Pais");
		Label naci = new Label("Nacionalidad");

		DNI = new TextField();
		Nombre = new TextField();
		Apellidos = new TextField();
		date = new DatePicker();
		direccion = new TextArea();
		direccion.setPrefHeight(50);
		CodigoPostal = new TextField();
		Localidad = new TextField();
		Paises = new ComboBox<String>();
		Nacionalidad = new TextArea();

		Button mas = new Button("+");
		Button menos = new Button("-");
		VBox botones = new VBox();
		botones.getChildren().addAll(mas, menos);

		a.add(d, 0, 0, 1, 1);
		a.add(p, 0, 1, 1, 1);
		a.add(ap, 0, 2, 1, 1);
		a.add(f, 0, 3, 1, 1);
		a.add(dir, 0, 4, 1, 1);
		a.add(cod, 0, 5, 1, 1);
		a.add(loca, 0, 6, 1, 1);
		a.add(pa, 0, 7, 1, 1);
		a.add(naci, 0, 8, 1, 1);
		a.add(DNI, 1, 0, 1, 1);
		a.add(Nombre, 1, 1, 1, 1);
		a.add(Apellidos, 1, 2, 1, 1);
		a.add(date, 1, 3, 1, 1);
		a.add(direccion, 1, 4, 1, 1);
		a.add(CodigoPostal, 1, 5, 1, 1);
		a.add(Localidad, 1, 6, 1, 1);
		a.add(Paises, 1, 7, 1, 1);
		a.add(Nacionalidad, 1, 8, 1, 1);
		a.add(botones, 2, 8, 1, 1);
		
		tab_1.setContent(a);
		Controlador.tabPane.getTabs().add(tab_1);
		
	}

	

}
