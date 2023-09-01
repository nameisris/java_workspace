import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataStreamTest1 {
	
	static void write(Person p) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("person.bin");
			dos = new DataOutputStream(fos);
			
			dos.writeUTF(p.name);
			dos.writeInt(p.age);
			dos.writeDouble(p.height);
			dos.writeBoolean(p.married);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) {
					dos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static Person read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		Person p = null;
		
		try {
			fis = new FileInputStream("person.bin");
			dis = new DataInputStream(fis);
			
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			boolean married = dis.readBoolean();
			
			p = new Person(name, age, height, married);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) {
					dis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return p;
	}
	
	static void write(List<Person> pers) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("person.bin");
			// 각 데이터 타입을 지정해주기 위해 DataInputStream 사용
			dos = new DataOutputStream(fos);

			// 가장 처음에 몇명인지부터 write
			dos.writeInt(pers.size());
			
			for(Person p : pers) {
				dos.writeUTF(p.name);
				dos.writeInt(p.age);
				dos.writeDouble(p.height);
				dos.writeBoolean(p.married);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) {
					dos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static List<Person> readList() {
		List<Person> pers = new ArrayList<>();
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("person.bin");
			dis = new DataInputStream(fis);
			
			// 인원수 read (write 할 때, pers의 size())
			int cnt = dis.readInt();
			
			for(int i = 0;i < cnt;i++) {
				String name = dis.readUTF();
				int age = dis.readInt();
				double height = dis.readDouble();
				boolean married = dis.readBoolean();
				pers.add(new Person(name, age, height, married));
			}
				
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) {
					dis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return pers;
	}
	
	

	public static void main(String[] args) {
//		Person p1 = new Person("hong", 35, 175.3, false);
//		write(p1);
		
//		Person p = read();
//		System.out.println(p);
		
		List<Person> pers = new ArrayList<>();
		pers.add(new Person("hong", 20, 175.3, false));
		pers.add(new Person("song", 30, 183.7, false));
		pers.add(new Person("gong", 40, 174.2, true));
		
		write(pers);
		
		List<Person> ps = readList();
		
		for(Person p : ps) {
			System.out.println(p);
		}
		
	}

}

class Person implements Serializable {
	String name;
	int age;
	double height;
	boolean married;
	
	Person(String name, int age, double height, boolean married) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.married = married;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return String.format("이름: %s, 나이: %d, 키: %.1f, 결혼: %s", name, age, height, married? "Y" : "N");
	}
}