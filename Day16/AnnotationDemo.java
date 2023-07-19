package Day16;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface Player {
	String gameName() default "Cricket";
}

@Player(gameName = "Cricket")
class Virat {
	private String name;
	private String age;
	
	public void display() {
		System.out.println("Virat is a player in Indian Cricket team");
	}
}

//@Player(gameName = "Football")
//class Messi {
//	private String name;
//	private String age;
//	
//	public void display() {
//		System.out.println("Messi is a football player");
//	}
//}

public class AnnotationDemo {
	public static void main(String[] args) {
		Virat virat = new Virat();
		virat.display();
		
//		Class c = virat.getClass();
//		Annotation a = c.getAnnotation(Player.class);
//		Player player = (Player)a;
//		System.out.println(player.gameName());
	}
}