// 抽象クラスJankenPlayerを書く
public abstract class JankenPlayer {
	protected int hand;
	protected String[] hands = { "グー", "チョキ", "パー" };

	abstract void setHand();

	public String getHandString() {
		return hands[hand];
	}

	public int getHand() {
		return hand;
	}
}
