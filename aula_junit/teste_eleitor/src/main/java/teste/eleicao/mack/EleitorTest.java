package teste.eleicao.mack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EleitorTest {
    public EleitorTest() {
    }
    
    Eleitor objEleitor = new Eleitor();

    @Test
    public void testClassificaEleitorInvalido() {
        System.out.println("Teste classificaEleitor Invalido");
        assertEquals("Idade inválida", objEleitor.classificaEleitor(-1));
        assertEquals("Idade inválida", objEleitor.classificaEleitor(131));
    }
    
    @Test
    public void testClassificaEleitorNaoPermitido() {
        System.out.println("Teste classificaEleitor Nao permitido");
        assertEquals("Não permitido", objEleitor.classificaEleitor(0));
        assertEquals("Não permitido", objEleitor.classificaEleitor(1));
        assertEquals("Não permitido", objEleitor.classificaEleitor(14));
        assertEquals("Não permitido", objEleitor.classificaEleitor(15));
    }
    
    @Test
    public void testClassificaEleitorFacultativo() {
        System.out.println("Teste classificaEleitor Facultativo");
        assertEquals("Facultativo", objEleitor.classificaEleitor(16));
        assertEquals("Facultativo", objEleitor.classificaEleitor(17));
        assertEquals("Facultativo", objEleitor.classificaEleitor(70));
        assertEquals("Facultativo", objEleitor.classificaEleitor(71));
        assertEquals("Facultativo", objEleitor.classificaEleitor(129));
        assertEquals("Facultativo", objEleitor.classificaEleitor(130));
    }
    
    @Test
    public void testClassificaEleitorObrigatorio() {
        System.out.println("Teste classificaEleitor Obrigatorio");
        assertEquals("Obrigatório", objEleitor.classificaEleitor(18));
        assertEquals("Obrigatório", objEleitor.classificaEleitor(19));
        assertEquals("Obrigatório", objEleitor.classificaEleitor(68));
        assertEquals("Obrigatório", objEleitor.classificaEleitor(69));
    }
    
}
