package org.dromara.demo.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.demo.domain.TestTree;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TestTreeVoToTestTreeMapper extends BaseMapper<TestTreeVo, TestTree> {
  TestTree convert(TestTreeVo source, @MappingTarget TestTree target);
}
