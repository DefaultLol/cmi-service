package com.app.batch;

import com.app.dao.CreationOpRepository;
import com.app.entity.CreationOp;
import com.app.services.ClientService;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CreationItemWriter implements ItemWriter<CreationOp> {
    @Autowired
    private CreationOpRepository creationOpRepository;

    @Autowired
    private ClientService clientService;

    @Override
    public void write(List<? extends CreationOp> list) throws Exception {
        for(CreationOp cr:list){
            if(clientService.cmiChecker(cr.getClient().getTel()) == null && cr.getStatus().equals("pending")){
                try{
                    clientService.createClient(cr.getClient());
                }
                catch(Exception e){
                    System.out.println("Creation Error");
                }
            }
            cr.setStatus("closed");
            creationOpRepository.save(cr);
        }
    }
}
