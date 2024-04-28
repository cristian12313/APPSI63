package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.UserDTO;
import pe.edu.upc.APPSI63.entities.UserE;
import pe.edu.upc.APPSI63.servicesinterfaces.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService sS;
    @Operation(summary = "Registra Usuario", description = "Registra Usuario")
    @PostMapping
    public void registrar(@RequestBody UserDTO s){
        ModelMapper m=new ModelMapper();
        UserE sh=m.map(s, UserE.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<UserDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @Operation(summary = "Eliminar Usuario", description = "Eliminar Usuario")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public UserDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        UserDTO dto=m.map(sS.listId(id), UserDTO.class);
        return dto;
    }
    @GetMapping("/cantidades")
    public List<UserDTO> cantidadInsumos(){
        List<String[]> filaLista=sS.quantityUser();
        List<UserDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            UserDTO dto=new UserDTO();
            dto.setUsername(columna[0]);
            dto.setQuantityUser(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}