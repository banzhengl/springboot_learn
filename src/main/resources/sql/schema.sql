DROP TABLE IF EXISTS `image_info`;
CREATE TABLE `image_info`
(
    `id`   INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NULL,
    `dir`  VARCHAR(45) NULL,
    `info` VARCHAR(200) NULL,
    PRIMARY KEY (`id`)
);
