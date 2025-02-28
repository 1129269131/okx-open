package org.dromara.system.domain.bo;

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
public interface SysTenantBoToSysTenantMapper extends BaseMapper<SysTenantBo, SysTenant> {
  SysTenant convert(SysTenantBo source, @MappingTarget SysTenant target);
}
