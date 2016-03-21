DROP TABLE IF EXISTS `event_by_day`;
CREATE TABLE `event_by_day` (
  `dy_id` int(11) NOT NULL,
  `AvgDistBtwEventIncdntInDay` double DEFAULT NULL,
  `AvgDistBtwPlEventsInDay` double DEFAULT NULL,
  `AvgDistBtwPl_X_EventsInDay` double DEFAULT NULL,
  `AvgTimeBtwEventIncdntInDay` double DEFAULT NULL,
  `GMAX_VAR` double DEFAULT NULL,
  `MaxDistBtwEventIncdntInDay` double DEFAULT NULL,
  `MaxDistBtwPlEventsInDay` double DEFAULT NULL,
  `MaxDistBtwPl_X_EventsInDay` double DEFAULT NULL,
  `MaxTimeBtwEventIncdntInDay` double DEFAULT NULL,
  `MinDistBtwEventIncdntInDay` double DEFAULT NULL,
  `MinDistBtwPlEventsInDay` double DEFAULT NULL,
  `MinDistBtwPl_X_EventsInDay` double DEFAULT NULL,
  `MinTimeBtwEventIncdntInDay` double DEFAULT NULL,
  `TSF_EventOfDay` double DEFAULT NULL,
  `TSL_EventOfDay` double DEFAULT NULL,
  `TimeBtwFstLstEventOfDay` double DEFAULT NULL,
  `velocity_var` double DEFAULT NULL,
  PRIMARY KEY (`dy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `event_by_day_expected`;
CREATE TABLE `event_by_day_expected` (
  `dy_id` int(11) NOT NULL,
  `AvgDistBtwEventIncdntInDay` double DEFAULT NULL,
  `AvgDistBtwPlEventsInDay` double DEFAULT NULL,
  `AvgDistBtwPl_X_EventsInDay` double DEFAULT NULL,
  `AvgTimeBtwEventIncdntInDay` double DEFAULT NULL,
  `GMAX_VAR` double DEFAULT NULL,
  `MaxDistBtwEventIncdntInDay` double DEFAULT NULL,
  `MaxDistBtwPlEventsInDay` double DEFAULT NULL,
  `MaxDistBtwPl_X_EventsInDay` double DEFAULT NULL,
  `MaxTimeBtwEventIncdntInDay` double DEFAULT NULL,
  `MinDistBtwEventIncdntInDay` double DEFAULT NULL,
  `MinDistBtwPlEventsInDay` double DEFAULT NULL,
  `MinDistBtwPl_X_EventsInDay` double DEFAULT NULL,
  `MinTimeBtwEventIncdntInDay` double DEFAULT NULL,
  `TSF_EventOfDay` double DEFAULT NULL,
  `TSL_EventOfDay` double DEFAULT NULL,
  `TimeBtwFstLstEventOfDay` double DEFAULT NULL,
  `velocity_var` double DEFAULT NULL,
  PRIMARY KEY (`dy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `event_info`;
CREATE TABLE `event_info` (
  `id` varchar(255) NOT NULL,
  `DailyEventCountType_ALL` int(11) DEFAULT NULL,
  `WeekEnd_v1` binary(1) DEFAULT NULL,
  `WeekEnd_v2` binary(1) DEFAULT NULL,
  `block_group` varchar(255) DEFAULT NULL,
  `datetime_var` datetime DEFAULT NULL,
  `event_type` varchar(255) DEFAULT NULL,
  `holiday_indicator_1` binary(1) DEFAULT NULL,
  `holiday_indicator_2` binary(1) DEFAULT NULL,
  `shift` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `event_info_expected`;
CREATE TABLE `event_info_expected` (
  `id` varchar(255) NOT NULL,
  `DailyEventCountType_ALL` int(11) DEFAULT NULL,
  `WeekEnd_v1` binary(1) DEFAULT NULL,
  `WeekEnd_v2` binary(1) DEFAULT NULL,
  `block_group` varchar(255) DEFAULT NULL,
  `datetime_var` datetime DEFAULT NULL,
  `event_type` varchar(255) DEFAULT NULL,
  `holiday_indicator_1` binary(1) DEFAULT NULL,
  `holiday_indicator_2` binary(1) DEFAULT NULL,
  `shift` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;