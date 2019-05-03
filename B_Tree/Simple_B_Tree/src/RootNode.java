import java.util.Collection;

public class RootNode extends Node {

	private int min;
	private int max;
	
	public RootNode(int min, int max, Collection<Node> nodes) {
		super();
		this.min = min;
		this.max = max;
		if (nodes != null && nodes.size() > 0) {
			children.addAll(nodes);
		}
	}
	
	public void addChild(Node node) {
		children.add(node);
	}
	
	public boolean inRange(int number) {
		return number >= min && number <= max;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getMin() {
		return min;
	}
	
	public boolean contains(int index, int number) {
		if (index < children.size()) {
			boolean find = children.get(index).contains(number);
			find |= contains(index + 1, number);
			return find;
		}
		return false;
	}
}
