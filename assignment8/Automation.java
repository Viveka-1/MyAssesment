package assignment8;

public class Automation extends MultipleLaunguage  implements Testtool,Launguage{

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium method is printed");
	}


	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		super.ruby();
	}


	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java is printed");
		
	}
public static void main(String[] args) {
	
	Automation obj = new Automation();
	obj.Java();
	obj.python();
	obj.Selenium();
	obj.ruby();
	
	
	
}
}
