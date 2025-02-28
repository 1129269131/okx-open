package org.dromara.demo.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.demo.domain.TestDemo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TestDemoBoToTestDemoMapper extends BaseMapper<TestDemoBo, TestDemo> {
  TestDemo convert(TestDemoBo source, @MappingTarget TestDemo target);
}
