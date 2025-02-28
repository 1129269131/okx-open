package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysDictData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysDictDataVoToSysDictDataMapperImpl implements SysDictDataVoToSysDictDataMapper {

    @Override
    public SysDictData convert(SysDictDataVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictData sysDictData = new SysDictData();

        sysDictData.setCreateTime( arg0.getCreateTime() );
        sysDictData.setDictCode( arg0.getDictCode() );
        sysDictData.setDictSort( arg0.getDictSort() );
        sysDictData.setDictLabel( arg0.getDictLabel() );
        sysDictData.setDictValue( arg0.getDictValue() );
        sysDictData.setDictType( arg0.getDictType() );
        sysDictData.setCssClass( arg0.getCssClass() );
        sysDictData.setListClass( arg0.getListClass() );
        sysDictData.setIsDefault( arg0.getIsDefault() );
        sysDictData.setRemark( arg0.getRemark() );

        return sysDictData;
    }

    @Override
    public SysDictData convert(SysDictDataVo source, SysDictData target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setDictCode( source.getDictCode() );
        target.setDictSort( source.getDictSort() );
        target.setDictLabel( source.getDictLabel() );
        target.setDictValue( source.getDictValue() );
        target.setDictType( source.getDictType() );
        target.setCssClass( source.getCssClass() );
        target.setListClass( source.getListClass() );
        target.setIsDefault( source.getIsDefault() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
