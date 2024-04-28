package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.ComentarioDTO;
import pe.edu.upc.APPSI63.entities.ComentarioE;
import pe.edu.upc.APPSI63.servicesinterfaces.ComentarioService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/Comentario")
public class ComentarioController {
    @Autowired
    private ComentarioService sS;
    @Operation(summary = "Registra Comentario", description = "Registra Comentario")
    @PostMapping
    public void registrar(@RequestBody ComentarioDTO s){
        ModelMapper m=new ModelMapper();
        ComentarioE sh=m.map(s, ComentarioE.class);
        sS.insert(sh);
    }
    @Operation(summary = "Eliminar Comentario", description = "Eliminar Comentario")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
}
