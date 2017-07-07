package exercise3;

/**
 * Created by Silviu.Marin on 07-Jul-17.
 */
public class Stud3 extends Student {

    public Stud3(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public boolean equals(Object o) {
        if (this.getFirstName() == ((Student) o).getFirstName())
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
