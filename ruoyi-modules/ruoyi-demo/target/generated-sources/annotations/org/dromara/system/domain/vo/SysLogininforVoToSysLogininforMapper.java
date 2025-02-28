package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysLogininfor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysLogininforVoToSysLogininforMapper extends BaseMapper<SysLogininforVo, SysLogininfor> {
  SysLogininfor convert(SysLogininforVo source, @MappingTarget SysLogininfor target);
}
