import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class LocacaoTest {

    @Test
    public void testNovaLocacao() {
        ArrayList<Equipamentos> listaEquipamentos = new ArrayList<>();
        ArrayList<Alugueis> listaAluguel = new ArrayList<>();
        Cliente clienteAutentic = new Cliente("Cliente A", 1);
        Equipamentos equipamento = new Equipamentos("Furadeira", 1234, 50.00, null, null, null, 0);
        listaEquipamentos.add(equipamento);

       
        String nomeEquipAutentic = "Furadeira";
        int IdEquipAutentic = 1234;

       
        Locacao locacao = new Locacao();
        locacao.novaLocacao(nomeEquipAutentic, IdEquipAutentic, listaEquipamentos, clienteAutentic, listaAluguel);

        // Verificando se a locação foi realizada corretamente
        assertFalse("O equipamento não foi encontrado ou não está disponível para locação", listaAluguel.isEmpty());
        assertEquals("O cliente que locou o equipamento não corresponde ao cliente autenticado", clienteAutentic.getName(), listaAluguel.get(0).getLocClienteName());
        assertEquals("O ID do cliente que locou o equipamento não corresponde ao ID do cliente autenticado", clienteAutentic.getId(), listaAluguel.get(0).getLocClienteId());
    }
}