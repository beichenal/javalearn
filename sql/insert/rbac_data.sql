use mybatis;

INSERT INTO sys_user VALUES (1,'admin','123456','admin@mybatis.tk','管理员',NULL,current_timestamp);
INSERT INTO sys_user VALUES (1001,'test','123456','test@mybatis.tk','测试用户',NULL,current_timestamp);

INSERT INTO sys_role VALUES (1,'管理员',1,1,current_timestamp);
INSERT INTO sys_role VALUES (2,'普通用户',1,1,current_timestamp);

INSERT INTO sys_user_role VALUES (1,1);
INSERT INTO sys_user_role VALUES (1,2);
INSERT INTO sys_user_role VALUES (1001,2);

INSERT INTO sys_privilege VALUES (1,'用户管理','/users');
INSERT INTO sys_privilege VALUES (2,'角色管理','/roles');
INSERT INTO sys_privilege VALUES (3,'系统日志','/logs');
INSERT INTO sys_privilege VALUES (4,'人员维护','/persons');
INSERT INTO sys_privilege VALUES (5,'单位维护','/companies');

INSERT INTO sys_role_privilege VALUES (1,1);
INSERT INTO sys_role_privilege VALUES (1,2);
INSERT INTO sys_role_privilege VALUES (1,3);
INSERT INTO sys_role_privilege VALUES (2,4);
INSERT INTO sys_role_privilege VALUES (2,5);