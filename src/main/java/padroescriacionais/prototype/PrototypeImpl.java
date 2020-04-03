package padroescriacionais.prototype;

public class PrototypeImpl implements Prototype {
    public Ovelha duplicar(Ovelha ovelha) {
        return (Ovelha) ovelha.clone();
    }
}
