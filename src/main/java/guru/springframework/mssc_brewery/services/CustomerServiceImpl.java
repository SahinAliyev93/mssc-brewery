package guru.springframework.mssc_brewery.services;

import guru.springframework.mssc_brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.
                builder().
                id(customerId).
                name("Joe Buck").
                build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating customer: " + customerId.toString());
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer: " + customerId.toString());
    }
}
