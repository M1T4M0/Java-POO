package ClasesInscripcionEstudiante;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
            new Codigo(1, 'A'),
            new Nombre("Luis", "Ramírez"),
            123456,
            new Fecha(2002, 5, 12)
        );
        
        Estudiante estudiante1 = new Estudiante(
        		new Codigo(2, 'V'),
        		new Nombre("Camila", "Martinez"),
        		3121321, 
        		new Fecha(2009, 3, 12)
        		);
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante);
        estudiantes.add(estudiante1);

        Programa programa = new Programa(
            new Codigo(101, 'B'),
            new Nombre("Ingeniería", "Ciencias de la Computacion e Inteligencia Artificial"),
            "Facultad de Ingeniería"
        );

        Proyecto p1 = new Proyecto(new Codigo(201, 'C'), new Nombre("Proyecto", "IA"), "Inteligencia Artificial");
        Proyecto p2 = new Proyecto(new Codigo(202, 'D'), new Nombre("Proyecto", "Robótica"), "Robótica avanzada");
        Proyecto p3 = new Proyecto(new Codigo(203, 'E'), new Nombre("Proyecto", "Datos"), "Big Data");

        List<Proyecto> proyectos = new ArrayList<>();
        proyectos.add(p1);
        proyectos.add(p2);
        proyectos.add(p3); 

        // Aqui crear inscripción
        Inscripcion inscripcion = new Inscripcion(new Fecha(2025, 3, 28), programa, proyectos);
       
        System.out.println("===== ESTUDIANTES REGISTRADOS =====");
        for (Estudiante est : estudiantes) {
            System.out.println(est);
        }
      
        System.out.println("===== INSCRIPCIÓN =====");
        System.out.println("Fecha: " + inscripcion.getFecha());
        System.out.println("Programa: " + inscripcion.getPrograma());
        System.out.println("Proyectos inscritos:");
        for (Proyecto proyecto : inscripcion.getProyectos()) {
            System.out.println("- " + proyecto);
        }
    }
}
