package foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

@Import(foo.Weapon.class)

public class Robot {
	
	private int firePower;
	
	private Weapon weapon;
	
	public Robot(int fp){
		System.out.println("robot cons");
		firePower = fp;
		System.out.println("firepower set to:" + firePower);
	}
	
	
	public void dem(){
		System.out.println("destroy...destroy...lol");
	}
	
	
	@Autowired
	public void setWeapon(Weapon weapon){
		System.out.println("injecting weapon");
		this.weapon = weapon;
	}

}
