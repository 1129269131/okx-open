package org.dromara.system.domain.bo;

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
public interface SysMenuBoToSysMenuMapper extends BaseMapper<SysMenuBo, SysMenu> {
  SysMenu convert(SysMenuBo source, @MappingTarget SysMenu target);
}
