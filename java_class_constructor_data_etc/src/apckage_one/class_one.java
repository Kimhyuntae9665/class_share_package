package apckage_one;

import for_class.*; //for_class package 의 모든 class를 사용 

public class class_one {

	public static void main(String[] args) {
		//원본 class 를 가지고 있는 파일에서 함수 앞이든 변수 앞이든 public 이라고 선언을 해야지 다른 package 에서 사용이 가능하다 
		
		smart_phone iPhone1; //
		iPhone1 = new smart_phone();//객체 생성 
		
		iPhone1.owner = "김현태";
		iPhone1.number = "010-3328-1490";
		
		iPhone1.setPower();
		iPhone1.setPower();
		iPhone1.setPower();
		iPhone1.getInfo();
		iPhone1.call("010-0000-9999"); // 매개변수가 String이라서 String으로"" 붙여서 함수 불러야해 
		
//		전원이 켜졌습니다.
//		전원이 꺼졌습니다.
//		전원이 켜졌습니다.
//		소유자 : 김현태, 전화번호 : 010-3328-1490
//		010-3328-1490 에서 010-0000-9999 로 전화를 겁니다.

	}

}
