package Array;

import java.util.Arrays;

public class Practice_Array_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] clubs = {"MU", "ManCity", "Liverpool"}; 
		System.out.println(Arrays.toString(clubs));  //in theo mot bien object
		
		System.out.println();
		
		int[] numbers = {4,2,3,5};
		Arrays.sort(numbers);   ///sắp xếp các phần tử số theo thứ tự tăng dần (C1 dùng sort)
		System.out.println("Print the number: " + Arrays.toString(numbers) );
		
		System.out.println();
		
		int[] a = {15 , 10 , 1 , 16 , 3};  /// Dùng vòng lặp for để sắp xếp theo thứ tự tăng dần 
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temporary;
					temporary = a[i];
					a[i] = a[j];
					a[j] = temporary;
					
//Ta có: 
//	      Xét i[0] = 15
//     	      j[i+1] = 10 ( lấy phần tử tiếp theo vì j = i + 1 mà i = 0 )
//				nếu i[0]< j[i+1] ( 15 < 10 ) => Gán tạm biến temporary = i[0](15) (tại vì khi i[0] < j[i+1]) => ta phải đổi chỗ 2 biến số 
//				=> ta phải gán tạm biến i[0] vào một biến tạm thời => temporary = i[0](15)(1) => i[0] = rỗng  
//				=> i[0] = j[i+1](10) =>  j[i+1] = rỗng(2)
//				mà temporary = i[0] cũ (15)
//				Từ 1 và 2 => j[i+1](15) = temporary   
//		  Làm tương tự các phần tử tiếp theo 
				
				
				
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
