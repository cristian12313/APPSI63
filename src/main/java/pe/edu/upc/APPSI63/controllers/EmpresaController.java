package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.EmpresaDTO;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.servicesinterfaces.EmpresaService;
import pe.edu.upc.APPSI63.servicesinterfaces.UserService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/Empresa")
public class EmpresaController {
    @Autowired
    private EmpresaService sS;
    @Operation(summary = "Registra Empresa", description = "Registra Empresa")
    @PostMapping
    public void registrar(@RequestBody EmpresaDTO s){
        ModelMapper m=new ModelMapper();
        EmpresaE sh=m.map(s, EmpresaE.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<EmpresaDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, EmpresaDTO.class);
        }).collect(Collectors.toList());
    }
    @Operation(summary = "Eliminar Empresa", description = "Eliminar Empresa")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public EmpresaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        EmpresaDTO dto=m.map(sS.listId(id), EmpresaDTO.class);
        return dto;
    }
}
