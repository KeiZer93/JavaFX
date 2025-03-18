package appli.accueil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javax.security.auth.callback.ConfirmationCallback;
import java.io.IOException;


public class InscriptionController {
    @FXML
    private TextField Nom;

    @FXML
    private TextField Prenom;

    @FXML
    private Button boutonInscription;

    @FXML
    private Button boutonRetour;

    @FXML
    private TextField email;

    @FXML
    private TextField mdp;

    @FXML
    private TextField pass;

    @FXML
    private Label labelErreur;


    @FXML
    void Inscription(ActionEvent event) {
        String nom = Nom.getText();
        String prenom = Prenom.getText();
        String emailInput = email.getText();
        String password = mdp.getText();
        String passInput = pass.getText();

        System.out.println("Nom = " + nom);
        System.out.println("Prenom = " + prenom);
        System.out.println("Email: " + emailInput);
        System.out.println("Mot de passe: " + password);
        System.out.println("pass : " + passInput);

        if (emailInput.equals("test@test.te") && password.equals("Test1234")) {
            System.out.println("Connexion réussie !");
            labelErreur.setText("Connexion réussie !");
            labelErreur.setStyle("-fx-text-fill: green;");
        } else {
            System.out.println("Identifiants incorrects.");
            labelErreur.setText("Identifiants incorrects.");
            labelErreur.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    void retourConnexion(ActionEvent event) {
        try {
            StartApplication.changeScene("accueil/Login");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
