/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectofinal.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author RONNY
 */
public class HomeController implements Initializable {
    
      private Stage stage;

    /**
     * Initializes the controller class.
     */
       @FXML
    private Button btnInicioSesion;

    @FXML
    void IniciarSesion(ActionEvent event) throws IOException {

         FXMLLoader loader   = new FXMLLoader(getClass().getResource("/proyectofinal/vistas/Login.fxml"));
        Parent root =loader.load();
        LoginController controller = loader.getController();
        Stage primaryStage =new Stage();   
        primaryStage.setTitle("Ingreso");
        primaryStage.setScene(new Scene(root));
        controller.init( primaryStage,this);
        primaryStage.show();
        this.stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    

    public void setStage(Stage primaryStage) {
       stage= primaryStage;
    }
    
}