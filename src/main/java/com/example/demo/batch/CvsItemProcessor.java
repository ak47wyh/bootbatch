package com.example.demo.batch;

import com.example.demo.vo.Person;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

/**
 * Created by wyh on 2017/6/10.
 */
public class CvsItemProcessor extends ValidatingItemProcessor<Person> {

    @Override
    public Person process(Person item) throws ValidationException {
        super.process(item);
        if (item.getNation().equals("han")){
            item.setNation("1");
        } else {
          item.setNation("0");
        }
        return item;
    }
}
