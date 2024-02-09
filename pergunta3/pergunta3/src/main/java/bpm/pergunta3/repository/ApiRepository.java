package bpm.pergunta3.repository;

import bpm.pergunta3.model.Palavra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiRepository extends JpaRepository<Palavra, Long> {

}


