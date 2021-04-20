package pdf.p36;

public class Foo {
	private Bar bar;
	private Bar bar2;
	private Baz baz;
	private String name ;

	public Foo(Bar bar, Bar bar2) {
		super();
		this.bar = bar;
		this.bar2 = bar2;
	}

	public Foo() {
		System.out.println("할일이 없는 default 생성자 ");
	}
	
	public Foo(Bar bar, Baz baz) {
		super();
		this.bar = bar;
		this.baz = baz;
		System.out.println("Foo(Bar bar, Baz baz) ");
	}
	
	@Override
	public String toString() {
		return "Foo [bar=" + bar + ", bar2=" + bar2 + ", baz=" + baz + ", name=" + name + "]";
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setBar2(Bar bar2) {
		this.bar2 = bar2;
	}

	public void setBaz(Baz baz) {
		this.baz = baz;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
