package human.class1.rest;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   				// 클래스를 Bean으로 등록시키며 컨트롤러 앞에 붙인다
							// Bean id를 지정하지 않으면
							// class 명의 앞글자가 소문자인 bean id가 자동 지정
							// 그래서 지금은 "paramController"로 지정됨
//@Controller("beanID")		// bean id를 지정하는 방법
@ResponseBody 				// 이 class의 모든 메소드에 @ResponseBody를 붙여줌(클래스 앞에 쓸때만)
//@RestController 			// 위 두개를 한번에 써준다
@RequestMapping("human")	// 주소 앞에 공통으로 적용 
							// 이 주소로 클래스까지 들어옴(HandlerMapping)
							// 그리고 나머지 주소고 메소드 찾아감 (HandlerAdaptor)
public class ParamController {
	
//	@Autowired  // 이 타입의 변수에 넣을 수 있는
				// 동일한 class 나 자동 형변환 되는 class를 찾아서
				// 생성해주며 (IoC)변수에 넣어준다 (DI)
				// 만약 후보 클래스가 2개 이상 있다면 
				// @Primary 가 붙은 class 가 온다 
				// @Primary 가 없다면 @Qualifier("bean id") 로 특정 bean 을 지정할 수 있다
//	EmpService empservice;
	
	@RequestMapping(
			value = {"/test","/test/{key}"}, // 한개 쓸때는 중괄호 없이 그 이상은 {"",""} 사용
			method = {RequestMethod.GET, RequestMethod.PUT} // 허용하는 method 없으면 모두 허용
			)
	@ResponseBody	// json으로 돌려줌
	public EmpDTO paramTest(
			HttpServletRequest request,
			HttpServletResponse response,
			Model model,
			
			@RequestParam(value="id",required=true) String id,
			// string id = request.getParameter("id")에 해당
			// required는 기본값이 true라서 생략하면 필수 전달인자가 됨
			// 필수일때 null인 경우 400 Bad Request 발생
			// @RequestParam 생략하면
			// parameter의 key가 변수명과 동일하고 필수가 아닌경우 
			// @RequestParam 생략가능
//			@RequestParam(value="pw",required=false) String id,
			String pw,
			
			@RequestParam Map map,			// 모든 parameter를 key,value로 map에 넣어줌
			
			@ModelAttribute EmpDTO dto1,	// getParameter로 꺼내서 필드에 set해서 넣어줌
			/*
			 *	String ename = request.getParameter("ename")
			 *	EmpDTO empDTO = new EmpDTO();
			 *	empDTO.setEname(ename); 이런거 
			 */
			
			
			@ModelAttribute("dto3") EmpDTO dto2,
			// 어차피 dto2를 model에 dto3라고 넣는경우
			// 즉 , model.addAttribute("dto3",dto2)를 한번에 해줌
			@ModelAttribute("empDTO") EmpDTO dto4,
			
			// model에 넣는 key를 class명의 앞글자를 소문자로 하는 경우 생략 가능
//			@ModelAttribute("empDTO")
			EmpDTO dto5,
			
			@RequestBody EmpDTO dto6,	// post,put,delete 등으로 넘어온 json을 분석해서 dto6에 넣음
			
			@PathVariable("key") String name	// 주소 중 {key}영역의 값을 name에 할당
			
			
	) {
		return null;
	}
}
