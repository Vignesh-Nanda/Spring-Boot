package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class name {
//@GetMapping("/llo/{str}")
//public String Name(@PathVariable String str )
//{
//	return "Hello"+str+"!";
//}
//}
@GetMapping("/ello")
public static String Name(@RequestParam String str )
{
	return "Hello"+str+"!";
}
}
