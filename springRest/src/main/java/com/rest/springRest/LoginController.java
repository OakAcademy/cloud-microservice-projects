package com.rest.springRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	
	@PostMapping("/login")
	public ResponseEntity loginpost(@RequestBody LoginForm loginform)
	{
		//make Add operations with JPA
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@PostMapping("/responsetext")
	@ResponseBody
	public ResponseText changeresponsetext(@RequestBody LoginForm loginform)
	{
		//make operations
		ResponseText rtext=new ResponseText();
		rtext.setText("Response Text was changed");
		return rtext;
		
	}
}
