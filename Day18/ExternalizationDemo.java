package Day18;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Externalizable {

	String str;
	int i; 
	int j;
	
	public Demo() {
		System.out.println("Constructor called");
	}
	
	public Demo(String str, int i, int j) {
		this.str = str;
		this.i = i;
		this.j = j;
	}
	
	// callback method (internally will be called when writeObject() is called)
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(str);
		out.writeInt(i);
	}

	// callback method (internally will be called when readObject() is called)
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		str = (String)in.readObject();
		i = in.readInt();
	}
}

public class ExternalizationDemo {
	public static void main(String[] args) throws Exception {
		
		Demo demo = new Demo("Dhoni", 7, 77);
		System.out.println("Serialization started...");

		FileOutputStream fos = new FileOutputStream("test.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(demo);
		System.out.println("Serialization ended...");
		System.out.println();
		
		System.out.println("Deserialization started...");
		FileInputStream fis = new FileInputStream("test.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo newDemo = (Demo) ois.readObject();

		System.out.println("Deserialization ended...");
		System.out.println(newDemo.str + " " + newDemo.i + " " + newDemo.j);
	}
}