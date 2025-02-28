package org.dromara.demo.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.demo.domain.vo.TestTreeVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TestTreeToTestTreeVoMapper extends BaseMapper<TestTree, TestTreeVo> {
  TestTreeVo convert(TestTree source, @MappingTarget TestTreeVo target);
}
