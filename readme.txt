һ.�ֶ�����oracle��
1.׼����һ��ƥ�����ݿ��oracle����(oracle��װĿ¼��Ҳ��),���ڴ˴�����������D��software\oracleDrivers�ļ����£��������õ���ojdbc6,���ݸ���ʹ�����ݿⲻͬ,����׼����ͬ�汾������

2.�ڱ��زֿ����ú���������汾
�����������:��cmd,�����������ִ��:
mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.1.0 -Dpackaging=jar -Dfile=D:\software\oracleDrivers\ojdbc6.jar
�����Ҹ��ұ��ص�ojdbc6.jar���õ���11.2.0.1.0�汾

3.pom.xml�������
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

��.IDEA�Զ�����ʵ����entity
���File�������Ĳ˵��е��Project Structure��
�������Modules���ٵ����+���ţ����ڵ����Ĳ˵���ѡ��Hibernate��
����ʱ����Ŀ�ж����һ��Hibernate�����Hibernate���ٵ����+���ţ�ѡ��hibernate.hbm.xml��