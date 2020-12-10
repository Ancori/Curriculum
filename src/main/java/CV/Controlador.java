package CV;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controlador extends Application {

	static TabPane tabPane = new TabPane();
	static MenuItem menuItem3;
	@Override
	public void start(Stage primaryStage) throws Exception {
		MenuBar menu = new MenuBar();
		Menu Archivo = new Menu("Archivo");
		Menu Ayuda = new Menu("Ayuda");
		MenuItem menuItem1 = new MenuItem("Nuevo");
		ImageView openView = new ImageView("169262.png");
		openView.setFitWidth(20);
		openView.setFitHeight(20);
		menuItem1.setGraphic(openView);
		MenuItem menuItem2 = new MenuItem("Abrir");
		ImageView openView2 = new ImageView("44739.png");
		openView2.setFitWidth(20);
		openView2.setFitHeight(20);
		menuItem2.setGraphic(openView2);
		menuItem3 = new MenuItem("Guardar");
		ImageView openView3 = new ImageView("save.png");
		openView3.setFitWidth(20);
		openView3.setFitHeight(20);
		menuItem3.setGraphic(openView3);
		MenuItem menuItem4 = new MenuItem("Guardar como...");
		SeparatorMenuItem sep = new SeparatorMenuItem();
		MenuItem menuItem5 = new MenuItem("Salir");
		MenuItem menuItem6 = new MenuItem("Acerca de...");

		Archivo.getItems().addAll(menuItem1, menuItem2, menuItem3, menuItem4, sep, menuItem5);
		Ayuda.getItems().add(menuItem6);
		menu.getMenus().addAll(Archivo, Ayuda);

		BorderPane borderPane = new BorderPane();

		Personal.main();
		Contacto.main();
		Formacion.main();
		Experiencia.main();
		Conocimiento.main();
		tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

		Controlador.menuItem3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				PDDocument document = new PDDocument();
				PDPage page = new PDPage(PDRectangle.A6);
	            document.addPage(page);

	            PDPageContentStream contentStream;
				try {
					contentStream = new PDPageContentStream(document, page);
					   contentStream.beginText();
			            contentStream.setFont(PDType1Font.TIMES_BOLD, 11);
			            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
			            contentStream.showText("DNI: "+Personal.DNI.getText());
			            contentStream.showText("Nombre: "+Personal.Nombre.getText());
			            contentStream.showText("Apellidos: "+Personal.Apellidos.getText());
			            contentStream.showText("Fecha Nacimiento: "+Personal.date.getValue());
			            contentStream.showText("Direccion: "+Personal.direccion.getText());
			            contentStream.showText("Codigo Postal: "+Personal.CodigoPostal.getText());
			            contentStream.showText("Localidad: "+Personal.Localidad.getText());
			            contentStream.showText("Pais: "+Personal.Paises.getSelectionModel().getSelectedItem());
			            contentStream.showText("Nacionalidad: "+Personal.Nacionalidad.getText());
			            contentStream.endText();
			            contentStream.close();
			            document.save("Curriculum.pdf");
			            document.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	           
			}
		});

		borderPane.setCenter(tabPane);

		VBox root = new VBox();
		root.getChildren().addAll(menu, borderPane);
		Scene scene = new Scene(root, 630, 630);
		primaryStage.setTitle("Crear Curriculum");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
