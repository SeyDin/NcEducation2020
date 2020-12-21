package com.nc.autumn2020.databaseH2_v2.repository;

import com.nc.autumn2020.databaseH2_v2.entity.Product;
import com.nc.autumn2020.databaseH2_v2.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {
    private JdbcTemplate jdbcTemplate;


    @Autowired
    public ProductRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Product getProductById(Integer id){
        return jdbcTemplate.queryForObject("SELECT * from LAREK where id = ?",new ProductMapper(), id);
    }

    public String getProductNameById(Integer id){
        return jdbcTemplate.queryForObject("SELECT firstname from LAREK where id = ?",String.class,id);
    }

    public List<Map<String,Object>> getProductsPlain(){
        return jdbcTemplate.queryForList("SELECT * from LAREK");
    }

    public List<Product> getProducts(){
        return jdbcTemplate.query("SELECT * from LAREK", new ProductMapper());
    }

    public void updateProduct(Product product){
        String query = "UPDATE LAREK SET name = ?, price = ?";
        jdbcTemplate.update(query,product.getName(), product.getPrice());
    }

    public Product addProduct(Product product){
        String query = "INSERT INTO LAREK (name,price) VALUES (?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            return preparedStatement;
        }, keyHolder);
        return getProductById(keyHolder.getKey().intValue());
    }
}
