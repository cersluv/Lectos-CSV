package Main;

import java.util.Objects;

public class StudentType_B extends Receiver {
    public StudentType_B(String carne, String nombreCompleto, String correo, String Telefono, String nickname, String tipoEstudiante, Integer notaPromedio_Examenes, Integer notaPromedio_Quices, Integer notaPormedio_Tareas, Integer nota_Proyecto_1, Integer nota_Poryecto_2, Integer nota_Proyecto_3){
        super (carne, nombreCompleto, correo, Telefono, nickname,tipoEstudiante,notaPromedio_Examenes,notaPromedio_Quices,notaPormedio_Tareas, nota_Proyecto_1, nota_Poryecto_2, nota_Proyecto_3);
    }

    @Override
    public double PromedioFinal(){
        double prom_final = 0.0;
        if (Objects.equals(getTipoEstudiante(), "B")){
            prom_final = (getNota_Proyecto_1() + getNota_Poryecto_2() + getNota_Proyecto_3()) / 3.0;
        }
        return prom_final;
    }
}
