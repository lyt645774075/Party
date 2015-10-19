CREATE DATABASE  IF NOT EXISTS `party` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `party`;
-- MySQL dump 10.13  Distrib 5.6.24, for osx10.8 (x86_64)
--
-- Host: 127.0.0.1    Database: party
-- ------------------------------------------------------
-- Server version	5.6.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `activity`
--

DROP TABLE IF EXISTS `activity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activity` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(140) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '活动名称',
  `description` mediumtext COMMENT '活动描述',
  `enable` tinyint(4) DEFAULT '1' COMMENT '是否启用活动，默认启用',
  `beginTime` datetime DEFAULT NULL COMMENT '活动开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '活动结束时间',
  `creatorId` bigint(20) DEFAULT NULL COMMENT '活动发起者id',
  `creatorName` varchar(40) DEFAULT NULL,
  `tagList` varchar(140) DEFAULT NULL COMMENT '活动标签，逗号分隔',
  `entryFee` bigint(20) DEFAULT '0',
  `totalExpenditure` bigint(20) DEFAULT '0' COMMENT '活动总支出，单位 分',
  `totalIncome` bigint(20) DEFAULT '0' COMMENT '活动总收入，单位 分',
  `gmtCreate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `gmtModified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activity`
--

LOCK TABLES `activity` WRITE;
/*!40000 ALTER TABLE `activity` DISABLE KEYS */;
INSERT INTO `activity` VALUES (1,'','<p>dddd</p>',1,'2015-10-15 23:52:59','2015-10-15 23:53:02',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-15 23:53:16','2015-10-15 23:53:16'),(2,'ç¬¬ä¸?ä¸ªæ´»å?¨','<p><span style=\"font-weight: bold; color: rgb(255, 0, 0);\">113414</span></p>',1,'2015-10-15 23:53:35','2015-10-15 23:53:37',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-15 23:53:52','2015-10-15 23:53:52'),(3,'ç¬¬ä¸?ä¸ªæ´»å?¨','<p>111</p>',1,'2015-10-15 23:59:05','2015-10-15 23:59:07',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-15 23:59:18','2015-10-15 23:59:18'),(4,'ç¬¬ä¸?ä¸ªæ´»å?¨','<p>è¿?ä¼?ä¹±ç ?ä¸?</p>',1,'2015-10-16 00:01:45','2015-10-16 00:01:48',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-16 00:01:59','2015-10-16 00:01:59'),(5,'ç¬¬ä¸?ä¸ªæ´»å?¨','<p>ddddd</p>',1,'2015-10-16 00:20:02','2015-10-16 00:20:04',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-16 00:20:08','2015-10-16 00:20:08'),(6,'?????','<p>??</p>',1,'2015-10-16 00:30:26','2015-10-16 00:30:30',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-16 00:30:35','2015-10-16 00:30:35'),(7,'?????','<p>??</p>',1,'2015-10-16 00:31:50','2015-10-16 00:31:52',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-16 00:32:21','2015-10-16 00:32:21'),(8,'?????','<p><ol><li><span style=\"line-height: 1.42857143;\">?????</span><br></li></ol></p>',1,'2015-10-16 00:43:17','2015-10-16 00:43:20',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-16 00:43:35','2015-10-16 00:43:35'),(9,'第一个活动','<p><br></p>',1,'2015-10-16 01:19:10','2015-10-16 01:19:12',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-16 01:19:15','2015-10-16 01:19:15'),(16,'测试活动','<p>ddddd</p>',1,'2015-10-18 01:26:53','2015-10-18 01:26:55',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 01:26:57','2015-10-18 01:26:57'),(17,'简阳中学校友奖学金','<p><span style=\"font-weight: bold;\">活动主旨（修改）</span></p><p style=\"line-height: 1.5;\">奖励品学兼优的同学，帮助其更好的完成学业。<br><span style=\"font-weight: bold;\">资金来源</span></p><p>已毕业校友，不限次数，不限金额，自愿无偿的捐献奖学金<br><span style=\"font-weight: bold;\">实施方案</span></p><h3>&nbsp; &nbsp;&nbsp;<span style=\"color: rgb(0, 0, 0); font-family: \'Microsoft YaHei\', u5FAEu8F6Fu96C5u9ED1, Arial, SimSun, u5B8Bu4F53; font-size: 16px; line-height: 2em;\">[解说]10月16日，中共中央政治局原常委李岚清出现在北京电影学院的讲堂上，为广大师生带来一场题为“知识分子与文化修养”的讲座。他表示，中国电影不能一味追求票房价值，而牺牲对艺术的高尚目标的追求。他期待着能够出现影响世界的中国电影学派。</span><p style=\"margin-top: 15px; margin-bottom: 15px; padding: 0px; font-size: 16px; line-height: 2em; color: rgb(0, 0, 0); font-family: \'Microsoft YaHei\', u5FAEu8F6Fu96C5u9ED1, Arial, SimSun, u5B8Bu4F53;\">　　李岚清讲述了自己一直以来对电影的热爱。他说，自己从小就是个影迷，电影就像是自己的第二课堂，让他学到很多东西，也让他了解到社会和人生的善恶是非与酸甜苦辣。</p><p style=\"margin-top: 15px; margin-bottom: 15px; padding: 0px; font-size: 16px; line-height: 2em; color: rgb(0, 0, 0); font-family: \'Microsoft YaHei\', u5FAEu8F6Fu96C5u9ED1, Arial, SimSun, u5B8Bu4F53;\">　　在谈及对电影的看法时，李岚清认为，中国电影事业在走向繁荣的同时，确实也存在有数量、缺质量，有高原、缺高峰等问题。中国电影要把爱国主义作为文化艺术创新的主旋律，为人民创作更多优秀的文艺作品。</p><p>相关连接</p></h3><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; <a href=\"http://www.baidu.com\" target=\"_blank\">http://www.baidu.com</a><br></div><div>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<a href=\"http://news.sina.com.cn/\" target=\"_blank\">http://news.sina.com.cn/</a><br></div><p><br></p>',1,'2015-10-18 01:45:01','2015-10-31 22:55:00',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-19 16:40:11','2015-10-19 16:40:11'),(18,'简阳中学校友奖学金','\r\n                            <p><span style=\"font-weight: bold;\">活动主旨</span></p><p style=\"line-height: 1.5;\">奖励品学兼优的同学，帮助其更好的完成学业。<span style=\"background-color: yellow;\">此处更新</span><br><span style=\"font-weight: bold;\">资金来源</span></p><p>已毕业校友，不限次数，不限金额，自愿无偿的捐献奖学金<br><span style=\"font-weight: bold;\">实施方案</span></p><h3>&nbsp; &nbsp;&nbsp;<span style=\"color: rgb(0, 0, 0); font-family: \'Microsoft YaHei\', u5FAEu8F6Fu96C5u9ED1, Arial, SimSun, u5B8Bu4F53; font-size: 16px; line-height: 2em;\">[解说]10月16日，中共中央政治局原常委李岚清出现在北京电影学院的讲堂上，为广大师生带来一场题为“知识分子与文化修养”的讲座。他表示，中国电影不能一味追求票房价值，而牺牲对艺术的高尚目标的追求。他期待着能够出现影响世界的中国电影学派。</span><p style=\"margin-top: 15px; margin-bottom: 15px; padding: 0px; font-size: 16px; line-height: 2em; color: rgb(0, 0, 0); font-family: \'Microsoft YaHei\', u5FAEu8F6Fu96C5u9ED1, Arial, SimSun, u5B8Bu4F53;\">　　李岚清讲述了自己一直以来对电影的热爱。他说，自己从小就是个影迷，电影就像是自己的第二课堂，让他学到很多东西，也让他了解到社会和人生的善恶是非与酸甜苦辣。</p><p style=\"margin-top: 15px; margin-bottom: 15px; padding: 0px; font-size: 16px; line-height: 2em; color: rgb(0, 0, 0); font-family: \'Microsoft YaHei\', u5FAEu8F6Fu96C5u9ED1, Arial, SimSun, u5B8Bu4F53;\">　　在谈及对电影的看法时，李岚清认为，中国电影事业在走向繁荣的同时，确实也存在有数量、缺质量，有高原、缺高峰等问题。中国电影要把爱国主义作为文化艺术创新的主旋律，为人民创作更多优秀的文艺作品。</p><p>相关连接</p></h3><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; <a href=\"http://www.baidu.com\" target=\"_blank\">http://www.baidu.com</a><br></div><div>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<a href=\"http://news.sina.com.cn/\" target=\"_blank\">http://news.sina.com.cn/</a><br></div><p><br></p>\r\n                        ',1,'2015-10-18 01:45:01','2015-10-18 01:45:04',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 03:21:05','2015-10-18 03:21:05'),(19,'简阳中学校友奖学金','\r\n                            \r\n                            <p><span style=\"font-weight: bold;\">活动主旨</span></p><p style=\"line-height: 1.5;\">奖励品学兼优的同学，帮助其更好的完成学业。<span style=\"background-color: yellow;\">此处更新</span><br><span style=\"font-weight: bold;\">资金来源</span></p><p>已毕业校友，不限次数，不限金额，自愿无偿的捐献奖学金<span style=\"background-color: yellow;\">此处更新</span><br><span style=\"font-weight: bold;\">实施方案</span></p><h3>&nbsp; &nbsp;&nbsp;<span style=\"color: rgb(0, 0, 0); font-family: \'Microsoft YaHei\', u5FAEu8F6Fu96C5u9ED1, Arial, SimSun, u5B8Bu4F53; font-size: 16px; line-height: 2em;\">[解说]10月16日，中共中央政治局原常委李岚清出现在北京电影学院的讲堂上，为广大师生带来一场题为“知识分子与文化修养”的讲座。他表示，中国电影不能一味追求票房价值，而牺牲对艺术的高尚目标的追求。他期待着能够出现影响世界的中国电影学派。</span><p style=\"margin-top: 15px; margin-bottom: 15px; padding: 0px; font-size: 16px; line-height: 2em; color: rgb(0, 0, 0); font-family: \'Microsoft YaHei\', u5FAEu8F6Fu96C5u9ED1, Arial, SimSun, u5B8Bu4F53;\">　　李岚清讲述了自己一直以来对电影的热爱。他说，自己从小就是个影迷，电影就像是自己的第二课堂，让他学到很多东西，也让他了解到社会和人生的善恶是非与酸甜苦辣。</p><p style=\"margin-top: 15px; margin-bottom: 15px; padding: 0px; font-size: 16px; line-height: 2em; color: rgb(0, 0, 0); font-family: \'Microsoft YaHei\', u5FAEu8F6Fu96C5u9ED1, Arial, SimSun, u5B8Bu4F53;\">　　在谈及对电影的看法时，李岚清认为，中国电影事业在走向繁荣的同时，确实也存在有数量、缺质量，有高原、缺高峰等问题。中国电影要把爱国主义作为文化艺术创新的主旋律，为人民创作更多优秀的文艺作品。</p><p>相关连接</p></h3><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; <a href=\"http://www.baidu.com\" target=\"_blank\">http://www.baidu.com</a><br></div><div>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<a href=\"http://news.sina.com.cn/\" target=\"_blank\">http://news.sina.com.cn/</a><br></div><p><br></p>\r\n                        \r\n                        ',1,'2015-10-18 01:45:01','2015-10-18 01:45:04',NULL,NULL,NULL,NULL,NULL,NULL,'2015-10-18 03:29:10','2015-10-18 03:29:10');
/*!40000 ALTER TABLE `activity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_activity_account`
--

DROP TABLE IF EXISTS `detail_activity_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detail_activity_account` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '流水号，主键',
  `gmtCreate` datetime DEFAULT CURRENT_TIMESTAMP,
  `type` tinyint(4) DEFAULT NULL COMMENT '流水类型（收支）',
  `money` bigint(20) DEFAULT '0' COMMENT '金额',
  `desc` varchar(200) DEFAULT NULL COMMENT '简单描述',
  `activityId` bigint(20) DEFAULT NULL,
  `actionPeopleName` varchar(45) DEFAULT NULL,
  `actionPeopleId` bigint(20) DEFAULT NULL,
  `auditPeopleName` varchar(45) DEFAULT NULL,
  `auditPeopleId` bigint(20) DEFAULT NULL,
  `actionPersonId` bigint(20) DEFAULT NULL,
  `actionPersonName` varchar(255) DEFAULT NULL,
  `auditPersonId` varchar(255) DEFAULT NULL,
  `auditPersonName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `NK_type` (`type`),
  KEY `NK_activity_id` (`activityId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='活动财务流水表,记录一旦生成，不允许修改，只能新增';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_activity_account`
--

LOCK TABLES `detail_activity_account` WRITE;
/*!40000 ALTER TABLE `detail_activity_account` DISABLE KEYS */;
INSERT INTO `detail_activity_account` VALUES (1,'2015-10-12 19:58:03',1,100000,'个人捐赠',17,'李洋涛',1,'苏愿',2,NULL,NULL,NULL,NULL),(2,'2015-10-12 20:36:45',1,100000,'个人捐赠',17,'苏愿',2,'苏愿',2,NULL,NULL,NULL,NULL),(3,'2015-10-12 20:37:58',0,50000,'购买基础设备',17,'鲁虹伟',3,'苏愿',2,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `detail_activity_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_people_account`
--

DROP TABLE IF EXISTS `detail_people_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detail_people_account` (
  `id` bigint(20) unsigned NOT NULL,
  `uuid` varchar(200) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `desc` varchar(200) NOT NULL,
  `type` int(11) NOT NULL,
  `people_id` bigint(20) NOT NULL,
  `money` bigint(20) NOT NULL,
  `account_incre` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_uuid` (`uuid`),
  KEY `NK_type` (`type`),
  KEY `NK_people_id` (`people_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户财务流水表,记录一旦生成，不允许修改，只能新增';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_people_account`
--

LOCK TABLES `detail_people_account` WRITE;
/*!40000 ALTER TABLE `detail_people_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_people_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_team_account`
--

DROP TABLE IF EXISTS `detail_team_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detail_team_account` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `uuid` varchar(200) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `desc` varchar(200) NOT NULL,
  `type` int(11) NOT NULL,
  `team_id` bigint(20) NOT NULL,
  `money` bigint(20) NOT NULL,
  `account_incre` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_uuid` (`uuid`),
  KEY `NK_type` (`type`),
  KEY `NK_people_id` (`team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='团队财务流水表,记录一旦生成，不允许修改，只能新增';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_team_account`
--

LOCK TABLES `detail_team_account` WRITE;
/*!40000 ALTER TABLE `detail_team_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_team_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rela_activity_user`
--

DROP TABLE IF EXISTS `rela_activity_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rela_activity_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `activityId` bigint(20) NOT NULL,
  `activityName` varchar(45) NOT NULL,
  `userId` bigint(20) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '申请，审核通过等',
  `gmtCreate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `gmtModified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `NK_activity_id` (`activityId`),
  KEY `NK_people_id` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rela_activity_user`
--

LOCK TABLES `rela_activity_user` WRITE;
/*!40000 ALTER TABLE `rela_activity_user` DISABLE KEYS */;
INSERT INTO `rela_activity_user` VALUES (5,17,'简阳中学校友奖学金（淡定）',6,'李洋涛',11,'2015-10-19 15:31:25','2015-10-19 15:31:25'),(6,17,'简阳中学校友奖学金（淡定）',5,'天脉',10,'2015-10-19 16:09:29','2015-10-19 16:09:29');
/*!40000 ALTER TABLE `rela_activity_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rela_team_activity`
--

DROP TABLE IF EXISTS `rela_team_activity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rela_team_activity` (
  `id` int(11) NOT NULL,
  `team_id` bigint(20) NOT NULL,
  `team_name` varchar(45) NOT NULL,
  `activity_id` bigint(20) NOT NULL,
  `activity_name` varchar(45) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `NK_team_id` (`team_id`),
  KEY `NK_activity_id` (`activity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rela_team_activity`
--

LOCK TABLES `rela_team_activity` WRITE;
/*!40000 ALTER TABLE `rela_team_activity` DISABLE KEYS */;
/*!40000 ALTER TABLE `rela_team_activity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rela_team_people`
--

DROP TABLE IF EXISTS `rela_team_people`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rela_team_people` (
  `id` int(11) NOT NULL,
  `team_id` bigint(20) NOT NULL,
  `team_name` varchar(45) NOT NULL,
  `people_id` bigint(20) NOT NULL,
  `people_name` varchar(45) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `NK_team_id` (`team_id`),
  KEY `NK_people_id` (`people_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rela_team_people`
--

LOCK TABLES `rela_team_people` WRITE;
/*!40000 ALTER TABLE `rela_team_people` DISABLE KEYS */;
/*!40000 ALTER TABLE `rela_team_people` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team` (
  `id` bigint(20) unsigned NOT NULL COMMENT '数据库主键id',
  `name` varchar(140) NOT NULL COMMENT '团队名称',
  `description` varchar(500) DEFAULT NULL COMMENT '团队描述',
  `tag_list` varchar(200) DEFAULT NULL COMMENT '团队标签，多个标签之间用逗号分隔',
  `creator_id` bigint(20) NOT NULL COMMENT '创建者id',
  `creator_name` varchar(40) NOT NULL COMMENT '创建者名称',
  `admin_list` varchar(140) DEFAULT NULL COMMENT '管理员列表，逗号分隔',
  `total_expenditure` bigint(20) NOT NULL DEFAULT '0' COMMENT '总支出，单位 分',
  `total_income` bigint(20) NOT NULL DEFAULT '0' COMMENT '总收入，单位 分',
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `creator_id_UNIQUE` (`creator_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '数据库主键id',
  `name` varchar(40) NOT NULL COMMENT '姓名',
  `email` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL,
  `sex` tinyint(4) DEFAULT '0' COMMENT '性别',
  `phone` varchar(30) DEFAULT '' COMMENT '联系电话',
  `gmtCreate` datetime DEFAULT CURRENT_TIMESTAMP,
  `gmtModified` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (4,'testpeople','','',1,'18380315288','2015-10-17 01:10:46','2015-10-17 01:10:46'),(5,'天脉','yangtao.lyt@alibaba-inc.com','123',NULL,NULL,NULL,NULL),(6,'李洋涛','645774075@qq.com','123',NULL,NULL,NULL,NULL),(9,'天脉','lyt645774075@qq.com','123',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_message`
--

DROP TABLE IF EXISTS `user_message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_message` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_message`
--

LOCK TABLES `user_message` WRITE;
/*!40000 ALTER TABLE `user_message` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_message` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-19 17:53:24
