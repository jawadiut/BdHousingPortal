package net.therap.controller;

import net.therap.domain.FlatOwner;
import net.therap.domain.User;
import net.therap.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * User: ashraf
 * Date: 6/4/12
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/login.htm")
public class LoginController {

     private static final Logger log = LoggerFactory.getLogger(FlatOwnerRegController.class);

    @Autowired
    UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login.htm",method = RequestMethod.POST)
    public String loginAction(HttpServletRequest request,HttpServletResponse response){


        Object object = userService.getUserByEmailAndPass(request.getParameter("email"),request.getParameter("password"));

        if(object == null){


           return "redirect:"+request.getHeader("Referer") + "?errorcode=1";
        }
        else {

           return "welcome";
        }
     }

}