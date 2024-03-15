import java.util.*;
class Pattern {
	public static void main (String [] args){
		int rows ,coef=1;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the no of rows;");
		rows=in.nextInt();
		for(int i=0;i<rows;i++){
			for(int space=1;space<rows-i;++space){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				if(j==0||i==0){
					coef=1;
 				}
				else
					coef=coef*(i-j+1)/j;
				System.out.printf("%4d",coef);
			}
			System.out.println();
		}
	}
}