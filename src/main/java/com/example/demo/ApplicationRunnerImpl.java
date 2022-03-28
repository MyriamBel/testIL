//package com.example.demo;
//
//import com.opencsv.CSVReader;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
//import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
//
//import java.io.Reader;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class ApplicationRunnerImpl implements ApplicationRunner {
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//        System.out.println("ApplicationRunnerImpl Called");
//
//        Connection conn= DriverManager.getConnection("jdbc:mySql://localhost:3306/mydatabases?serverTimezone=GMT%2B8", "root", "root");
//        Statement statement=conn.createStatement();
//
//        String filePath = new ClassPathResource("logins.csv").getFile().getPath();
//        System.out.println("File Path: "+filePath);
//        CSVReader csvReader = new CSVReader(reader);
//        List<String[]> list = new ArrayList<>();
//        list = csvReader.readAll();
//        reader.close();
//        csvReader.close();
//        System.out.println("LisT: " + list);
//        return list;
//
//    }
//
//    public List<String[]> readAll() throws Exception {
//        Connection conn= DriverManager.getConnection("jdbc:mySql://localhost:3306/mydatabases?serverTimezone=GMT%2B8", "root", "root");
//        Statement statement=conn.createStatement();
//
//        String filePath = new ClassPathResource("logins.csv").getFile().getPath();
//        System.out.println("File Path: "+filePath);
//        CSVReader csvReader = new CSVReader(reader);
//        List<String[]> list = new ArrayList<>();
//        list = csvReader.readAll();
//        reader.close();
//        csvReader.close();
//        System.out.println("LisT: " + list);
//            return list;
//    }
//
////	Connection conn=DriverManager.getConnection("jdbc:mySql://localhost:3306/mydatabases?serverTimezone=GMT%2B8", "root", "root");
////	Statement statement=conn.createStatement();
////	String path="D:\\databases\\IT_shenzhen.csv";
////	CsvReader reader=new CsvReader(path,',',Charset.forName("gbk"));
////	String name=new BufferedReader(new FileReader(new File(path))).readLine();
////	// имя - это имя столбца таблицы
////		reader.readHeaders();
////	int len=reader.getHeaders().length;
////	// len означает, что есть несколько столбцов
////		 while (reader.readRecord ()) {// Все while нужно собрать в форму оператора вставки
////		String tmp="insert into recruitment_form("+name+")values("+reader.get(0);
////		for(int i=1;i<len-1;i++){
////			tmp+=","+"'"+reader.get(i).replaceAll("'", "\\\\'")+"'";
////		}
////		tmp+=","+"'"+reader.get(len-1).replaceAll("'", "\\\\'")+"');";
////		// tmp - это собранный оператор вставки, а именно вставка в talble (атрибут) values ​​(content);
////		statement.execute (tmp); // Выполняем вставку
////	}
////		reader.close();
////		statement.close();
////		conn.close();
////}
//}
//
//@Component
//public class ApplicationRunnerImpl implements ApplicationRunner {
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//        System.out.println("ApplicationRunnerImpl Called");

//
////print all arguemnts: arg: status=running, arg: --mood=happy, 10, --20
//        for (String arg : args.getSourceArgs()) {
//            System.out.println("arg: "+arg);
//        }
//        System.out.println("NonOptionArgs: "+args.getNonOptionArgs()); //[status=running,10]
//        System.out.println("OptionNames: "+args.getOptionNames());  //[mood, 20]
//
//        System.out.println("Printing key and value in loop:");
//        for (String key : args.getOptionNames()) {
//            System.out.println("key: "+key);     //key: mood  //key: 20
//            System.out.println("val: "+args.getOptionValues(key)); //val:[happy] //val:[]
//        }
//    }
//}