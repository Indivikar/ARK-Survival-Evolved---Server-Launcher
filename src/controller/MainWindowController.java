package controller;

//Multi-Controller und Multi-FXMLs

//zuerst im Scene Builder die fxml-Datei includen: File -> Include -> FXML... -> die Datei wählen
//(ACHTUNG! die Datei kann nicht in alle Nodes eingefügt werden, aber man kann sie danach verschieben wo man sie hin haben möchte, es geht auf jeden Fall: AnchorPane, HBox, VBox)
//in der "Main.fxml", in der Zeile "<fx:include fx:id="testTab" source="Test.fxml" />" muss das "fx:id="testTab" von Hand in die Main.fxml eingetragen werden und
//der erste Node von der include fxml muss die id selbe id bekommen

//das example für Multi-Controller und Multi-FXMLs
//https://www.youtube.com/watch?v=osIRfgHTfyg

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import stage.SystemTrayIcon;

public class MainWindowController {

	MainWindowController mainWindowController;

	// Stage
	private SystemTrayIcon main;


	// View's
	@FXML private AnchorPane mainAnchorPane;
	@FXML private TextField textField;
	@FXML private Button button;


	// Action's
//	@FXML public void actionButton(){
//		System.out.println("Button");
//
//	}

	public void initialize(){
		this.mainWindowController = this;
		System.out.println("MainController");

	}

	// Getter



    // Setter
	public void setMainWindowStage(SystemTrayIcon systemTrayIcon, Stage primaryStage){
		this.main = systemTrayIcon;


	}

}
