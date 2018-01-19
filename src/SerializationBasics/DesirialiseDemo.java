package SerializationBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesirialiseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\a664155\\Desktop\\Docs\\t1.txt");
			ObjectInputStream obj=new ObjectInputStream(fin);
			Bank b=(Bank)obj.readObject();
			int acno=b.getAccNo();
			System.out.println(acno);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
