
package com.insignia.webBookmark.controllers;

import com.insignia.webBookmark.entities.Login;
import com.insignia.webBookmark.service.BookmarkService;
import javafx.beans.binding.DoubleBinding;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Arrays;

@Controller

public class HomeController {

    // adding init binder to trim the input value to null
    // if the input value is all whitespaces in the form
    // For any request that comes to this controller, this method will execute

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("login",new Login());
        return "login";
    }

    @RequestMapping("/auth")
    public String authMe(@Valid @ModelAttribute("login") Login login, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "login";
        } else {
            model.addAttribute("books", BookmarkService.getInstance().getMyBooks());
            return "browse";
        }
    }

    @RequestMapping("/auth/logout")
    public String logout() {
        return "login";
    }

    @RequestMapping("/bookmark/mybooks")
    public String myBooks() {
        return "mybooks";
    }


}

