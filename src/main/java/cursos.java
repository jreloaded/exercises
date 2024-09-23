import entity.Curso;
import entity.Estudiante;

import java.util.*;

public class cursos {
    public static void main(String[] args) {





        Scanner sc = new Scanner(System.in);

        AgregarCurso crearCurso = new AgregarCurso();

        crearCurso.creandoEstudiantes();
        crearCurso.creandoCursos();
        List<Estudiante> listaEstudian = new ArrayList<>(crearCurso.listEstudiantes);



        int opcion;
        System.out.println("------------Bienvenido a gestión de cursos y estudiantes--------");
        do {
            System.out.println("--Por favor selecciona un opción-- \n 1. Agregar curso \n 2. Agregar estudiante \n 3.imprimir todos los cursos \n 4. imprimir todos los estudiantes de un curso \n 5. Salir del programa");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Escribe el id del curso a agregar");
                    int idCurso = sc.nextInt();
                    System.out.println("Escribe el nombre del curso a agregar");
                    String nombreCurso = sc.next();
                    System.out.println("Escriba la cantidad de estudiantes del curso por lo menos escriba tres estudiantes");
                    int cantEstudiantes = sc.nextInt();

                    for (int i = 0; i < cantEstudiantes; i++) {

                        System.out.println("Por favor digite el nombre del estudiante");
                        String docEstudiante = sc.next();
                        System.out.println("Por favor digite  el documento del estudiante");
                        String nombreEstudiante = sc.next();
                        Estudiante estudiante = new Estudiante(docEstudiante, nombreEstudiante);
                        crearCurso.addEstudiante(nombreCurso, estudiante);
                    }


                    Curso cursoIngresado = new Curso(idCurso, nombreCurso, listaEstudian);
                    System.out.println("el curso registrado con exito");

                    crearCurso.addCurso(nombreCurso, cursoIngresado);
                    break;
                case 2:
                    System.out.println("Estos son nuestros cursos");
                    crearCurso.imprimirCurso();
                    System.out.println("Por favor selecciona un curso para tu estudiante");
                    String cursoSeleccionado = sc.next();

                    System.out.println("Por favor digite el nombre del estudiante");
                    String docEstudiante = sc.next();
                    System.out.println("Por favor digite  el documento del estudiante");
                    String nombreEstudiante = sc.next();
                    Estudiante estudiante = new Estudiante(docEstudiante, nombreEstudiante);

                    crearCurso.addEstudiante(cursoSeleccionado, estudiante);
                    break;
                case 3:
                    System.out.println("Estos son nuestros cursos");
                    crearCurso.imprimirCurso();
                    break;
                case 4:
                    System.out.println("Seleccione por favor de que curso desea conocer sus estudiantes");
                    String cursoSeleccionadoDos = sc.next();
                    crearCurso.estudiantesDeUnCurso(cursoSeleccionadoDos);
                    break;
                case 5:
                    System.out.println("-------------Saliendo del programa----------------------");
                    break;
                default:
                    System.out.println("---------------No escogio una opcion-------------------------");
            }
        }while (opcion != 5) ;


    }
}
