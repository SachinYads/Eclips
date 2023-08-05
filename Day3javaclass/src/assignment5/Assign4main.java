package assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Assign4main {

 
    public static void main(String[] args) 
    {
               Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter username");
        String username = keyboard.nextLine();

        if(Assign4_map.containsKey(username))
        {
            System.out.println("Enter password");
            String password = keyboard.nextLine();

            Map<String, Assign4> user_compare = new HashMap<String, Assign4>();

            try 
            {
                Scanner data_store = new Scanner(new File("fake-people-db.txt"));

                while (data_store.hasNextLine())
                {
                    String[] split_string = data_store.nextLine().split(",");
                    split_string [4] = username;
                    split_string [5] = password;
                    Assign4 u = new Assign4(split_string);
                        user_compare.put(u.username, u);
                       
                        if(u.equals(Assign_map.get(u.username)))
                        {
                            System.out.println("Hello");
                    }
                }
                System.out.println("Incorrect password");
            } 

            catch (FileNotFoundException e)
            {
                System.out.println(e.getMessage());
            }           
        }
        else
        {
            System.out.println("That username does not exist.");
        }