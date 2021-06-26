package kodlamaio.nortwind.business.abstracts;

import java.util.List;

import kodlamaio.nortwind.entities.concretes.User;

public interface UserService {

	List<User> getAll();
}
