package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TipoPago")
public class TipoPagoE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTPago;
    @Column(name = "NombreTPago",nullable = false,length = 35)
    private  String NombreTPago;
    public TipoPagoE() {
    }

    public TipoPagoE(int idTPago, String nombreTPago) {
        this.idTPago = idTPago;
        NombreTPago = nombreTPago;
    }

    public int getIdTPago() {
        return idTPago;
    }

    public void setIdTPago(int idTPago) {
        this.idTPago = idTPago;
    }

    public String getNombreTPago() {
        return NombreTPago;
    }

    public void setNombreTPago(String nombreTPago) {
        NombreTPago = nombreTPago;
    }
}
