package net.javaguides.sms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Dilma", "Opressora", "dilma@gmail.com");
//		Student student2 = new Student("Tenório", "Godofredo", "tenorio@gmail.com");
//		Student student3 = new Student("Roberval", "Terencio", "roberval@gmail.com");
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		studentRepository.save(student3);

	}

}
