import exceptions.AnimalManancaAnimalException;
import exceptions.AnimalManancaOmException;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public class AnimalZooRar extends Animal {

    public String name;
    public String nameTariiDeOrigine;

    public AnimalZooRar(String name, String nameTariiDeOrigine) {
        this.name = name;
        this.nameTariiDeOrigine = nameTariiDeOrigine;
    }
    public AnimalZooRar(String name){
        this.name = name;
    }
    public AnimalZooRar(){}

    public String getName() {
        return name;
    }

    public String getNameTariiDeOrigine() {
        return nameTariiDeOrigine;
    }

    @Override
    public void mananca(Object obj) throws AnimalManancaOmException, AnimalManancaAnimalException {

        if (obj instanceof AngajatZoo)
            throw new AnimalManancaOmException();
        else if (obj instanceof Animal)
            throw new AnimalManancaAnimalException();
        else
            System.out.println("AnimalulZooRar mananca");

        //TODO DONE
        /*
        In cadrul metodei mananca, in cazul in care obiectul primit ca parametru
        este un AngajatZoo sa se arunce exceptia AnimalManancaOmException daca nu,
        sa se afiseze mesajul in consola “AnimalZooRar mananca”.
        */

    }

    @Override
    public void seJoaca() {
        System.out.println("AnimalulZooRar se joaca");
        super.doarme();
    }

    @Override
    public void faceBaie() {
        System.out.println("AnimalulZooRar face baie");
    }
}

