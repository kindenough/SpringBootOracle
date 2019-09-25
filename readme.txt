一.手动配置oracle库
1.准备好一个匹配数据库的oracle驱动(oracle安装目录下也有),我在此处将它放在了D盘software\oracleDrivers文件夹下，这里我用的是ojdbc6,根据个人使用数据库不同,可以准备不同版本的驱动

2.在本地仓库配置好驱动及其版本
具体操作如下:打开cmd,cd到目录D:/Program Files/JetBrains/IntelliJ IDEA 2019.1.2/plugins/maven/lib/maven3
然后输入以下命令并执行:
mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.1.0 -Dpackaging=jar -Dfile=D:\software\oracleDrivers\ojdbc6.jar
这里我给我本地的ojdbc6.jar配置的是11.2.0.1.0版本

3.pom.xml添加配置
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.2</version>
        </dependency>
        <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>ojdbc6</artifactId>
            <version>11.2.0.1.0</version>
            <scope>runtime</scope>
        </dependency>

二.IDEA自动创建实体类entity
点击File，弹出的菜单中点击Project Structure；
点击左侧的Modules，再点击“+”号，再在弹出的菜单中选择Hibernate；
在这时，项目中多出了一个Hibernate，点击Hibernate，再点击“+”号，选择hibernate.hbm.xml；
