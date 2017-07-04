import exceptions.AnimalManancaAnimalException;
import exceptions.AnimalManancaOmException;
import exceptions.AnimalPeCaleDeDisparitieException;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public class IngrijitorZoo implements AngajatZoo {
    private int bonus=0;

    public int getBonus() {
        return bonus;
    }

    @Override
    public void lucreaza(Animal animal) {
        System.out.println("Ingrijitorul intra in cusca animalului");
        this.calculeazaBonusSalarial();
    }

    @Override
    public void calculeazaBonusSalarial() {

        bonus = 3*valoareBonusPerAnimal;
    }

    public void lucreaza(Animal animal, Object mancare) throws AnimalPeCaleDeDisparitieException {

        if ((animal instanceof AnimalZooRar) && (mancare == null))
            throw new AnimalPeCaleDeDisparitieException();
        else {
            this.lucreaza(animal);
            animal.doarme();
            animal.faceBaie();
            animal.seJoaca();

            try
            {
                animal.mananca(mancare);
            }
            catch (AnimalManancaOmException e){
                e.printStackTrace();
            } catch (AnimalManancaAnimalException e) {
                e.printStackTrace();
            }

        }

    }

}
