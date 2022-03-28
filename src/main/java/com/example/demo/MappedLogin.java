package com.example.demo;

import com.example.demo.model.Login;
import com.example.demo.model.Posting;
import com.opencsv.*;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.*;

// Класс запускает некоторый функционал при запуске приложения Java.
// В нашем случае - распарсить файл в некоторые объекты.

@Component
public class MappedLogin implements ApplicationRunner {
    private static ColumnPositionMappingStrategy setLoginColumMapping()
    {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Login.class);
        String[] columns = new String[] {"Application", "AppAccountName", "IsActive", "JobTitle", "Department"};
        strategy.setColumnMapping(columns);
        return strategy;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        CsvToBean loginCsv = new CsvToBean();
        String loginFilePath = new ClassPathResource("logins.csv").getFile().getPath();
        CSVReader loginReader = new CSVReader(new FileReader(loginFilePath));
        loginCsv.setCsvReader(loginReader);
        loginCsv.setMappingStrategy(setLoginColumMapping());
        List loginsList = loginCsv.parse();
        for (Object object : loginsList) {
            Login login = (Login) object;
            System.out.println(login.toString());
        }

        String file = new ClassPathResource("postings.csv").getFile().getPath();
        BufferedReader csvReader = new BufferedReader(new FileReader(file));
        String row;
        ArrayList<String> data = new ArrayList<>();
        while ((row = csvReader.readLine()) != null) {
            data.add(row);
        }
        csvReader.close();
        String[] keys = data.get(0).split(";	");
        Map<Integer, Map> allrows = new HashMap<Integer, Map>();
        for (int i = 1; i < data.size(); i++) {
            Map<String, String> states = new HashMap<String, String>();
            String[] values = data.get(i).split(";\t");
            if (values.length > 1){
                int length = keys.length;
                for (int j = 0; j < length; j ++) {
                    states.put(keys[j], values[j]);
            }
                allrows.put(i - 1, states);
                Posting posting = new Posting();
                posting.fromMap(states);
                System.out.println(posting.toString());
            }
        }
    }
}