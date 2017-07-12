package ro.teamnet.zth.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * Created by Silviu.Marin on 12-Jul-17.
 */
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String name() default "";


}
