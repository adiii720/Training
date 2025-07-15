package finaldemo;

 class FinalClassDemo1 {
	void show ()
	{
		System.out.println("Final class cannot be inherited");
	}
}


//class Student extends FinalClass{
//	
//}



public class FinalClassDemo {

	public static void main(String[] args) {
		
		FinalClassDemo1 f=new FinalClassDemo1();
		f.show();

	}

}
