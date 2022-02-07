package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private ProductDao productDao;
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product apple = new Product("apple");
        Product banana = new Product("banana");
        Product orange = new Product("orange");

        Item item1 = new Item(new BigDecimal("5.52"), 3);
        Item item2 = new Item(new BigDecimal("4.45"), 4);
        Item item3 = new Item(new BigDecimal("3.98"), 3);

        apple.getItems().add(item1);
        banana.getItems().add(item2);
        orange.getItems().add(item3);

        productDao.save(apple);
        productDao.save(banana);
        productDao.save(orange);

        item1.setProduct(apple);
        item2.setProduct(banana);
        item3.setProduct(orange);



        Invoice invoice1 = new Invoice("1/2022");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);



        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.deleteById(id);



    }
}
