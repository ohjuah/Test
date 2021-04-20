package pdf.p43;

public class Foo {
	private Bar bar;
	private String email;

	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("pdf.p43.Foo class의 setBar");
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("pdf.p43.Foo class의 setEmail");
	}

	public Foo() {
		System.out.println("pdf.p43.Foo class의 default()");
	}

	@Override
	public String toString() {
		return "Foo [bar=" + bar + ", email=" + email + "]";
	}

}
