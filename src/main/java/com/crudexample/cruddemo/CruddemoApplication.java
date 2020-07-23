package com.crudexample.cruddemo;

import com.crudexample.cruddemo.model.SearchChanges;
import com.crudexample.cruddemo.service.ISearchChangesService;
import com.crudexample.cruddemo.service.SearchChangesServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(CruddemoApplication.class, args);

        ISearchChangesService service = ac.getBean(SearchChangesServiceImpl.class);

//        Optional<SearchChanges> searchChanges = service.getItemChange(Long.valueOf(94846));
//        System.out.println("item: " + searchChanges.toString());
        List<SearchChanges> searchChanges = service.getAllServiceChanges();
        System.out.println("search changes: \n" + searchChanges);

//        searchChanges.
//        searchChanges.getItemId();
//        searchChanges.getUpdate_counter();
//        searchChanges.getUpdate_data();
//        searchChanges.getUpdate_flag();

    }

}
