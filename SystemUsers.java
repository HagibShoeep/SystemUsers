/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUsers;

import java.util.Scanner;

/**
 *
 * @author shoeep
 */
public class SystemUsers {

    static public void recerSiveShow() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter :");
        int chioce = input.nextInt();
        if (chioce == 1) {
            Scanner inputUserName = new Scanner(System.in);
            User user = new User();
            System.out.println("insert your UserName:");
            String UserName = inputUserName.nextLine();
            inputUserName.reset();

            while (!ImpUsers.getImpUsers().chickUsers(UserName)) {//if user is found

                Scanner inputUserName1 = new Scanner(System.in);
                System.out.println("insert your UserName agian:");
                UserName = inputUserName1.nextLine();
                inputUserName1.reset();

            }

            user.setUserName(UserName);
            System.out.println("insert your Password:");
            String Password = inputUserName.next();
            user.setPassword(Password);
            ImpUsers.getImpUsers().add(user);
            recerSiveShow();
        } else if (2 == chioce) {
            String UserName = "";
            String UserName1 = "";

            Scanner inputUserName = new Scanner(System.in);

            System.out.println("insert your UserName for update:");
            UserName = inputUserName.nextLine();//userbefore

            if (!ImpUsers.getImpUsers().chickUsers(UserName)) {
                Scanner inputUserupdate = new Scanner(System.in);
                System.out.println("insert your update  UserName  :");
                UserName1 = inputUserupdate.nextLine();
                ImpUsers.getImpUsers().update(UserName1);
                System.out.println("update sucessfuly :");

            }
            recerSiveShow();
        }//end if 2
        else if (chioce == 3) {
            Scanner inputUserName = new Scanner(System.in);
            System.out.println("insert your UserName for delete:");
            String Name = inputUserName.nextLine();
            inputUserName.reset();
            ImpUsers.getImpUsers().remove(Name);
            recerSiveShow();
        } else if (chioce == 4) {
            ImpUsers.getImpUsers().getUsers();
            recerSiveShow();
        } else if (chioce == 5) {
            ImpUsers.getImpUsers().showMessage();
            recerSiveShow();
        } else if (chioce == 0) {
            return;
        } else {
            System.out.println("incorrect is chioce");
            recerSiveShow();
        }//
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ImpUsers.getImpUsers().showMessage();  //show  info
        recerSiveShow();

    }

}
