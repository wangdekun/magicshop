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
  `user_id` INTEGER(11) NOT NULL primary key AUTO_INCREMENT COMMENT '用户表id',
  `user_name` varchar(100) NOT NULL COMMENT '用户name',
  `user_nick_name` varchar(100) NOT NULL COMMENT '用户昵称',
  /*`user_birthday` date not null COMMENT '用户birthday' ,*/
  `user_sex` varchar(2) not null COMMENT '用户sex',
  `user_idcard` INTEGER(18) not null COMMENT '用户身份证账号',
  `user_mobile` varchar(30) not null COMMENT '用户mobile',
  `user_email` varchar(50) not null COMMENT '用户email',
  `user_qq` varchar(12) not null COMMENT '用户qq',
  `user_wechat` varchar(15) not null COMMENT '用户wechat',
  `user_origin` varchar(255) not null COMMENT '用户籍贯address',
  `user_address` varchar(255) not null COMMENT '用户address',
  `encrypted_user_password` varchar(100) NOT null COMMENT '用户password',
  /*`user_money` INTEGER(8) DEFAULT NULL COMMENT '用户资产',*/
  `user_creation_date` DATE comment '用户创建日期',
  `user_created_by` DATE comment '用户创建人',
  `user_last_update_date` DATE comment '用户创建日期',
  `user_last_updated_by` DATE comment '用户创建人',
/*  `user_number_createarea` VARCHAR(100) comment '用户创建位置',*/
  /*`user_start` INTEGER(2) comment '用户等级',*/
  `user_type` INTEGER(2) comment '用户类型',
  `user_status` INTEGER(2) comment '用户状态'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '用户共性表';


-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `SYS_CUSTOMER`;
CREATE TABLE `SYS_CUSTOMER` (
  `customer_id` INTEGER primary key COMMENT '客户表编号',
  `customer_code` INTEGER DEFAULT null COMMENT '客户编号',
  `user_id` INTEGER(11) NOT NULL COMMENT '用户表id',
  `customer_integral` INTEGER DEFAULT null COMMENT '客户积分',
  `cart_code` INTEGER(11) COMMENT '购物车编号',
  `customer_money_id` INTEGER(8) DEFAULT NULL COMMENT '用户资产id',
  `customer_level` VARCHAR(8) DEFAULT NULL COMMENT '用户等级',
  `customer_employee_number` VARCHAR(8) DEFAULT NULL COMMENT '用户业务员'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '客户表';

-- ----------------------------
-- Table structure for employee
-- ----------------------------

DROP TABLE IF EXISTS `SYS_EMPLOYEE`;
CREATE TABLE `SYS_EMPLOYEE` (
  `employee_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '管理员系统number' ,
  `employee_code` INTEGER(15) NOT NULL comment '员工编号',
  `user_id` INTEGER(11) NOT NULL COMMENT '用户表id',
  `department_id` INTEGER(15) NOT NULL comment '员工部门表编号',
  `employee_style` INTEGER(15) NOT NULL comment '员工类型',
  `employee_status` INTEGER(15) NOT NULL comment '员工状态',
  `employee_start` INTEGER(15) NOT NULL comment '员工等级'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '用户表';

-- ----------------------------
-- Table structure for department
-- ----------------------------

DROP TABLE IF EXISTS `SYS_DEPARTMENT`;
CREATE TABLE `SYS_DEPARTMENT` (
  `department_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '部门表id' ,
  `department_code` INTEGER(15) NOT NULL comment '部门编号',
  `employee_department_id` INTEGER(15) NOT NULL comment '员工部门编号',
  `department_name` INTEGER(15) NOT NULL comment '部门名称',
  `department_employee_count` INTEGER(15) NOT NULL comment '部门人数',
  `department_create_time` DATE NOT NULL comment '部门创建日期',
  `department_description` varchar(255) NOT NULL comment '部门描述'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '部门表';


-- ----------------------------
-- Table structure for assets
-- ----------------------------

DROP TABLE IF EXISTS `SYS_ASSETS`;
CREATE TABLE `SYS_ASSETS` (
  `assets_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '资产表id' ,
  `assets_code` INTEGER(15) NOT NULL comment '资产编号',
  `assets_money` INTEGER(15) NOT NULL comment '资产',
  `assets_password` varchar(15) NOT NULL comment '资产支付密码',
  `assets_record_id` INTEGER(15) NOT NULL comment '资产使用记录id'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '资产表';

-- ----------------------------
-- Table structure for assetrecords
-- ----------------------------

DROP TABLE IF EXISTS `SYS_ASSETSRECORDS`;
CREATE TABLE `SYS_ASSETSRECORDS` (
  `assetrecords_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '资产使用记录表id' ,
  `assets_id` INTEGER(15) NOT NULL comment '资产编号',
  `assetrecords_money` integer(15) NOT NULL comment '资产交易详情',
  `assetrecords_time` INTEGER(15) NOT NULL comment '资产交易时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '资产使用记录表';


-- ----------------------------
-- Table structure for scenicspot
-- ----------------------------

DROP TABLE IF EXISTS `SYS_SCENICSPOT`;
CREATE TABLE `SYS_SCENICSPOT` (
  `scenicspot_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '景点信息表id' ,
  `scenicspot_code` INTEGER(15) NOT NULL comment '景点编号',
  `scenicspot_name` varchar(255) NOT NULL comment '景点名',
  `scenicspot_area` varchar(255) NOT NULL comment '景点地点',
  `scenicspot_spend` integer(15) NOT NULL comment '景点费用',
  `scenicspot_description` integer(15) NOT NULL comment '景点描述',
  `assetrecords_tourist_account` INTEGER(15) comment '景点累购票计人数'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '景点信息表';



-- ----------------------------
-- Table structure for scenicspotpic
-- ----------------------------

DROP TABLE IF EXISTS `SYS_SCENICSPOTPIC`;
CREATE TABLE `SYS_SCENICSPOTPIC` (
  `scenicspotpic_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '景点图片表id' ,
  `scenicspot_code` INTEGER(15) NOT NULL comment '景点编号',
  `scenicspot_pic_url` varchar(255) comment '景点图片url',
  `scenicspot_pic_date` date comment '景点图片更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '景点图片信息表';


-- ----------------------------
-- Table structure for headportrait
-- ----------------------------

DROP TABLE IF EXISTS `SYS_HEADPORTRAIT`;
CREATE TABLE `SYS_HEADPORTRAIT` (
  `headportrait_id` INTEGER(11) primary key NOT NULL AUTO_INCREMENT COMMENT '景点图片表id' ,
  `headportrait_pic_url` varchar(255) comment '用户头像url',
  `headportrait_last_pic_url` varchar(255) comment '用户上次头像url',
  `headportrait_pic_date` date comment '用户头像更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '用户头像信息表';

-- ----------------------------
-- Table structure for cart
-- ----------------------------

DROP TABLE IF EXISTS `SYS_CART`;
CREATE TABLE `SYS_CART` (
  `cart_id` INTEGER(11) primary key COMMENT '购物车表id' ,
  `cart_code` INTEGER(11) COMMENT '购物车编号'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '购物车表';


-- ----------------------------
-- Table structure for cartdetail
-- ----------------------------

DROP TABLE IF EXISTS `SYS_CARTDETAIL`;
CREATE TABLE `SYS_CARTDETAIL` (
  `cartdetail_id` INTEGER(11) primary key COMMENT '购物车商品详情表表id' ,
  `cartdetail_code` INTEGER(11) COMMENT '购物车商品详情编号',
  `cart_code` INTEGER(11) COMMENT '购物车编号',
  `cartdetail_name` varchar(255) COMMENT '购物车商品名' ,
  `cartdetail_count` INTEGER(11) COMMENT '购物车商品详数目' ,
  `cartdetail_unit_Price` INTEGER(11) COMMENT '购物车商品单价'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '购物车商品详情表';




