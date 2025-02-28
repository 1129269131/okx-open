package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysClientVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysClientToSysClientVoMapper extends BaseMapper<SysClient, SysClientVo> {
  SysClientVo convert(SysClient source, @MappingTarget SysClientVo target);
}
