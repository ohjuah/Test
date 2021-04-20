package pdf.p38;


public class GreetingServiceImpl {
	
	private String greeting;
	private int loopCount; 

public GreetingServiceImpl() {
	// TODO Auto-generated constructor stub
}

public GreetingServiceImpl(String greeting, int loopCount) {
	this.greeting = greeting;
	this.loopCount = loopCount;
	System.out.println("GreetingServiceImpl(String greeting, int loopCount)");
}

@Override
public String toString() {
	return "GreetingServiceImpl [greeting=" + greeting + ", "
			+ "loopCount=" + loopCount + "]";
}


}

