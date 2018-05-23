
package Controller;

import Models.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormsController {
    
    @RequestMapping(value = "Login.htm", method = RequestMethod.GET)
    public ModelAndView Login(){
        return new ModelAndView("Login/Login", "command", new Persona(1001, "chavo0022009@gmail.com", "Rodrigo Rodolfo Rubio Haro", 18));
    }
    
    @RequestMapping(value = "SignUp.htm", method = RequestMethod.GET)
    public ModelAndView SignUp(){
        return new ModelAndView("SignUp/SignUp", "command", new Persona(1001, "chavo0022009@gmail.com", "Rodrigo Rodolfo Rubio Haro", 18));
    }
    
    @RequestMapping(value = "SignUp.htm", method = RequestMethod.POST)
    public String SignUPForm(Persona personita, ModelMap modelo){
        modelo.addAttribute("Nombre", personita.getNombre());
        modelo.addAttribute("Correo", personita.getCorreo());
        modelo.addAttribute("Edad", personita.getEdad());
        
        return "Registro Exitoso";
    }
}
