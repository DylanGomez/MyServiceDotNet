package View;

import Controller.CustomerController;
import Model.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dylan on 29-5-2017.
 */
public class RegisterForm extends JFrame{

    private JTextField RegisterUsernameField;
    private JTextArea NewPasswordField;
    private JButton RegisterButton;
    private JTabbedPane LoginRegisterPane;
    private JTextArea Username;
    private JTextField LoginInputField;
    private JTextField passwordField;
    private JButton loginButton;
    private JTextArea ErrorField;
    private JTextArea WelcomeText;
    private JLabel UsernmeField;
    private JLabel PasswordLabel;

    CustomerController c = new CustomerController();
    public void init(){
        JPanel panel = new JPanel();
        panel.add(LoginRegisterPane);
        this.add(panel);
    }

    public RegisterForm() {
        this.init();
        this.setSize(600, 400);
        this.setVisible(true);

        RegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(RegisterUsernameField.getText().isEmpty())
                    {
                        NewPasswordField.setText("Gebruikersnaam mag niet leeg zijn");
                    }
                    else {
                        String pass = c.registerUser(RegisterUsernameField.getText());
                        NewPasswordField.setText("Your password is: " + pass);
                    }
                    }catch (Exception exception){
                    NewPasswordField.setText("There was a problem with registering");
                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(LoginInputField.getText().isEmpty() || passwordField.getText().isEmpty()){
                        ErrorField.setText("Niet alle velden zijn ingevuld");
                    }else {
                        if (c.loginUser(LoginInputField.getText(), passwordField.getText())) {
                            ErrorField.setText("Je bent ingelogt");
                            new ProductForm(LoginInputField.getText());
                        }
                    }
                } catch (Exception ex) {
                    ErrorField.setVisible(true);
                    ErrorField.setText("Something went wrong, check your information" + ex);
                }
            }
        });

    }
}
