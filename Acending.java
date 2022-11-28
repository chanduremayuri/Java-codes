package Package1;
import java.util.*;
class Acending {
public static void main(String[] args) {
	int n,i,j,temp;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter element");
	n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<=n-1;i++){
		System.out.println("Enter no");
        a[i]=sc.nextInt();
	}
	for(i=0;i<=n-2;i++){
		
	}
	for(j=0;j<=n-2;j++){
	if(a[j]>a[j+1]){
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
	}
}System.out.println("After Sorting");
for(i=0;i<=n-1;i++){
	System.out.println(a[i]);
}
}


}
