import exceptions.AnimalManancaAnimalException;
import exceptions.AnimalManancaOmException;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public class AnimalZooFeroce extends Animal {
    @Override
    public void mananca(Object obj) throws AnimalManancaOmException, AnimalManancaAnimalException {
        System.out.println("Animal feroce a mostenit mananca()");

        if (obj instanceof AngajatZoo)
            throw new AnimalManancaOmException();
        else if (obj instanceof Animal)
            throw new AnimalManancaAnimalException();
        else
            System.out.println("AnimalulZooRar mananca");
    }

    @Override
    public void seJoaca() {
        System.out.println("Animal feroce a mostenit seJoaca()");
    }

    @Override
    public void faceBaie() {
        System.out.println("Animal feroce a mostenit faceBaie()");
    }

    @Override
    public void doarme() {
        super.doarme();
        System.out.println("Animal feroce vaneaza");
    }

    //TODO Done
    //Se va avea grija ca AnimalulZooFeroce sa nu manance un AngajatZoo, ca in exemplul precedent.
}
