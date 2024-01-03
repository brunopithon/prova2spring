package br.edu.ifrn.saude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrn.saude.domain.consulta.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

}