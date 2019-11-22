import java.util.*;


public class playplaincypher
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    String key = scan.next();
        System.out.println(encript(str , key));
	}
	public static String encript(String enstr ,String str)
	{
      
      
       System.out.println(arrstr);

        HashMap<Character , Integer > map = new HashMap<>();
		char arr[][] = new char[5][5] ;
		int k=0 , a=0;
		for (int i=0;i<5 ;i++) {
			for (int j=0;j<5 ;) {
				if (k<str.length()) {
					if(!map.containsKey(str.charAt(k)))
				{
					arr[i][j]=str.charAt(k);
					map.put(str.charAt(k) ,1);
					j++;
				}
				}
				else
				{
					if((!map.containsKey((char)(a+'a'))) && (char)(a+'a')!='j')
				{
					arr[i][j]=(char)(a+'a');
					map.put((char)(a+'a'),1);
					j++;
				}
				a++;
				}
				k++;
			}
			
		}

		for (int i=0;i<5 ;i++ ) {
			for (int j=0;j<5 ;j++ ) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
		String encriptd ="";
          for (int i=0;i<enstr.length()-1 ;) {
            char ch =enstr.charAt(i) ;
            char ch1=enstr.charAt(i+1);
            if (ch!=ch1) {
            	aaa+=ch+ch1;
            	
            	i+=2;
            }
            else
            {
                 ch1='x';
            	i++;
            }
            int row , col , row1 , col1 ;
           for (int j=0;j<5 ;j++ ) {
			for ( k=0;k<5 ;k++ ) {
				if (ch==arr[i][j]) {
					row =i;
					col =j;
				}
				if (ch1==arr[i][j]) {
					row1=i;
					col1=j;
				}
			}

			
		}
		   int max ,min ;
		 if(row!=row1 && col1!=col)
		 {
		 	max=Math.max(row1 ,row);
		 	min = Math.min(col1 ,col);
		 	encriptd+=arr[max][min];
		 	max=Math.min(row1 ,row);
		 	min = Math.max(col1 ,col);
		 	encriptd+=arr[max][min];
		 }

       } 









		return encripted;
	}
}