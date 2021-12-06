package javabtc;
public class EncapDemo {
	public static void main(String[] args)
	{
		EncapMod em=new EncapMod();
		em.setRegno(101);
		em.setModel("Triber");
		em.setSeat(7);
		System.out.println("Regno"+em.getRegno());
		System.out.println("Regno"+em.getModel());
		System.out.println("Regno"+em.getSeat());
	}

}
