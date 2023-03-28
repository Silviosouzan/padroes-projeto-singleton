package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    public void deveRetornarNomeCantina() {
        Escola.getInstance().setNomeEscola("ENSA");
        assertEquals("ENSA", Escola.getInstance().getNomeEscola());
    }

    @Test
    public void deveRetornarFuncionarioCantina() {
        Escola.getInstance().setUsuarioLogado("Silvio");
        assertEquals("Silvio", Escola.getInstance().getUsuarioLogado());
    }

}