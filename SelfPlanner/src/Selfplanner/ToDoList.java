package Selfplanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    ArrayList<ToDo> list = new ArrayList<ToDo>();

    public ToDoList() {
    }

    public void add(ToDo toAdd){
        list.add(toAdd);
    }

    public ToDoList read(String filename) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(filename));
        ToDoList readed = new ToDoList();
        while(sc.hasNext()){
            ToDo temp = ToDo.read(sc);
            readed.add(temp);
        }
        sc.close();
        return readed;
    }
}
