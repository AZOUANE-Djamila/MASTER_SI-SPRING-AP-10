/**
 * @author AZOUANE DJAMILA
 *
 */
package patient;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends MongoRepository<Patient, Integer> {       
	
    //@Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
	 public List<Patient> findAll();
}
