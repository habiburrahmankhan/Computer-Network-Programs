import java.util.* ;

public class transposition
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		 hrkhan();
		System.out.println("Enter the Msg to encript  : - ");
		String Msg = s.nextLine() ;
		System.out.println("Enter the Key ");
		String key =s.next() ;
		String encript= encription(Msg,key);
		System.out.println("the encryption  msg is  :- " + encript);
		System.out.println("the decryption  Msg is    " + decription(encript,key));
	}
	public static String encription(String encript , String key)
	{
        int row , k =0;
        String encriptMsg = "";
        if (encript.length()%key.length()==0) {
        	row = encript.length() /key.length();
        }
        else
        {
        	row = (encript.length() /key.length()) + 1;
        }
      char[][] chararr = new char[row][key.length()]; 
	  for (int i = 0 ; i< chararr.length ; i++ ) {
	     	for (int j = 0; j < chararr[i].length ;j++ ) {
	     		if (k >=encript.length()) {
	     			chararr[i][j] = '$' ;
	     		}
	     		else
	     		{
	     			chararr[i][j]=encript.charAt(k);
	     		}
	     		 
	     		 k++; 
	     	}
	     }
        boolean flag[] = new boolean[key.length()];
        char[] key1 = key.toCharArray() ;
         k = 0 ;
        Arrays.sort(key1);
        for (int i = 0 ;i <key.length();i++) {
        	for (int j = 0;j< key.length() ;j++ ) {
        		if (key.charAt(j)==key1[i]) {
        			k=j ; 
        			break ;
        		}
        	}
          for (int j = 0 ; j<chararr.length ;j++ ) {
          	 encriptMsg+=chararr[j][k];
          }
        }



       for (int i = 0 ; i< chararr.length ; i++ ) {
	     	for (int j = 0; j < chararr[i].length ;j++ ) {
	     		System.out.print(chararr[i][j] + "   ");
	     	}
	     	System.out.println();
	     } 
	    return encriptMsg;	
	}

	public static String decription(String encript , String key)
	{
		int row , k =0;
		String decriptMsg = "";
		if (encript.length()%key.length()==0) {
			row = encript.length() /key.length();
		}
		else
		{
			row = (encript.length() /key.length()) + 1;
		}
		char[][] chararr = new char[row][key.length()];
		boolean flag[] = new boolean[key.length()];
		char[] key1 = key.toCharArray();
		Arrays.sort(key1);
		k=0;
		int m = 0 ;
		for (int i = 0 ;i <key.length();i++) {
			for (int j = 0;j< key.length() ;j++ ) {
				if (key.charAt(j)==key1[i]) {
					k=j ;
					break ;
				}
			}
			for (int j = 0 ; j<chararr.length ;j++ ) {
				chararr[j][k]=encript.charAt(m);
				m++;
			}
		}

		for (int i = 0 ; i< chararr.length ; i++ ) {
			for (int j = 0; j < chararr[i].length ;j++ ) {
				if(chararr[i][j]!='$')
				{
					decriptMsg+=chararr[i][j];
				}
			}
		}
		return decriptMsg;
	}
	public static void hrkhan()
	{
		System.out.println();
		System.out.println("Name : - Habiburrahman");
		System.out.println("Roll no :- 17BCS071 ");
		System.out.println("B-Tech 5th Semester ");
		System.out.println();
	}
}

