# 信件表 信件书写每隔一定时间会自动保存，此时状态未0:正在创建 信件完成后完成创建一封信件，并创建订单

DROP TABLE if exists app_letter;
CREATE TABLE `app_letter` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `cust_id` int(11) NOT NULL COMMENT '客户ID',
  `letter_title` varchar(20) NOT NULL COMMENT '信件标题',
  `letter_content` longtext NOT NULL COMMENT '信件内容',
  `letter_source` tinyint(2) NOT NULL DEFAULT '0' COMMENT '信件来源（0：小程序 1：web端 2：支付宝小程序 3：公众号）',
  `letter_type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '信件类型(0:私密 1:公开)',
  `status` tinyint(2) NOT NULL COMMENT '信件状态 0:正在创建|1:创建完成，等待审核|2:审核通过，等待发送|3：审核拒绝|4：发送完成|5：信件作废',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `app_letter_cust_id` (`cust_id`),
  KEY `app_letter_title` (`letter_title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='信件表';

