package ca.annacl.tasktracker.model;

import java.util.GregorianCalendar;

public class Task {
    String taskName;
    String notes;
    GregorianCalendar dueDate;
    Boolean completed;

    public Task(){
        completed = false;
    }

    public String getTaskName(){
        return taskName;
    }

    public String getNotes(){
        return notes;
    }

    public GregorianCalendar getDueDate(){
        return dueDate;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    @Override
    public String toString(){
        return "" ;
    }
}
