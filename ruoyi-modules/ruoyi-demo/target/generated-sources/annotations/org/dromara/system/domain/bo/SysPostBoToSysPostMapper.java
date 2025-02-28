package org.dromara.system.domain.bo;

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
public interface SysPostBoToSysPostMapper extends BaseMapper<SysPostBo, SysPost> {
  SysPost convert(SysPostBo source, @MappingTarget SysPost target);
}
