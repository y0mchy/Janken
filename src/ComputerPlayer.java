import java.util.Random;

// コンピュータプレーヤを表すサブクラスComputerPlayerを書く
public class ComputerPlayer extends JankenPlayer {
	public ComputerPlayer() {
	}

	@Override
	void setHand() {
		Random rand = new Random();
		hand = rand.nextInt(3);
	}
}
