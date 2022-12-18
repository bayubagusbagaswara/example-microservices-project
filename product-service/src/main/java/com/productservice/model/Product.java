package com.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCT")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GenericGenerator(name = "gen-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "gen-uuid")
    private String id;

    private String name;

    private String description;

    private BigDecimal price;
}
