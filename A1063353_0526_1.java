
import java.io.*;

    class Student implements Serializable{
	
	public Student(String s,short e,short m,short j){
		
		name =s;//姓名
		Escore = e;//英文成績
		Mscore =m;
		Jscore =j;
		
		
		
		
	}
	
	public Student() {
		
		
	}
	public String getN() { return name;}
	public short getE() { return Escore;}
	public short getM() { return Mscore;}
	public short getJ() { return Jscore;}
	
	public double getAvg() {
		return (Escore+Mscore+Jscore)/3.0;
		
	}
	
	
	private String name;
	private short Escore;
	private short Mscore;
	private short Jscore;
	

}




public class  A1063353_0526_1{
	
	public static void main(String args[])throws IOException{
		
		System.out.println("請輸入要建立的學生成績檔檔名");
		System.out.print("~~~");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String filename = br.readLine();
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(filename));//
		String str = new String();
		int counter=0;
		do {
			
			counter++;
			System.out.print("請輸入學生姓名:");
			String name =br.readLine();
			System.out.print("請輸入英文分數:");
		    str = br.readLine();
		    short e=Short.parseShort(str);
		    
		    System.out.print("請輸入英文分數:");
		    str = br.readLine();
		    short m=Short.parseShort(str);
		    
		    System.out.print("請輸入英文分數:");
		    str = br.readLine();
		    short j=Short.parseShort(str);
		    
		   Student ss=new Student(name,e,m,j);
		   os.writeObject(ss);
		   System.out.print("還需要輸入另一筆資料嗎(Y/N):");
		   str = br.readLine();
		}while(str.equalsIgnoreCase("y"));
		
		os.flush();
		os.close();
		
		 System.out.println("\n以寫入"+counter+"學生資料"+filename);  
		    
		    
		    
		   
			
			
			
			
		}
		
		
		
		
		
		

		
	
	

	
	
	
	
	
	
}













