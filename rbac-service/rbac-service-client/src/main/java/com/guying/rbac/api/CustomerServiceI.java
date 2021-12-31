package com.guying.rbac.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.guying.rbac.dto.CustomerAddCmd;
import com.guying.rbac.dto.CustomerListByNameQry;
import com.guying.rbac.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
