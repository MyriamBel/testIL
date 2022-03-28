package com.example.demo;

import com.example.demo.model.Login;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
	}

//	Connection conn=DriverManager.getConnection("jdbc:mySql://localhost:3306/mydatabases?serverTimezone=GMT%2B8", "root", "root");
//	Statement statement=conn.createStatement();
//	String path="D:\\databases\\IT_shenzhen.csv";
//	CsvReader reader=new CsvReader(path,',',Charset.forName("gbk"));
//	String name=new BufferedReader(new FileReader(new File(path))).readLine();
//	// имя - это имя столбца таблицы
//		reader.readHeaders();
//	int len=reader.getHeaders().length;
//	// len означает, что есть несколько столбцов
//		 while (reader.readRecord ()) {// Все while нужно собрать в форму оператора вставки
//		String tmp="insert into recruitment_form("+name+")values("+reader.get(0);
//		for(int i=1;i<len-1;i++){
//			tmp+=","+"'"+reader.get(i).replaceAll("'", "\\\\'")+"'";
//		}
//		tmp+=","+"'"+reader.get(len-1).replaceAll("'", "\\\\'")+"');";
//		// tmp - это собранный оператор вставки, а именно вставка в talble (атрибут) values ​​(content);
//		statement.execute (tmp); // Выполняем вставку
//	}
//		reader.close();
//		statement.close();
//		conn.close();
//}
}
