package ClasesClinicaV2;

public class Clinica {
    public static void main(String[] args) {
        Fecha fechaCita = new Fecha(15, 3, "10:30 AM");

        Disponibilidad disponibilidad = new Disponibilidad(3, 15);
        disponibilidad.setHora(java.time.LocalDate.of(2025, 3, 15));
        
        Medico medico = new Medico(101, "Dra. Ana Torres", fechaCita, disponibilidad);

        Paciente paciente = new Paciente(201, "Carlos Gómez", "Calle 123", 3124567890.0);

        Registro registro = new Registro("Gripe común", "Reposo y líquidos");

        Cita cita = new Cita(fechaCita, paciente, medico, "Consulta general", registro);

        registro.setCita(cita);

        System.out.println("----- CITA MÉDICA -----");
        System.out.println(cita);
        System.out.println("----- MÉDICO -----");
        System.out.println(medico);
        System.out.println("----- PACIENTE -----");
        System.out.println(paciente);
        System.out.println("----- REGISTRO -----");
        System.out.println(registro);
    }
}
