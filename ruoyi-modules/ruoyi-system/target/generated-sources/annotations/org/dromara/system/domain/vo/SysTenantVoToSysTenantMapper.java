package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysTenant;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysTenantVoToSysTenantMapper extends BaseMapper<SysTenantVo, SysTenant> {
  SysTenant convert(SysTenantVo source, @MappingTarget SysTenant target);
}
