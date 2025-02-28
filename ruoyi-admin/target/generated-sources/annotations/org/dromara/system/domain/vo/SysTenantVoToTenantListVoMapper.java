package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.web.domain.vo.TenantListVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysTenantVoToTenantListVoMapper extends BaseMapper<SysTenantVo, TenantListVo> {
  TenantListVo convert(SysTenantVo source, @MappingTarget TenantListVo target);
}
