package com.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;


public class EProduct {

        private long ID;
        private String name;
        private BigDecimal price;
         
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
       
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
         
}
