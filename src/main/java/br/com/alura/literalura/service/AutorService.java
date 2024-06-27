package br.com.alura.literalura.service;

import br.com.alura.literalura.model.Autor;
import br.com.alura.literalura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> getAutoresVivosNoAno(Integer ano) {
        return autorRepository.findAutoresVivos(ano);
    }
}

//@RestController
//@RequestMapping("/autores")
//public class AutorController {
//
//    @Autowired
//    private AutorService autorService;
//
//    @GetMapping("/vivos/{ano}")
//    public List<Autor> getAutoresVivosNoAno(@PathVariable Integer ano) {
//        return autorService.getAutoresVivosNoAno(ano);
//    }
//}

