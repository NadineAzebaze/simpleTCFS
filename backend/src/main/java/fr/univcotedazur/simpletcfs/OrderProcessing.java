package fr.univcotedazur.simpletcfs;

import fr.univcotedazur.simpletcfs.entities.Order;

// very partial vision, the OrderStatus cannot properly make progress
// MVP just to set the order from VALIDATED to IN_PROGRESS
public interface OrderProcessing {

    void process(Order order);

}
