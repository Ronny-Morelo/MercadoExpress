/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyectofinal.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author RONNY
 */
public class LoginController implements Initializable {
      private Stage stage;
    @FXML
    private AnchorPane si_loginForm;
    @FXML
    private TextField si_username;
    @FXML
    private PasswordField si_password;
    @FXML
    private Button si_loginBtn;
    @FXML
    private Hyperlink si_forgotPass;
    @FXML
    private AnchorPane su_signupForm;
    @FXML
    private TextField su_username;
    @FXML
    private PasswordField su_password;
    @FXML
    private ComboBox<?> su_question;
    @FXML
    private TextField su_answer;
    @FXML
    private Button su_signupBtn;
    @FXML
    private AnchorPane fp_questionForm;
    @FXML
    private Button fp_proceedBtn;
    @FXML
    private TextField fp_username;
    @FXML
    private ComboBox<?> fp_question;
    @FXML
    private TextField fp_answer;
    @FXML
    private Button fp_back;
    @FXML
    private AnchorPane np_newPassForm;
    @FXML
    private PasswordField np_newPassword;
    @FXML
    private PasswordField np_confirmPassword;
    @FXML
    private Button np_changePassBtn;
    @FXML
    private Button np_back;
    @FXML
    private AnchorPane side_form;
    @FXML
    private Button side_CreateBtn;
    @FXML
    private Button side_alreadyHave;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    public void setStage(Stage primaryStage) {
       stage= primaryStage;
    }

    @FXML
    private void loginBtn(ActionEvent event) {
    }

    @FXML
    private void switchForgotPass(ActionEvent event) {
    }

    @FXML
    private void regBtn(ActionEvent event) {
    }

    @FXML
    private void proceedBtn(ActionEvent event) {
    }

    @FXML
    private void backToLoginForm(ActionEvent event) {
    }

    @FXML
    private void changePassBtn(ActionEvent event) {
    }

    @FXML
    private void backToQuestionForm(ActionEvent event) {
    }

    @FXML
    private void switchForm(ActionEvent event) {
    }
    
      
    
     
    
}
