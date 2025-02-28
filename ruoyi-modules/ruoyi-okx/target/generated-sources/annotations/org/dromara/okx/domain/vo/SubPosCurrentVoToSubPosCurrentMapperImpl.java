package org.dromara.okx.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.okx.domain.SubPosCurrent;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SubPosCurrentVoToSubPosCurrentMapperImpl implements SubPosCurrentVoToSubPosCurrentMapper {

    @Override
    public SubPosCurrent convert(SubPosCurrentVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SubPosCurrent subPosCurrent = new SubPosCurrent();

        subPosCurrent.setId( arg0.getId() );
        subPosCurrent.setInstId( arg0.getInstId() );
        subPosCurrent.setPosSide( arg0.getPosSide() );
        subPosCurrent.setMgnMode( arg0.getMgnMode() );
        subPosCurrent.setLever( arg0.getLever() );
        subPosCurrent.setOpenAvgPx( arg0.getOpenAvgPx() );
        subPosCurrent.setOpenTimeDate( arg0.getOpenTimeDate() );
        subPosCurrent.setSubPos( arg0.getSubPos() );
        subPosCurrent.setInstType( arg0.getInstType() );
        subPosCurrent.setMargin( arg0.getMargin() );
        subPosCurrent.setUpl( arg0.getUpl() );
        subPosCurrent.setUplRatio( arg0.getUplRatio() );
        subPosCurrent.setMarkPx( arg0.getMarkPx() );
        subPosCurrent.setUniqueCode( arg0.getUniqueCode() );

        return subPosCurrent;
    }

    @Override
    public SubPosCurrent convert(SubPosCurrentVo source, SubPosCurrent target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setInstId( source.getInstId() );
        target.setPosSide( source.getPosSide() );
        target.setMgnMode( source.getMgnMode() );
        target.setLever( source.getLever() );
        target.setOpenAvgPx( source.getOpenAvgPx() );
        target.setOpenTimeDate( source.getOpenTimeDate() );
        target.setSubPos( source.getSubPos() );
        target.setInstType( source.getInstType() );
        target.setMargin( source.getMargin() );
        target.setUpl( source.getUpl() );
        target.setUplRatio( source.getUplRatio() );
        target.setMarkPx( source.getMarkPx() );
        target.setUniqueCode( source.getUniqueCode() );

        return target;
    }
}
