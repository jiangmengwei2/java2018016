package fuxi;

import java.util.ArrayList;
import java.util.List;

public class jihe {
	public static void main(String[]ages) {
		List list=new ArrayList();
		System.out.println(list.size());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
