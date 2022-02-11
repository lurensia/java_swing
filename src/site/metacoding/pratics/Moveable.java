package site.metacoding.pratics;

public interface Moveable {
	void left();

	void right();

	void up();

	default void down() {// 버튼은 다운이 없음

	}

}
