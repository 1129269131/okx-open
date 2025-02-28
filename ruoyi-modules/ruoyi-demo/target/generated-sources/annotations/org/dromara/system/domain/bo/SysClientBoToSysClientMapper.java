package org.dromara.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysClient;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysClientBoToSysClientMapper extends BaseMapper<SysClientBo, SysClient> {
  SysClient convert(SysClientBo source, @MappingTarget SysClient target);
}
