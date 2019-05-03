import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		RootNode root = new RootNode(1, 1000, null);
		RootNode node1 = new RootNode(100, 199, null);
		RootNode node2 = new RootNode(200, 399, null);
		RootNode node3 = new RootNode(300, 399, null);
		root.addChild(node1);
		root.addChild(node2);
		ArrayList<Integer> values = new ArrayList<>();
		values.add(100);
		values.add(120);
		values.add(140);
		values.add(160);
		node1.addChild(new LeafNode(values));
		ArrayList<Integer> values2 = new ArrayList<>();
		values2.add(200);
		values2.add(220);
		values2.add(240);
		values2.add(260);
		node2.addChild(new LeafNode(values2));
		node2.addChild(node3);
		ArrayList<Integer> values3 = new ArrayList<>();
		values3.add(300);
		values3.add(320);
		values3.add(340);
		values3.add(360);
		node3.addChild(new LeafNode(values3));
		System.out.println(root.search(100));
		System.out.println(root.search(110));
		System.out.println(root.search(120));
		System.out.println(root.search(130));
		System.out.println(root.search(140));
		System.out.println(root.search(150));
		System.out.println(root.search(160));
		System.out.println(root.search(200));
		System.out.println(root.search(210));
		System.out.println(root.search(220));
		System.out.println(root.search(230));
		System.out.println(root.search(240));
		System.out.println(root.search(250));
		System.out.println(root.search(260));
		System.out.println(root.search(300));
		System.out.println(root.search(310));
		System.out.println(root.search(320));
		System.out.println(root.search(330));
		System.out.println(root.search(340));
		System.out.println(root.search(350));
		System.out.println(root.search(360));
	}
}
