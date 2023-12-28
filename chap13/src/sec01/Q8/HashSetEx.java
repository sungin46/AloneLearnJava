package sec01.Q8;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍성인"));
		set.add(new Student(2, "유길동"));
		set.add(new Student(1, "홍길동"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}

}
