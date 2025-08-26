import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testGetNome() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetNome() {
        Usuario usuario = new Usuario("Antigo", 30);
        usuario.setNome("Novo");
        assertEquals("Novo", usuario.getNome());
    }

    @Test
    public void testSetIdade() {
        Usuario usuario = new Usuario("Teste", 30);
        usuario.setIdade(40);
        assertEquals(40, usuario.getIdade());
    }
}