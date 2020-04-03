package padroescriacionais.builder;

public class Jeep extends Veiculo {
    private String nome;
    public Jeep(String modelo) {
        super(modelo, "Utilitário");
        this.nome = "Jeep";
    }

    @Override
    public String toString() {
        return "Carro: " + nome + " " + getModelo() + " " + getTipo();
    }
}
