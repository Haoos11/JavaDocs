import exceptions.AnimalManancaAnimalException;
import exceptions.AnimalManancaOmException;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public abstract class Animal {

    public abstract void mananca(Object obj) throws AnimalManancaOmException, AnimalManancaAnimalException;

    public abstract void seJoaca();

    public abstract void faceBaie();

    public void doarme(){
        System.out.println("Animalul doarme");
    }

    public Animal() {
        System.out.println("Animal nou");
    }
}
