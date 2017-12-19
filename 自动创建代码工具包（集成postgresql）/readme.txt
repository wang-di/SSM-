打开控制台，进入当前目录，执行以下脚本：
java -jar mybatis-generator-core-1.3.5.jar -configfile generatorConfig.xml -overwrite

其中有mybatis框架的jar包，数据库驱动程序jar包以及MyBatis生成器jar包。其中的generatorConfig.xml是需要我们来配置的文件

这样在生成之后，就可以在src目录下找到相应的文件夹，每个表格都会对应三个文件（实体类、接口、配置文件）。

出现的问题：
1.如果报xml文件有问题，就用记事本将xml文件另存为ANSI格式
2.在配置postgresql时，主要是驱动的问题，目前下了三个驱动，jre6、jre7和以上的，jre6经过测试没有问题，7及以上没有测试

版本1.0
  支持mysql数据库
版本1.1
  支持postgresql数据库