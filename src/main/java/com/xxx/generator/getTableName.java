package com.xxx.generator;

import org.springframework.stereotype.Controller;

import java.sql.*;

@Controller
public class getTableName {

    public StringBuilder getAllTableName(){
        String url = "jdbc:mysql://localhost:3306/seckill";
        String username = "root";
        String password = "123456";
        StringBuilder sb = new StringBuilder();
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            // SQL查询语句
            String sql = "SHOW TABLES";

            // 执行查询并获取结果集
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("请复制下面内容并粘贴到逆向工程里");
            System.out.println("===========================");


            int change = 0;

            while (resultSet.next()) {
                change++;
                String tableName = resultSet.getString(1);
                sb.append(tableName).append(",");

                if (change % 5 == 0) {
                    sb.append("\n");
                }
            }
            // 删除最后一个逗号
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }

            System.out.println(sb.toString());

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sb;
    }
}
