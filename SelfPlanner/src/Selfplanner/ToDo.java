package Selfplanner;

import java.util.Arrays;
import java.util.Scanner;

public class ToDo {

    private String name, date, description, extra;
    private boolean[] complete;

    public ToDo(String name, String date, String description, String extra){
        this.name = name;
        this.date = date;
        this.description = description;
        this.extra = extra;
        complete = new boolean[3];
        Arrays.fill(complete, Boolean.FALSE);
    }

    public static void main(String[] args) {
        ToDo test = new ToDo("test", "12/11", "maak test", "in java");
        test.setDone(true);
        System.out.println(test.write());
    }

    public static ToDo read(Scanner read){
        //preparing the ToDo
        String name, date, description, extra;
        boolean[] complete = new boolean[3];
        ToDo readed;
        read.useDelimiter(",|\\n");

        //make the ToDO
        name = read.next();
        date = read.next();
        description = read.next();
        extra = read.next();
        readed = new ToDo(name, date, description, extra);

        //set the complete
        complete[0] = read.nextBoolean();
        complete[1] = read.nextBoolean();
        complete[2] = read.nextBoolean();
        return readed;
    }

    public String write(){
        String comp = Arrays.toString(complete);
        comp = comp.substring(1, comp.length()-1);
        return name + ", " + date + ", " + description + ", " + extra + ", " + comp;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", extra='" + extra + '\'' +
                ", complete=" + Arrays.toString(complete) +
                '}';
    }

    public void setBusy(boolean done){
        complete[0] = done;
    }

    public void setAlmost(boolean done){
        complete[1] = done;
    }

    public void setDone(boolean done){
        complete[2] = done;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public boolean getBusy(){
        return complete[0];
    }

    public boolean getAlmost(){
        return complete[1];
    }

    public boolean getDone(){
        return complete[2];
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getExtra() {
        return extra;
    }

    public String getName() {
        return name;
    }
}
