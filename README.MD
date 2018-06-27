#问题：
###数据源配置：
- application.properties
    ```
    spring.datasource.url=jdbc:sqlserver://localhost;DatabaseName=test;
    spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
    spring.datasource.username=sa
    spring.datasource.password=sa
    #需要注意的是：端口，实例，这一步浪费好久的时间
    ```
- mybatis 配置(和mysql数据库不一样)

```$xslt
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN" "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
	<properties>
		<property name="dialect" value="sqlserver"/>
	</properties>
</configuration>
```