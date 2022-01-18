/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.web;

import com.alibaba.cola.dto.Response;
import com.guying.rbac.dto.ConfigRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SysConfigControllerTest {
    @Autowired
    private SysConfigController sysConfigController;

    @Test
    void saveForInsert() {
        ConfigRequest configRequest = new ConfigRequest().setValue("Vasda")
                                                         .setLabelNam("Namsd")
                                                         .setType("AAA")
                                                         .setDescInf("ABUISDGuw")
                                                         .setSort(1L)
                                                         .setCrtBy("Gy")
                                                         .setRemarks("IQWUE 阿数额和");

        Response save = sysConfigController.save(configRequest);
        Assertions.assertTrue(save.isSuccess());
    }

    @Test
    void saveForUpdate() {
        ConfigRequest configRequest = new ConfigRequest().setId("1483424628731109378")
                                                         .setValue("Vasda")
                                                         .setLabelNam("Namsd")
                                                         .setType("CCA")
                                                         .setDescInf("ABUISDGuw")
                                                         .setSort(1L)
                                                         .setLstUpdBy("Gy2")
                                                         .setRemarks("new fassf ");


        Response save = sysConfigController.save(configRequest);
        Assertions.assertTrue(save.isSuccess());
    }

    @Test
    void delete() {
        List<ConfigRequest> configRequestList = new ArrayList<>();

        ConfigRequest configRequest = new ConfigRequest().setId("1483426432520912897")
                                                         .setLstUpdBy("Gy2");
        configRequestList.add(configRequest);

        Response delete = sysConfigController.delete(configRequestList);
        Assertions.assertTrue(delete.isSuccess());
    }

    @Test
    void findPage() {
    }

    @Test
    void findByLabel() {
    }
}