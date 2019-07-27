DROP TABLE if exists app_notice;
CREATE TABLE `app_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `cust_id` int(11) NOT NULL COMMENT '客户ID',
  `notice_title` varchar(20) NOT NULL COMMENT '通知标题',
  `notice_content` longtext NOT NULL COMMENT '通知内容',
  `status` tinyint(2) NOT NULL COMMENT '通知状态 0：未读|1：已读|2：已作废',
  `notice_type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '通知类型 0：普通推送|1：收信通知|2：订单状态通知',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `app_notice_cust_id` (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户通知消息表';

