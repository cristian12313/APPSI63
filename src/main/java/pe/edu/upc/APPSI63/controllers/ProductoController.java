package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.DiseñoDTO;
import pe.edu.upc.APPSI63.entities.Diseño;
import pe.edu.upc.APPSI63.servicesinterfaces.DiseñoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Prendas")
public class ProductoController {
    @Autowired
    private DiseñoService sS;
    @Operation(summary = "Registra Producto", description = "Registra Producto")
    @PostMapping
    public void registrar(@RequestBody DiseñoDTO s){
        ModelMapper m=new ModelMapper();
        Diseño sh=m.map(s, Diseño.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<DiseñoDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, DiseñoDTO.class);
        }).collect(Collectors.toList());
    }
    @Operation(summary = "Eliminar Producto", description = "Eliminar Producto")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public DiseñoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        DiseñoDTO dto=m.map(sS.listId(id), DiseñoDTO.class);
        return dto;
    }


}
