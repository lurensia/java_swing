package site.metacoding.pratics;

public interface Moveable {
	void left();

	void right();

	void up();

	default void down() {// ��ư�� �ٿ��� ����

	}

}
