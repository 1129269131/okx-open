package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysDictTypeVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysDictTypeToSysDictTypeVoMapperImpl implements SysDictTypeToSysDictTypeVoMapper {

    @Override
    public SysDictTypeVo convert(SysDictType arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictTypeVo sysDictTypeVo = new SysDictTypeVo();

        sysDictTypeVo.setDictId( arg0.getDictId() );
        sysDictTypeVo.setDictName( arg0.getDictName() );
        sysDictTypeVo.setDictType( arg0.getDictType() );
        sysDictTypeVo.setRemark( arg0.getRemark() );
        sysDictTypeVo.setCreateTime( arg0.getCreateTime() );

        return sysDictTypeVo;
    }

    @Override
    public SysDictTypeVo convert(SysDictType source, SysDictTypeVo target) {
        if ( source == null ) {
            return target;
        }

        target.setDictId( source.getDictId() );
        target.setDictName( source.getDictName() );
        target.setDictType( source.getDictType() );
        target.setRemark( source.getRemark() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
