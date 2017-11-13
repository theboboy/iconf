# iconf
分布式的配置中心

iconf-core 实体
iconf-db 存储实体和关联关系 默认使用mysql存储
iconf-face 管理和服务接口

iconf-mysql-single 单台的mysql实现
iconf-mysql-master-slave 主从的mysql实现
iconf-redis-single 单台的redis实现
iconf-redis-sentinel 哨兵的redis实现
iconf-zookeeper zookeeper的实现

iconf-admin WEB管理平台部署 包含界面和接口 依赖iconf-db iconf-face和某种实现

iconf-server 服务端部署 依赖 iconf-face和某种实现

iconf-client-base 客户端的公共类
iconf-client-java java的客户端
iconf-client-spring-adapter-java 支持spring的java客户端 依赖iconf-client-java
iconf-client-kotlin kotlin的客户端
iconf-client-spring-adapter-kotlin 支持spring的kotlin客户端 依赖iconf-client-kotlin

iconf-client-demo 使用iconf的示例
