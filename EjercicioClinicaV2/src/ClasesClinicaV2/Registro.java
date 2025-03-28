package ClasesClinicaV2;

public class Registro {
	private String diagnostico;
	private String tratamiento;
	private Cita cita;

	public Registro(String diagnostico, String tratamiento) {
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	@Override
	public String toString() {
	    return " Su Diagnostico: " + diagnostico +
	           ", Y su tratamiento: " + tratamiento + ".";
	}
}
