// **** Note ****
// To fix "com.google" "Gson cannot be resolved" bugs:
// create a "lib" folder, same level as "src" folder
// download and move this file into `lib/` gson-2.10.1.jar

package ca.annacl.tasktracker.control;

import ca.annacl.tasktracker.model.Task;
import ca.annacl.tasktracker.view.AppView;
import com.google.gson.*;

import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;

public class AppController {
    private final List<Task> taskList = new ArrayList<>();
    private AppView view;

    public AppController(AppView view){
    // public AppController(Task task, AppView view){
        this.view = view;
        this.view.viewButtonListener(new TaskListener());
    }

    class TaskListener implements ActionListener, ItemListener{
        @Override
        public void actionPerformed(ActionEvent e){

        }

        @Override
        public void itemStateChanged(ItemEvent e){

        }
    }


}
