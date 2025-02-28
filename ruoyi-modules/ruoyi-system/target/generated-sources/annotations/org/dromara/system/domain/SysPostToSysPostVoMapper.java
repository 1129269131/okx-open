package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysPostVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysPostToSysPostVoMapper extends BaseMapper<SysPost, SysPostVo> {
  SysPostVo convert(SysPost source, @MappingTarget SysPostVo target);
}
