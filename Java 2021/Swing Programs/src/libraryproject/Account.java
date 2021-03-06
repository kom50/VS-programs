package libraryproject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	// Add serialVersionUID
	private static final long serialVersionUID = 1L;
	private String dbUsserName;
	private String dbPassword;
	private String dbName;
	private String userName;
	private String password;
//	private String dateOfCreate;
	public Account() {
		
	}
	public Account(String dbUsserName, String dbPassword, String dbName, String userName, String password){
		this.setDbUsserName(dbUsserName);
		this.setDbPassword(dbPassword);
		this.setDbName(dbName);
		this.setUserName(userName);
		this.setPassword(password);		
	}
	
	public static void writeData(Account account) /* throws IOException */{
		try( FileOutputStream fos = new FileOutputStream("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Account.ser");
			 ObjectOutputStream oos = new ObjectOutputStream(fos)){
			 // code
			 oos.writeObject(account);
			 System.out.println("Data inserted successfull");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Object readData() /* throws IOException, ClassNotFoundException */ {
		Object obj = null;
		try(FileInputStream fis = new FileInputStream("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Account.ser");
		    ObjectInputStream ois = new ObjectInputStream(fis)){
			
			obj = ois.readObject();
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDbUsserName() {
		return dbUsserName;
	}
	public void setDbUsserName(String dbUsserName) {
		this.dbUsserName = dbUsserName;
	}
	public String getDbPassword() {
		return dbPassword;
	}
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}