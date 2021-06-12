package com.nextcare_f.nextcare_f.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="TEST_TEST")
@Getter @Setter @ToString
public class Hello {
  @Id  
  @Column(name="IDX", nullable=false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idx;

  @Column(name="TEST_TEST", nullable=false, length=50)
  private String test;

  @Enumerated(EnumType.STRING)
  @Column(name="GENDER", columnDefinition = "enum('FEMALE', 'MALE')")
  private Gender gender;
}

enum Gender {
  FEMALE, MALE
}
