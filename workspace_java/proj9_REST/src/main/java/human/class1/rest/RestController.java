package human.class1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
//@RestController = @Controller + @ResponseBody 이거다~
@RequestMapping("/human") // HandlerMapping에서 처리

public class RestController {
	
	@RequestMapping("/test1") //HandlerAdaptor에서 처리
	public int test1() {
		return 100;
	}
	
	@RequestMapping("/test2")
	public String test2() {
		return "ajax";
	}
}
