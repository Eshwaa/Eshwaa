package week2.day1;

public class Phone {
	public void powerOn() {
		System.out.println("turn on");
	}
	public void powerOff() {
		System.out.println("turn off");
	}
	public void call() {
		System.out.println("dial the number");
	}
	public void message() {
		System.out.println("send message");
	}
	public void camera() {
		System.out.println("take a picture");
	}
	public void delete() {
		System.out.println("delect the document");
	}
	public void document() {
		System.out.println("create the document");
	}
	
public static void main(String[] args) {
	Phone mymob = new Phone();
	mymob.powerOn();
	mymob.powerOff();
	mymob.call();
	mymob.message();
	mymob.camera();
	mymob.delete();
	mymob.document();
}
}
