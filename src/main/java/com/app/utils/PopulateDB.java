package com.app.utils;

import com.app.dao.CreanceRepository;
import com.app.dao.CreancierRepository;
import com.app.entity.Creance;
import com.app.entity.Creancier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopulateDB {
    @Autowired
    private CreancierRepository creancierRepository;
    @Autowired
    private CreanceRepository creanceRepository;

    public void populateCreancier(){
        if(creanceRepository.findAll().size() == 0){
            // iam
            Creance iamCreance1=new Creance(null,"internet","iam1001","/endpoint");
            Creance iamCreance2=new Creance(null,"telephone","iam1002","/endpoint");
            Creance iamCreance3=new Creance(null,"fixe","iam1003","/endpoint");

            List<Creance> iamCreances=new ArrayList<>();
            iamCreances.add(iamCreance1);
            iamCreances.add(iamCreance2);
            iamCreances.add(iamCreance3);

            creanceRepository.saveAll(iamCreances);

            Creancier iamCreancier=new Creancier(null,"iam","iam1000","fournisseur",iamCreances);
            creancierRepository.save(iamCreancier);

            // inwi
            Creance inwiCreance1=new Creance(null,"internet","inwi2001","/endpoint");
            Creance inwiCreance2=new Creance(null,"telephone","inwi2002","/endpoint");
            Creance inwiCreance3=new Creance(null,"fixe","inwi2003","/endpoint");

            List<Creance> inwiCreances=new ArrayList<>();
            inwiCreances.add(inwiCreance1);
            inwiCreances.add(inwiCreance2);
            inwiCreances.add(inwiCreance3);

            creanceRepository.saveAll(inwiCreances);

            Creancier inwiCreancier=new Creancier(null,"inwi","inwi2000","fournisseur",inwiCreances);
            creancierRepository.save(inwiCreancier);

            //laydec
            Creance laydecCreance1=new Creance(null,"electricite","lydec3001","/endpoint");
            Creance laydecCreance2=new Creance(null,"eau","lydec3002","/endpoint");

            List<Creance> laydecCreances=new ArrayList<>();
            laydecCreances.add(laydecCreance1);
            laydecCreances.add(laydecCreance2);

            creanceRepository.saveAll(laydecCreances);

            Creancier radesCreancier=new Creancier(null,"lydec","lydec3000","fournisseur",laydecCreances);
            creancierRepository.save(radesCreancier);
        }
    }
}
