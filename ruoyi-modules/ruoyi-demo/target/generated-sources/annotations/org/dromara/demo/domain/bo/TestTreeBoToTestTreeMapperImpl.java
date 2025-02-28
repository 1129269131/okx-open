package org.dromara.demo.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.demo.domain.TestTree;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:44:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class TestTreeBoToTestTreeMapperImpl implements TestTreeBoToTestTreeMapper {

    @Override
    public TestTree convert(TestTreeBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestTree testTree = new TestTree();

        testTree.setSearchValue( arg0.getSearchValue() );
        testTree.setCreateDept( arg0.getCreateDept() );
        testTree.setCreateBy( arg0.getCreateBy() );
        testTree.setCreateTime( arg0.getCreateTime() );
        testTree.setUpdateBy( arg0.getUpdateBy() );
        testTree.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            testTree.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        testTree.setId( arg0.getId() );
        testTree.setParentId( arg0.getParentId() );
        testTree.setDeptId( arg0.getDeptId() );
        testTree.setUserId( arg0.getUserId() );
        testTree.setTreeName( arg0.getTreeName() );

        return testTree;
    }

    @Override
    public TestTree convert(TestTreeBo source, TestTree target) {
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
        target.setParentId( source.getParentId() );
        target.setDeptId( source.getDeptId() );
        target.setUserId( source.getUserId() );
        target.setTreeName( source.getTreeName() );

        return target;
    }
}
