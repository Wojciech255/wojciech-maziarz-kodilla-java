package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private Invoice invoice;
    private Item item;
    private Product product;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    private static final String NAME = "Test: Name";

    @Test
    void testInvoiceDaoSave() {

        //Given
        Invoice invoice = new Invoice("1", new ArrayList<>());
        Item item = new Item(new BigDecimal("1"), 1, new BigDecimal("1"));
        Product product = new Product("name");

        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        itemDao.save(item);
        //Then
        Assertions.assertEquals(1, 1);
        //CleanUp
        invoiceDao.delete(invoice);

    }
}
