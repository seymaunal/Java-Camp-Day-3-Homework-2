package day3homework2;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kaydýnýz Tamamlandý." + user.getFirstName()+ "  "+ user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kaydýnýz Silindi!" + user.getFirstName()+ "  "+ user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kaydýnýz Güncellendi!" + user.getFirstName()+ "  "+ user.getLastName());
	}
}
