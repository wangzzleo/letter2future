# 订单表 信件书写完成提交后会创建订单
DROP TABLE if exists app_order;
CREATE TABLE `app_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `letter_id` int(11) NOT NULL COMMENT '信件唯一编号',
  `cust_id` int(11) NOT NULL COMMENT '客户id',
  `send_time` datetime NOT NULL COMMENT '寄信时间',
  `addressee_name` varchar(20) NOT NULL COMMENT '收件人',
  `addressee_zip_code` varchar(10) DEFAULT NULL COMMENT '收件人邮编',
  `addressee_address` varchar(50) NOT NULL COMMENT '收件人地址（必填）',
  `addressee_phone` varchar(15) DEFAULT NULL COMMENT '收件人电话（纸质必填）',
  `sender_name` varchar(20) NOT NULL COMMENT '寄件人',
  `sender_zip_code` varchar(10) DEFAULT NULL COMMENT '寄件人邮编',
  `sender_address` varchar(20) DEFAULT NULL COMMENT '寄件人地址',
  `sender_phone` varchar(15) DEFAULT NULL COMMENT '寄件人电话',
  `total_amount` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '总金额',
  `pay_amount` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '应付金额（实际支付）',
  `freight_amount` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '运费金额',
  `discount_amount` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '折扣金额',
  `pay_type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '支付方式：0:未支付；1:支付宝；2:微信',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '订单状态(0:等待支付|1:免费订单，无需支付|2:已支付|3:已作废)',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `app_oder_letter_id` (`letter_id`) COMMENT '信件唯一编号',
  KEY `app_oder_cust_id` (`cust_id`) COMMENT '客户号索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单表';