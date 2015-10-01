package com.pineone.so.task;

import com.pineone.so.domain.VirtualDeviceControlMessage;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.xml.transform.Result;

/**
 * Created by use on 2015-10-01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDeviceControl {

    @Autowired private WebApplicationContext wac;
    @Autowired private ObjectMapper objectMapper;

    private MockMvc mock;

    private VirtualDeviceControlMessage test;

    @Before
    public void setUp() throws Exception{
        this.mock = MockMvcBuilders.webAppContextSetup(wac).build();
        test = new VirtualDeviceControlMessage();
        test.setId("JUNIT_ID_TEST");
    }

    public ResultActions getResultActions(Object object) throws Exception{
        return mock.perform(MockMvcRequestBuilders.post("/so/controlmessage")
        .contentType(MediaType.APPLICATION_JSON)
        .content(objectMapper.writeValueAsString(object)));
    }

    @Test
    public void testMock() throws Exception{
        ResultActions resultActions = getResultActions(test);
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
    }



}
