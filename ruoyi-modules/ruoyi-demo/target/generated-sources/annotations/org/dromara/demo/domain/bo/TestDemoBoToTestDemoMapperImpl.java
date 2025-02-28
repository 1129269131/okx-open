package org.dromara.demo.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.demo.domain.TestDemo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:44:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class TestDemoBoToTestDemoMapperImpl implements TestDemoBoToTestDemoMapper {

    @Override
    public TestDemo convert(TestDemoBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestDemo testDemo = new TestDemo();

        testDemo.setSearchValue( arg0.getSearchValue() );
        testDemo.setCreateDept( arg0.getCreateDept() );
        testDemo.setCreateBy( arg0.getCreateBy() );
        testDemo.setCreateTime( arg0.getCreateTime() );
        testDemo.setUpdateBy( arg0.getUpdateBy() );
        testDemo.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            testDemo.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        testDemo.setId( arg0.getId() );
        testDemo.setDeptId( arg0.getDeptId() );
        testDemo.setUserId( arg0.getUserId() );
        testDemo.setOrderNum( arg0.getOrderNum() );
        testDemo.setTestKey( arg0.getTestKey() );
        testDemo.setValue( arg0.getValue() );

        return testDemo;
    }

    @Override
    public TestDemo convert(TestDemoBo source, TestDemo target) {
        if ( source == null ) {
            return target;
        }

        target.setSearchValue( source.getSearchValue() );
        target.setCreateDept( source.getCreateDept() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        target.setId( source.getId() );
        target.setDeptId( source.getDeptId() );
        target.setUserId( source.getUserId() );
        target.setOrderNum( source.getOrderNum() );
        target.setTestKey( source.getTestKey() );
        target.setValue( source.getValue() );

        return target;
    }
}
