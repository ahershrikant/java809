package Java809;

public class HashCode {
	String rank;
	String name;
	public HashCode(String r,String n) {
		rank=r;
		name=n;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof HashCode)) {
			return false;
		}
		HashCode h=(HashCode) obj;
		return rank.equals(h.rank) && name.equals(h.name);
	}
    public int hashCode() {
    	return rank.hashCode();
		
	}
    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashCode c= new HashCode("19","king");
		System.out.println(c.equals(c));
		System.out.println(c.hashCode());

	}

}
