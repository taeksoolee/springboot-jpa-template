package com.nextcare_f.nextcare_f.service;

import java.util.List;

import com.nextcare_f.nextcare_f.dao.HelloRepository;
import com.nextcare_f.nextcare_f.dto.Hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HelloService {
  @Autowired
  private HelloRepository helloRepository;

  @Transactional
  public List<Hello> selectHelloList() {
    return helloRepository.findAll();
  }

  @Transactional
  public Hello insertHello(Hello hello) {
    Hello rst = helloRepository.save(hello);

    return rst;
  }
  
}
