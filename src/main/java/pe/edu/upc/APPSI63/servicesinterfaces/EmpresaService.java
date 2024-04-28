package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.EmpresaE;

import java.util.List;

public interface EmpresaService {
    public void insert(EmpresaE empresaE);
    public List<EmpresaE> list();
    public void delete(int id);
    public EmpresaE listId(int id);
}
