package exercise3;

import exercise3.Student;

/**
 * Created by Silviu.Marin on 07-Jul-17.
 */
public class Stud1 extends Student {


    public Stud1(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public boolean equals(Object o) {

        if (this.getFirstName().equals(((Student) o).getFirstName()))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getFirstName().hashCode();

        return result;
    }
}
