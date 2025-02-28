package org.dromara.system.domain.vo;

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
public interface SysClientVoToSysClientMapper extends BaseMapper<SysClientVo, SysClient> {
  SysClient convert(SysClientVo source, @MappingTarget SysClient target);
}
