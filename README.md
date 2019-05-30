# BankSystem
## 使用的包的版本：
Apache Struts 2.1
Spring 4.1
Hibernate 5.1 (在applicationContext.xml中我调成了4)

开发工具：
MyEclipse2017

web服务器：
Apache Tomcat 8.5

数据库：
Mysql 8.0.16

## 简介：
这是我在某公司实习期间做来练手的小项目，主要是复习一下SSH框架。Struts主要负责拦截和转发请求，Spring负责业务层的封装，Hibernate负责处理数据。一开始想使用最新的MyEclipse，可是在包的兼容性上怎么也调不好。最后赶时间换成了MyEclipse2017，很顺利的做出来了。感觉SSH的最新资料确实不多了，希望能帮到像我一样的初学者:)

## 主要功能:
1. 用户登录/退出
2. 用户注册
3. 存款/取款
4. 显示历史交易记录

## 数据库：

drop database bank;
create database bank;

create table account(
account_id int primary key AUTO_INCREMENT,
account_balance decimal(11,2) not null);

create table user(
user_id int primary key AUTO_INCREMENT,
user_name TEXT not null,
print_name TEXT not null,
user_pass TEXT not null,
account_id int not null,
foreign key(account_id) references account(account_id));

create table transactions(
trans_id int primary key AUTO_INCREMENT,
trans_user_id int not null,
trans_action TEXT not null,   
trans_value decimal(11,2) not null);

要注意的是，我这个设计是每个用户只能拥有一张卡。实际生活中，应该是一个用户对应一个账户，一个账户下存有多张卡片，用户存取款时需要选择一张卡片进行操作。因为这点我挨p了。

## 前端界面
前端使用jsp实现，但我前端太渣，不知为何无法在脚本中加载css文件，只能把配置硬写到每个控件里。


## 一些链接
配置SSH框架可以参考这个，写的很详细：
https://blog.csdn.net/xp731574722/article/details/79423246
antlr包冲突：
https://www.xuebuyuan.com/286412.html


