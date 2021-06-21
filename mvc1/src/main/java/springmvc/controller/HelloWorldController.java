package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
 
 @RequestMapping("/helloWorld")
 public ModelAndView helloWorld() {
 
  String helloWorldMessage = "Hello world Assisgnment 1 Completed!";
  return new ModelAndView("helloWorld", "message", helloWorldMessage);
 }

@RequestMapping("/index")
public String index()
{
	System.out.println("this is home url");
	
	return "index";
}
}



