/*
Navicat MySQL Data Transfer

Source Server         : a
Source Server Version : 50558
Source Host           : localhost:3306
Source Database       : a

Target Server Type    : MYSQL
Target Server Version : 50558
File Encoding         : 65001

Date: 2018-09-08 11:43:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for SYS_USER
-- ----------------------------

DROP TABLE IF EXISTS `SYS_USER`;
CREATE TABLE `SYS_USER` (
      `user_id` INTEGER(10) NOT NULL primary key AUTO_INCREMENT COMMENT '表Id',
      `user_code` INTEGER(10) NOT NULL  COMMENT '用户登录账号(系统生产)',
      `user_name` varchar(20) NOT NULL COMMENT '用户名',
      `user_sex` varchar(2) NOT NULL COMMENT '用户sex',
      `user_head_portrait` varchar(20) NOT NULL COMMENT '用户头像',
      `user_birthday` DATE  COMMENT '用户birthday',
      `user_password` varchar(30) DEFAULT NULL COMMENT '登录密码',
      `user_real_name` varchar(20) DEFAULT NULL COMMENT '用户真实姓名',
      `user_id_card` varchar(18) DEFAULT NULL COMMENT '用户身份证',
      `user_mobile` varchar(11) DEFAULT NULL COMMENT '手机号码',
      `user_email` varchar(25) DEFAULT NULL COMMENT '邮箱',
      `user_qq` INTEGER(14)  COMMENT '用户qq',
      `user_wechat` varchar(15)  COMMENT '用户wechat',
      `user_type` INTEGER(2) comment '用户类型',
      `user_status` VARCHAR(1) comment '用户状态N或者Y(是否处于冻结状态)',
      `user_activity` VARCHAR(1) comment '用户状态N或者Y(是否登录)',
      `user_creation_date` DATE comment '用户创建日期',
      `user_created_by` varchar(20) comment '用户创建人',
      `user_last_update_date` DATE comment '用户修改日期',
      `user_last_updated_by` VARCHAR(15) comment '用户创建人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment'登录用户表';


-- ----------------------------
-- Table structure for 客户地址
-- ----------------------------
DROP TABLE IF EXISTS `SYS_ADDRESS`;
CREATE TABLE `SYS_ADDRESS` (
       `address_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '用户地址表id',
       `address_code` INTEGER(11) NOT NULL COMMENT '用户地址编号',
       `user_code` INTEGER(11) NOT NULL COMMENT '用户code(账号)',
       `addr_province` varchar(30) DEFAULT NULL COMMENT '地址省',
       `addr_city` varchar(35) DEFAULT NULL COMMENT '地址市',
       `addr_area` varchar(45) DEFAULT NULL COMMENT '地址区',
       `addr_street` varchar(200) NOT NULL DEFAULT '' COMMENT '地址街道',
       `postal_code` int(6) DEFAULT NULL COMMENT '邮编号'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '客户地址表';

-- ----------------------------
-- Table structure for 钱包
-- ----------------------------

DROP TABLE IF EXISTS `SYS_WALLET`;
CREATE TABLE `SYS_WALLET` (
      `wallet_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '钱包Id' ,
      `wallet_code` INTEGER(11) NOT NULL comment '钱包编号',
      `user_code` INTEGER(11) NOT NULL COMMENT '用户编号',
      `user_alipay` INTEGER(11) NOT NULL COMMENT '用户支付宝账号',
      `user_paycount` INTEGER(11) NOT NULL COMMENT '用户交易账号',
      `user_wallet` DECIMAL NOT NULL COMMENT '用户余额'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '钱包表';



-- ----------------------------
-- Table structure for 交易记录
-- ----------------------------

DROP TABLE IF EXISTS `SYS_TRANSACTION_RECORD`;
CREATE TABLE `SYS_TRANSACTION_RECORD` (
      `transaction_record_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '交易记录Id' ,
      `transaction_record_code` INTEGER(11) NOT NULL comment '交易记录编号',
      `wallet_code` INTEGER(11) NOT NULL COMMENT '钱包编号',
      `user_cash_flow` DECIMAL NOT NULL COMMENT '余额增减详情',
      `user_cash_details` varchar(50) NOT NULL COMMENT '交易详情记录(具体做了什么)',
      `transaction_operation_time` DATE NOT NULL comment '资产操作时间(包括查看等等)',
      `transaction_operation_ip` varchar(20) NOT NULL comment '资产操作ip',
      `transaction_operation_address` varchar(50) NOT NULL comment '资产操作地址',
      `transaction_time` DATE NOT NULL comment '资产交易时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '交易记录表';

DROP TABLE
IF EXISTS `SYS_BRAND`;

CREATE TABLE `SYS_BRAND` (
	`brand_id` INTEGER (11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '品牌表Id',
	`brand_code` INTEGER (11) NOT NULL COMMENT '品牌编号',
	`brand_name` VARCHAR (20) NOT NULL COMMENT '品牌名称',
	`brand_url` INTEGER (8) NOT NULL COMMENT '品牌图片地址',
	`brand_initial` VARCHAR (1) NOT NULL COMMENT '品牌首字母'
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT '品牌表';

DROP TABLE
IF EXISTS `SYS_GOODS_TYPE`;

CREATE TABLE `SYS_GOODS_TYPE` (
	`goods_type_id` INTEGER (11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '商品类别表Id',
	`goods_type_code` INTEGER (11) NOT NULL COMMENT '商品类别编号',
	`goods_type_name` VARCHAR (20) NOT NULL COMMENT '商品类别名称',
	`parent_id` INTEGER (11) NOT NULL COMMENT '商品类别父类id',
	`node_type` VARCHAR (1) NOT NULL COMMENT '是否为父类节点',
	`sort_type` VARCHAR (1) NOT NULL COMMENT '排序指数即（一级节点1，二级2开头，便于分清）'
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT '商品类别表';

DROP TABLE
IF EXISTS `SYS_GOODS_SPU`;

CREATE TABLE `SYS_GOODS_SPU` (
	`goods_spu_id` INTEGER (11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '商品spu表Id',
	`goods_spu_code` INTEGER (11) NOT NULL COMMENT '商品spu编号',
	`goods_spu_name` VARCHAR (20) NOT NULL COMMENT '商品spu名称',
	`goods_spu_synopsis` VARCHAR (50) NOT NULL COMMENT '商品spu简介',
	`goods_spu_content` VARCHAR (200) NOT NULL COMMENT '商品spu详情',
	`brand_id` INTEGER (11) NOT NULL COMMENT '商品分类id',
	`goods_type_id` INTEGER (11) NOT NULL COMMENT '商品品牌id'
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT ' 商品spu（标准产品单位，比如一个iphone，与商家等等因素都无关）';

DROP TABLE
IF EXISTS `SYS_GOODS_SKU`;

CREATE TABLE `SYS_GOODS_SKU` (
	`goods_sku_id` INTEGER (11) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '商品sku表Id',
	`goods_sku_code` INTEGER (11) NOT NULL COMMENT '商品sku编号',
	`goods_sku_name` VARCHAR (20) NOT NULL COMMENT '商品sku名称',
	`goods_sku_price` DECIMAL (10,0) NOT NULL COMMENT '商品sku价格',
	`goods_spu_id` INTEGER (11)  NOT NULL  COMMENT '商品spu表Id'
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT ' 商品sku（标准产品单位，比如一个黑色16g的iphone）';




