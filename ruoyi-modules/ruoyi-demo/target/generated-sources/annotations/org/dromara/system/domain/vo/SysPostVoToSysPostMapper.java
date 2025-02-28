package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysPost;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysPostVoToSysPostMapper extends BaseMapper<SysPostVo, SysPost> {
  SysPost convert(SysPostVo source, @MappingTarget SysPost target);
}
