package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.appl.domain.Department;
import ro.teamnet.zth.appl.domain.Employee;

import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by Silviu.Marin on 12-Jul-17.
 */
public class EntityUtilsTest {

    @Test
    public void testGetTableNameMethod() {
        String tableName = EntityUtils.getTableName(Department.class);
        assertEquals("Table name should be departments!", "departments", tableName);
    }

    @Test
    public void testGetTableNameMethod2() {
        String tableName = EntityUtils.getTableName(Employee.class);
        assertEquals("Table name should be employee!", "employee", tableName);
    }

    @Test
    public void testGetColumns() {
        List<ColumnInfo> list = EntityUtils.getColumns(Department.class);
        assertEquals("Number of columns must be 3!", 3, list.size());
    }

    @Test
    public void testGetColumns2() {
        List<ColumnInfo> list = EntityUtils.getColumns(Employee.class);
        assertEquals("Number of columns must be 11!", 11, list.size());
    }

//    @Test
//    public void testCastFromSqlType() {
//        List<ColumnInfo> list = EntityUtils.castFromSqlType(Employee.class);
//        assertEquals("Number of columns must be 11!", 11, list.size());
//    }


    @Test
    public void testGetFieldsByAnnotations() {
        int list = EntityUtils.getFieldsByAnnotations(Department.class, Column.class).size();
        assertEquals("...", 2, list);
    }

}
