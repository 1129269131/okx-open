package org.dromara.system.domain.bo;

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
public interface SysLogininforBoToSysLogininforMapper extends BaseMapper<SysLogininforBo, SysLogininfor> {
  SysLogininfor convert(SysLogininforBo source, @MappingTarget SysLogininfor target);
}
