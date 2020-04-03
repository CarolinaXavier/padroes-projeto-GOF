package padroescriacionais.factoryMethod;

public class FacMet {
    public static void main(String[] args) {
        new FacMet().construir();
    }
    public void construir() {
        GMCriador gm = new GMCriadorConcreto();
        Veiculo vectra = gm.factoryVectra();
        Veiculo opala = gm.factoryOpala();
    }
}
