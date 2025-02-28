package io.github.linpeilie;

import org.dromara.system.domain.vo.SysTenantVo;
import org.dromara.system.domain.vo.SysTenantVoToTenantListVoMapper;
import org.dromara.web.domain.vo.TenantListVo;
import org.dromara.web.domain.vo.TenantListVoToSysTenantVoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private TenantListVoToSysTenantVoMapper tenantListVoToSysTenantVoMapper;

  @Autowired
  @Lazy
  private SysTenantVoToTenantListVoMapper sysTenantVoToTenantListVoMapper;

  public SysTenantVo org_dromara_web_domain_vo_TenantListVoToSysTenantVo(TenantListVo param) {
    return tenantListVoToSysTenantVoMapper.convert(param);}

  public TenantListVo org_dromara_system_domain_vo_SysTenantVoToTenantListVo(SysTenantVo param) {
    return sysTenantVoToTenantListVoMapper.convert(param);}
}
