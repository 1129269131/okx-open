package org.dromara.okx.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.vo.UserSwapConfigVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface UserSwapConfigToUserSwapConfigVoMapper extends BaseMapper<UserSwapConfig, UserSwapConfigVo> {
  UserSwapConfigVo convert(UserSwapConfig source, @MappingTarget UserSwapConfigVo target);
}
