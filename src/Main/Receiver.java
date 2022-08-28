package Main;

import java.util.Objects;

public class Receiver {
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

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public void setTipoEstudiante(String tipoEstudiante) {
        TipoEstudiante = tipoEstudiante;
    }

    public void setNotaPromedio_Examenes(Integer notaPromedio_Examenes) {
        NotaPromedio_Examenes = notaPromedio_Examenes;
    }

    public void setNotaPromedio_Quices(Integer notaPromedio_Quices) {
        NotaPromedio_Quices = notaPromedio_Quices;
    }

    public void setNotaPormedio_Tareas(Integer notaPormedio_Tareas) {
        NotaPormedio_Tareas = notaPormedio_Tareas;
    }

    public void setNota_Proyecto_1(Integer nota_Proyecto_1) {
        Nota_Proyecto_1 = nota_Proyecto_1;
    }

    public void setNota_Poryecto_2(Integer nota_Poryecto_2) {
        Nota_Poryecto_2 = nota_Poryecto_2;
    }

    public void setNota_Proyecto_3(Integer nota_Proyecto_3) {
        Nota_Proyecto_3 = nota_Proyecto_3;
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

    public double PromedioFinal(){
        double prom_final = 0.0;
        if (Objects.equals("Pepe", "Pepe")){
            prom_final = getNotaPromedio_Examenes() + getNotaPormedio_Tareas() + getNotaPromedio_Quices() + getNota_Proyecto_1() + getNota_Poryecto_2() + getNota_Proyecto_3();
        }
        return prom_final;
    }
}