package MASTER_SISPRING.AP10;

/**
 * @author AZOUANE DJAMILA
 *
 */

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends MongoRepository<Patient, ObjectId> {       
		 public List<Patient> findAll();
}
