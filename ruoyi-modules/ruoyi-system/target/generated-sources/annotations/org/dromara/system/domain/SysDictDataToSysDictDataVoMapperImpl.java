package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysDictDataVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysDictDataToSysDictDataVoMapperImpl implements SysDictDataToSysDictDataVoMapper {

    @Override
    public SysDictDataVo convert(SysDictData arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictDataVo sysDictDataVo = new SysDictDataVo();

        sysDictDataVo.setDictCode( arg0.getDictCode() );
        sysDictDataVo.setDictSort( arg0.getDictSort() );
        sysDictDataVo.setDictLabel( arg0.getDictLabel() );
        sysDictDataVo.setDictValue( arg0.getDictValue() );
        sysDictDataVo.setDictType( arg0.getDictType() );
        sysDictDataVo.setCssClass( arg0.getCssClass() );
        sysDictDataVo.setListClass( arg0.getListClass() );
        sysDictDataVo.setIsDefault( arg0.getIsDefault() );
        sysDictDataVo.setRemark( arg0.getRemark() );
        sysDictDataVo.setCreateTime( arg0.getCreateTime() );

        return sysDictDataVo;
    }

    @Override
    public SysDictDataVo convert(SysDictData source, SysDictDataVo target) {
        if ( source == null ) {
            return target;
        }

        target.setDictCode( source.getDictCode() );
        target.setDictSort( source.getDictSort() );
        target.setDictLabel( source.getDictLabel() );
        target.setDictValue( source.getDictValue() );
        target.setDictType( source.getDictType() );
        target.setCssClass( source.getCssClass() );
        target.setListClass( source.getListClass() );
        target.setIsDefault( source.getIsDefault() );
        target.setRemark( source.getRemark() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
