import java.io.*;

public class CRCW {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter first Sequence length");
//		int first = (Integer.parseInt(br.readLine()));
		
		System.out.println("Enter the Sequence");
		String arr=br.readLine();
		
		String a[]=arr.split(",");
		int first=a.length;
		int firstArr[] = new int[first];
		
		for (int i = 0; i < first; i++) {
			firstArr[i] = (Integer.parseInt(a[i]));
		}

		int c[] = new int[first];
		for (int i = 0; i < first; i++) {
			c[i] = 0;
		}

		for (int i = 0; i < first; i++) {
			for (int j = 0; j < first; j++) {
				if ((firstArr[i] > firstArr[j]) || ((firstArr[i] == firstArr[j]) && i > j)) {
					c[i] += 1;
				} else {

					c[i] += 0;
				}
			}
		}
		int sorted[] = new int[first];
		for (int i = 0; i < first; i++) {

			sorted[c[i]] = firstArr[i];

		}
		System.out.print("Sorted List==>  ");
		for (int i = 0; i < first; i++) {
		if(i+1!=first)
			System.out.print(sorted[i]+",");
		else
			System.out.print(sorted[i]+".");
		}
		System.out.println();
		System.out.println(first*first+" processors are used.");

	}
}
