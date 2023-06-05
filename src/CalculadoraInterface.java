import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculadoraInterface extends Application {

    private TextField numero1Field;
    private TextField numero2Field;
    private Label resultadoLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculadora");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        numero1Field = new TextField();
        numero2Field = new TextField();
        resultadoLabel = new Label();

        Button somarButton = new Button("Somar");
        somarButton.setOnAction(e -> somar());

        Button subtrairButton = new Button("Subtrair");
        subtrairButton.setOnAction(e -> subtrair());

        Button multiplicarButton = new Button("Multiplicar");
        multiplicarButton.setOnAction(e -> multiplicar());

        Button dividirButton = new Button("Dividir");
        dividirButton.setOnAction(e -> dividir());

        gridPane.add(new Label("Número 1:"), 0, 0);
        gridPane.add(numero1Field, 1, 0);
        gridPane.add(new Label("Número 2:"), 0, 1);
        gridPane.add(numero2Field, 1, 1);
        gridPane.add(somarButton, 0, 2);
        gridPane.add(subtrairButton, 1, 2);
        gridPane.add(multiplicarButton, 0, 3);
        gridPane.add(dividirButton, 1, 3);
        gridPane.add(resultadoLabel, 0, 4, 2, 1);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void somar() {
        double numero1 = Double.parseDouble(numero1Field.getText());
        double numero2 = Double.parseDouble(numero2Field.getText());
        double resultado = numero1 + numero2;
        resultadoLabel.setText("Resultado: " + resultado);
    }

    private void subtrair() {
        double numero1 = Double.parseDouble(numero1Field.getText());
        double numero2 = Double.parseDouble(numero2Field.getText());
        double resultado = numero1 - numero2;
        resultadoLabel.setText("Resultado: " + resultado);
    }

    private void multiplicar() {
        double numero1 = Double.parseDouble(numero1Field.getText());
        double numero2 = Double.parseDouble(numero2Field.getText());
        double resultado = numero1 * numero2;
        resultadoLabel.setText("Resultado: " + resultado);
    }

    private void dividir() {
        double numero1 = Double.parseDouble(numero1Field.getText());
        double numero2 = Double.parseDouble(numero2Field.getText());
        double resultado = numero1 / numero2;
        resultadoLabel.setText("Resultado: " + resultado);
    }
}
