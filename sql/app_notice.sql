CREATE TABLE `app_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `order_sn` varchar(50) NOT NULL COMMENT '订单唯一编号',
  `send_time` datetime NOT NULL,
  `addressee_name` varchar(20) NOT NULL COMMENT '收件人',
  `addressee_zip_code` varchar(10) DEFAULT NULL COMMENT '收件人邮编',
  `addressee_address` varchar(50) NOT NULL COMMENT '收件人地址（必填）',
  `addressee_phone` varchar(15) DEFAULT NULL COMMENT '收件人电话（纸质必填）',
  `sender_name` varchar(20) NOT NULL COMMENT '寄件人',
  `sender_zip_code` varchar(10) DEFAULT NULL COMMENT '寄件人邮编',
  `sender_address` varchar(20) DEFAULT NULL COMMENT '寄件人地址',
  `sender_phone` varchar(15) DEFAULT NULL COMMENT '寄件人电话',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `app_notice_order_sn` (`order_sn`),
  KEY `app_notice_send_time` (`send_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='通知渠道表';

