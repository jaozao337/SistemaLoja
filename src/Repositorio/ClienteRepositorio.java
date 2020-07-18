
package Repositorio;
import java.util.ArrayList;
import java.util.List;
import Modelo.Cliente;

public class ClienteRepositorio {

    private static List<Cliente> clientes;
    
    public ClienteRepositorio(){
        if(clientes == null){
            clientes = new ArrayList<Cliente>();
        }
    }
    
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
        
    }
    
    
}
