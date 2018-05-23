package Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 ***************************************************
 * Created on : 10/05/2018, 09:34:42 AM; Author : Rodrigo R. Rubio Haro; Company
 * : Aguila bicefala; **************************************************
 *
 */
@Controller
public class HomeController {

    /*Por convencion el nombre del Request Mapping debe de ser igual al nombre del metodo del ModelAndView*/
    @RequestMapping("home.htm")
    public ModelAndView Home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;
    }

    /*Por convencion el nombre del Request Mapping debe de ser igual al nombre del metodo del ModelAndView*/
    @RequestMapping("Nosotros.htm")
    public ModelAndView Nosotros() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Nosotros");
        return mav;
    }

    /*Por convencion el nombre del Request Mapping debe de ser igual al nombre del metodo del ModelAndView*/
    @RequestMapping("Profile.htm")
    public ModelAndView Profile(HttpServletRequest RequestProfile) {
        String UserId;
        String HashPassword;
        
        UserId = RequestProfile.getParameter("UserId");
        HashPassword = RequestProfile.getParameter("HPass");
        if (UserId != null && HashPassword != null) {
            System.out.println("El id del usuario es:" + UserId);
            System.out.println("El has del password ingresado es:" + HashPassword);
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("UserId", UserId);
        mav.addObject("HashPassword", HashPassword);
        mav.setViewName("Profile/Profile");
        return mav;
    }

}
