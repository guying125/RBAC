package com.guying.rbac.domain.customer.gateway;

import com.guying.rbac.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
