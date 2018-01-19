package SerializationBasics;

import java.beans.Transient;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bank implements Serializable{

	int accNo;
	transient String name;
	int balance;
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Bank b=new Bank();
			b.setAccNo(1010);
			b.getAccNo();
			FileOutputStream fout=new FileOutputStream("C:\\Users\\a664155\\Desktop\\Docs\\t1.txt");
			ObjectOutputStream o=new ObjectOutputStream(fout);
			o.writeObject(b);
			System.out.println("sucess");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
