/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50637
Source Host           : localhost:3306
Source Database       : news

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2018-04-30 14:14:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for classify
-- ----------------------------
DROP TABLE IF EXISTS `classify`;
CREATE TABLE `classify` (
  `classify_id` int(11) NOT NULL AUTO_INCREMENT,
  `classifyName` varchar(255) NOT NULL,
  `classifyUrl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`classify_id`),
  KEY `classifyName` (`classifyName`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classify
-- ----------------------------
INSERT INTO `classify` VALUES ('1', 'bj', 'http://bj.bjd.com.cn/');
INSERT INTO `classify` VALUES ('2', 'sjc', 'http://www.bjd.com.cn/zc/sjc/');
INSERT INTO `classify` VALUES ('3', 'sbs', 'http://www.beijingdaily.com.cn/zc/sbs/');
INSERT INTO `classify` VALUES ('4', 'shq', 'http://www.beijingdaily.com.cn/zc/shq/');
INSERT INTO `classify` VALUES ('5', 'btt', 'http://www.bjd.com.cn/zc/btt/');
INSERT INTO `classify` VALUES ('6', 'du', 'http://du.bjd.com.cn/');
INSERT INTO `classify` VALUES ('7', 'mrq', 'http://www.bjd.com.cn/sd/mrq/');
INSERT INTO `classify` VALUES ('8', 'cgr', 'http://www.bjd.com.cn/sd/cgr/');
INSERT INTO `classify` VALUES ('9', 'hcr', 'http://www.bjd.com.cn/sd/hcr/');
INSERT INTO `classify` VALUES ('10', 'sy', 'http://www.bjd.com.cn/sy/');
INSERT INTO `classify` VALUES ('11', '3j', 'http://3j.bjd.com.cn/');
INSERT INTO `classify` VALUES ('12', 'jx', 'http://www.bjd.com.cn/');
INSERT INTO `classify` VALUES ('13', 'toutiao', 'http://www.bjd.com.cn/jx/toutiao/');
INSERT INTO `classify` VALUES ('14', 'tp', 'http://www.bjd.com.cn/jx/tp/');
INSERT INTO `classify` VALUES ('15', 'jj', 'http://www.bjd.com.cn/jx/jj/');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `keywords` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publishdate` datetime DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `criticism` int(11) DEFAULT NULL,
  `classify_id` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `classify` (`classify_id`),
  CONSTRAINT `news_ibfk_1` FOREIGN KEY (`classify_id`) REFERENCES `classify` (`classify_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4087 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('3988', '习近平在武汉考察', '习近平;武汉', '奚小荻', '2018-04-27 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('3989', '习近平在武汉考察', '习近平;武汉', '奚小荻', '2018-04-27 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('3990', '历史性时刻！金正恩跨过“三八线”与文在寅握手', '金正恩;文在寅', '奚小荻', '2018-04-27 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('3991', '历史性时刻！金正恩跨过“三八线”与文在寅握手', '金正恩;文在寅', '奚小荻', '2018-04-27 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('3992', '一张37年前的老照片，拂起长安街上“1路”春风', '车组;1路', '奚小荻', '2018-04-27 00:00:00', '京呈', '0', '14');
INSERT INTO `news` VALUES ('3993', '一张37年前的老照片，拂起长安街上“1路”春风', '车组;1路', '奚小荻', '2018-04-27 00:00:00', '京呈', '0', '14');
INSERT INTO `news` VALUES ('3994', '习近平考察三峡工程', '', '康琪雪', '2018-04-25 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('3995', '习近平考察三峡工程', '', '康琪雪', '2018-04-25 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('3996', '突发！苏州胡同今晨起火 冒出黑白两色浓烟', '苏州胡同;起火建筑', '奚小荻', '2018-04-26 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('3997', '突发！苏州胡同今晨起火 冒出黑白两色浓烟', '苏州胡同;起火建筑', '奚小荻', '2018-04-26 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('3998', '五一假期有赏花“专列”，最美S2线加密啦！', 'S2线', '奚小荻', '2018-04-26 00:00:00', '长安街知事', '0', '14');
INSERT INTO `news` VALUES ('3999', '五一假期有赏花“专列”，最美S2线加密啦！', 'S2线', '奚小荻', '2018-04-26 00:00:00', '长安街知事', '0', '14');
INSERT INTO `news` VALUES ('4000', '时隔一年，辽宁省长为何再次来到北京？', '', '康琪雪', '2018-04-25 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4001', '时隔一年，辽宁省长为何再次来到北京？', '', '康琪雪', '2018-04-25 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4002', '北京世园会国际馆“钢铁花伞”连成“花海”', '', '康琪雪', '2018-04-25 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4003', '北京世园会国际馆“钢铁花伞”连成“花海”', '', '康琪雪', '2018-04-25 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4004', '为这事，蔡奇陈吉宁冒雨进深山，现场解决问题！', '蔡奇;低收入农户;帮扶;陈吉宁;低收入', '康琪雪', '2018-04-23 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4005', '为这事，蔡奇陈吉宁冒雨进深山，现场解决问题！', '蔡奇;低收入农户;帮扶;陈吉宁;低收入', '康琪雪', '2018-04-23 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4006', '北京四位新任区委书记，都以这个身份做了同一件事！', '在职党员;报到;区委书记;基层党组织;社区', '奚小荻', '2018-04-24 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4007', '北京四位新任区委书记，都以这个身份做了同一件事！', '在职党员;报到;区委书记;基层党组织;社区', '奚小荻', '2018-04-24 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4008', '京城70年老字号影院，变身全国首家公共“藏书楼”！', '藏书楼;红楼;藏书;图书;电影院', '奚小荻', '2018-04-24 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4009', '京城70年老字号影院，变身全国首家公共“藏书楼”！', '藏书楼;红楼;藏书;图书;电影院', '奚小荻', '2018-04-24 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4010', '弃选率7成？共有产权房遇冷？这说法您怎么看', '产权房;自媒体;申购', '奚小荻', '2018-04-23 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4011', '弃选率7成？共有产权房遇冷？这说法您怎么看', '产权房;自媒体;申购', '奚小荻', '2018-04-23 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4012', '这场春雨背后的诗意与艰辛', '节气;春雨;张图;诗意;雨情', '李亚敏', '2018-04-22 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4013', '这场春雨背后的诗意与艰辛', '节气;春雨;张图;诗意;雨情', '李亚敏', '2018-04-22 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4014', '市委书记蔡奇面对面教16区委书记从哪开局起步！', '蔡奇;攻坚战;区委书记', '康琪雪', '2018-04-20 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4015', '市委书记蔡奇面对面教16区委书记从哪开局起步！', '蔡奇;攻坚战;区委书记', '康琪雪', '2018-04-20 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4016', '北京这家新开的图书馆，给爱书的你一个天堂', '', '康琪雪', '2018-04-23 00:00:00', '', '0', '14');
INSERT INTO `news` VALUES ('4017', '北京这家新开的图书馆，给爱书的你一个天堂', '', '康琪雪', '2018-04-23 00:00:00', '', '0', '14');
INSERT INTO `news` VALUES ('4018', '告别脏街后的三里屯再变样，这一次连外籍“活雷锋”也来了', '', '康琪雪', '2018-04-20 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4019', '告别脏街后的三里屯再变样，这一次连外籍“活雷锋”也来了', '', '康琪雪', '2018-04-20 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4020', '清华大学最美校门修缮完毕 “黑科技”与美颜效果get√', '校门;修缮;清华大学;黑科技;清华', '康琪雪', '2018-04-20 00:00:00', '', '0', '14');
INSERT INTO `news` VALUES ('4021', '清华大学最美校门修缮完毕 “黑科技”与美颜效果get√', '校门;修缮;清华大学;黑科技;清华', '康琪雪', '2018-04-20 00:00:00', '', '0', '14');
INSERT INTO `news` VALUES ('4022', '一个老北京笔下的北京胡同，一幕一幕就像在昨天', '胡同;廖增保;大白菜;北京胡同;生活', '李亚敏', '2018-04-19 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4023', '一个老北京笔下的北京胡同，一幕一幕就像在昨天', '胡同;廖增保;大白菜;北京胡同;生活', '李亚敏', '2018-04-19 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4024', '胡同换新颜 老北京味道又回来了', '胡同;开墙打洞;新颜;机动车乱停乱放;北京胡同', '李亚敏', '2018-04-19 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4025', '胡同换新颜 老北京味道又回来了', '胡同;开墙打洞;新颜;机动车乱停乱放;北京胡同', '李亚敏', '2018-04-19 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4026', '7条地铁新线、11个延长段计划开通，看看哪些路过你家！', '', '康琪雪', '2018-04-18 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4027', '7条地铁新线、11个延长段计划开通，看看哪些路过你家！', '', '康琪雪', '2018-04-18 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4028', '蔡奇：这个区全面向副中心标准看齐', '蔡奇;通州区;规划', '康琪雪', '2018-04-18 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4029', '蔡奇：这个区全面向副中心标准看齐', '蔡奇;通州区;规划', '康琪雪', '2018-04-18 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4030', '习总书记出的这道题，离红墙最近的地方如何作答', '', '康琪雪', '2018-04-17 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4031', '习总书记出的这道题，离红墙最近的地方如何作答', '', '康琪雪', '2018-04-17 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4032', '仅隔一天，这个被市委书记蔡奇抱进怀里的孩子来到北京！', '', '康琪雪', '2018-04-17 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4033', '仅隔一天，这个被市委书记蔡奇抱进怀里的孩子来到北京！', '', '康琪雪', '2018-04-17 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4034', '一组对比图胜千言，老北京民居胡同回来了！', '', '康琪雪', '2018-04-17 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4035', '一组对比图胜千言，老北京民居胡同回来了！', '', '康琪雪', '2018-04-17 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4036', '习近平在海南考察', '习近平;中共中央总书记;中央军委主席;国家主席;考察', '康琪雪', '2018-04-16 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4037', '习近平在海南考察', '习近平;中共中央总书记;中央军委主席;国家主席;考察', '康琪雪', '2018-04-16 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4038', '蔡奇为何“故地重游”走街串巷一整天？', '蔡奇;胡同;整治;背街小巷', '康琪雪', '2018-04-16 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4039', '蔡奇为何“故地重游”走街串巷一整天？', '蔡奇;胡同;整治;背街小巷', '康琪雪', '2018-04-16 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4040', '赴河北对接扶贫协作工作，蔡奇心疼地把这个孩子抱在怀里', '蔡奇;扶贫;脱贫;北京市', '康琪雪', '2018-04-15 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4041', '赴河北对接扶贫协作工作，蔡奇心疼地把这个孩子抱在怀里', '蔡奇;扶贫;脱贫;北京市', '康琪雪', '2018-04-15 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4042', '“北京味儿”的马拉松，您老也来一回？', '半程马拉松;天安门广场;奥林匹克公园中心区;京味儿;北京味儿', '康琪雪', '2018-04-15 00:00:00', '', '0', '14');
INSERT INTO `news` VALUES ('4043', '“北京味儿”的马拉松，您老也来一回？', '半程马拉松;天安门广场;奥林匹克公园中心区;京味儿;北京味儿', '康琪雪', '2018-04-15 00:00:00', '', '0', '14');
INSERT INTO `news` VALUES ('4044', '京城四月花事指南，抓住春天的尾巴', '公园;赏花', '赵悦', '2018-04-16 00:00:00', '周末跟我Go', '0', '14');
INSERT INTO `news` VALUES ('4045', '京城四月花事指南，抓住春天的尾巴', '公园;赏花', '赵悦', '2018-04-16 00:00:00', '周末跟我Go', '0', '14');
INSERT INTO `news` VALUES ('4046', '翻开老照片，找寻大栅栏胡同变迁的记忆', '', '康琪雪', '2018-04-13 00:00:00', '京呈', '0', '14');
INSERT INTO `news` VALUES ('4047', '翻开老照片，找寻大栅栏胡同变迁的记忆', '', '康琪雪', '2018-04-13 00:00:00', '京呈', '0', '14');
INSERT INTO `news` VALUES ('4048', '“科学”号在麦哲伦海山发现“珊瑚林”', '张建松;珊瑚;麦哲伦海;记者;水螅', '康琪雪', '2018-04-13 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4049', '“科学”号在麦哲伦海山发现“珊瑚林”', '张建松;珊瑚;麦哲伦海;记者;水螅', '康琪雪', '2018-04-13 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4050', '深入贯彻新时代党的强军思想 把人民海军全面建成世界一流海军', '习近平;人民海军;强军;检阅;重要讲话', '康琪雪', '2018-04-13 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4051', '深入贯彻新时代党的强军思想 把人民海军全面建成世界一流海军', '习近平;人民海军;强军;检阅;重要讲话', '康琪雪', '2018-04-13 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4052', '中国插花到底有多美？看完这些画被彻底征服了！', '', '赵悦', '2018-04-13 00:00:00', '艺绽', '0', '14');
INSERT INTO `news` VALUES ('4053', '中国插花到底有多美？看完这些画被彻底征服了！', '', '赵悦', '2018-04-13 00:00:00', '艺绽', '0', '14');
INSERT INTO `news` VALUES ('4054', '习近平出席博鳌亚洲论坛2018年年会开幕式并发表主旨演讲', '年会开幕式;博鳌亚洲论坛', '奚小荻', '2018-04-11 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4055', '习近平出席博鳌亚洲论坛2018年年会开幕式并发表主旨演讲', '年会开幕式;博鳌亚洲论坛', '奚小荻', '2018-04-11 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4056', '蔡奇陈吉宁在内蒙古的两天两夜', '蔡奇;扶贫;内蒙古', '奚小荻', '2018-04-11 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4057', '蔡奇陈吉宁在内蒙古的两天两夜', '蔡奇;扶贫;内蒙古', '奚小荻', '2018-04-11 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4058', '缓解京藏京新拥堵，这条高速年底通车！将成京西北重要通道', '爆破;隧道;西北', '奚小荻', '2018-04-11 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4059', '缓解京藏京新拥堵，这条高速年底通车！将成京西北重要通道', '爆破;隧道;西北', '奚小荻', '2018-04-11 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4060', '北京这几个“城中村”将配套幼儿园养老院！', '幼儿园;城中村;养老院', '奚小荻', '2018-04-10 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4061', '北京这几个“城中村”将配套幼儿园养老院！', '幼儿园;城中村;养老院', '奚小荻', '2018-04-10 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4062', '真正的长租公寓来啦！一租10年，租金不变，精装修', '', '康琪雪', '2018-04-12 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4063', '真正的长租公寓来啦！一租10年，租金不变，精装修', '', '康琪雪', '2018-04-12 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4064', '美丽博鳌再次吸引世界目光', '', '康琪雪', '2018-04-09 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4065', '美丽博鳌再次吸引世界目光', '', '康琪雪', '2018-04-09 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4066', '“不忘初心.牢记嘱托”全国网络媒体四川德阳行启幕', '', '毛京', '2018-04-17 00:00:00', '', '0', '14');
INSERT INTO `news` VALUES ('4067', '让您抬头看到澄净天空！今年北京核心区扩大实施这项工程', '电力架空线', '奚小荻', '2018-04-08 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4068', '让您抬头看到澄净天空！今年北京核心区扩大实施这项工程', '电力架空线', '奚小荻', '2018-04-08 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4069', '德阳原野牧场：打造观光牧业发展新标杆', '', '毛京', '2018-04-17 00:00:00', '', '0', '14');
INSERT INTO `news` VALUES ('4070', '德阳原野牧场：打造观光牧业发展新标杆', '', '毛京', '2018-04-17 00:00:00', '', '0', '14');
INSERT INTO `news` VALUES ('4071', '习近平同奥地利总统范德贝伦举行会谈', '', '康琪雪', '2018-04-09 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4072', '习近平同奥地利总统范德贝伦举行会谈', '', '康琪雪', '2018-04-09 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4073', '一起去看桃花海，平谷桃花节赏花地图发布！', '郊游', '赵悦', '2018-04-10 00:00:00', '北京最新鲜', '0', '14');
INSERT INTO `news` VALUES ('4074', '一起去看桃花海，平谷桃花节赏花地图发布！', '郊游', '赵悦', '2018-04-10 00:00:00', '北京最新鲜', '0', '14');
INSERT INTO `news` VALUES ('4075', '深山苗寨春色美', '固本乡;贵州省', '奚小荻', '2018-04-08 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4076', '深山苗寨春色美', '固本乡;贵州省', '奚小荻', '2018-04-08 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4077', '跟总书记一起“做种树者”', '', '康琪雪', '2018-04-03 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4078', '跟总书记一起“做种树者”', '', '康琪雪', '2018-04-03 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4079', '一天密集调研三所市属高校，市委书记蔡奇说了什么？', '蔡奇;高校;青年学子', '康琪雪', '2018-04-04 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4080', '一天密集调研三所市属高校，市委书记蔡奇说了什么？', '蔡奇;高校;青年学子', '康琪雪', '2018-04-04 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4081', '电视剧“飞天奖”暨电视文艺“星光奖”颁奖典礼在浙江举行', '', '康琪雪', '2018-04-04 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4082', '电视剧“飞天奖”暨电视文艺“星光奖”颁奖典礼在浙江举行', '', '康琪雪', '2018-04-04 00:00:00', '新华网', '0', '14');
INSERT INTO `news` VALUES ('4083', '紫禁城背后，藏着北京的心跳！', '老北京', '赵悦', '2018-04-04 00:00:00', '芝麻匠通讯社', '0', '14');
INSERT INTO `news` VALUES ('4084', '紫禁城背后，藏着北京的心跳！', '老北京', '赵悦', '2018-04-04 00:00:00', '芝麻匠通讯社', '0', '14');
INSERT INTO `news` VALUES ('4085', '幸好秋裤还没脱！四月飞雪+冷雨纷纷，北京再“入冬”', '雨雪天气;清明;冷雨;天气;雨情', '康琪雪', '2018-04-04 00:00:00', '北京日报', '0', '14');
INSERT INTO `news` VALUES ('4086', '幸好秋裤还没脱！四月飞雪+冷雨纷纷，北京再“入冬”', '雨雪天气;清明;冷雨;天气;雨情', '康琪雪', '2018-04-04 00:00:00', '北京日报', '0', '14');
