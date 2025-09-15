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

public class AppController {
    private final List<Task> taskList = new ArrayList<>();
    // private final AppView view;

    public AppController(Task task, AppView view){

    }



}
