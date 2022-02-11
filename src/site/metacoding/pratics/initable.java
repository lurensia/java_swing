package site.metacoding.pratics;

/**
 * 
 * @author Administrator 생성자 실행 순서 initObject 1번 실행 initSetting 2번 실행
 *         initListener 3번 실행(defalut)
 */

public interface initable {
	default void initObject() {

	}

	default void initSetting() {

	}

	default void initListener() {

	};

}
