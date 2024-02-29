package dgtic.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//Los beans son apenas instancias de una clase manejadas por el Spring Container
@SpringBootApplication
@ComponentScan(basePackages ="dgtic.core")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //.run es el metodo para correr la aplicacion de Spring y su retorno es el contexto de la aplicación Spring 
    }
}
