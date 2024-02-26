package com.odata.controllers;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/odata")
public class ProductController {

    private final EntityManagerFactory entityManagerFactory;

    @Autowired
    public ProductController(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

//    @GetMapping("/products")
//    public String getProducts() {
//        EntityManager em = entityManagerFactory.createEntityManager();
//
//        MyODataJPAContext oDataJPAContext = new MyODataJPAContext();
//        oDataJPAContext.setEntityManagerFactory(entityManagerFactory);
//
//        ODataJPAFactory factory = ODataJPAFactoryFactory.getFactory();
//        return factory.createJPAProcessor(oDataJPAContext).getEntities("Products").execute().getBody();
//    }
}
