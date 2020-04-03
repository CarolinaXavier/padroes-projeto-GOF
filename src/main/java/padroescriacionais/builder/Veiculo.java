package padroescriacionais.builder;

public class Veiculo {

    private String modelo;
    private String tipo;

    public Veiculo(String modelo, String tipo) {
        this.modelo = modelo;
        this.tipo = tipo;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
