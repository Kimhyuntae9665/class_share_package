package for_class;




public class smart_phone { //public class�� ��� �ؾ��� �ٸ� package���� ��밡�� 
	public String number;
	public  String owner; //public ���� �ٲ������ �ٸ� package���� ��� �� �� �ִ�
	public boolean power;//public �� ���� The field smart_phone.owner is not visible
	
	
	public void setPower() { //�Լ���  public �Լ��� ����ؾ��� �ٸ� package���� ���� �ִ� 
		power = !power;
	    if (power) System.out.println("������ �������ϴ�.");
	    else System.out.println("������ �������ϴ�.");
	}
	
	public void getInfo() {
	    System.out.println("������ : " + owner + ", ��ȭ��ȣ : " + number);
	  }
	  public void call(String toNumber) {
	    if (power) System.out.println(number + " ���� " + toNumber + " �� ��ȭ�� �̴ϴ�.");
	    else System.out.println("������ �����ֽ��ϴ�.");
	  }
	

}
