package bpm.pergunta3.controller;

import bpm.pergunta3.model.Numero;
import bpm.pergunta3.model.Palavra;
import bpm.pergunta3.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping(path = "/buscarTodos")

    public List<Palavra> buscaTodos(){
        return apiService.buscarTodos();
    }

    @GetMapping(path = "/buscarTodosNumeros")

    public List<Numero> buscaTodosNumeros(){
        return apiService.buscarTodosNumeros();
    }

    @PostMapping("/reverso")
    public String reversoString(@RequestBody String input) {
        return apiService.reversoString(input);
    }

    @PostMapping("/soma")
    public int somaNumeros(@RequestBody List<Integer> numbers) {
        return apiService.somaNumeros(numbers);
    }
}



