import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


	public class EquipamentosTest {

	    @Test
	    public void testGerarIdProduto() {
	        int id = Equipamentos.gerarIdProduto();
	        assertTrue("O ID gerado não está dentro do intervalo esperado", id >= 1000 && id <= 9000);
	    }

	    @Test
	    public void testToString() {
	        Equipamentos equipamento = new Equipamentos("Furadeira", 1234, 50.00, "01/01/2024", "01/02/2024", "Cliente A", 1);
	        String expectedToString = "Equipamentos [name=Furadeira, id=1234, vlLoc=50.0, dateLoc=01/01/2024, dateDev=01/02/2024, clienteName=Cliente A, clienteId=1]";
	        assertEquals("A representação toString do objeto Equipamentos não corresponde ao esperado", expectedToString, equipamento.toString());
	    }
	}