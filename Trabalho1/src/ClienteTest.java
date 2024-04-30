import static org.junit.Assert.*;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void testGerarIdCliente() {
        int id = Cliente.gerarIdCliente();
        assertTrue("O ID gerado não está dentro do intervalo esperado", id >= 10000 && id <= 90000);
    }

    @Test
    public void testToString() {
        Cliente cliente = new Cliente("Cliente A", 123456);
        String expectedToString = "Cliente [name=Cliente A, id=123456]";
        assertEquals("A representação toString do objeto Cliente não corresponde ao esperado", expectedToString, cliente.toString());
    }
}