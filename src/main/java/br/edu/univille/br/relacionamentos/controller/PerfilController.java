package br.edu.univille.br.relacionamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.univille.br.relacionamentos.entities.Perfil;
import br.edu.univille.br.relacionamentos.entities.Usuario;
import br.edu.univille.br.relacionamentos.service.PerfilService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/perfil")
public class PerfilController {
    
    @Autowired
    private PerfilService service;

    @GetMapping()
    public Perfil obter(@RequestBody Usuario usuario) {
        return service.Obter(usuario);
    }
    
}
