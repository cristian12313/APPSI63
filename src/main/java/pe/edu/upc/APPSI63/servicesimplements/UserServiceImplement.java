package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.UserE;
import pe.edu.upc.APPSI63.repositories.UserRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.UserService;

import java.util.List;
@Service
public class UserServiceImplement implements UserService {
    @Autowired
    private UserRepository sR;
    @Override
    public void insert(UserE userE) {
        sR.save(userE);
    }

    @Override
    public List<UserE> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public UserE listId(int id) {
        return sR.findById(id).orElse(new UserE());
    }
    @Override
    public List<String[]> quantityUser() {
        return sR.quantityUser();
    }

}