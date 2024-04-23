package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Pedidos")
public class PedidosE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedidos;
    @Column(name = "Estado",nullable = false,length = 35)
    private  String Estado;
    @Column(name = "Cantidad",nullable = false,length = 35)
    private String Cantidad;
    public PedidosE() {
    }
}
