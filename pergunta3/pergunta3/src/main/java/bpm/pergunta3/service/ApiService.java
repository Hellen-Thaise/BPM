package bpm.pergunta3.service;

import bpm.pergunta3.model.Numero;
import bpm.pergunta3.model.Palavra;
import bpm.pergunta3.repository.ApiRepository;
import bpm.pergunta3.repository.NumeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {
    @Autowired
    ApiRepository apiRepository;
    @Autowired
    NumeroRepository numeroRepository;
    public String reversoString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public int somaNumeros(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
    public List<Palavra> buscarTodos() {
        return apiRepository.findAll();
    }

    public List<Numero> buscarTodosNumeros() {
        return numeroRepository.findAll();
    }

}
