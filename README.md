这是一个逆向生成工具
我加了一个小功能，获取所有表名直接复制粘贴就好了，节省时间

下面是操作流程：

你需要在CodeGenerator里修改数据库名与账号密码

        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/seckill?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia"+"/Shanghai");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);
        
同样你需要在getTableNam里修改数据库名与账号密码
        
        String url = "jdbc:mysql://localhost:3306/seckill";
        String username = "root";
        String password = "123456";
