CREATE TABLE sys_param (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  param_key varchar(20) NOT NULL COMMENT '属性名称',
  param_value text NOT NULL COMMENT '属性值',
  remark varchar(20) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (id),
  KEY sys_param_key (param_key)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT '系统参数表';
