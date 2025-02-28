package org.dromara.okx.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.UserSwapConfig;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface UserSwapConfigVoToUserSwapConfigMapper extends BaseMapper<UserSwapConfigVo, UserSwapConfig> {
  UserSwapConfig convert(UserSwapConfigVo source, @MappingTarget UserSwapConfig target);
}
