package ro.teamnet.zth.api.annotations;

import java.lang.annotation.*;

/**
 * Created by Silviu.Marin on 20-Jul-17.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMethod {
    String methodType();
    String urlPath();
}
