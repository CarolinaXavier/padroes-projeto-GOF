package padroescriacionais.abstractFactory;

abstract class Pet {

    private String nome;

    public Pet(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
