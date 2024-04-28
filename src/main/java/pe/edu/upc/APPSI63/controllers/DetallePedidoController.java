package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.DetallePedidoDTO;
import pe.edu.upc.APPSI63.dtos.ProductoDTO;
import pe.edu.upc.APPSI63.entities.DetallePedidoE;
import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.servicesinterfaces.DetallePedidoService;
import pe.edu.upc.APPSI63.servicesinterfaces.ProductoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/Detalles")
public class DetallePedidoController {
    @Autowired
    private DetallePedidoService sS;
    @Operation(summary = "Registra", description = "Registra")
    @PostMapping
    public void registrar(@RequestBody DetallePedidoE s){
        ModelMapper m=new ModelMapper();
        DetallePedidoE sh=m.map(s, DetallePedidoE.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<DetallePedidoDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, DetallePedidoDTO.class);
        }).collect(Collectors.toList());
    }
    @Operation(summary = "Eliminar", description = "Eliminar")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
}
