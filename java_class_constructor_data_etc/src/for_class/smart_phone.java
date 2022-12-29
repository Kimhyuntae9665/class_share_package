package for_class;




public class smart_phone { //public class를 사용 해야지 다른 package에서 사용가능 
	public String number;
	public  String owner; //public 으로 바꿔줘야지 다른 package에서 사용 할 수 있다
	public boolean power;//public 안 쓰면 The field smart_phone.owner is not visible
	
	
	public void setPower() { //함수도  public 함수를 사용해야지 다른 package에서 쓸수 있다 
		power = !power;
	    if (power) System.out.println("전원이 켜졌습니다.");
	    else System.out.println("전원이 꺼졌습니다.");
	}
	
	public void getInfo() {
	    System.out.println("소유자 : " + owner + ", 전화번호 : " + number);
	  }
	  public void call(String toNumber) {
	    if (power) System.out.println(number + " 에서 " + toNumber + " 로 전화를 겁니다.");
	    else System.out.println("전원이 꺼져있습니다.");
	  }
	

}
