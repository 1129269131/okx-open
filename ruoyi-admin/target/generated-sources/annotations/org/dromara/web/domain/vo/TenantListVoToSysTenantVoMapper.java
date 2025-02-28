package org.dromara.web.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysTenantVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TenantListVoToSysTenantVoMapper extends BaseMapper<TenantListVo, SysTenantVo> {
  SysTenantVo convert(TenantListVo source, @MappingTarget SysTenantVo target);
}
