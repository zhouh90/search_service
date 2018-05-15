DROP TABLE IF EXISTS IDCARDLOATION ;

CREATE TABLE IDCARDLOATION (
  id int(10) NOT NULL COMMENT '主键',
  idcard int(6) NOT NULL COMMENT '身份证前六位',
  province varchar(255) NOT NULL,
  address varchar(765) NOT NULL COMMENT '身份证对应地址'
);