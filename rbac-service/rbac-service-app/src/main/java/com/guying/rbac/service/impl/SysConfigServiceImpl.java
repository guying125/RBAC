/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service.impl;

import com.alibaba.cola.dto.PageQuery;
import com.guying.rbac.consts.StatusConsts;
import com.guying.rbac.domain.domainservice.SysConfigDomainService;
import com.guying.rbac.domain.entity.SysConfig;
import com.guying.rbac.dto.ConfigDTO;
import com.guying.rbac.dto.ConfigRequest;
import com.guying.rbac.service.SysConfigService;
import com.guying.rbac.util.DateUtils3;
import com.guying.rbac.util.RegExpValidatorUtils;
import com.guying.rbac.util.SqlBatchActionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：配置
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@Service
public class SysConfigServiceImpl implements SysConfigService {
    @Autowired
    private SysConfigDomainService sysConfigDomainService;

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public boolean save(ConfigRequest configRequest) {
        String id = configRequest.getId();
        LocalDateTime localDateTime = DateUtils3.grabCurrentDateTime();

        SysConfig sysConfig = new SysConfig().setValue(configRequest.getValue())
                                             .setLabelNam(configRequest.getLabelNam())
                                             .setType(configRequest.getType())
                                             .setDescInf(configRequest.getDescInf())
                                             .setSort(configRequest.getSort())
                                             .setRemarks(configRequest.getRemarks())
                                             .setDelFlg(StatusConsts.NORMAL_STATUS);

        if (StringUtils.isBlank(id) || "0".equals(id) || "0L".equalsIgnoreCase(id)) {
            // 当前无主键，做插入，注意：主键由MyBatis Plus生成
            log.info("系统配置——保存");
            // TODO 上下文中获取操作员信息
            sysConfig.setCrtBy(configRequest.getCrtBy());
            sysConfig.setCrtTim(localDateTime);
            return sysConfigDomainService.insert(sysConfig);
        }
        if (RegExpValidatorUtils.longNumberMatch(RegExpValidatorUtils.LONG_NUMBER_REGEXP, id)) {
            // 当前有主键，做更新
            log.info("系统配置——更新");
            // TODO 上下文中获取操作员信息
            sysConfig.setId(Long.valueOf(id));
            sysConfig.setLstUpdBy(configRequest.getLstUpdBy());
            sysConfig.setLstUpdTim(localDateTime);
            return sysConfigDomainService.update(sysConfig);
        }
        // 主键有问题
        return false;
    }

    @Override
    public boolean delete(List<ConfigRequest> configRequestList) {
        SqlBatchActionUtil.doBatch(sqlSessionFactory, configRequestList, SqlBatchActionUtil.BATCH_SIZE, this::delete);
        return sysConfigDomainService.delete();
    }

    @Override
    public boolean delete(ConfigRequest configRequest) {
        Long id = Long.valueOf(configRequest.getId());
        String lstUpdBy = configRequest.getLstUpdBy();
        return sysConfigDomainService.deleteById(id, lstUpdBy);
    }

    @Override
    public List<ConfigDTO> findPage(PageQuery pageQuery) {
        List<SysConfig> sysConfigList = sysConfigDomainService.findPage();
        return new ArrayList<>();
    }

    @Override
    public List<ConfigDTO> findByLabel(String label) {
        List<SysConfig> sysConfigList = sysConfigDomainService.findByLabel();
        return new ArrayList<>();
    }
}
