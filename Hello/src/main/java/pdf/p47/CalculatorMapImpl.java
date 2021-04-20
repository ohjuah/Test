package pdf.p47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CalculatorMapImpl {
	private Map<String, Bar> map;
	private List<String> keyList;
	
	public void sample() {
		
		map = new HashMap<String, Bar>();
		Bar bar = new Bar(); 
		map.put("hello :D !!!", bar);
		Bar bar2 = new Bar(); 
		map.put("hi :D !!!", bar2);
		Iterator<String> keyIterator = map.keySet().iterator();
		keyList= new ArrayList<String>();
		while(keyIterator.hasNext()) {
			keyList.add(keyIterator.next());
		}
	}
	
	
	public void setMap(Map<String, Bar> map) {
		this.map = map;
		Iterator<String> keyIterator = map.keySet().iterator();
		keyList= new ArrayList<String>();
		while(keyIterator.hasNext()) {
			keyList.add(keyIterator.next());
		}
	}

	@Override
	public String toString() {
		return "CalculatorMapImpl [map=" + map + ", keyList=" + keyList + "]";
	}
}