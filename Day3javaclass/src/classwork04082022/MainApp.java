package classwork04082022;

public class MainApp {

	public static void main(String[] args) {
        PrintInformation pii=new PrintInformationImpl();
       // PrintInformationImpl piii = new PrintInformationImpl();
        pii.printMessage("I am a fuctional interface");
        PrintInformation.printInformation();
        pii.printInfo();
        PrintInformation pi=(c)->System.out.println(c+"Hello I understand Lambda expression");
        pi.printMessage("Hi");
	}

}
