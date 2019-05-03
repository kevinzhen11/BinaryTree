import java.util.ArrayList;

public abstract class Node {
	
	ArrayList<Node> children;
	
	public Node() {
		children = new ArrayList<Node>();
	}
	
	public ArrayList<Node> getChildren() {
		return this.children;
	}
	
	public boolean contains(int number) {
		return contains(0, number);
	}
	
	public boolean search(int number) {
		return this.contains(number);
	}
	
	public abstract boolean contains(int index, int number);
}
