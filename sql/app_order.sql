CREATE TABLE `app_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `order_sn` varchar(50) NOT NULL COMMENT '订单唯一编号',
  `cust_id` int(11) NOT NULL COMMENT '客户id',
  `total_amount` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '总金额',
  `pay_amount` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '应付金额（实际支付）',
  `freight_amount` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '运费金额',
  `discount_amount` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '折扣金额',
  `pay_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '支付方式：0:未支付；1:支付宝；2:微信',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '订单状态(0:正在生成 ;1:等待支付; 2:已支付; 3:已作废)',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `app_oder_order_sn` (`order_sn`) COMMENT '订单编号索引',
  KEY `app_oder_cust_id` (`cust_id`) COMMENT '客户好索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单表';

