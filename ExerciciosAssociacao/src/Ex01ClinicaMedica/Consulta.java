package Ex01ClinicaMedica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private double valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(double valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH'h'm");
        return "---Consulta---" +
                "\nData: " + data.format(formatoBR) +
                ", Valor Da Consulta: " + valorDaConsulta +
                "\nMedico: " + medico +
                "\nPaciente: " + paciente;
    }
}
