package todospringboot.annotation;



@CustomAnnotation(count = 5)
public class Application {

	public void start(){
		System.out.println("Application.start() called.");
	}
}
