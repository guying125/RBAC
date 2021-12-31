package com.guying.rbac.dto.event;

import static com.guying.rbac.dto.event.DomainEventConstant.CUSTOMER_CREATED_TOPIC;

/**
 * CustomerCreatedEvent
 *
 * @author CODE POTER
 * @date 2019-01-04 10:32 AM
 */
public class CustomerCreatedEvent{

    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

}
