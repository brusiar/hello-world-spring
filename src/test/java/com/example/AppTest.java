import org.junit.Test;
import static org.junit.Assert.assertTrue; // Usado para o assertTrue

/**
 * Teste unitário simples para a aplicação.
 */
public class AppTest {
    
    /**
     * Teste simples para verificar se o teste está rodando.
     */
    @Test // A anotação @Test diz ao JUnit que este é um método de teste
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    // Remova o construtor, o método suite() e a herança de TestCase
}