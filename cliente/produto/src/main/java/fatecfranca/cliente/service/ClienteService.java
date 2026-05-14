package fatecfranca.cliente.service;

import fatecfranca.cliente.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    //criar a lista de produtos
    private List<Cliente> lista = new ArrayList<Cliente>();
    private Long nextId = 1L;

    public List<Cliente> listar(){
        return this.lista;
    }

    public Cliente criar(Cliente c){
        c.setId(nextId); // insere id
        nextId++; // atualiza id
        this.lista.add(c); // adiciona na lista
        return c; // retorna produto
    }

    public Cliente buscarPorId(Long id) {
        for (Cliente c : lista) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public boolean remover(Long id){
        for (int i=0;i<this.lista.size();i++){
            if (lista.get(i).getId().equals(id)){
                this.lista.remove(i);
                return true;
            }
        }
        return false;
    }
    public Cliente atualizar(Long id, Cliente novo){
        for(int i=0;i<lista.size();i++){
            if (lista.get(i).getId().equals(id)){
                novo.setId(id);
                lista.set(i, novo);
                return novo; //atualizou
            }
        }
        return null; //não atualizou
    }
}
