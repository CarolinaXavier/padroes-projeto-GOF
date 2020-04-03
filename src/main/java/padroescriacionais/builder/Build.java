package padroescriacionais.builder;

public class Build {
    public static void main(String[] args) {
        new Build().executar();
    }

    public void executar() {
        Montadora montadora = new Montadora();
        Veiculo carro1 = montadora.montar('F', "Testerossa");
        Veiculo carro2 = montadora.montar('J', "Renegade");
        System.out.println(carro1);
        System.out.println(carro2);
    }
}
