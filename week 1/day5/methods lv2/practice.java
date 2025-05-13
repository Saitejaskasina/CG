/*import java.util.Scanner;
import java.lang.Math;
public class math{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter angle");
		double angle = sc.nextDouble();
		double [] result = calculateTrigonometricFunctions( angle);
		System.out.println("sine "+result[0]);
		System.out.println("cos "+result[1]);
		System.out.println("tan " +result[2]);
		sc.close();
	}

public static double[] calculateTrigonometricFunctions(double angle){
	double[] result = new double[3];
	double radian = Math.toRadians(angle);
	result[0] = Math.sin(radian);
	result[1] = Math.cos(radian);
	result[2] = Math.tan(radian);
	return result;
}
}*/
/*
import java.util.Scanner;
import java.lang.Math;
public class practice{
	public static void main(String[] args){
		String name = "hie" ;
		int age = 21;
		hi(name,age);
	}

 static void hi(String dam, int age){
	 
	System.out.println("hi "+ dam + age);
	
}
}*/
/*
public class practice{
	public static void main(String[] args){
		int x = 3;
		int y = 2;
		int z = add(x,y);
		System.out.println(z);
	}
	static int add(int x, int y){
		int z = x+y;
		return z;
	}
}
*/
/*
public class practice{
	public static void main(String[] args){
		int x = 3;
		int y = 2;
		add(x,y);
	}
	static int add(int x, int y){
		int z = x+y;
		
		System.out.println(z);
		return 0;
	}
}*/
/*
public class practice{
	public static void main(String[] args){
		
		int y = add(1,2,3,4);
		int z = add(1,2);
		int a = add(1,2,3);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
	static int add(int a, int b){
		return a+b;
	}
	static int add(int a, int b, int c){
		return a+b+c;
	}
	static int add(int a, int b, int c, int d){
		return a+b+c+d;
	}
}*//*
public class practice{
	public static void main(String[] args){
		for(int i=-48;i>-51;i--){
			for(int j = -33;j<-29;j++){
				System.out.print(j +","+i);
			}
		System.out.println();
		}
	}
}*/
/*
public class practice{
	public static void main(String []args){
		int a = -10;
		int b = -5;
		int c = (a+b)/2;
		
		if ((a+b)<0 && (a+b)%2 != 0){
			
				c = c-1;
			
		}
		System.out.println(c);
	}
}
		*/
		
/*
public class practice{
	
	public static void main(String []args){
		
		int [] a = {2,6,-1,0,0,0, 3,0,6,4};
		int j = 0;
		for(int i = 0; i< 10; i++){
			
			if (a[i] == 0){
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
		for(int i = 0; i< 10; i++){
			System.out.print(a[i]+" , ");
		}
	}
}*/
/*
public class practice{
	
	public static void main(String []args){
		int [] a = {2,3,6,10,15,20};
		for(int i = 0; i < a.length - 1 ; i++){
			
				for(int n = a[i]+1; n< a[i+1]; n++){
					System.out.print(n+",");
				}
			
		}
	}
}*/
/*
public class practice{
	
	public static void main(String []args){
		int [] a = {2,5,4,10};
		int product = 1;
		for(int i = 0; i < a.length ; i++){
			product  *= a[i];
		}
		for(int i = 0; i < a.length ; i++){
			int result = product / a[i];
			System.out.println(result);
		}
			
		}
	}*/
	/*
	import java.util.Scanner;
public class practice{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = " ";
		for (int i = 0 ; i< a.length();i++){
			char ch = a.charAt(i);
			if ( ch >= 'a' && ch <= 'z'){
				b += (char)(ch - 32); 
			}
			else if ( ch>= 'A' && ch<= 'Z'){
				b += (char)(ch + 32); 
			}
			else {
				b += ch;
			}
		}
		System.out.println(b);
		sc.close();
	}
}	*/

/* 
import java.util.Scanner;
public class bmi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows : ");
        int n = sc.nextInt();
		System.out.print("Enter the columns : ");
        int m = sc.nextInt();
		
        System.out.print("Enter the elements: ");
        int [][] wh = new int[n][m];
			
		
	
		for(int i = 0; i<n;i++){
			for (int j = 0; j<m; j++){
				wh[i][j] = sc.nextInt();
				
			}
		}
			
		for(int i = 0; i<n;i++){
			for (int j = 0; j<m; j++){
				System.out.printf(wh[i][j]+"\t");
			}System.out.println();
		}
		System.out.println("trnspose of the matrix is: ");
		int [][] tr = new int[m][n];
		for(int i = 0; i<n;i++){
			for (int j = 0; j<m; j++){
			
				
				tr[j][i] = wh[i][j];
			
			}
		}
		for(int i = 0; i<m;i++){
			for (int j = 0; j<n; j++){
				System.out.printf(tr[i][j]+"\t");
			}System.out.println();
		}
	}
	}

*/
/*
public class practice{
	public static void main (String[]args){
		int [] a = {1,3,2,5,6,2,9};
		for (int i = 0; i < a.length; i++){
			if( i==0){
				if( a[i]> a[i+1]){
				System.out.print(a[i]);
			}				
			else{
				System.out.print(" -1 ,");
			}
			}
			else if(i == (a.length -1)){
				if( a[i]> a[i-1]){
				System.out.print(a[i]);
			}				
			else{
				System.out.print(" -1 ,");
			}
			}
			else{
			if( a[i]> a[i-1] && a[i]> a[i+1]){
				System.out.print(a[i]);
			}				
			else{
				System.out.print(" -1 ,");
			}
		}
		}
	}
}
*/
/* 
import java.util.scanner;
public class practice{
	public static void main(string[] args){
		int []a = {1,5,6,7,8,2};
		for (int i =1;int<a.length; i++){
			int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        
		}
	}
}*//*public class Practice {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 7, 8, 2};

        mergeSort(a, 0, a.length - 1);

        // Print the sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge function
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge temp arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
 */
/* 
 public class Practice {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 7, 8, 2};

        Practice obj = new Practice();
        obj.merge(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    void merge(int a[], int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            merge(a, l, m);       
            merge(a, m + 1, h);   
            mergeSort(a, l, m, h); 
        }
    }

    void mergeSort(int a[], int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = a[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = a[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < n1)
            a[k++] = left[i++];
        while (j < n2)
            a[k++] = right[j++];
    }
}

*/
public class Practice {
    public static void main(String[] args) {
        int[] d = {1400,1500,800,2100,700,600};
		int[] a = {1700,1900,900,2300,1000,830};
		for (int i = 0; i < d.length; i++){
			int count = 1;
			for (int j = 0; j < d.length; j++){
				if (d[i] <= d[j] && a[i]>d[i]){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}


