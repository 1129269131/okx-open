package org.dromara.demo.domain;

import javax.annotation.processing.Generated;
import org.dromara.demo.domain.vo.TestTreeVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:44:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class TestTreeToTestTreeVoMapperImpl implements TestTreeToTestTreeVoMapper {

    @Override
    public TestTreeVo convert(TestTree arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestTreeVo testTreeVo = new TestTreeVo();

        testTreeVo.setId( arg0.getId() );
        testTreeVo.setParentId( arg0.getParentId() );
        testTreeVo.setDeptId( arg0.getDeptId() );
        testTreeVo.setUserId( arg0.getUserId() );
        testTreeVo.setTreeName( arg0.getTreeName() );
        testTreeVo.setCreateTime( arg0.getCreateTime() );

        return testTreeVo;
    }

    @Override
    public TestTreeVo convert(TestTree source, TestTreeVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setParentId( source.getParentId() );
        target.setDeptId( source.getDeptId() );
        target.setUserId( source.getUserId() );
        target.setTreeName( source.getTreeName() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
