package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.EmpresaDTO;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.servicesinterfaces.EmpresaService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/Comentario")
public class ComentarioController {
    @Autowired
    private EmpresaService sS;
    @Operation(summary = "Registra Comentario", description = "Registra Comentario")
    @PostMapping
    public void registrar(@RequestBody EmpresaDTO s){
        ModelMapper m=new ModelMapper();
        EmpresaE sh=m.map(s, EmpresaE.class);
        sS.insert(sh);
    }
    @Operation(summary = "Eliminar Comentario", description = "Eliminar Comentario")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
}
