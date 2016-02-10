package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("start");
		
		 ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(HelloWorldConfig.class);
				   
				   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

				   //helloWorld.setMessage("Hello World!");
				   //helloWorld.getMessage();
				   
				   Robot theRobot = ctx.getBean(Robot.class);
				   theRobot.dem();
				   
				   
	}

}
