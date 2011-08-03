/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.controller.home;

import java.util.List;
import mutabene.manager.TodoManager;
import mutabene.model.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import mutabene.manager.TodoManager;



/**
 *
 * @author stenlik
 */
@Controller
public class HomeController {
    TodoManager todoManager;
    
    @ModelAttribute(value = "todos")
    List<Todo> getList(){
        return (List<Todo>)todoManager.getTodos("");
    }
    
    @RequestMapping(value="/index.htm", method=RequestMethod.GET)
    public String index(ModelMap model) throws Exception{
        
        return "Home/index";
    }
            
    @RequestMapping(value="/about.htm", method=RequestMethod.GET)
    public String about() throws Exception{
        return "Home/about";
    }

    public @Autowired void setTodoManager(TodoManager todoManager) {
        this.todoManager = todoManager;
    }
    
    
}
