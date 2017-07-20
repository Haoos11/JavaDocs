package ro.teamnet.zth.api.annotations;


import java.lang.annotation.*;

/**
 * Created by Silviu.Marin on 20-Jul-17.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
    String urlPath();
}
