package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {



    private double x; //Сайт
    private double y; //Логин
    private double z; //Длина пароля

    @FXML
    public CheckBox clickWordNumbers;
    @FXML
    public CheckBox clickWordCharacters;
    @FXML
    public CheckBox clickWordSmale;
    @FXML
    public CheckBox clickWordBig;
    @FXML
    public Button clickSendGen;
    @FXML
    public TextField textLogin;
    @FXML
    public TextField textWebsite;
    @FXML
    public TextField textLength;
    @FXML
    public TextArea textArea;



    public void clickSendGen(ActionEvent actionEvent) {
        textArea.clear();
        MyPassword myPassword = new MyPassword();
        String x = textWebsite.getText();
        String y = textLogin.getText();
        int z = Integer.parseInt(textLength.getText());
        Boolean w = clickWordBig.isSelected();
        Boolean s = clickWordSmale.isSelected();
        Boolean e = clickWordNumbers.isSelected();
        Boolean r = clickWordCharacters.isSelected();

        textArea.appendText("Сайт " + x + "\n" + "Логин " + y + "\n" + "Пароль "+ myPassword.MyPassword(z,w,s,e,r) + "\n" + "Длина пароля " + z + "\n");
        textWebsite.requestFocus();
    }

//    public void clickClear(ActionEvent actionEvent) {
//        textArea.clear();
//    }

    public void clickCopy(ActionEvent actionEvent) {
        textArea.selectAll();
        textArea.copy();

    }
}
