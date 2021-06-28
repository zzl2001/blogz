select * from other;
drop table if exists `other`;

drop table if exists `test`;
create table `test` (
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    `password` varchar(50) comment '密码',
    primary key (`id`)
) engine=innodb default charset=utf8mb4
  comment='名称';

insert into `test` (id, name, password) values (1, '测试', 'password');

# 电子书表
drop table if exists `ebook`;
create table `ebook`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    `category1_id` bigint comment '分类1',
    `category2_id` bigint comment '分类2',
    `description` varchar(200) comment '描述',
    `cover` varchar(200) comment '封面',
    `doc_count` int comment '文档数',
    `view_count` int comment '阅读数',
    `vote_count` int comment '点赞数',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='电子书';

insert into `ebook` (id, name, description) values (1, 'Spring boot 教程', '入门');
insert into `ebook` (id, name, description) values (2, 'Vue 教程', '入门');
insert into `ebook` (id, name, description) values (3, 'Python 教程', '入门');
insert into `ebook` (id, name, description) values (4, 'Mysql 教程', '入门');
insert into `ebook` (id, name, description) values (5, 'Oracle 教程', '入门');
