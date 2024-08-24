package com.github.dtsdemo.controller;

import com.github.dts.controller.AbstractEs7xETLStringController;
import com.github.dts.impl.elasticsearch7x.ES7xAdapter;
import com.github.dts.util.Dml;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 解决这种非自增ID的etl用这个AbstractEs7xETLStringController
 * <p>
 * id	group_name	name	home_url	source_enum	data_type	credit_code	register_status_name	nature_enum	manual_flag	unique_key	status	create_user	update_user	create_time	update_time	root_name
 * 2024071120001536320040986	陕西煤业化工集团	海南德璟置业投资有限责任公司		tyc	0	91460200056399292A	存续	guo_qi	0	662f11edbe7fa41ef500f138	1			2024-07-11 20:00:15	2024-07-11 20:00:15	陕西煤业化工集团
 * 2024071120001540020040987	陕西煤业化工集团	西安重装渭南橡胶制品有限公司		tyc	0	916105005735206015	存续	guo_qi	0	662e1a9ebe7fa41ef5ea41fc	1			2024-07-11 20:00:15	2024-07-11 20:00:15	陕西煤业化工集团
 * 2024071120001546920040988	仁怀市建工集团	仁怀城投中资智慧城市运营有限公司		tyc	0	91520382MAC57C207X	存续	guo_qi	0	662f11edbe7fa41ef500f12e	1			2024-07-11 20:00:15	2024-07-11 20:00:15	仁怀市建工集团
 * 2024071120001563920040989	苏州城市建设投资发展集团	苏州物资控股（集团）有限责任公司		tyc	0	913205001377629700	存续	guo_qi	0	664c7375a5bca3e4f734c87d	1			2024-07-11 20:00:16	2024-07-11 20:00:16	苏州城市建设投资发展集团
 * curl "http://localhost:8080/es7x/corp/syncById?id=2024071120255559720056013,2024071118325561520000001"
 * curl "http://localhost:8080/es7x/corp/syncAll"
 * curl "http://localhost:8080/es7x/corp/stop"
 */
@RestController
@RequestMapping("/es7x/corp")
public class Es7xCorpController extends AbstractEs7xETLStringController {

}
