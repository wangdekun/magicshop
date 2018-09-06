
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
create table SYS_USER
(
  user_id                       integer not null,
  user_name                     VARCHAR(100) not null,
  encrypted_foundation_password VARCHAR(100) not null,
  encrypted_user_password       VARCHAR(100) not null,
  start_date                    DATE not null,
  end_date                      DATE,
  last_logon_date               DATE,
  description                   VARCHAR(240),
  password_lifespan_days        integer,
  password_lifespan_access      integer,
  employee_id                   integer,
  customer_id                   integer,
  vender_id                     integer,
  frozen_flag                   VARCHAR(1),
  frozen_date                   DATE,
  password_start_date           DATE,
  menu_type                     VARCHAR(1) default 'L',
  last_update_date              DATE not null,
  last_updated_by               integer not null,
  creation_date                 DATE not null,
  created_by                    integer not null
)
