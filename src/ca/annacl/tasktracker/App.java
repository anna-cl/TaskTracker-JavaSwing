// * Issue: declared package "ca.annacl.tasktracker" does not match 
// the expected package "src.ca.annacl.tasktracker"
// In terminal, at project root, makdir ./vscode/
// In VS code -> command pallet -> Preferences: Open Workspace Settings (JSON) -> go to setting.json
// paste {
//  "java.project.sourcePaths": ["src"]
//}

package ca.annacl.tasktracker;

import ca.annacl.tasktracker.control.*;
import ca.annacl.tasktracker.model.*;
import ca.annacl.tasktracker.view.*;

import javax.swing.*;
import java.io.*;

public class App{
    public static void main(String[] args) throws IOException {
        
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                // Task task = new Task(null, null, null, false);
                AppView view = new AppView("*** Task Tracker ***");
                // AppController controller = new AppController(task, view);
                AppController controller = new AppController(view);
            }

        });
    
    }

}