package pdf.p42;

public class Foo {
	private Bar bar;

	
	public void setBar(Bar bar) {
		this.bar= bar;
	}
	
	public void doBar() {
		
		Bar bar = getBar();
		bar.doIt();
		System.out.println("pdf.p42.Foo class의 doBar()");
		}

	protected Bar getBar() {
		System.out.println("pdf.p42.Foo class의 getBar()");
		return null;
		}


	@Override
	public String toString() {
		return "Foo [bar=" + bar + "]";
	}


	

	



	

}
