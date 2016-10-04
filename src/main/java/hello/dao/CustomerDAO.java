package hello.dao;
import java.util.ArrayList;
import java.util.List;

import hello.model.Customer;
import org.springframework.stereotype.Component;


@Component
public class CustomerDAO {

    // Dummy database. Initialize with some dummy values.
    private static List customers;
    {
        customers = new ArrayList();
        customers.add(new Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
        customers.add(new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
        customers.add(new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
    }

    /**
     * Returns list of customers from dummy database.
     *
     * @return list of customers
     */
    public List list() {
        return customers;
    }

    /**
     * Return customer object for given id from dummy database. If customer is
     * not found for id, returns null.
     *
     * @param id
     *            customer id
     * @return customer object for given id
     */
    public Customer get(Long id) {
        for (int i = 0; i < customers.size(); i++){
            Customer customer = (Customer) customers.get(i);
            if (customer.getId().equals(id))
                return customer;
        }
        return null;
    }

    /**
     * Create new customer in dummy database. Updates the id and insert new
     * customer in list.
     *
     * @param customer
     *            Customer object
     * @return customer object with updated id
     */
    public Customer create(Customer customer) {
        customer.setId(System.currentTimeMillis());
        customers.add(customer);
        return customer;
    }

    /**
     * Delete the customer object from dummy database. If customer not found for
     * given id, returns null.
     *
     * @param id
     *            the customer id
     * @return id of deleted customer object
     */
    public Long delete(Long id) {
        for (int i = 0; i < customers.size(); i++){
            Customer customer = (Customer) customers.get(i);
            if (customer.getId().equals(id))
                customers.remove(customer);
        }
        return null;
    }

    /**
     * Update the customer object for given id in dummy database. If customer
     * not exists, returns null
     *
     * @param id
     * @param customer
     * @return customer object with id
     */
    public Customer update(Long id, Customer customer) {

        for (int i = 0; i < customers.size(); i++){
            Customer customer1 = (Customer) customers.get(i);
            if (customer.getId().equals(id)) {
                customers.remove(customer1);
                customers.add(customer);
            }
        }

        return null;
    }

}