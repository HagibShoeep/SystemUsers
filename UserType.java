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
public interface UserType<T> {

    public void add(T user);//add class object to arraylist

    public void getUsers();//return class  opject for each 

    public boolean remove(String name);//remove object in class

    public boolean update(String t);//update opject 

    public int getCount();//return count opject in ArrayList

}
