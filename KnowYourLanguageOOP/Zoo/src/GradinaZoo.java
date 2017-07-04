import java.util.Date;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public final class GradinaZoo {
    final private String denumireGradinaZoo;
    final private Date dataDeschideriiGradinii;

    private AnimalZooRar animalRar;
    private IngrijitorZoo angajatulLunii;

    public GradinaZoo(String denumireGradinaZoo, Date dataDeschideriiGradinii, AnimalZooRar animalRar, IngrijitorZoo angajatulLunii) {
        this.denumireGradinaZoo = denumireGradinaZoo;
        this.dataDeschideriiGradinii = new Date(dataDeschideriiGradinii.getTime());
        this.animalRar = animalRar;
        this.angajatulLunii = angajatulLunii;
    }

    public String getDenumireGradinaZoo() {
        return denumireGradinaZoo;
    }

    public Date getDataDeschideriiGradinii() {
        return dataDeschideriiGradinii;
    }

    public AnimalZooRar getAnimalRar() {
        return animalRar;
    }

    public IngrijitorZoo getAngajatulLunii() {
        return angajatulLunii;
    }

    public void setAnimalRar(AnimalZooRar animalRar) {
        this.animalRar = animalRar;
    }

    public void setAngajatulLunii(IngrijitorZoo angajatulLunii) {
        this.angajatulLunii = angajatulLunii;
    }
}
