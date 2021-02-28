/*
 * Test05_추상클래스ex)  (BankAbstract와  MyBankAbstract 사용)
 - 클래스의 공통된 부분을 뽑아서 별도의 클래스(추상클래스)BankAbstract로 만들어 놓고, 이것을 MyBankAbstract에서 상속해 사용
 - 멤버 변수갖음, extends 키워드, 구현필요, 일반메서드 갖음, 생성자도 있음.
 */
package o226;
abstract class BankAbstract {	// 추상클래스(공통 부분 구현)
    String name;
    String account;
    int totalAmount;
    public BankAbstract(){
        System.out.println("BankAbstract 생성자");    }
    
    public BankAbstract(String name, String account, int totalAmount){
        System.out.println("BankAbstract 매개변수 생성자");
        this.name = name;
        this.account = account;
        this.totalAmount = totalAmount;        }
    
// 일반 함수(예금, 출금, 정보출력) 추상 함수(적금, 해약)
    public void deposit(){
        System.out.println("예금 함수 시작");
    }
    public void withdraw(){
        System.out.println("출금 함수 시작");
    }
    public void getInfo(){
        System.out.printf("name : %s\n", name);
        System.out.printf("account : %s\n", account);
        System.out.printf("totalAmount : %s\n", totalAmount);
    }
    public abstract void installmentSavings(); // 적금 추상함수
    public abstract void cancellation(); // 해약 추상함수
}

class MyBankAbstract extends BankAbstract	// MyBankAbstract에서 상속해 사용
{
	// 매개변수 생성자
    public MyBankAbstract(String name, String account, int totalAmount){
        super(name, account, totalAmount);	 	}
   
    @Override
    public void installmentSavings() {
        System.out.println("추상 메소드인 적금 메서드 시작");}
    @Override
    public void cancellation() {
        System.out.println("추상 메소드인 해약 메서드 시작");}
}

public class Test05_AbstractClassEx {
public static void main(String[] args) {
	BankAbstract mybank = new MyBankAbstract("박찬호", "계좌번호", 900);	// 추상클래스로 이동
    mybank.deposit();   // 본 클래스의 예금함수 시작
    mybank.withdraw();  // 본 클래스의 출금함수 시작
    System.out.println();
    mybank.installmentSavings(); // 추상 메소드인 적금 메서드 시작
    mybank.cancellation(); // 추상 메소드인 해약 메서드 시작

    System.out.println();
    mybank.getInfo();   // name 박찬호 account 계좌번호 totalAmount 900
	}
}
