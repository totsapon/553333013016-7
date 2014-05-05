package arraylist;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add("t1");
		list.add("t2");
		list.add("t3");
		list.add("t4");
		list.add("t5");
		System.out.println(list);

		ArrayListQueue queue = new ArrayListQueue();
		queue.enQueue("t1");
		queue.enQueue("t2");
		queue.enQueue("t3");
		queue.enQueue("t4");
		queue.enQueue("t5");
		System.out.println(queue);

		ArrayListStack stack = new ArrayListStack();
		stack.push("t1");
		stack.push("t2");
		stack.push("t3");
		stack.push("t4");
		stack.push("t5");
		System.out.println(stack);
		
	}

}
