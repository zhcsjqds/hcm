/*
Navicat MySQL Data Transfer

Source Server         : Study
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : hcm

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-04-25 00:09:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for attendance_record
-- ----------------------------
DROP TABLE IF EXISTS `attendance_record`;
CREATE TABLE `attendance_record` (
  `attenid` varchar(36) NOT NULL,
  `staffid` varchar(36) DEFAULT NULL,
  `attentime` datetime DEFAULT NULL,
  PRIMARY KEY (`attenid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance_record
-- ----------------------------

-- ----------------------------
-- Table structure for attendance_statistics
-- ----------------------------
DROP TABLE IF EXISTS `attendance_statistics`;
CREATE TABLE `attendance_statistics` (
  `statid` varchar(36) NOT NULL,
  `staffid` varchar(36) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `hday` int(11) DEFAULT NULL COMMENT '本月天数',
  `sday` int(11) DEFAULT NULL COMMENT '应出勤天数',
  `oday` int(11) DEFAULT NULL COMMENT '出勤天数',
  `leave` float DEFAULT NULL COMMENT '请假天数',
  `late` int(11) DEFAULT NULL,
  `early` int(11) DEFAULT NULL,
  `holidayot` int(11) DEFAULT NULL,
  `otherot` int(11) DEFAULT NULL,
  `evection` int(11) DEFAULT NULL,
  `otpay` decimal(16,2) DEFAULT NULL,
  `other` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`statid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance_statistics
-- ----------------------------

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `departmentid` varchar(36) NOT NULL,
  `departmentname` varchar(32) DEFAULT NULL,
  `manager` varchar(32) DEFAULT NULL,
  `departmentno` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`departmentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('29a29398-7bc5-472d-95de-8b7c6ba9ab85', '生产部', null, 'SC');
INSERT INTO `department` VALUES ('7352a4cf-6e8c-48d1-810d-26c6bb4b2ea9', '保安部', null, 'BA');
INSERT INTO `department` VALUES ('86598990-2e65-44fa-bf7c-80420192f81a', '行政部', null, 'XZ');
INSERT INTO `department` VALUES ('9a85087a-6e22-4ae2-9697-0cb69ba4a17d', '人事部', null, 'RS');
INSERT INTO `department` VALUES ('9af47a5c-71ea-4ce4-8f7d-3207be8a6b15', '财务部', null, 'CW');
INSERT INTO `department` VALUES ('cb7658b7-94e9-43e3-bf29-f5c018dc375c', '销售部', null, 'XS');
INSERT INTO `department` VALUES ('d955eb7b-0e40-4ac0-9e6b-b7015c4f5d2f', 'IT部', null, 'IT');

-- ----------------------------
-- Table structure for paygrade
-- ----------------------------
DROP TABLE IF EXISTS `paygrade`;
CREATE TABLE `paygrade` (
  `paygradeid` varchar(36) NOT NULL,
  `paygradeno` varchar(16) DEFAULT NULL COMMENT '工资等级编号',
  `headship` varchar(16) DEFAULT NULL COMMENT '职务',
  `headshippay` decimal(16,2) DEFAULT NULL COMMENT '职位工资',
  `title` varchar(16) DEFAULT NULL COMMENT '职称',
  `titlewage` decimal(16,2) DEFAULT NULL COMMENT '职称工资',
  `allowance` decimal(16,2) DEFAULT NULL COMMENT '补贴',
  `paygradedescribe` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`paygradeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paygrade
-- ----------------------------

-- ----------------------------
-- Table structure for payroll
-- ----------------------------
DROP TABLE IF EXISTS `payroll`;
CREATE TABLE `payroll` (
  `payid` varchar(36) NOT NULL,
  `staffid` varchar(36) DEFAULT NULL COMMENT '职务工资,底薪',
  `paygradeid` varchar(36) DEFAULT NULL COMMENT '工资等级',
  `allowance` decimal(16,2) DEFAULT NULL COMMENT '补贴',
  `bonus` decimal(16,2) DEFAULT '0.00' COMMENT '奖金',
  `overtime` decimal(16,2) DEFAULT '0.00' COMMENT '加班费',
  `attendance` decimal(16,2) DEFAULT '0.00' COMMENT '考勤',
  `endowmentins` decimal(16,2) DEFAULT NULL COMMENT '代扣养老保险',
  `medicalins` decimal(16,2) DEFAULT NULL COMMENT '医疗保险',
  `unemploymentins` decimal(16,2) DEFAULT NULL COMMENT '失业保险',
  `housingfund` decimal(16,2) DEFAULT NULL COMMENT '住房公积金',
  `incometax` decimal(16,2) DEFAULT NULL COMMENT '个人所得税',
  `fsalary` decimal(16,2) DEFAULT NULL COMMENT '实发工资',
  `paytime` datetime DEFAULT NULL COMMENT '发放时间',
  `payway` varchar(8) DEFAULT NULL COMMENT '发放方式',
  `paystatus` varchar(8) DEFAULT NULL COMMENT '发放状态',
  `tsalary` decimal(16,2) DEFAULT NULL COMMENT '应发工资',
  PRIMARY KEY (`payid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of payroll
-- ----------------------------

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staffid` varchar(36) NOT NULL,
  `realname` varchar(32) NOT NULL COMMENT '员工姓名',
  `gender` tinyint(4) DEFAULT NULL,
  `education` varchar(8) DEFAULT NULL COMMENT '学历',
  `province` varchar(16) DEFAULT NULL COMMENT '籍贯（省）',
  `city` varchar(16) DEFAULT NULL COMMENT '籍贯（市）',
  `nation` varchar(16) DEFAULT NULL COMMENT '民族',
  `bloodtpye` varchar(8) DEFAULT NULL COMMENT '血型',
  `positionid` varchar(36) DEFAULT NULL COMMENT '职位职务',
  `departmentid` varchar(36) DEFAULT NULL,
  `entrydate` datetime DEFAULT NULL COMMENT '入职时间',
  `politicsstatus` varchar(4) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `identityid` varchar(18) NOT NULL,
  `maritalstatus` tinyint(4) DEFAULT NULL COMMENT '婚姻状况，0未婚，1已婚',
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `status` varchar(8) DEFAULT NULL COMMENT '在职状态',
  `staffno` varchar(16) DEFAULT NULL,
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `bankcard` varchar(20) DEFAULT NULL COMMENT '银行卡号',
  `title` varchar(36) DEFAULT NULL COMMENT '职称',
  PRIMARY KEY (`staffid`),
  UNIQUE KEY `no` (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------

-- ----------------------------
-- Table structure for staff_evaluation
-- ----------------------------
DROP TABLE IF EXISTS `staff_evaluation`;
CREATE TABLE `staff_evaluation` (
  `evaid` varchar(36) NOT NULL,
  `staffid` varchar(36) DEFAULT NULL,
  `evatime` datetime DEFAULT NULL,
  `performance` varchar(8) DEFAULT NULL,
  `attitude` varchar(8) DEFAULT NULL,
  `standard` varchar(8) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL COMMENT '详细评价，备注',
  PRIMARY KEY (`evaid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_evaluation
-- ----------------------------

-- ----------------------------
-- Table structure for staff_position
-- ----------------------------
DROP TABLE IF EXISTS `staff_position`;
CREATE TABLE `staff_position` (
  `positionid` varchar(36) NOT NULL,
  `positionname` varchar(16) DEFAULT NULL,
  `departmentid` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`positionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_position
-- ----------------------------
INSERT INTO `staff_position` VALUES ('1660f25c-4f18-4c53-97d3-ff2653efb9a3', '保安部经理', '7352a4cf-6e8c-48d1-810d-26c6bb4b2ea9');
INSERT INTO `staff_position` VALUES ('441bb7d0-4127-44aa-92dd-332c19c5f152', '程序员', 'd955eb7b-0e40-4ac0-9e6b-b7015c4f5d2f');
INSERT INTO `staff_position` VALUES ('5c35d7d6-e9e2-46fc-8160-011887d3a2f2', '财务经理', '9af47a5c-71ea-4ce4-8f7d-3207be8a6b15');
INSERT INTO `staff_position` VALUES ('75f487fe-b953-41d7-92f7-5df3d479083c', '福利专员', '9a85087a-6e22-4ae2-9697-0cb69ba4a17d');
INSERT INTO `staff_position` VALUES ('7cce81c2-32b8-4290-8374-6924a280cfc3', '销售专员', 'cb7658b7-94e9-43e3-bf29-f5c018dc375c');
INSERT INTO `staff_position` VALUES ('7ffbcf32-628f-4862-b69e-3f64c960c5dc', '出纳', '9af47a5c-71ea-4ce4-8f7d-3207be8a6b15');
INSERT INTO `staff_position` VALUES ('9f621efc-cc7d-40bb-8cd8-60b16fdfc74b', '销售部经理', 'cb7658b7-94e9-43e3-bf29-f5c018dc375c');
INSERT INTO `staff_position` VALUES ('c4387949-e85f-4fdd-a736-cb25550e7cfa', '人事经理', '9a85087a-6e22-4ae2-9697-0cb69ba4a17d');
INSERT INTO `staff_position` VALUES ('cf4d7604-52da-4e17-86a4-a14da63b9823', '会计', '9af47a5c-71ea-4ce4-8f7d-3207be8a6b15');
INSERT INTO `staff_position` VALUES ('d71f0462-ebc5-4a77-b597-08299b608d9f', '招聘专员', '9a85087a-6e22-4ae2-9697-0cb69ba4a17d');
INSERT INTO `staff_position` VALUES ('ec5cf507-7d8a-4af2-82a5-7897840002b1', '保安', '7352a4cf-6e8c-48d1-810d-26c6bb4b2ea9');
INSERT INTO `staff_position` VALUES ('edc4fe41-606a-4c09-8fd3-4fef4f9760a9', 'IT部经理', 'd955eb7b-0e40-4ac0-9e6b-b7015c4f5d2f');
INSERT INTO `staff_position` VALUES ('fa4abdc8-f02f-49fd-b316-28e2932ed81f', '人事专员', '9a85087a-6e22-4ae2-9697-0cb69ba4a17d');

-- ----------------------------
-- Table structure for staff_reward
-- ----------------------------
DROP TABLE IF EXISTS `staff_reward`;
CREATE TABLE `staff_reward` (
  `awardid` varchar(36) NOT NULL,
  `staffid` varchar(36) DEFAULT NULL,
  `awardtype` varchar(50) DEFAULT NULL,
  `awardreason` varchar(255) DEFAULT NULL,
  `awardresult` varchar(255) DEFAULT NULL,
  `awardamount` decimal(16,2) DEFAULT NULL COMMENT '奖金，罚金',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`awardid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_reward
-- ----------------------------

-- ----------------------------
-- Table structure for staff_train
-- ----------------------------
DROP TABLE IF EXISTS `staff_train`;
CREATE TABLE `staff_train` (
  `trainid` varchar(36) NOT NULL,
  `staffid` varchar(36) DEFAULT NULL,
  `traintype` varchar(16) DEFAULT NULL,
  `starttime` datetime DEFAULT NULL,
  `endtime` datetime DEFAULT NULL,
  `traingrade` varchar(4) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`trainid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_train
-- ----------------------------

-- ----------------------------
-- Table structure for staff_transfer
-- ----------------------------
DROP TABLE IF EXISTS `staff_transfer`;
CREATE TABLE `staff_transfer` (
  `transid` varchar(36) NOT NULL,
  `staffid` varchar(36) DEFAULT NULL,
  `lastdepartment` varchar(36) DEFAULT NULL,
  `lastjob` varchar(36) DEFAULT NULL,
  `transreason` varchar(255) DEFAULT NULL,
  `transtime` datetime DEFAULT NULL,
  `newdepartment` varchar(36) DEFAULT NULL,
  `newjob` varchar(36) DEFAULT NULL,
  `applicant` varchar(36) DEFAULT NULL COMMENT '申请人',
  `approver` varchar(36) DEFAULT NULL COMMENT '审批者',
  PRIMARY KEY (`transid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_transfer
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` varchar(36) NOT NULL COMMENT 'id',
  `username` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `roleid` varchar(36) NOT NULL COMMENT '角色（权限）',
  `locked` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户是否被锁定：0-未锁定，1锁定',
  `uicon` varchar(255) DEFAULT NULL COMMENT '头像资源地址',
  `email` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `createdate` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('d0af49eb-f122-4460-b5f6-c6809c911438', 'root', '2d587b5384e075eacd3bf9d4046d1295', '1', '0', null, null, '2018-04-20 19:31:30');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `roleid` varchar(36) NOT NULL,
  `rolename` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
