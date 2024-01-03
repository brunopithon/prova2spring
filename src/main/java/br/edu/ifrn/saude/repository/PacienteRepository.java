package br.edu.ifrn.saude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrn.saude.domain.paciente.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}