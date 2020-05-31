##程序猿社区

##资料
[Spring 文档](https://spring.io/guides)

[Spring web](https://spring.io/guides/gs/serving-web-content/)

[es](https://elasticsearch.cn/)

[Github deploy key](https://help.github.com/en/github/authenticating-to-github/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)

[BootStrap文档](https://v3.bootcss.com/getting-started/)

[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Spring MVC](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-handlermapping-interceptor) 

[菜鸟教程](https://www.runoob.com)

[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
##工具
[Git](https://git-scm.com/)

[Visual Paradigm](https://www.visual-paradigm.com)

[Flyway](https://flywaydb.org/getstarted/firststeps/maven)

[Lombok](https://projectlombok.org)

## 脚本
```sql
  create table USER
  (
  	ID INT auto_increment PRIMARY KEY NOT NULL,
  	ACCOUNT_ID VARCHAR(100),
  	NAME VARCHAR(50),
  	TOKEN CHAR(36),
  	GMT_CREATE BIGINT,
  	GMT_MODIFIED BIGINT
  );
``` 
```bash
 mvn flyway:migrate
```