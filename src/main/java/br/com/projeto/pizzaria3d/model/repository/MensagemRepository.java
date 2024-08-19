package br.com.projeto.pizzaria3d.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.pizzaria3d.model.entity.Mensagem;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {

}
