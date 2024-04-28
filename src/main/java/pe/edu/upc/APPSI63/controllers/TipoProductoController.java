package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.ProductoDTO;
import pe.edu.upc.APPSI63.dtos.TipoProductoDTO;
import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.entities.TipoProductoE;
import pe.edu.upc.APPSI63.servicesinterfaces.ProductoService;
import pe.edu.upc.APPSI63.servicesinterfaces.TipoProductoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/TipoProducto")
public class TipoProductoController {
    @Autowired
    private TipoProductoService sS;
    @Operation(summary = "Registra ", description = "Registra ")
    @PostMapping
    public void registrar(@RequestBody TipoProductoDTO s){
        ModelMapper m=new ModelMapper();
        TipoProductoE sh=m.map(s, TipoProductoE.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<TipoProductoDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, TipoProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @Operation(summary = "Eliminar ", description = "Eliminar ")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
}
