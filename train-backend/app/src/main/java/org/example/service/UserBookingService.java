package org.example.service;
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;

public class UserBookingService {

	private User user;
	private List<User> userList; //list of users
	//used for json processing
	//used to convert java objects into json
	//used to convert JSON to java objects
	private ObjectMapper objectMapper = new ObjectMapper();
	private static final String USER_PATH = "../localDb/users.json";

	//this will throw IOException if anything goes wrong
	public UserBookingService(User user) throws IOException {
		this.user = user;
		File users = new File(USER_PATH); //creating a file object representing the path.
		//read value is a method of ObjectMapper that is used to read the JSON object and convert it into JAVA object
		//TypeReference<List<User>> specifies that the JSON should be mapped to a List user
		//Typereference is used... because of type erasures in java.. 
		//basically after compilation java doesnt know whats the type of the object...
		//so we use Typerefreferance to retain the information
		//so objectMapper will read the value inside the users(JSON).. and enusre that it is a list of User
		userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
	}

  //stream -> is used in declarative, functional and parallelized way
  public Boolean loginUser(){
    Optional<User> foundUser = userList.stream().filter(user -> {
      return user.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPasswoord()user)
    })
  }

}
