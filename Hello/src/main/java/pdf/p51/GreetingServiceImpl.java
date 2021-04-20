package pdf.p51;

public class GreetingServiceImpl implements GreetingService {
	private OutputService outputter;

	public void setOutputter(String outputter) {
		this.outputter = new OutputServiceImpl();
	}	
	
	public GreetingServiceImpl() {
		// TODO Auto-generated constructor stub
	System.out.println("생성자 ");
	}

	public GreetingServiceImpl(OutputService outputter) {
		this.outputter = outputter;
		System.out.println("매개변수 생성자 ");
		
	}
	
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name + "Hola";

	}

}
