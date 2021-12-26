DROP SCHEMA IF EXISTS `service001`;

CREATE SCHEMA `service001`;
USE `service001` ;

CREATE TABLE IF NOT EXISTS `service001`.`odi_team` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `team_name` VARCHAR(50) UNIQUE NOT NULL,
    `position` TINYINT NOT NULL,
    `rating` INT NOT NULL,
    `points` INT NOT NULL,
    PRIMARY KEY (`id`)
)  ENGINE=INNODB AUTO_INCREMENT=1;

SELECT 
    *
FROM
    odi_team;
    
CREATE TABLE IF NOT EXISTS `service001`.`odi_legend_batter` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `batter_name` VARCHAR(50) UNIQUE NOT NULL,
    `matches` INT NOT NULL,
    `fifties` INT NOT NULL,
    `hundreds` INT NOT NULL,
    `avg` DECIMAL(4 , 2 ) NOT NULL,
    `odi_team_id` BIGINT NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`odi_team_id`)
        REFERENCES `odi_team` (`id`)
)  ENGINE=INNODB AUTO_INCREMENT=1;

SELECT 
    *
FROM
    odi_legend_batter;
    
SELECT 
    *
FROM
    odi_legend_batter x
        LEFT JOIN
    odi_team y ON x.odi_team_id = y.id;