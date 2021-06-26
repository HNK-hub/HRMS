package kodlamaio.nortwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.nortwind.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

	
}
