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
    public static final String J_TABLE_NAME = "job";
    public static final String J_ID_COL_NAME = "id";

    @Override
    protected Integer selectMaxId(JdbcTemplate jdbcTemplate) {
        return selectMaxId(jdbcTemplate, J_ID_COL_NAME, J_TABLE_NAME);
    }

    @Override
    protected ES7xAdapter getES7xAdapter() {
        return getES7xAdapter("adapterES7");
    }

    @Override
    protected List<Dml> convertDmlList(JdbcTemplate jdbcTemplate, String catalog, Integer minId, int limit) {
        return convertDmlList(jdbcTemplate, catalog, minId, limit, J_TABLE_NAME, J_ID_COL_NAME);
    }

}
