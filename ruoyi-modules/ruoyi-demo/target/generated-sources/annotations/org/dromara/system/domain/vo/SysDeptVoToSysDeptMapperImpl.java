package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysDept;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysDeptVoToSysDeptMapperImpl implements SysDeptVoToSysDeptMapper {

    @Override
    public SysDept convert(SysDeptVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDept sysDept = new SysDept();

        sysDept.setCreateTime( arg0.getCreateTime() );
        sysDept.setDeptId( arg0.getDeptId() );
        sysDept.setParentId( arg0.getParentId() );
        sysDept.setDeptName( arg0.getDeptName() );
        sysDept.setOrderNum( arg0.getOrderNum() );
        sysDept.setLeader( arg0.getLeader() );
        sysDept.setPhone( arg0.getPhone() );
        sysDept.setEmail( arg0.getEmail() );
        sysDept.setStatus( arg0.getStatus() );
        sysDept.setAncestors( arg0.getAncestors() );

        return sysDept;
    }

    @Override
    public SysDept convert(SysDeptVo source, SysDept target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setDeptId( source.getDeptId() );
        target.setParentId( source.getParentId() );
        target.setDeptName( source.getDeptName() );
        target.setOrderNum( source.getOrderNum() );
        target.setLeader( source.getLeader() );
        target.setPhone( source.getPhone() );
        target.setEmail( source.getEmail() );
        target.setStatus( source.getStatus() );
        target.setAncestors( source.getAncestors() );

        return target;
    }
}
