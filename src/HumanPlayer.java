import java.util.Scanner;

// 人間プレーヤを表すサブクラスHumanPlayerを書く
public class HumanPlayer extends JankenPlayer {
	public HumanPlayer() {
	}

	@Override
	void setHand() {
		Scanner stdIn = new Scanner(System.in);
		do {
			System.out.print("じゃんけんポン");
			for (int i = 0; i < 3; i++)
				System.out.printf("(%d)%s ", i, hands[i]);
			System.out.print("：");
			hand = stdIn.nextInt();
		} while (hand < 0 || hand > 2);
	}
}
