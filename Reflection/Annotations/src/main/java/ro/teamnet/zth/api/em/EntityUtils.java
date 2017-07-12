package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;
import ro.teamnet.zth.appl.domain.Department;
import sun.reflect.annotation.AnnotationType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Silviu.Marin on 12-Jul-17.
 */
public class EntityUtils {

    public EntityUtils() {
        throw new UnsupportedOperationException();
    }

    public static String getTableName(Class entity){

        return ((Table) entity.getAnnotation(Table.class)).name();
    }

    public static List<ColumnInfo> getColumns(Class entity){
        List<ColumnInfo> list = new LinkedList<>();

        for (Field f: entity.getDeclaredFields()) {
            Id idObj = f.getAnnotation(Id.class);
            Column columnObj =  f.getAnnotation(Column.class);

            ColumnInfo columnInfoObj = new ColumnInfo();
            if (columnObj != null) {
                columnInfoObj.setDbColumnName(columnObj.name());
                columnInfoObj.setId(false);
            } else {
                columnInfoObj.setDbColumnName(idObj.name());
                columnInfoObj.setId(true);
            }

            columnInfoObj.setColumnName(f.getName());
            columnInfoObj.setColumnType(f.getType());
            list.add(columnInfoObj);
        }

    return list;
    }

    public static Object castFromSqlType(Object value, Class wantedType) {
        if (value instanceof BigDecimal && wantedType.equals(Integer.class)) {
            return (Integer) value;
        }
        else if (value instanceof BigDecimal && wantedType.equals(Long.class)) {
            return (Long) value;
        }
        else if (value instanceof BigDecimal && wantedType.equals(Float.class)) {
            return (Float) value;
        }
        else if (value instanceof BigDecimal && wantedType.equals(Double.class)) {
            return (Double) value;
        }
        else {
            return value;
        }
    }

    public static List<Field> getFieldsByAnnotations(Class clazz, Class annotation){
        List<Field> list = new LinkedList<>();

        for (Field f: clazz.getDeclaredFields()) {
            if (f.isAnnotationPresent(annotation)) {
                list.add(f);
            }

        }

        return list;
    }

    public static Object getSqlValue(Object object){
        if (object.getClass().isAnnotationPresent(Table.class)){
            for (Field f: object.getClass().getDeclaredFields()){
                if (f.isAnnotationPresent(Id.class)){
                    f.setAccessible(true);
                    return f.getType();
                }
            }
        }
        return object;
    }
}
