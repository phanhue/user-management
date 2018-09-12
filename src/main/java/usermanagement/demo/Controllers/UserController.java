package usermanagement.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import usermanagement.demo.dao.models.User;
import usermanagement.demo.dto.UserDTO;
import usermanagement.demo.services.UserService;

import javax.servlet.http.HttpSession;
// hue.pt
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public ModelAndView index (){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;

    }

    @GetMapping(value = "/login")
    public ModelAndView login (){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        mav.addObject("user", new UserDTO());// object usser binding data
        return mav;
    }

    @PostMapping(value = "/login-process")
    public ModelAndView loginProcess (UserDTO userDTO, HttpSession session) {
        System.out.println(userDTO);
        session.setAttribute("user", userDTO);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/");// truc tiep toi home
        return mav;
    }
    @GetMapping(value ="/register")
    public ModelAndView register(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register");
        mav.addObject("userForm", new UserDTO());
        return mav;
    }
    @PostMapping(value = "/register-process")
    public ModelAndView registerProcess (UserDTO userDTO, HttpSession session) {
        System.out.println(userDTO);
        session.setAttribute("user", userDTO);
        userService.postUser(userDTO);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/");// truc tiep toi home
        return mav;
    }
//    @PostMapping(value = "/register-process")
//    public ModelAndView registerProcess(UserDTO userDTO, HttpSession session){
//        System.out.println(userDTO);
//        session.setAttribute("user", userDTO);
//        ModelAndView mav = new ModelAndView();
//        //mav.setViewName("list");
//        mav.setViewName("redirect:/");
//        return  mav;
//    }

    @GetMapping(value ="/list")
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("list");
        mav.addObject("user", new UserDTO());
        return mav;
    }

}
