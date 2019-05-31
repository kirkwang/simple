package main.java.com.kirk.rest;

/**
 * Created by kewang on 1/12/16.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> getAllUsers() {
        List<com.kirk.rest.User> userList = null;
        try {
            File file = new File("Users.dat");
            if (!file.exists()) {
                com.kirk.rest.User user = new com.kirk.rest.User(1, "Mahesh", "Teacher");
                userList = new ArrayList<com.kirk.rest.User>();
                userList.add(user);

            }
            else{
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                userList = (List<com.kirk.rest.User>) ois.readObject();
                ois.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
