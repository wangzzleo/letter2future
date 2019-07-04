CREATE TABLE `app_customer` (
  `cust_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `cust_name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `phone` varchar(15) DEFAULT NULL COMMENT '手机号码',
  `wx_id` varchar(20) DEFAULT NULL COMMENT '微信号',
  `qq_number` varchar(20) DEFAULT NULL COMMENT 'qq号码',
  `alipay_id` varchar(20) DEFAULT NULL COMMENT '支付宝账号',
  `toutiao_id` varchar(20) DEFAULT NULL COMMENT '头条账户',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '账户状态',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`cust_id`),
  KEY `app_customer_wxid` (`wx_id`) COMMENT '微信ID索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='客户表';
