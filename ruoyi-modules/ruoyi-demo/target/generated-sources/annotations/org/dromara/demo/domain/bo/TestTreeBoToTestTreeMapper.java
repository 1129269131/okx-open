package org.dromara.demo.domain.bo;

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
public interface TestTreeBoToTestTreeMapper extends BaseMapper<TestTreeBo, TestTree> {
  TestTree convert(TestTreeBo source, @MappingTarget TestTree target);
}
