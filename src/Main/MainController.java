package Main;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import java.awt.event.ActionEvent;
import java.io.File;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.ResourceBundle;

public abstract class MainController implements Initializable {

    private ObservableList<Receiver> Estudiantes;
    private ArrayList<StudentType_A> estudiA = new ArrayList<>();
    private ArrayList<StudentType_B> estudiB = new ArrayList<>();
    private File archivo;

    @FXML
    private TableView<Receiver> Show_data;
    @FXML
    private TableColumn<Receiver, String> Show_Carnet;
    @FXML
    private TableColumn<Receiver, String> Show_Nom;
    @FXML
    private TableColumn<Receiver, String> Show_Correo;
    @FXML
    private TableColumn<Receiver, String> Show_Tel;
    @FXML
    private TableColumn<Receiver, String> Show_Nick;
    @FXML
    private TableColumn<Receiver, String> Show_Type;
    @FXML
    private TableColumn<Receiver, String> Show_Examenes;
    @FXML
    private TableColumn<Receiver, String> Show_Quices;
    @FXML
    private TableColumn<Receiver, String> Show_Tareas;
    @FXML
    private TableColumn<Receiver, String> Show_P1;
    @FXML
    private TableColumn<Receiver, String> Show_P2;
    @FXML
    private TableColumn<Receiver, String> Show_P3;
    @FXML
    private TableColumn<Receiver, String> Show_PromA;
    @FXML
    private TableColumn<Receiver, String> Show_PromB;
    @FXML
    private TableColumn<Receiver, String> Show_PromF;

    FileChooser seleccionador = new FileChooser();
    @FXML
    private void getText(MouseEvent event) {
        archivo = seleccionador.showOpenDialog(new Stage());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Estudiantes = FXCollections.observableArrayList();
        this.Show_Carnet.setCellValueFactory(new PropertyValueFactory<>("carne"));
        this.Show_Nom.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.Show_Correo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        this.Show_Tel.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.Show_Nick.setCellValueFactory(new PropertyValueFactory<>("nickname"));
        this.Show_Type.setCellValueFactory(new PropertyValueFactory<>("tipoEstudiante"));
        this.Show_Examenes.setCellValueFactory(new PropertyValueFactory<>("notaPromedioE"));
        this.Show_Quices.setCellValueFactory(new PropertyValueFactory<>("notaPromedioQ"));
        this.Show_Tareas.setCellValueFactory(new PropertyValueFactory<>("notaPromedioT"));
        this.Show_P1.setCellValueFactory(new PropertyValueFactory<>("notaP1"));
        this.Show_P2.setCellValueFactory(new PropertyValueFactory<>("notaP2"));
        this.Show_P3.setCellValueFactory(new PropertyValueFactory<>("notaP3"));
        this.Show_PromA.setCellValueFactory(new PropertyValueFactory<>("notaPromedioTipoA"));
        this.Show_PromB.setCellValueFactory(new PropertyValueFactory<>("notaPromedioTipoB"));
        this.Show_PromF.setCellValueFactory(new PropertyValueFactory<>("notaFinal"));

    }
    @FXML
    private void start() throws Exception{
        int borrar = 1;
        int limitador = 0;
        int n = 0;
        int m = 0;

        List<String> lista_Objetos = new ArrayList<>();
        Scanner lector = new Scanner(new File(String.valueOf(archivo)));
        lector.useDelimiter("[,:\r\n]+");
        while (lector.hasNext()) {
            if (borrar <=1) {
                lector.nextLine();
                borrar++;
            }
            if (limitador == 12) {
                if (Objects.equals(lista_Objetos.get(5), "A")){
                    estudiA.add(new StudentType_A(lista_Objetos.get(0), lista_Objetos.get(1), lista_Objetos.get(2),
                            lista_Objetos.get(3), lista_Objetos.get(4), lista_Objetos.get(5), Integer.parseInt(lista_Objetos.get(6)),
                            Integer.parseInt(lista_Objetos.get(7)), Integer.parseInt(lista_Objetos.get(8)),
                            Integer.parseInt(lista_Objetos.get(9)), Integer.parseInt(lista_Objetos.get(10)),
                            Integer.parseInt(lista_Objetos.get(11))," "," ",0));
                }
                else{
                    estudiB.add(new StudentType_B(lista_Objetos.get(0), lista_Objetos.get(1), lista_Objetos.get(2),
                            lista_Objetos.get(3), lista_Objetos.get(4), lista_Objetos.get(5), Integer.parseInt(lista_Objetos.get(6)),
                            Integer.parseInt(lista_Objetos.get(7)), Integer.parseInt(lista_Objetos.get(8)),
                            Integer.parseInt(lista_Objetos.get(9)), Integer.parseInt(lista_Objetos.get(10)),
                            Integer.parseInt(lista_Objetos.get(11)), " ", " ",0));
                }
                lista_Objetos.clear();
                limitador = 0;
                lector.nextLine();
            } else {
                lista_Objetos.add(lector.next());
                limitador++;
            }
        }
        if (Objects.equals(lista_Objetos.get(5), "A")){
            estudiA.add(new StudentType_A(lista_Objetos.get(0), lista_Objetos.get(1), lista_Objetos.get(2),
                    lista_Objetos.get(3), lista_Objetos.get(4), lista_Objetos.get(5), Integer.parseInt(lista_Objetos.get(6)),
                    Integer.parseInt(lista_Objetos.get(7)), Integer.parseInt(lista_Objetos.get(8)),
                    Integer.parseInt(lista_Objetos.get(9)), Integer.parseInt(lista_Objetos.get(10)),
                    Integer.parseInt(lista_Objetos.get(11))," "," ",0));
        }
        else{estudiB.add(new StudentType_B(lista_Objetos.get(0), lista_Objetos.get(1), lista_Objetos.get(2),
                lista_Objetos.get(3), lista_Objetos.get(4), lista_Objetos.get(5), Integer.parseInt(lista_Objetos.get(6)),
                Integer.parseInt(lista_Objetos.get(7)), Integer.parseInt(lista_Objetos.get(8)),
                Integer.parseInt(lista_Objetos.get(9)), Integer.parseInt(lista_Objetos.get(10)),
                Integer.parseInt(lista_Objetos.get(11))," "," ",0));
        }
        while(n < estudiA.size()){
            estudiA.get(n).notaFinal();
            estudiA.get(n).notaPromedio();
            n++;
        }
        while(m < estudiB.size()) {
            estudiB.get(m).notaFinal();
            estudiB.get(m).notaPromedio();
            m++;
        }
        Estudiantes.addAll(estudiA);
        Estudiantes.addAll(estudiB);
        this.Show_data.setItems(Estudiantes);
        lector.close();
    }
}