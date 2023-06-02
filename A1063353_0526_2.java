import java.io.*;
public class A1063353_0526_2 {
	
 public static void main(String args[]) throws IOException, ClassNotFoundException{
	 
	 
System.out.println("要讀取的學生資料檔"); 
System.out.print("-----");  
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
String filename= br.readLine();  // ## mano - Unid

int counter = 0 ;
double Esum = 0 ; 
double Msum = 0 ; 
double Jsum = 0 ; 
Student ss = new Student ( ) ; 
System.out.println ( "姓名\t英文 \t數學 \tJava \t 平均" ) ; 
System.out.println ( "---------- ");


		
		try ( ObjectInputStream ois =  
				new ObjectInputStream ( new FileInputStream ( filename ) ) ) {
			while ( true )
			{ ss = ( Student ) ois.readObject ( ) ;
			

			 counter ++ ;
			 Esum += ss.getE ( ) ; 
			 Msum +=ss.getM ( ) ; 
			 Jsum += ss.getJ ( ) ; 
			
			
			
		
				 System.out.println ( ss.getN ( ) + '\t' + ss.getE ( ) 
				 + '\t' + ss.getM ( ) + '\t' + ss.getJ ( ) + '\t' + ss.getAvg ( ) ) ;
		 
			} 
				
			}catch(EOFException e){
				
			 System.out.println ( "\n已從檔案" +filename+"讀取"+counter+"學生資料" ) ; 
			 System.out.println ( " \n全員英文成績: "+  ( Esum / counter ));
			 System.out.println ( " \n全員數學成績: "+  ( Msum / counter ));
			 System.out.println ( " \n全員JAVA成績: "+  ( Jsum / counter ));
			
				
			}
		

 }}
 

