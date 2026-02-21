import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.io.File;
import java.io.PrintWriter;
import javafx.scene.control.ToolBar;

public class Main extends Application {
    @Override
    public void start(Stage palco) {

        TextArea area = new TextArea();
        Button botao = new Button("Salvar");

        botao.setOnAction(e ->{
            salvarTexto(area);
        });

        ToolBar ferramenta = new ToolBar(botao);

        BorderPane bp = new BorderPane();
        bp.setTop(ferramenta);
        bp.setCenter(area);

        Scene cena = new Scene(bp,800,600);
        palco.setTitle("Editor de texto basica");
        palco.setScene(cena);
        palco.show();

    }
    public static void salvarTexto(TextArea textarea){
        FileChooser file =  new FileChooser();
        file.setTitle("Salvar arquivo de texto");
        File f = file.showSaveDialog(null);

        if (f != null) {
            try(PrintWriter writer = new PrintWriter(f)){
                writer.print(textarea.getText());

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}