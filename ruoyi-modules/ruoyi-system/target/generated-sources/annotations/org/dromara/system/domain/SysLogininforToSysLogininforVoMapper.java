package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysLogininforVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysLogininforToSysLogininforVoMapper extends BaseMapper<SysLogininfor, SysLogininforVo> {
  SysLogininforVo convert(SysLogininfor source, @MappingTarget SysLogininforVo target);
}
