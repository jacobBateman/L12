package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;


import java.awt.*;

public class ChatController {
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    private ListView<String> userList;

    public void receive(String part) {
        textArea.appendText(part);

    }

    @FXML
    public void send(ActionEvent actionEvent) {
        client.send(textField.getText());
        textField.clear();
    }


}

