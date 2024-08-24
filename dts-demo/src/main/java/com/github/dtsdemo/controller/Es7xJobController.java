package com.github.dtsdemo.controller;

import com.github.dts.controller.AbstractEs7xETLIntController;
import com.github.dts.impl.elasticsearch7x.ES7xAdapter;
import com.github.dts.util.Dml;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 自增ID的ETL可以用这个AbstractEs7xETLIntController
 * <p>
 * curl "http://localhost:8080/es7x/job/syncById?id=1,2"
 * curl "http://localhost:8080/es7x/job/syncAll"
 * curl "http://localhost:8080/es7x/job/stop"
 */
@RestController
@RequestMapping("/es7x/job")
public class Es7xJobController extends AbstractEs7xETLIntController {

}
