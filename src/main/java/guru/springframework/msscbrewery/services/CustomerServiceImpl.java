package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        CustomerDto returnedCustomer = CustomerDto.builder()
                .uuid(UUID.randomUUID())
                .name("Existing Customer")
                .build();

        log.info("Customer returned: {}", returnedCustomer);
        return returnedCustomer;
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        CustomerDto savedCustmoer = CustomerDto.builder()
                .uuid(UUID.randomUUID())
                .name("New Customer")
                .build();
        log.info("Customer saved: {}", customerDto);

        return savedCustmoer;
    }

    @Override
    public CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto) {
        CustomerDto updatedCustomer = CustomerDto.builder()
                .name(customerDto.getName())
                .uuid(customerDto.getUuid())
                .build();
        log.info("Customer updated: {}", updatedCustomer);
        return updatedCustomer;
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.info("Customer with id: {} was deleted", customerId);
    }
}
