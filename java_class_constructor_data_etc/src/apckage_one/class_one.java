package apckage_one;

import for_class.*; //for_class package 의 모든 class를 사용 

public class class_one {

	public static void main(String[] args) {
		
		
		smart_phone iPhone1; //
		iPhone1 = new smart_phone();//객체 생성 
		
		iPhone1.owner = "김현태";
		iPhone1.number = "010-3328-1490";
		
		iPhone1.setPower();
		iPhone1.setPower();
		iPhone1.setPower();
		iPhone1.getInfo();
		iPhone1.call("010-0000-9999"); // 매개변수가 String이라서 String으로"" 붙여서 함수 불러야해 
	}

}
