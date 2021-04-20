package pdf.p46;

import java.util.List;

public class CalculatorServiceImpl {
	private List valueList;

	public void setValueList(List valueList) {
		this.valueList = valueList;

	}

	@Override
	public String toString() {
		return "CalculatorServiceImpl [valueList=" + valueList + "]";
	}
	
	
}