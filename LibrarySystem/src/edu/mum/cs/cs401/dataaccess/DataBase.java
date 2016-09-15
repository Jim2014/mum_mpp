package edu.mum.cs.cs401.dataaccess;

import edu.mum.cs.cs401.entity.Book;
import edu.mum.cs.cs401.entity.Person;

/**
 * Created by 985333 on 9/13/2016.
 */
public class DataBase {
    public static DataAccess<String , Book> bookTable = new DataAccessImpl<>(); // ISBN , BOOK
    public static DataAccess<String , Person> userTable = new DataAccessImpl<>(); // ISBN , BOOK

}
