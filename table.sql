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
  `user_id` int(10) NOT NULL primary key AUTO_INCREMENT COMMENT '表Id',
  `user_code` int(10) NOT NULL  COMMENT '用户登录账号(系统生产)',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `user_sex` varchar(2)  COMMENT '用户sex',
  `user_head_portrait` varchar(20) NOT NULL COMMENT '用户头像',
  `user_birthday` DATE  COMMENT '用户birthday' ,
  `user_password` varchar(200) DEFAULT NULL COMMENT '登录密码',
  `user_real_name` varchar(20) DEFAULT NULL COMMENT '用户真实姓名',
  `user_id_card` varchar(18) DEFAULT NULL COMMENT '用户身份证',
  `user_mobile` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `user_email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `user_qq` INTEGER(14)  COMMENT '用户qq',
  `user_wechat` varchar(15)  COMMENT '用户wechat',
  `user_type` INTEGER(2) comment '用户类型',
  `user_status` VARCHAR(1) comment '用户状态N或者Y(是否处于冻结状态)',
  `user_activity` VARCHAR(1) comment '用户状态N或者Y(是否登录)',
  `user_creation_date` DATE comment '用户创建日期',
  `user_created_by` varchar(100) comment '用户创建人',
  `user_last_update_date` DATE comment '用户修改日期',
  `user_last_updated_by` VARCHAR(15) comment '用户创建人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment'登录用户表';


-- ----------------------------
-- Table structure for 客户地址
-- ----------------------------
DROP TABLE IF EXISTS `SYS_CUSTOMER_ADDRESS`;
CREATE TABLE `SYS_CUSTOMER_ADDRESS` (
  `address_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '客户地址表id',
  `address_code` INTEGER(11) NOT NULL COMMENT '客户地址编号',
  `user_code` INTEGER(11) NOT NULL COMMENT '用户code(账号)',
  `user_address` VARCHAR (255) DEFAULT NULL COMMENT '用户地址'
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
  `user_cash_details` DECIMAL NOT NULL COMMENT '交易详情记录(具体做了什么)',
  `transaction_operation_time` DATE NOT NULL comment '资产操作时间(包括查看等等)',
  `transaction_operation_ip` DATE NOT NULL comment '资产操作ip',
  `transaction_operation_address` DATE NOT NULL comment '资产操作地址',
  `transaction_time` DATE NOT NULL comment '资产交易时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '交易记录表';




