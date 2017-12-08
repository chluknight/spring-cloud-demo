package com.cmsz.springcloud;

import net.minidev.json.JSONObject;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EurekaclientApplicationTests {
  @Autowired
  private MockMvc mvc;

  @Test
  public void contextLoads() throws Exception {
  }

  //String expectedJson;

  @SuppressWarnings("deprecation")
  @Test
  public void testDc() throws Exception {
    MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/dc"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andReturn();
    int status = mvcResult.getResponse().getStatus();
    String content = mvcResult.getResponse().getContentAsString();
    Assert.assertEquals("错误，正确返回值为200", 200, status);
    //Assert.assertEquals("错误，返回值与预期不符", expectedJson, content);
System.out.println(status+content);
  }
}
