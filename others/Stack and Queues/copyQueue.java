import java.util.*;

import jdk.internal.jshell.tool.resources.l10n;

public class Main{
	public static void main(String args[]) {
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		copyQueue(q1, q2);
		System.out.println(q2);
		
	}
	public static void copyQueue(Queue<Integer> q1, Queue<Integer> q2) {
		int x = q1.size();
		for(int i=1;i<x+1;i++) {
			int y = q1.remove();
			q1.add(y);
			q2.add(y);
		}
		return;
	}
	
}
