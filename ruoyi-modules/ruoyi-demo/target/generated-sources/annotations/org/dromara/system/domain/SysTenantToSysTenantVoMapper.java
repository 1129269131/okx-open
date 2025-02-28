package org.dromara.system.domain;

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
public interface SysTenantToSysTenantVoMapper extends BaseMapper<SysTenant, SysTenantVo> {
  SysTenantVo convert(SysTenant source, @MappingTarget SysTenantVo target);
}
