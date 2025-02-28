package org.dromara.demo.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.demo.domain.TestDemo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:44:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class TestDemoVoToTestDemoMapperImpl implements TestDemoVoToTestDemoMapper {

    @Override
    public TestDemo convert(TestDemoVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestDemo testDemo = new TestDemo();

        testDemo.setCreateBy( arg0.getCreateBy() );
        testDemo.setCreateTime( arg0.getCreateTime() );
        testDemo.setUpdateBy( arg0.getUpdateBy() );
        testDemo.setUpdateTime( arg0.getUpdateTime() );
        testDemo.setId( arg0.getId() );
        testDemo.setDeptId( arg0.getDeptId() );
        testDemo.setUserId( arg0.getUserId() );
        testDemo.setOrderNum( arg0.getOrderNum() );
        testDemo.setTestKey( arg0.getTestKey() );
        testDemo.setValue( arg0.getValue() );

        return testDemo;
    }

    @Override
    public TestDemo convert(TestDemoVo source, TestDemo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        target.setId( source.getId() );
        target.setDeptId( source.getDeptId() );
        target.setUserId( source.getUserId() );
        target.setOrderNum( source.getOrderNum() );
        target.setTestKey( source.getTestKey() );
        target.setValue( source.getValue() );

        return target;
    }
}
