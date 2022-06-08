package com.npteam.apinotivis;

import com.npteam.apinotivis.controller.MateriaController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ApiNotivisApplicationTests {

  @Autowired
  private MateriaController materiaController;

  @Test
  void contextLoads() {
    assertThat(materiaController).isNotNull();
  }

}
