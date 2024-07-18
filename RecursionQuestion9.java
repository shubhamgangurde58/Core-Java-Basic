class RecursionQuestion9{
	
	public static int first = -1;
	public static int last = -1;
	
	public static void findIndex(String str, int index, char element){

		
		if(index == str.length()){

			System.out.println(first);
			System.out.println(last);
			return;
		}

		
		System.out.print(str.charAt(index));

		char current = str.charAt(index);

		if(current == element){
	
			if(first == -1){

				first = index;
			}else{

				last = index;
			}		

		}

		findIndex(str , index+1 , element);

	}

	public static void main(String args[]){

		String str = "abcdabgapt";
		
		findIndex(str,0,'a');
	
	}

}