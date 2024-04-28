package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.InteraccionesDTO;
import pe.edu.upc.APPSI63.entities.InteraccionesE;
import pe.edu.upc.APPSI63.servicesinterfaces.InteraccionService;

@RestController
@RequestMapping("/Ineteracciones")
public class InteraccionesController {
    @Autowired
    private InteraccionService sS;
    @Operation(summary = "Registra Ineteracciones", description = "Registra Ineteracciones")
    @PostMapping
    public void registrar(@RequestBody InteraccionesDTO s){
        ModelMapper m=new ModelMapper();
        InteraccionesE sh=m.map(s, InteraccionesE.class);
        sS.insert(sh);
    }
    @Operation(summary = "Eliminar Ineteracciones", description = "Eliminar Ineteracciones")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
}
