import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;



class Node {

	int key;
	Node left;
	Node right;

	Node(int key) {
		this.key = key;
		left = null;
		right = null;
	}

	public void insert(int value) {
		if (value == key) {
			return; // No duplicates are allowed
		}

		if (value > key) {
			// explore right
			if (this.right == null) {
				this.right = new Node(value);
				return;
			} else {
				this.right.insert(value);
			}
		} else {
			// explore left
			if (this.left == null) {
				this.left = new Node(value);
				return;
			} else {
				this.left.insert(value);
			}
		}
	}


	public boolean getNode(int value) {
		if (this.key == value) {
			return true;
		}

		if (this.key > value) {
			if (this.left != null) {
				return this.left.getNode(value);
			} else {
				// not found.
				return false;
			}
		} else {
			if (this.right != null) {
				return this.right.getNode(value);
			} else {
				// not found.
				return false;
			}
		}

	}

}

class Tree {
	Node root;

	Tree(int key) {
		root = new Node(key);
	}

	Tree() {
		root = null;
	}

	// insertion
	public void insertNode(int value) {
		if (root == null) {
			root = new Node(value);
			return;
		} else {
			root.insert(value);
		}
	}


	// search
	public boolean get(int value) {
		if (root != null) {
			return root.getNode(value);
		} else {
			return false;
		}

	}	

}



public class Main{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String a[] = br.readLine().split(" ");
			int m = Integer.parseInt(a[1]);
			int l = Integer.parseInt(a[2]);
			
			Tree list[] = new Tree[m];
			
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for(int i=0;i<m;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				list[i] = new Tree();
				st.nextToken();
				while(st.hasMoreTokens()) {
					int next = Integer.parseInt(st.nextToken());
					map.put(next,i);
					list[i].insertNode(next);
				}
			}
			
			String larr[] = br.readLine().split(" ");
			
			int segments = 1;
			
			for(int i=0;i<l-1;i++) {
				int key = map.get(Integer.parseInt(larr[i]));
				if(!list[key].get(Integer.parseInt(larr[i+1]))) {
					segments++;
				}
			}
		
			System.out.println(segments);
			
		}
	
	}
}
