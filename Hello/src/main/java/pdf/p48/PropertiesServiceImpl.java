package pdf.p48;

import java.util.Properties;

public class PropertiesServiceImpl {
	private Properties prop;

	public void connect() {
		String serverIp = prop.getProperty("server");
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	@Override
	public String toString() {
		return "PropertiesServiceImpl [prop=" + prop + "]";
	}
}