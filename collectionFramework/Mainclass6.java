package com.collectionFramework;
interface Language{
	void write();
}
class English implements Language{
	@Override
	public void write() {
		System.out.println("Language English");
	}
}
class Hindi implements Language{
	@Override
	public void write() {
		System.out.println("Language Hindi");
	}
}
class Sanskrit implements Language{
	@Override
	public void write() {
		System.out.println("Language Sanskrit");
	}
}
class Google{
	static void translate(Language l1, Language l2) {
		if(l1!=null && l2!=null) {
			l1.write();
			System.out.println(" to ");
			l2.write();
		}
	}
}
public class Mainclass6 {
	public static void main(String[] args) {
		English e=new English();
		Hindi h=new Hindi();
		Sanskrit s=new Sanskrit();
		Google.translate(h, e);
		Google.translate(e, s);
		Google.translate(s, h);
		Google.translate(h, s);
		Google.translate(s, e);
		Google.translate(e, s);
	}

}
