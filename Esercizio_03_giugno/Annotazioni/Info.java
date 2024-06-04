package Annotazioni;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE}) 
public @interface Info {

    String author();
    String version();
}
