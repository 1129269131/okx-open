package org.dromara.demo.domain;

import javax.annotation.processing.Generated;
import org.dromara.demo.domain.vo.TestDemoVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:44:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class TestDemoToTestDemoVoMapperImpl implements TestDemoToTestDemoVoMapper {

    @Override
    public TestDemoVo convert(TestDemo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestDemoVo testDemoVo = new TestDemoVo();

        testDemoVo.setId( arg0.getId() );
        testDemoVo.setDeptId( arg0.getDeptId() );
        testDemoVo.setUserId( arg0.getUserId() );
        testDemoVo.setOrderNum( arg0.getOrderNum() );
        testDemoVo.setTestKey( arg0.getTestKey() );
        testDemoVo.setValue( arg0.getValue() );
        testDemoVo.setCreateTime( arg0.getCreateTime() );
        testDemoVo.setCreateBy( arg0.getCreateBy() );
        testDemoVo.setUpdateTime( arg0.getUpdateTime() );
        testDemoVo.setUpdateBy( arg0.getUpdateBy() );

        return testDemoVo;
    }

    @Override
    public TestDemoVo convert(TestDemo source, TestDemoVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setDeptId( source.getDeptId() );
        target.setUserId( source.getUserId() );
        target.setOrderNum( source.getOrderNum() );
        target.setTestKey( source.getTestKey() );
        target.setValue( source.getValue() );
        target.setCreateTime( source.getCreateTime() );
        target.setCreateBy( source.getCreateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        target.setUpdateBy( source.getUpdateBy() );

        return target;
    }
}
