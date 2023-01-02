/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUsers;

import java.util.ArrayList;

/**
 *
 * @author shoeep
 */
public class ImpUsers extends User implements UserType<User> {

    static ArrayList<User> user;
    private static ImpUsers impUsers;

    private ImpUsers() {

    }//cant create object from any where out this class

    public static ImpUsers getImpUsers() {//create one object fro all project
        if (impUsers == null) {//chick user is create before 
            user = new ArrayList<>();
            impUsers = new ImpUsers();
        }
        return impUsers;
    }

    public boolean chickUsers(String userName) {//chick user
        for (User in : user) {
            if (userName.equals(in.getUserName())) {
                return false;
            }
        }
        return true;
    }

    public void showMessage() {

        System.out.println("1)      Press '1' to add new user.");
        System.out.println("2)	Press '2' to update any user.");
        System.out.println("3)	Press '3' to delete the user.");
        System.out.println("4)	Press '4' to view all users.");
        System.out.println("5)	Press '5' to view the menu again.");
        System.out.println("6)	Press '0' to exit the system.");
    }

    @Override
    public void add(User user1) {
        user.add(user1);

    }//insert object User class hire

    @Override
    public void getUsers() {
        for (User us : user) {
            if (user.isEmpty()) {

            }
            System.out.println("\tUsrName:\t" + us.getUserName() + "");
            System.out.println("\tpassword\t" + us.getPassword() + "\n");
        }

    }

    @Override
    public boolean remove(String name) {
        for (User in : user) {

            if (user.equals(in.getUserName())) {
                user.remove(in);
                return true;

            }

        }
        return false;
    }

    @Override
    public boolean update(String user1) {
        int i = 0;
        for (User in : user) {  //start for
            //user= ArrayList  in is object for assingment object 

            if (user1.equals(in.getUserName())) {

                User vo = new User();
                vo.setUserName(user1);
                vo.setPassword(in.getPassword());
                user.set(i, vo);//update in 
                return true;
            }
            i++;
        }//end for
        return false;
    }

    @Override
    public int getCount() {

        return user.size();
    }

}
