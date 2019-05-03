import java.util.ArrayList;
import java.util.Collection;

public class LeafNode extends Node{
	
	private ArrayList<Integer> values;
	
	public LeafNode(Collection<Integer> values) {
		super();
		this.values = new ArrayList<Integer>();
		this.values.addAll(values);
	}
	
	public ArrayList<Integer> getValues() {
		return this.values;
	}
	
	public boolean contains(int index, int number) {
		if (index < values.size()) {
			if (values.get(index) == number) {
				return true;
			} else 
				return contains(index + 1, number);
		}
		return false;
	}
}
