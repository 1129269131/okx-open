package org.dromara.demo.domain.vo;

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
public interface TestDemoVoToTestDemoMapper extends BaseMapper<TestDemoVo, TestDemo> {
  TestDemo convert(TestDemoVo source, @MappingTarget TestDemo target);
}
