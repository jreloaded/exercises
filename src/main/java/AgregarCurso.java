import entity.Curso;
import entity.Estudiante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgregarCurso {
    Map<String,Curso> listaCursos = new HashMap();
    List<Estudiante> listEstudiantes = new ArrayList<>();

    public void creandoEstudiantes() {
        Estudiante estudiante1 = new Estudiante("123", "Josue");
        Estudiante estudiante2 = new Estudiante("0987", "Joshua");
        Estudiante estudiante3 = new Estudiante("12567", "Camilo");
        listEstudiantes.add(estudiante1);
        listEstudiantes.add(estudiante2);
        listEstudiantes.add(estudiante3);
    }
    public void creandoCursos() {
        Curso curso1 = new Curso(1, "Matematicas",listEstudiantes);
        Curso curso2 = new Curso(2, "Español",listEstudiantes);
        Curso curso3 = new Curso(3, "Ingles",listEstudiantes);
        listaCursos.put("Matematicas",curso1);
        listaCursos.put("Español",curso2);
        listaCursos.put("Ingles",curso3);
    }


    public void estudiantesDeUnCurso(String cursoSeleccionadoDos){
        Curso curso = listaCursos.get(cursoSeleccionadoDos);
        System.out.println(curso.getEstudiantes());

    }


    public void addCurso(String nombre, Curso curso){
        listaCursos.put(nombre,curso);
    }

    public void addEstudiante (String cursoSeleccionado , Estudiante estudiante){

        if (cursoSeleccionado == null) {
            System.out.println("Curso no existe");
        }else{
            listEstudiantes.add(estudiante);
            System.out.println("Estudiante agregado con exito");

        }

    }

    public void imprimirCurso(){
        for(Map.Entry<String,Curso> entry: listaCursos.entrySet()){
            System.out.println("Curso " + entry.getKey() + ", tiene " + entry.getValue()+" estudiantes");
        }
    }


}
