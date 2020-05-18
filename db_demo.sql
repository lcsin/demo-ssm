/*
Navicat MySQL Data Transfer

Source Server         : student
Source Server Version : 50643
Source Host           : localhost:3306
Source Database       : db_demo

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2020-05-18 12:37:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('admin', 'admin', 'admin');
