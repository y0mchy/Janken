import java.util.Scanner;

// mainメソッドを含むJankenGameクラスを書く
class JankenGame {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; // もう一度行うか？

		JankenPlayer humanPlayer = new HumanPlayer();
		JankenPlayer compPlayer = new ComputerPlayer();

		do {
			// コンピュータの手を0, 1, 2の乱数として生成
			compPlayer.setHand();
			int comp = compPlayer.getHand();
			// プレーヤの手を0, 1, 2で読み込む
			humanPlayer.setHand();
			int user = humanPlayer.getHand();

			// 両者の手を表示
			System.out.println("私は" + compPlayer.getHandString() + "で、あなたは" + humanPlayer.getHandString() + "ですyo。");

			// 判定
			int judge = (user - comp + 3) % 3;
			switch (judge) {
			case 0:
				System.out.println("引分けです。");
				break;
			case 1:
				System.out.println("あなたの負けです。");
				break;
			case 2:
				System.out.println("あなたの勝ちです。");
				break;
			}

			// もう一度行うかどうかを確認
			do {
				System.out.print("もう一度？ (0)いいえ (1)はい：");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
	}
}
