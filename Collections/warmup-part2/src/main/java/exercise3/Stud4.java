package exercise3;

/**
 * Created by Silviu.Marin on 07-Jul-17.
 */
public class Stud4 extends Student {

    public Stud4(String firstName, String lastName) {
        super(firstName, lastName);
    }


    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public boolean equals(Object o) {
        if (this.getFirstName().equals(((Student) o).getFirstName()) && this.getLastName().equals(((Student) o).getLastName()))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();

        return result;
    }

}
