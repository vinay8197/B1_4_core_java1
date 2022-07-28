import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Basic {
	private List<String> student=new ArrayList<String>();

	
	public void remove(String name) {
		student.remove(name);
		
		
		
	}
	
	public void add(String name) {
		student.add(name);
		
	}
	
	public void removeAll() {
		student.clear();
		
	}
	
	public int sizeOf() {
		return student.size();
		
	}

}
