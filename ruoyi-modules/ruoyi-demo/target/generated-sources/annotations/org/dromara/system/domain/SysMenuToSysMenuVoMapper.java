package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysMenuVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysMenuToSysMenuVoMapper extends BaseMapper<SysMenu, SysMenuVo> {
  SysMenuVo convert(SysMenu source, @MappingTarget SysMenuVo target);
}
