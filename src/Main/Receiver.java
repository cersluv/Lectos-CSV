package Main;

import java.util.Objects;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Receiver {
    /* Clase Padre y receptora de información
     * Recibe los datos de los estudiantes
     * Les hace cambios y también los dá
     *
     */
    private String carne;
    private String NombreCompleto;
    private String Correo;
    private String Nickname;
    private String Telefono;
    private String TipoEstudiante;
    private Integer NotaPromedio_Examenes;
    private Integer NotaPromedio_Quices;
    private Integer NotaPormedio_Tareas;
    private Integer Nota_Proyecto_1;
    private Integer Nota_Poryecto_2;
    private Integer Nota_Proyecto_3;

    public String getCarne() {
        return carne;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getNickname() {
        return Nickname;
    }

    public String getTipoEstudiante() {
        return TipoEstudiante;
    }

    public Integer getNotaPromedio_Examenes() {
        return NotaPromedio_Examenes;
    }

    public Integer getNotaPromedio_Quices() {
        return NotaPromedio_Quices;
    }

    public Integer getNotaPormedio_Tareas() {
        return NotaPormedio_Tareas;
    }

    public Integer getNota_Proyecto_1() {
        return Nota_Proyecto_1;
    }

    public Integer getNota_Poryecto_2() {
        return Nota_Poryecto_2;
    }

    public Integer getNota_Proyecto_3() {
        return Nota_Proyecto_3;
    }


    public Receiver(String carne, String nombreCompleto, String correo, String Telefono, String nickname, String tipoEstudiante, Integer notaPromedio_Examenes, Integer notaPromedio_Quices, Integer notaPormedio_Tareas, Integer nota_Proyecto_1, Integer nota_Poryecto_2, Integer nota_Proyecto_3) {
        this.carne = carne;
        this.NombreCompleto = nombreCompleto;
        this.Correo = correo;
        this.Telefono = Telefono;
        this.Nickname = nickname;
        this.TipoEstudiante = tipoEstudiante;
        this.NotaPromedio_Examenes = notaPromedio_Examenes;
        this.NotaPromedio_Quices = notaPromedio_Quices;
        this.NotaPormedio_Tareas = notaPormedio_Tareas;
        this.Nota_Proyecto_1 = nota_Proyecto_1;
        this.Nota_Poryecto_2 = nota_Poryecto_2;
        this.Nota_Proyecto_3 = nota_Proyecto_3;
    }

    public abstract double notaPromedio();

    public double PromedioFinal(){
        double prom_final = 0.0;
        if (Objects.equals("Pepe", "Pepe")){
            prom_final = getNotaPromedio_Examenes() + getNotaPormedio_Tareas() + getNotaPromedio_Quices() + getNota_Proyecto_1() + getNota_Poryecto_2() + getNota_Proyecto_3();
        }
        return prom_final;
    }
    public static void main(String[] args) throws Exception {
        int borrar = 1;
        int limitador = 0;

        ArrayList<StudentType_A> estudiA = new ArrayList<>();
        ArrayList<StudentType_B> estudiB = new ArrayList<>();

        List<String> lista_Objetos = new ArrayList<>();
        Scanner lector = new Scanner(new File(""));
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
                            Integer.parseInt(lista_Objetos.get(11))));
                }
                else{
                    estudiB.add(new StudentType_B(lista_Objetos.get(0), lista_Objetos.get(1), lista_Objetos.get(2),
                            lista_Objetos.get(3), lista_Objetos.get(4), lista_Objetos.get(5), Integer.parseInt(lista_Objetos.get(6)),
                            Integer.parseInt(lista_Objetos.get(7)), Integer.parseInt(lista_Objetos.get(8)),
                            Integer.parseInt(lista_Objetos.get(9)), Integer.parseInt(lista_Objetos.get(10)),
                            Integer.parseInt(lista_Objetos.get(11))));
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
                    Integer.parseInt(lista_Objetos.get(11))));
        }
        else{estudiA.add(new StudentType_A(lista_Objetos.get(0), lista_Objetos.get(1), lista_Objetos.get(2),
                lista_Objetos.get(3), lista_Objetos.get(4), lista_Objetos.get(5), Integer.parseInt(lista_Objetos.get(6)),
                Integer.parseInt(lista_Objetos.get(7)), Integer.parseInt(lista_Objetos.get(8)),
                Integer.parseInt(lista_Objetos.get(9)), Integer.parseInt(lista_Objetos.get(10)),
                Integer.parseInt(lista_Objetos.get(11))));
        }
    }
}