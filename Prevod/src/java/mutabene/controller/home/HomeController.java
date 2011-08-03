/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import mutabene.manager.TodoManager;



/**
 *
 * @author stenlik
 */
@Controller
public class HomeController {
    
    @RequestMapping(value="/index.htm", method=RequestMethod.GET)
    public String index() throws Exception{
        return "Home/index";
    }
            
    @RequestMapping(value="/about.htm", method=RequestMethod.GET)
    public String about() throws Exception{
        return "Home/about";
    }
}
