package fatecfranca.cliente.controller;

import fatecfranca.cliente.model.Cliente;
import fatecfranca.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired // injeção de dependência
    // podemos usar service sem instanciá-lo
    private ClienteService service;

    @GetMapping // verbo get
    public ResponseEntity<List<Cliente>> listar(){
        // status de resposta é ok (sucessoO
        return ResponseEntity.ok(service.listar());
    }
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente c){
        Cliente criado = service.criar(c);
        URI uri = URI.create("/clientes/" + criado.getId());
        // retorna status de sucesso 201 (created)
        return ResponseEntity.created(uri).body(criado);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> remover(@PathVariable long id) {
        return service.remover(id) ?
                ResponseEntity.noContent().build():
                ResponseEntity.notFound().build();
    }

    @PatchMapping ("/{id}")
    public ResponseEntity<Cliente> atualizar(
            @PathVariable Long id,
            @RequestBody Cliente produto
            ){
            Cliente ret = service.atualizar(id, produto);
            if (ret == null){
                // não encontrou para atualizar
                return ResponseEntity.notFound().build();
            }
            else {
                // retorna produto atualizado
                return ResponseEntity.ok(ret);
        }
    }
}
