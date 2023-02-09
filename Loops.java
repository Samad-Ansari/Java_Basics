public class Loops {
	public static void main(String[] args){
		for(int i=0; i<5; i++){
			System.out.print(i + " ");
		}
		System.out.println("\n");
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(i + "" + j + " ");
			}
			System.out.println("\n");
		}
		
		int[] nums = {5,4,2,3,1};
		for(int num: nums){
			System.out.println(num);
		}

		a: for(int i=0; i<4; i++){
			System.out.print(i + " ");
			b: for(int j=0; j<4; j++){
				System.out.print(j);
				if(i+j == 3){
					break a;
				}
			}
			System.out.println();
		}

		int i=0;
		for(;;){
			if(i<5)
				System.out.println(i);
			else break;
			i++;
		}


		int j=0;
		while(j <= 5){
			System.out.println(j);
			j++;
		}
		System.out.println();
		int k=10;
		do{
			System.out.println(k);
			k++;
		}while(k < 10);


		for(int l=0; l<=5; l++){
			if(l == 4){
				break;
			}
			System.out.println(l);
		}
		System.out.println();
		for (int l=0; l<= 5; l++) {
			if(l == 3){
				continue;
			}
			System.out.println(l);
		}






	}
}