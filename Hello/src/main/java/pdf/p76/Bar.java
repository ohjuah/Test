package pdf.p76;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	private Foo foo;

	@Required
	@Resource
	public void setFoo(Foo foo) {
		this.foo = foo;
		System.out.println("Bar.setFoo");
	}

	public void doBar() {
		foo.doFoo();
		System.out.println("Bar.doBar()");
	}
}
