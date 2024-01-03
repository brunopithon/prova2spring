package br.edu.ifrn.saude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrn.saude.domain.medico.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}