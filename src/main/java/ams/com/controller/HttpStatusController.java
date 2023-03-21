/*
 * Copyright 2021-2022 the original author.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ams.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HttpStatusController class is a Controller which deals with the incoming HTTP Status Code Errors.
 * It handles all the error caught by the web.xml file with the help of {@link ams.com.service.HttpStatusService}.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

@Controller
public class HttpStatusController {
	
	@Autowired
	private Environment environment;
	
	/**
	 * 
	 * @param HTTP Status Code
	 * @param model for JSP
	 * 
	 * This method handles the error request and designates an appropriate error message for user with help
	 * of {@link ams.com.service.HttpStatusService} class and sets the attribute of the model to be read in JSP.
	 * 
	 * @return http-error-page.jsp
	 */
	
	@RequestMapping("/error/{code}")
	public String httpError(@PathVariable("code") Integer code, Model model) {
		if(environment.containsProperty("ERROR." + code)) {
			model.addAttribute("message", environment.getProperty("ERROR." + code));
			return "http-error-page";
		}
		model.addAttribute("message", environment.getProperty("ERROR.126"));
		return "http-error-page";
	}
}
