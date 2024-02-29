package dgtic.core.inicio;

import dgtic.core.modelo.Persona;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Inicio {
    public static void main(String[] args) {
        final Resource resource=new ClassPathResource("bean_configuration.xml"); //Revisar que coincida el nombre
        final DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
        final XmlBeanDefinitionReader xmlBeanDefinitionReader=new XmlBeanDefinitionReader(beanFactory); //leer archivo de configuracion
        xmlBeanDefinitionReader.loadBeanDefinitions(resource); //metodo para leer definicion, le pasamos el recurso
        Persona persona=(Persona)beanFactory.getBean("persona");
        System.out.println(persona);
        persona.setNombre("Demo");
        System.out.println(persona);
        System.out.println(persona);
        System.out.println(beanFactory.isSingleton("persona")); //Cualquier bean que se crea en el contenedor por default es Singleton
        System.out.println(beanFactory.getBean("persona")instanceof Persona);
        System.out.println(beanFactory.isTypeMatch("persona",Persona.class));//Que sea de la misma clase
        System.out.println(beanFactory.getAliases("persona").length>0);//revisar si hago otro bean (instancio otro) creo una persona y le ponga un apodo


    }
}
