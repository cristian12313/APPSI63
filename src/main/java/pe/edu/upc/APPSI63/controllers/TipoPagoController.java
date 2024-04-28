package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.TipoPagoDTO;
import pe.edu.upc.APPSI63.entities.TipoPagoE;
import pe.edu.upc.APPSI63.servicesinterfaces.TipoPagoService;

@RestController
@RequestMapping("/TipoPago")
public class TipoPagoController {
    @Autowired
    private TipoPagoService sS;
    @Operation(summary = "Registra ", description = "Registra ")
    @PostMapping
    public void registrar(@RequestBody TipoPagoDTO s){
        ModelMapper m=new ModelMapper();
        TipoPagoE sh=m.map(s, TipoPagoE.class);
        sS.insert(sh);
    }
    @Operation(summary = "Eliminar ", description = "Eliminar ")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
}
