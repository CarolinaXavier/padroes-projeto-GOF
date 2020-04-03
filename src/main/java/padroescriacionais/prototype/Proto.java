package padroescriacionais.prototype;

public class Proto {
    public static void main(String[] args) {
        new Proto().executar();
    }

    public void executar (){
        Ovelha original = new Ovelha("Dolly");
        Ovelha clone = new PrototypeImpl().duplicar(original);
    }
}
