package ClasesClinicaV2;

public class Cita {
	private Fecha fecha;
	private Paciente paciente;
	private Medico medico;
	private String motivo;
	private Registro registroMedico;

	public Cita(Fecha fecha, Paciente paciente, Medico medico, String motivo, Registro registroMedico) {
		this.fecha = fecha;
		this.paciente = paciente;
		this.medico = medico;
		this.motivo = motivo;
		this.registroMedico = registroMedico;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Registro getRegistroMedico() {
		return registroMedico;
	}

	public void setRegistroMedico(Registro registroMedico) {
		this.registroMedico = registroMedico;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@Override
	public String toString() {
		return "La fecha de su cita es:" + fecha + ", Su ID es:" + paciente + ", El Medico Asignado es:" + medico + ", Y el motivo registrado es: " + motivo
				+ ", Finalizando con un registro Medico donde ud debe seguir: " + registroMedico + "]";
	}
}
