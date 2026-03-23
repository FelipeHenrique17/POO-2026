package Ex01ClinicaMedica;

import java.time.LocalDateTime;

public class TestaConsulta {
    public static void main(String[] args) {

        Medico medico = new Medico(1, "Clinico Geral", "Dr. Felipe");
        Paciente paciente = new Paciente(1, "Henrique", "123.456.789-00");

        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 10, 0);

        Consulta consulta = new Consulta(data, 300.0, medico, paciente);

        System.out.println(consulta);
    }
}
