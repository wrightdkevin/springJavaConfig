package foo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
   
   
   @Bean Robot robbie(){
	   return new Robot(56);
   }
   
   @Bean Weapon aWeapon(){
	   return new Weapon();
   }
   
   
}