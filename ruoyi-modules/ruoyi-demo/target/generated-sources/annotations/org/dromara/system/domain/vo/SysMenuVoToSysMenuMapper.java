package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysMenu;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysMenuVoToSysMenuMapper extends BaseMapper<SysMenuVo, SysMenu> {
  SysMenu convert(SysMenuVo source, @MappingTarget SysMenu target);
}
