package padraoEstrutural.Bridge;

public class LivroImpl extends Publicacao {
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    private String titulo;
    private String autor;


}
