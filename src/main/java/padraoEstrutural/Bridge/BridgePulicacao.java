package padraoEstrutural.Bridge;

public class BridgePulicacao {
    private Publicacao publicacao;

    public BridgePulicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

}
