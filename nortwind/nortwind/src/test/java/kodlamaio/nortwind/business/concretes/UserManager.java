package kodlamaio.nortwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.nortwind.business.abstracts.UserService;
import kodlamaio.nortwind.dataAccess.abstracts.UserDao;
import kodlamaio.nortwind.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
