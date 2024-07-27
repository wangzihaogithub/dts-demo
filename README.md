# dts-demo

#### 介绍
数据同步 
- 延迟低至5ms（修改数据库至elasticsearch可以搜索到）
- 支持 同步elasticsearch-Nested字段，会收集sql的join相关表，自动反向更新，支持自定义处理字段，解析url转换为文本
- 支持 直连数据库binglog，支持redis记忆offset，不丢binlog
- 支持 连阿里云-kafka-binlog
- 支持 自定义监听
- 支持 将Row变更转化为SQL语句对象
- 支持 报警消息


### 代码例子 demo如下

https://github.com/wangzihaogithub/dts-demo


### 源码地址如下

https://github.com/wangzihaogithub/dts

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.wangzihaogithub/dts/badge.svg)](https://search.maven.org/search?q=g:com.github.wangzihaogithub%20AND%20a:dts)

```xml
<!-- https://github.com/wangzihaogithub/dts -->
<!-- https://mvnrepository.com/artifact/com.github.wangzihaogithub/dts -->
<dependency>
  <groupId>com.github.wangzihaogithub</groupId>
  <artifactId>dts</artifactId>
  <version>1.1.4</version>
</dependency>
```
    
-  1.仅导入上面的maven包就行
        

 - 启动springboot 项目用mysql执行SQL： show processlist， 即可看到 binlog dump 线程已启动

