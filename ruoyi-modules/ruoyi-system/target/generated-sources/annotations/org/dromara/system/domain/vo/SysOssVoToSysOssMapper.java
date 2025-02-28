package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysOss;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOssVoToSysOssMapper extends BaseMapper<SysOssVo, SysOss> {
  SysOss convert(SysOssVo source, @MappingTarget SysOss target);
}
