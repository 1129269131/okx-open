package io.github.linpeilie;

import org.dromara.demo.domain.TestDemo;
import org.dromara.demo.domain.TestDemoToTestDemoVoMapper;
import org.dromara.demo.domain.TestTree;
import org.dromara.demo.domain.TestTreeToTestTreeVoMapper;
import org.dromara.demo.domain.bo.TestDemoBo;
import org.dromara.demo.domain.bo.TestDemoBoToTestDemoMapper;
import org.dromara.demo.domain.bo.TestTreeBo;
import org.dromara.demo.domain.bo.TestTreeBoToTestTreeMapper;
import org.dromara.demo.domain.vo.TestDemoVo;
import org.dromara.demo.domain.vo.TestDemoVoToTestDemoMapper;
import org.dromara.demo.domain.vo.TestTreeVo;
import org.dromara.demo.domain.vo.TestTreeVoToTestTreeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private TestTreeBoToTestTreeMapper testTreeBoToTestTreeMapper;

  @Autowired
  @Lazy
  private TestTreeToTestTreeVoMapper testTreeToTestTreeVoMapper;

  @Autowired
  @Lazy
  private TestDemoVoToTestDemoMapper testDemoVoToTestDemoMapper;

  @Autowired
  @Lazy
  private TestDemoBoToTestDemoMapper testDemoBoToTestDemoMapper;

  @Autowired
  @Lazy
  private TestDemoToTestDemoVoMapper testDemoToTestDemoVoMapper;

  @Autowired
  @Lazy
  private TestTreeVoToTestTreeMapper testTreeVoToTestTreeMapper;

  public TestTree org_dromara_demo_domain_bo_TestTreeBoToTestTree(TestTreeBo param) {
    return testTreeBoToTestTreeMapper.convert(param);}

  public TestTreeVo org_dromara_demo_domain_TestTreeToTestTreeVo(TestTree param) {
    return testTreeToTestTreeVoMapper.convert(param);}

  public TestDemo org_dromara_demo_domain_vo_TestDemoVoToTestDemo(TestDemoVo param) {
    return testDemoVoToTestDemoMapper.convert(param);}

  public TestDemo org_dromara_demo_domain_bo_TestDemoBoToTestDemo(TestDemoBo param) {
    return testDemoBoToTestDemoMapper.convert(param);}

  public TestDemoVo org_dromara_demo_domain_TestDemoToTestDemoVo(TestDemo param) {
    return testDemoToTestDemoVoMapper.convert(param);}

  public TestTree org_dromara_demo_domain_vo_TestTreeVoToTestTree(TestTreeVo param) {
    return testTreeVoToTestTreeMapper.convert(param);}
}
