
package service;

import dao.ContatoDAO;
import java.util.List;
import javax.jws.WebService;
import model.Contato;

@WebService(name = "contatoService")
public class ContatoFacade {
    
    private ContatoDAO cdao;

    public ContatoFacade() {
        cdao = new ContatoDAO();
    }
    
    public List<Contato> listAll(){
        return cdao.findAll();
    }
    
    public Contato findById(int id){
        return cdao.findById(id);
    }
}
