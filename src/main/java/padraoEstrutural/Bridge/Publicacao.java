package padraoEstrutural.Bridge;

abstract class Publicacao {
    private BridgePulicacao bridgePulicacao;

    public BridgePulicacao getBridgePulicacao() {
        return bridgePulicacao;
    }

    public void setBridgePulicacao(BridgePulicacao bridgePulicacao) {
        this.bridgePulicacao = bridgePulicacao;
    }


}
