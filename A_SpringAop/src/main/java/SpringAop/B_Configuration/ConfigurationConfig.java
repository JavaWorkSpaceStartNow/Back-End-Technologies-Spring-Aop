package SpringAop.B_Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//One of the most important annotations in spring is @Configuration annotation which indicates that the class has @Bean definition
//methods. So Spring container can process the class and generate Spring Beans to be used in the application.
@Configuration
//Spring @EnableAspectJAutoProxy annotation enables support for handling components marked with @Aspect annotation of AspectJ. 
//The @EnableAspectJAutoProxy is used on @Configuration classes.
@EnableAspectJAutoProxy
//With Spring, we use the @ComponentScan annotation along with the @Configuration annotation to specify the packages that we 
//want to be scanned.
@ComponentScan("SpringAop")
public class ConfigurationConfig {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
