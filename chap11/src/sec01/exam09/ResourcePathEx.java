package sec01.exam09;

public class ResourcePathEx {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photoPath1 = clazz.getResource("photo1.jpg").getPath();
		String photoPath2 = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photoPath1);
		System.out.println(photoPath2);
	}

}
