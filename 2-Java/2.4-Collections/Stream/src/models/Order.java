package models;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deleveryDate;
    private List<Product> products;
    private Customer customer;
}
