package org.dromara.okx.domain.bo;

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
public interface UserSwapConfigBoToUserSwapConfigMapper extends BaseMapper<UserSwapConfigBo, UserSwapConfig> {
  UserSwapConfig convert(UserSwapConfigBo source, @MappingTarget UserSwapConfig target);
}
