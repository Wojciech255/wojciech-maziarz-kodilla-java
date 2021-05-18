package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private Invoice invoice;
    private Item item;
    private Product product;
    private ItemDao itemDao;
    private ProductDao productDao;

    private static final String NAME = "Test: Name";

    @Test
    void testInvoiceDaoSave() {

        //Given
        Invoice invoice = new Invoice();
        Item item = new Item();
        Product product = new Product();

        //When
     //   invoiceDao.save();
     //   itemDao.save();
     //   productDao.save();
        //Then

        //CleanUp
      //  invoiceDao.deleteById(id);
    }
}
