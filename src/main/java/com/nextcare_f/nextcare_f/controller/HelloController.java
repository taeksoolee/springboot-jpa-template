package com.nextcare_f.nextcare_f.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nextcare_f.nextcare_f.dto.Hello;
import com.nextcare_f.nextcare_f.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @Autowired
  private HelloService helloService;

  @RequestMapping("/")
  public Map<String, Object> index() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("hello", "world");
    return map;
  }

  @RequestMapping(value="/hello")
  public List<Hello> getHellos() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("hello", "world");
    return helloService.selectHelloList();
  }

  @RequestMapping(value="/hello", method=RequestMethod.POST)
  public Hello postHello(@RequestBody Hello hello) {
    // Map<String, Object> map = new HashMap<String, Object>();

    System.out.println(hello);

    // map.put("hello", "world");
    return helloService.insertHello(hello);
  }
}
