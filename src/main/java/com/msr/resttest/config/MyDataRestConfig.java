package com.msr.resttest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Autowired
    EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){
        // Get the list of all entity classes
        Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();

        Class[] domainType = entities.stream().map(x -> x.getJavaType())
//                                                .filter(x -> x != Country.class)
                .collect(Collectors.toList())
                .toArray(new Class[0]);
        // Expose the id elements from the class
        System.out.println("Expose Ids for classes ::");

        config.exposeIdsFor(domainType);
        Arrays.asList(domainType).stream().forEach(x -> System.out.println(x));
    }
}
