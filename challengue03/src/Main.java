import br.com.caio.challengue.models.ex2.Animal;
import br.com.caio.challengue.models.ex2.Cachorro;
import br.com.caio.challengue.models.ex2.Gato;

public class Main {
    public static void main(String[] args) {
//        Polimorfismo
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();

        Animal gato = new Gato();
        gato.emitirSom();
    }
}
