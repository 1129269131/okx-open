package org.dromara.demo.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.demo.domain.TestTree;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:44:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class TestTreeVoToTestTreeMapperImpl implements TestTreeVoToTestTreeMapper {

    @Override
    public TestTree convert(TestTreeVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestTree testTree = new TestTree();

        testTree.setCreateTime( arg0.getCreateTime() );
        testTree.setId( arg0.getId() );
        testTree.setParentId( arg0.getParentId() );
        testTree.setDeptId( arg0.getDeptId() );
        testTree.setUserId( arg0.getUserId() );
        testTree.setTreeName( arg0.getTreeName() );

        return testTree;
    }

    @Override
    public TestTree convert(TestTreeVo source, TestTree target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setId( source.getId() );
        target.setParentId( source.getParentId() );
        target.setDeptId( source.getDeptId() );
        target.setUserId( source.getUserId() );
        target.setTreeName( source.getTreeName() );

        return target;
    }
}
