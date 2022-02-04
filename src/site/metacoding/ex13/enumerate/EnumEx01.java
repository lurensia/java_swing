package site.metacoding.ex13.enumerate;

// 인터페이스의 변수는 public static final이 생략되어 있다.
interface Direction {
	String LEFT = "Left"; 
	String RIGHT = "Right";
}

public class EnumEx01 {
	
	public static void add(String direction) {
		//"Left","Right" 이렇게만 문자가 들어오게끔 만들어야함.
		if(direction.equals("Left")||direction.equals("Right")) {
			System.out.println("잘들어왔군");
		}else {
			System.out.println("너 잘못입력했어");
		}
	}

	public static void main(String[] args) {
		add(Direction.RIGHT);
	}

}
