import com.zookeeper.types.animals.Bat;

public class BatTest {
	public static void main(String[] args) {
		
		Bat bruce = new Bat(300);
		
		bruce.attackTown();
		bruce.displayEnergy();
		bruce.attackTown();
		bruce.displayEnergy();
		bruce.attackTown();
		bruce.displayEnergy();
		bruce.eatHumans();
		bruce.displayEnergy();
		bruce.eatHumans();
		bruce.displayEnergy();
		bruce.fly();
		bruce.displayEnergy();
		bruce.fly();
		bruce.displayEnergy();
	}
}
