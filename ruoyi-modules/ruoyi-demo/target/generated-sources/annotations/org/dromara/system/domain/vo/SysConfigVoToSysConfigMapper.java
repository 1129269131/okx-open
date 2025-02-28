package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysConfig;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysConfigVoToSysConfigMapper extends BaseMapper<SysConfigVo, SysConfig> {
  SysConfig convert(SysConfigVo source, @MappingTarget SysConfig target);
}
