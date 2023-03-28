package padroescriacao.singleton;

public class Escola {

    private Escola() {};
    private static final Escola instance = new Escola();
    public static Escola getInstance() {
        return instance;
    }

    private String nomeEscola;
    private String funcionarioCantina;

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getUsuarioLogado() {
        return funcionarioCantina;
    }

    public void setUsuarioLogado(String funcionarioCantina) {
        this.funcionarioCantina = funcionarioCantina;
    }
}
