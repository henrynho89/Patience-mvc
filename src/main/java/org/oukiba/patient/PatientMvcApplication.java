package org.oukiba.patient;

import java.util.Date;

import org.oukiba.patient.dao.PatienceRepository;
import org.oukiba.patient.entities.Patience;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PatientMvcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PatientMvcApplication.class, args);
		PatienceRepository patienceRepository = ctx.getBean(PatienceRepository.class);
		{
			Patience patience = new Patience();
			patience.setDateNaissance(new Date());
			patience.setMalade(true);
			patience.setName("AS A");
			patience.setScore(20);
			patienceRepository.save(patience);
		}
		{
			Patience patience = new Patience();
			patience.setDateNaissance(new Date());
			patience.setMalade(false);
			patience.setName("AB B");
			patience.setScore(20);
			patienceRepository.save(patience);
		}
		{
			Patience patience = new Patience();
			patience.setDateNaissance(new Date());
			patience.setMalade(true);
			patience.setName("FD G");
			patience.setScore(20);
			patienceRepository.save(patience);
		}
		{
			Patience patience = new Patience();
			patience.setDateNaissance(new Date());
			patience.setMalade(false);
			patience.setName("RA F");
			patience.setScore(20);
			patienceRepository.save(patience);
		}
		{
			Patience patience = new Patience();
			patience.setDateNaissance(new Date());
			patience.setMalade(true);
			patience.setName("SA V");
			patience.setScore(20);
			patienceRepository.save(patience);
		}
		
		patienceRepository.findAll().forEach(p->{
			System.out.println(p.getName());
		});
	}

}
