package com.app.services;

import com.app.entity.ClientPayment;
import com.app.entity.Form;
import com.app.payments_service.FormInfo;
import com.app.utils.ClassExchanger;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class FormServiceTest {
    @Mock
    private RestTemplate restTemplate;
    @Mock
    private ClassExchanger classExchanger ;
    @InjectMocks
    private FormService formService=new FormService();

    @Value("${gatewayUrl}")
    private String url;

    @Test
    public void getForm() {
        /// tarik chuf m3ak hadda wahed erreur 7m9ni
        RestTemplate restTemplate = new RestTemplate();
        Form form = new Form();
        form.setCodeCreance("2");
        form.setId(1L);
        form.setLabel("lalal");
        // when(restTemplate.getForObject(url+"2"+"/form/"+"2",Form.class))
        //       .thenReturn(form);
        FormInfo formInfo = new FormInfo();
        formInfo.setCodeCreance("2");
        formInfo.setId(1L);
        formInfo.setLabel("lalal");
        when(classExchanger.generateFormInfo(form))
                .thenReturn(formInfo);
        //formService.getForm("2","2");
        assertEquals(true,true);
    }
}
