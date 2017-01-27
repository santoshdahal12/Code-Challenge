/**
 * 
 */
package santosh.dahal.tensubstring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import santosh.dahal.tensubstring.service.TenSubstringService;

/**
 * @author santosh dahal
 *
 */
@Controller
public class TenSubstringController {
	@Autowired
	TenSubstringService tenSubstringService;

	@RequestMapping("/")
	public String login(Model model) {
		return "index";
	}

	@RequestMapping(value = "/getnumber", method = RequestMethod.GET)
	public @ResponseBody List<Integer> removeFromCart(@RequestParam("number") String number) {
		System.out.println("I am here");
		
		return tenSubstringService.getTenSubString(number);

	}
}