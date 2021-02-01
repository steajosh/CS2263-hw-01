/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CS2263.hw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

import java.util.Vector;

public class App extends Application {
    Vector<Course> courseList = new Vector<Course>(1);

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Whatever");

        ComboBox comboBox = new ComboBox();

        comboBox.getItems().add("Computer Science");
        comboBox.getItems().add("Chemistry");
        comboBox.getItems().add("Physics");
        comboBox.getItems().add("Mathematics");
        comboBox.getItems().add("Botany");
        comboBox.getItems().add("Zoology");
        comboBox.getItems().add("Computer Science");

        ListView listView = new ListView();
        listView.setVisible(false);

        TextField textField1 = new TextField("");
        textField1.setVisible(false);
        TextField textField2 = new TextField("");
        textField2.setVisible(false);
        TextField textField3 = new TextField("");
        textField3.setVisible(false);


        Button button1 = new Button("Display all");
        Button button2 = new Button("Display Dept");
        Button button3 = new Button("Enter");

        Label label1 = new Label( "Course Name:");
        label1.setVisible(false);
        Label label2 = new Label( "Course Number:");
        label2.setVisible(false);
        Label label3 = new Label( "Credits:");
        label3.setVisible(false);

        comboBox.setOnAction(value -> {
            textField1.setVisible(true);
            textField2.setVisible(true);
            textField3.setVisible(true);
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
        });

        button1.setOnAction(value -> {
            listView.setVisible(!listView.isVisible());
        });

        button3.setOnAction(value-> {
            if (!textField1.getText().equals("") & !textField2.getText().equals("") & !textField3.getText().equals("")){
                Course newCourse = new Course(comboBox.getValue().toString(), textField2.getText(), textField1.getText(), textField3.getText());
                listView.getItems().add(newCourse.getCode() + " " + newCourse.getCourseNumb() + " " + newCourse.getCredits());
                textField1.setVisible(false);
                textField2.setVisible(false);
                textField3.setVisible(false);

                label1.setVisible(false);
                label2.setVisible(false);
                label3.setVisible(false);
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });

        VBox vbox1 = new VBox(comboBox, label1, textField1, label2, textField2, label3, textField3,         button1, button2, button3
        );
        VBox vbox2 = new VBox(listView);
        HBox hbox = new HBox(vbox1, vbox2);

        Scene scene = new Scene(hbox, 400, 400);
        primaryStage.setScene((scene));

        primaryStage.show();
    }

    public static void main(String[] args) {
    Application.launch(args);
    }
}