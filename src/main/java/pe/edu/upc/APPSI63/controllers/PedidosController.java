package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.ProductoDTO;
import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.servicesinterfaces.ProductoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/Pedidos")
public class PedidosController {
    @Autowired
    private ProductoService sS;
    @Operation(summary = "Registra Producto", description = "Registra Producto")
    @PostMapping
    public void registrar(@RequestBody ProductoDTO s){
        ModelMapper m=new ModelMapper();
        ProductoE sh=m.map(s, ProductoE.class);
        sS.insert(sh);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('USUARIO')")
    public List<ProductoDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @Operation(summary = "Eliminar Producto", description = "Eliminar Producto")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
}
