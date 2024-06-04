package Annotazioni;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) 
public @interface DeprecatedCustom {
    String messaggio();

}
