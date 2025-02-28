package org.dromara.demo.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.demo.domain.vo.TestDemoVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface TestDemoToTestDemoVoMapper extends BaseMapper<TestDemo, TestDemoVo> {
  TestDemoVo convert(TestDemo source, @MappingTarget TestDemoVo target);
}
