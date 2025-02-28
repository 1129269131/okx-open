package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysOperLogVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOperLogToSysOperLogVoMapper extends BaseMapper<SysOperLog, SysOperLogVo> {
  SysOperLogVo convert(SysOperLog source, @MappingTarget SysOperLogVo target);
}
