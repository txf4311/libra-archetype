Maven Archetype 开发
=======

### 背景
在日常开发中，当我们需要新建项目时，如果是自己手动搭建耗时耗力还容易出现错误。所以在公司内部一般会有一套基于公司业务场景和规范的模板，
让业务开发人员节省大量的工作，减少错误，这里说的模板就是**Archetype（脚手架）**。  

说白了Archetype封装了一个项目的地基，框架师在里面集成了公司公共的开发组件和中间件，让业务开发人员更快更高效的开发业务逻辑。

[阿里云脚手架] [1]  
[Spring 官方脚手架] [2]

### 介绍Archetype
[官方文档]

Archetype是一个Maven项目的模板工具包，它定义了一类项目的基本架构。Archetype为开发人员提供了创建Maven项目的模板，
同时它也可以根据已有的Maven项目生成参数化的模板。通过Archetype，开发人员可以很方便地将一类项目的最佳实现应用到自己的项目中。
在一个Maven项目中，开发者可以通过Archetype提供的范例快速入门并了解该项目的结构与特点。

### Archetype使用

使用IDEA，File - New Project– Maven – 勾选 Create from archetype, 选择某个Archetype快速创建模板项目。  

![使用IDEA中的Archetype创建项目](IDEA.png)  

使用Maven命令，选择某个Archetype创建模板项目。  

```javascript
mvn archetype:generate
```
* 输入命令后，会出现一批Archetype列表供用户选择，输入对应的数字创建你所需要的Archetype。
* 用户输入对应的数字后，会提示输入一些基本项目参数信息，如 groupId,artifactId,version,package等。
* 完成以上操作就自动生成了一个项目骨架。

### Archetype开发
[官方介绍] 



 [1]: https://start.aliyun.com/bootstrap.html
 [2]: https://start.spring.io/
 [官方文档]: https://maven.apache.org/archetype/index.html
 [官方介绍]: https://maven.apache.org/archetype/maven-archetype-plugin/advanced-usage.html
