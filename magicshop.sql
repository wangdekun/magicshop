-- ----------------------------
-- Table structure for 用户表
-- ----------------------------
DROP TABLE sys_user;/*SQL@Run*//*SkipError*/
CREATE TABLE sys_user(
    user_id INT NOT NULL AUTO_INCREMENT  COMMENT '主键 自增主键' ,
    user_code VARCHAR(32) NOT NULL   COMMENT '用户编号 用户唯一编号' ,
    user_name VARCHAR(32) NOT NULL   COMMENT '用户名 用户名(真实姓名)' ,
    user_nick_name VARCHAR(32) NOT NULL   COMMENT '用户昵称 用户昵称' ,
    user_birthday DATE    COMMENT '用户生日 用户生日' ,
    user_age INT    COMMENT '用户年龄 用户年龄(如果用户没有输入就进行后台计算)' ,
    user_status VARCHAR(1)    COMMENT '用户状态 用户状态(此处表示用户账户状态冻结之类的状态 Y表示冻结，N表示未冻结)' ,
    user_active INT    COMMENT '用户活跃状态 用户活跃状态(用户是否上线  0下线   1上线)' ,
    user_plaintext_password VARCHAR(32) NOT NULL   COMMENT '用户密码 用户密码(明码，既是真实密码)' ,
    user_encryption_cipher VARCHAR(32) NOT NULL   COMMENT '用户加密密码 用户密码(加密后)' ,
    user_tel VARCHAR(32) NOT NULL   COMMENT '用户手机号 用户手机号' ,
    user_mobile VARCHAR(32)    COMMENT '用户座机 用户座机' ,
    user_qq_number VARCHAR(32)    COMMENT '用户qq 用户qq' ,
    user_wechat_number VARCHAR(32)    COMMENT '用户微信 用户微信' ,
    user_email_number VARCHAR(32)    COMMENT '用户email 用户email' ,
    user_identity_type VARCHAR(32)    COMMENT '用户身份证件类型 用户身份证件类型(应该是枚举类型)' ,
    user_identity_number VARCHAR(32) NOT NULL   COMMENT '用户身份证号码 用户身份证号码' ,
    user_type INT    COMMENT '用户类别 用户类别(是否是会员，暂定1是会员，2不是会员)' ,
    user_kinds INT    COMMENT '用户身份类别 用户身份类别(管理员，普通员工，普通用户，暂定0是超级管理员,暂定1是员工，2是普通用户)' ,
    user_register_time DATETIME NOT NULL   COMMENT '注册时间 注册时间' ,
    user_update_time DATETIME    COMMENT '修改时间 修改时间' ,
    PRIMARY KEY (user_id)
) COMMENT = 'sys_user 用户表(客户/管理员等等)';/*SQL@Run*/

ALTER TABLE sys_user ADD INDEX user_code(user_code);/*SQL@Run*/
ALTER TABLE sys_user ADD INDEX user_name(user_name);/*SQL@Run*/
ALTER TABLE sys_user ADD INDEX user_nick_name(user_nick_name);/*SQL@Run*/
ALTER TABLE sys_user ADD INDEX user_tel(user_tel);/*SQL@Run*/
ALTER TABLE sys_user ADD INDEX user_identity_number(user_identity_number);/*SQL@Run*/
ALTER TABLE sys_user COMMENT 'sys_user';/*SQL@Run*/


-- ----------------------------
-- Table structure for 用户头像表
-- ----------------------------
DROP TABLE IF EXISTS sys_user_headimg;/*SQL@Run*//*SkipError*/
CREATE TABLE sys_user_headimg(
                               user_headimg_id INT NOT NULL AUTO_INCREMENT  COMMENT '主键 主键' ,
                               user_headimg_url VARCHAR(32)    COMMENT '头像地址 头像地址' ,
                               CREATED_TIME DATETIME    COMMENT '头像上传时间 头像上传时间' ,
                               user_code VARCHAR(32)    COMMENT '用户编码 用户编码' ,
                               PRIMARY KEY (user_headimg_id)
) COMMENT = 'sys_user_headimg 用户头像表';/*SQL@Run*/

ALTER TABLE sys_user_headimg ADD INDEX user_code(user_code);/*SQL@Run*/
ALTER TABLE sys_user_headimg COMMENT 'sys_user_headimg';/*SQL@Run*/

DROP TABLE IF EXISTS sys_address;/*SQL@Run*//*SkipError*/

-- ----------------------------
-- Table structure for 用户地址表
-- ----------------------------
CREATE TABLE  sys_address(
                          address_id INT NOT NULL AUTO_INCREMENT  COMMENT '主键 主键' ,
                          user_code VARCHAR(32)    COMMENT '用户编码 用户编码' ,
                          address_province VARCHAR(32)    COMMENT '省 省' ,
                          address_city VARCHAR(32)    COMMENT '市 市' ,
                          address_area VARCHAR(32)    COMMENT '区 区' ,
                          address_detail VARCHAR(32)    COMMENT '详细地址 详细地址' ,
                          address_type INT    COMMENT '地址类型 地址类型(0表示注册时候填写的地址，1表示物流地址)' ,
                          PRIMARY KEY (address_id)
) COMMENT = 'sys_address 用户地址表';/*SQL@Run*/

ALTER TABLE sys_address COMMENT 'sys_address';/*SQL@Run*/

-- ----------------------------
-- Table structure for 客户积分表
-- ----------------------------
DROP TABLE IF EXISTS cus_points;/*SQL@Run*//*SkipError*/
CREATE TABLE cus_points(
                         points_id INT NOT NULL AUTO_INCREMENT  COMMENT '主键 主键' ,
                         points_code VARCHAR(32)    COMMENT '积分编号 用户唯一积分编号' ,
                         points_amount INT    COMMENT '积分数量 积分数量' ,
                         user_code DATETIME    COMMENT '用户编码 用户编码' ,
                         PRIMARY KEY (points_id)
) COMMENT = 'cus_points 客户积分详情表';/*SQL@Run*/

ALTER TABLE cus_points COMMENT 'cus_points';/*SQL@Run*/

-- ----------------------------
-- Table structure for 客户积分明细表
-- ----------------------------
DROP TABLE IF EXISTS cus_integral_flow;/*SQL@Run*//*SkipError*/
CREATE TABLE cus_integral_flow(
                                integral_id INT NOT NULL AUTO_INCREMENT  COMMENT '主键 主键' ,
                                points_code VARCHAR(32)    COMMENT '积分编号 积分编号' ,
                                integral_variation_amount INT    COMMENT '积分变动数目 积分变动数目' ,
                                points_add_or_reduce VARCHAR(1)    COMMENT '增减积分 增减积分(N表示减,Y表示加)' ,
                                integral_variation_reason VARCHAR(32)    COMMENT '积分变动原因 积分变动原因' ,
                                integral_variation_time DATETIME    COMMENT '积分变动时间 积分变动时间' ,
                                PRIMARY KEY (integral_id)
) COMMENT = 'cus_integral_flow 客户积分流动表';/*SQL@Run*/

ALTER TABLE cus_integral_flow COMMENT 'cus_integral_flow';/*SQL@Run*/

-- ----------------------------
-- Table structure for 用户登陆日志表
-- ----------------------------
DROP  TABLE IF EXISTS sys_login_log;/*SQL@Run*//*SkipError*/
CREATE TABLE sys_login_log(
                            login_id INT NOT NULL AUTO_INCREMENT  COMMENT '主键 主键' ,
                            user_code VARCHAR(32)    COMMENT '登陆用户code 登陆用户code' ,
                            login_ip VARCHAR(32)    COMMENT '登陆IP 登陆IP' ,
                            login_time DATETIME    COMMENT '用户登陆时间 用户登陆时间' ,
                            login_type INT    COMMENT '登陆类型 登陆类型：0未成功，1成功' ,
                            PRIMARY KEY (login_id)
)  COMMENT = 'sys_login_log 用户登陆日志表';/*SQL@Run*/


ALTER TABLE sys_login_log COMMENT 'sys_login_log';/*SQL@Run*/



