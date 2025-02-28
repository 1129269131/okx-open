package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysDeptVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysDeptToSysDeptVoMapperImpl implements SysDeptToSysDeptVoMapper {

    @Override
    public SysDeptVo convert(SysDept arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDeptVo sysDeptVo = new SysDeptVo();

        sysDeptVo.setDeptId( arg0.getDeptId() );
        sysDeptVo.setParentId( arg0.getParentId() );
        sysDeptVo.setAncestors( arg0.getAncestors() );
        sysDeptVo.setDeptName( arg0.getDeptName() );
        sysDeptVo.setOrderNum( arg0.getOrderNum() );
        sysDeptVo.setLeader( arg0.getLeader() );
        sysDeptVo.setPhone( arg0.getPhone() );
        sysDeptVo.setEmail( arg0.getEmail() );
        sysDeptVo.setStatus( arg0.getStatus() );
        sysDeptVo.setCreateTime( arg0.getCreateTime() );

        return sysDeptVo;
    }

    @Override
    public SysDeptVo convert(SysDept source, SysDeptVo target) {
        if ( source == null ) {
            return target;
        }

        target.setDeptId( source.getDeptId() );
        target.setParentId( source.getParentId() );
        target.setAncestors( source.getAncestors() );
        target.setDeptName( source.getDeptName() );
        target.setOrderNum( source.getOrderNum() );
        target.setLeader( source.getLeader() );
        target.setPhone( source.getPhone() );
        target.setEmail( source.getEmail() );
        target.setStatus( source.getStatus() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
