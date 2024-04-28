package pe.edu.upc.APPSI63.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.APPSI63.dtos.PedidosDTO;
import pe.edu.upc.APPSI63.dtos.ProductoDTO;
import pe.edu.upc.APPSI63.entities.PedidosE;
import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.servicesinterfaces.PedidosService;
import pe.edu.upc.APPSI63.servicesinterfaces.ProductoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/Pedidos")
public class PedidosController {
    @Autowired
    private PedidosService sS;
    @Operation(summary = "Registra ", description = "Registra ")
    @PostMapping
    public void registrar(@RequestBody PedidosDTO s){
        ModelMapper m=new ModelMapper();
        PedidosE sh=m.map(s, PedidosE.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<PedidosDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, PedidosDTO.class);
        }).collect(Collectors.toList());
    }
    @Operation(summary = "Eliminar ", description = "Eliminar ")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
    @GetMapping("/cantidades")
    public List<PedidosDTO> cantidadInsumos(){
        List<String[]> filaLista=sS.quantityPedidos();
        List<PedidosDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            PedidosDTO dto=new PedidosDTO();
            dto.setIdPedidos(Integer.parseInt(columna[0]));
            dto.setQuantityPedidos(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
