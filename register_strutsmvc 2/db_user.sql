/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : db_user

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 07/09/2017 07:52:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(25) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) DEFAULT NULL,
  `repeatPassword` varchar(25) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `gender` varchar(25) DEFAULT NULL,
  `profession` varchar(10) DEFAULT NULL,
  `hobby` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES (1, 'wenyou', '123456', '123456', 'w@1.com', '男', '学生', '运动');
INSERT INTO `t_user` VALUES (2, 'konglii', 'aaaaaa', 'aaaaaa', '1a3@a.nh', '男', '学生', '运动');
INSERT INTO `t_user` VALUES (3, 'mataii', 'qqqqqq', 'qqqqqq', 'qqqQ@xa.com', '男', '学生', NULL);
INSERT INTO `t_user` VALUES (4, 'suchengguang', 'zzzzzz', 'zzzzzz', 'zz@12.com', '男', '学生', '编程');
INSERT INTO `t_user` VALUES (5, 'wenyou', '111111', '111111', 'we@qq.com', '男', '学生', '运动');
INSERT INTO `t_user` VALUES (6, '123456', '123456', '123456', '1a3@a.nh', '男', '学生', '音乐');
INSERT INTO `t_user` VALUES (7, '111111', '111111', '111111', '1a3@a.nh', '男', '学生', '运动');
INSERT INTO `t_user` VALUES (8, '222222', '222222', '222222', '1a3@a.nh', '男', '学生', '书法');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
