package fuxi;

public class maopao {
	public static void main(String[]ages) {
		int[]a= {22,3,25,35,65,93,15,74};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length-1-i;j++) {
				if(a[i]>a[j]) {
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
			System.out.println(a[i]);
		}
	} 

}
