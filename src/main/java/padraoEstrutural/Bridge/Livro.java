package padraoEstrutural.Bridge;

public class Livro extends BridgePulicacao {

    public Livro(String titulo, String autor) {
        super(new LivroImpl());
        ((LivroImpl) getPublicacao()).setTitulo(titulo);
        ((LivroImpl) getPublicacao()).setAutor(autor);
    }

    public  String toString () {
        return  ((LivroImpl) getPublicacao()).getTitulo() + "de" + ((LivroImpl) getPublicacao()).getAutor() ;
    }
}
