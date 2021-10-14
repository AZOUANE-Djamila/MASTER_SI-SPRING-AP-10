package MASTER_SISPRING.AP10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import patient.Patient;
import patient.PatientRepository;

@SpringBootApplication
//@EnableMongoRepositories

//TODO implements CommandLineRunner
public class Ap10Application implements CommandLineRunner{
	
	@Autowired//(required = false) 
	PatientRepository patientRepo;
	
	public static void main(String[] args) { SpringApplication.run(Ap10Application.class, args);}
	   @Override
	   public void run(String... strings) throws Exception{	System.out.println("Application Started !!");

			List<Patient> patients = patientRepo.findAll();
			patients.forEach(p->System.out.println(p));
			
		}
}