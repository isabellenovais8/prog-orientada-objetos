import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testGetNome() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        assertEquals("Alan Turing", autor.getNome());
    }

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        assertEquals("Inglês", autor.getNacionalidade());
    }

    @Test
    public void testSetNome() {
        Autor autor = new Autor("Nome Antigo", "Brasileira");
        autor.setNome("Novo Nome");
        assertEquals("Novo Nome", autor.getNome());
    }

    @Test
    public void testSetNacionalidade() {
        Autor autor = new Autor("Autor", "Antiga");
        autor.setNacionalidade("Nova");
        assertEquals("Nova", autor.getNacionalidade());
    }
}
