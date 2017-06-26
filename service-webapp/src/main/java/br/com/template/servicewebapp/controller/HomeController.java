/**
 * 
 */
package br.com.template.servicewebapp.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.template.servicewebapp.service.HomeService;

/**
 * @author Rudson Kiyoshi S. Carvalho - IBM
 * @data 2017-06-22
 */
@Controller
public class HomeController {
	
		private final Logger log = LoggerFactory.getLogger(this.getClass());
	
		@Autowired
		private HomeService homeService;
	
		@RequestMapping("/")
		public String home(Map<String, Object> model) {
			
			log.debug("This is a debug message");
			log.info("This is an info message");
			log.warn("This is a warn message");
			log.error("This is an error message");
			
			model.put("message", homeService.loadHomeMessage());
			
			
			return "home";
		}
	
}
