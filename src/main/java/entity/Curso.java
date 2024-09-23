package entity;

import java.util.ArrayList;
import java.util.List;


public class Curso {

    private int idCurso;
    private String nombreCurso;
    private List<Estudiante> estudiantes = new ArrayList<>();



    @Override
        public String toString() {
        int cantEstudiantes = estudiantes.size();
        return String.valueOf(cantEstudiantes);
    }


    public String toStringDetallado() {
        return "Curso{" +
                "estudiante=" + estudiantes +
                ", idCurso=" + idCurso +
                ", nombreCurso='" + nombreCurso + '\'' +
                '}';
    }

    public Curso() {
    }

    public Curso(int idCurso, String nombreCurso,List<Estudiante> estudiante) {
        this.estudiantes = estudiante;
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }



}
