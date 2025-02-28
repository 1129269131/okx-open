package io.github.linpeilie;

import org.dromara.okx.domain.ClientUser;
import org.dromara.okx.domain.ClientUserToClientUserVoMapper;
import org.dromara.okx.domain.CopytradingInfo;
import org.dromara.okx.domain.CopytradingInfoToCopytradingInfoVoMapper;
import org.dromara.okx.domain.InstPushInfo;
import org.dromara.okx.domain.InstPushInfoToInstPushInfoVoMapper;
import org.dromara.okx.domain.SubPosCurrent;
import org.dromara.okx.domain.SubPosCurrentToSubPosCurrentVoMapper;
import org.dromara.okx.domain.SubPosHis;
import org.dromara.okx.domain.SubPosHisToSubPosHisVoMapper;
import org.dromara.okx.domain.UserSwapConfig;
import org.dromara.okx.domain.UserSwapConfigToUserSwapConfigVoMapper;
import org.dromara.okx.domain.bo.ClientUserBo;
import org.dromara.okx.domain.bo.ClientUserBoToClientUserMapper;
import org.dromara.okx.domain.bo.CopytradingInfoBo;
import org.dromara.okx.domain.bo.CopytradingInfoBoToCopytradingInfoMapper;
import org.dromara.okx.domain.bo.InstPushInfoBo;
import org.dromara.okx.domain.bo.InstPushInfoBoToInstPushInfoMapper;
import org.dromara.okx.domain.bo.SubPosCurrentBo;
import org.dromara.okx.domain.bo.SubPosCurrentBoToSubPosCurrentMapper;
import org.dromara.okx.domain.bo.SubPosHisBo;
import org.dromara.okx.domain.bo.SubPosHisBoToSubPosHisMapper;
import org.dromara.okx.domain.bo.UserSwapConfigBo;
import org.dromara.okx.domain.bo.UserSwapConfigBoToUserSwapConfigMapper;
import org.dromara.okx.domain.vo.ClientUserVo;
import org.dromara.okx.domain.vo.ClientUserVoToClientUserMapper;
import org.dromara.okx.domain.vo.CopytradingInfoVo;
import org.dromara.okx.domain.vo.CopytradingInfoVoToCopytradingInfoMapper;
import org.dromara.okx.domain.vo.InstPushInfoVo;
import org.dromara.okx.domain.vo.InstPushInfoVoToInstPushInfoMapper;
import org.dromara.okx.domain.vo.SubPosCurrentVo;
import org.dromara.okx.domain.vo.SubPosCurrentVoToSubPosCurrentMapper;
import org.dromara.okx.domain.vo.SubPosHisVo;
import org.dromara.okx.domain.vo.SubPosHisVoToSubPosHisMapper;
import org.dromara.okx.domain.vo.UserSwapConfigVo;
import org.dromara.okx.domain.vo.UserSwapConfigVoToUserSwapConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private SubPosHisVoToSubPosHisMapper subPosHisVoToSubPosHisMapper;

  @Autowired
  @Lazy
  private ClientUserVoToClientUserMapper clientUserVoToClientUserMapper;

  @Autowired
  @Lazy
  private SubPosCurrentBoToSubPosCurrentMapper subPosCurrentBoToSubPosCurrentMapper;

  @Autowired
  @Lazy
  private InstPushInfoBoToInstPushInfoMapper instPushInfoBoToInstPushInfoMapper;

  @Autowired
  @Lazy
  private CopytradingInfoBoToCopytradingInfoMapper copytradingInfoBoToCopytradingInfoMapper;

  @Autowired
  @Lazy
  private UserSwapConfigVoToUserSwapConfigMapper userSwapConfigVoToUserSwapConfigMapper;

  @Autowired
  @Lazy
  private SubPosHisBoToSubPosHisMapper subPosHisBoToSubPosHisMapper;

  @Autowired
  @Lazy
  private CopytradingInfoVoToCopytradingInfoMapper copytradingInfoVoToCopytradingInfoMapper;

  @Autowired
  @Lazy
  private UserSwapConfigBoToUserSwapConfigMapper userSwapConfigBoToUserSwapConfigMapper;

  @Autowired
  @Lazy
  private SubPosHisToSubPosHisVoMapper subPosHisToSubPosHisVoMapper;

  @Autowired
  @Lazy
  private SubPosCurrentToSubPosCurrentVoMapper subPosCurrentToSubPosCurrentVoMapper;

  @Autowired
  @Lazy
  private ClientUserBoToClientUserMapper clientUserBoToClientUserMapper;

  @Autowired
  @Lazy
  private ClientUserToClientUserVoMapper clientUserToClientUserVoMapper;

  @Autowired
  @Lazy
  private SubPosCurrentVoToSubPosCurrentMapper subPosCurrentVoToSubPosCurrentMapper;

  @Autowired
  @Lazy
  private InstPushInfoToInstPushInfoVoMapper instPushInfoToInstPushInfoVoMapper;

  @Autowired
  @Lazy
  private CopytradingInfoToCopytradingInfoVoMapper copytradingInfoToCopytradingInfoVoMapper;

  @Autowired
  @Lazy
  private UserSwapConfigToUserSwapConfigVoMapper userSwapConfigToUserSwapConfigVoMapper;

  @Autowired
  @Lazy
  private InstPushInfoVoToInstPushInfoMapper instPushInfoVoToInstPushInfoMapper;

  public SubPosHis org_dromara_okx_domain_vo_SubPosHisVoToSubPosHis(SubPosHisVo param) {
    return subPosHisVoToSubPosHisMapper.convert(param);}

  public ClientUser org_dromara_okx_domain_vo_ClientUserVoToClientUser(ClientUserVo param) {
    return clientUserVoToClientUserMapper.convert(param);}

  public SubPosCurrent org_dromara_okx_domain_bo_SubPosCurrentBoToSubPosCurrent(SubPosCurrentBo param) {
    return subPosCurrentBoToSubPosCurrentMapper.convert(param);}

  public InstPushInfo org_dromara_okx_domain_bo_InstPushInfoBoToInstPushInfo(InstPushInfoBo param) {
    return instPushInfoBoToInstPushInfoMapper.convert(param);}

  public CopytradingInfo org_dromara_okx_domain_bo_CopytradingInfoBoToCopytradingInfo(CopytradingInfoBo param) {
    return copytradingInfoBoToCopytradingInfoMapper.convert(param);}

  public UserSwapConfig org_dromara_okx_domain_vo_UserSwapConfigVoToUserSwapConfig(UserSwapConfigVo param) {
    return userSwapConfigVoToUserSwapConfigMapper.convert(param);}

  public SubPosHis org_dromara_okx_domain_bo_SubPosHisBoToSubPosHis(SubPosHisBo param) {
    return subPosHisBoToSubPosHisMapper.convert(param);}

  public CopytradingInfo org_dromara_okx_domain_vo_CopytradingInfoVoToCopytradingInfo(CopytradingInfoVo param) {
    return copytradingInfoVoToCopytradingInfoMapper.convert(param);}

  public UserSwapConfig org_dromara_okx_domain_bo_UserSwapConfigBoToUserSwapConfig(UserSwapConfigBo param) {
    return userSwapConfigBoToUserSwapConfigMapper.convert(param);}

  public SubPosHisVo org_dromara_okx_domain_SubPosHisToSubPosHisVo(SubPosHis param) {
    return subPosHisToSubPosHisVoMapper.convert(param);}

  public SubPosCurrentVo org_dromara_okx_domain_SubPosCurrentToSubPosCurrentVo(SubPosCurrent param) {
    return subPosCurrentToSubPosCurrentVoMapper.convert(param);}

  public ClientUser org_dromara_okx_domain_bo_ClientUserBoToClientUser(ClientUserBo param) {
    return clientUserBoToClientUserMapper.convert(param);}

  public ClientUserVo org_dromara_okx_domain_ClientUserToClientUserVo(ClientUser param) {
    return clientUserToClientUserVoMapper.convert(param);}

  public SubPosCurrent org_dromara_okx_domain_vo_SubPosCurrentVoToSubPosCurrent(SubPosCurrentVo param) {
    return subPosCurrentVoToSubPosCurrentMapper.convert(param);}

  public InstPushInfoVo org_dromara_okx_domain_InstPushInfoToInstPushInfoVo(InstPushInfo param) {
    return instPushInfoToInstPushInfoVoMapper.convert(param);}

  public CopytradingInfoVo org_dromara_okx_domain_CopytradingInfoToCopytradingInfoVo(CopytradingInfo param) {
    return copytradingInfoToCopytradingInfoVoMapper.convert(param);}

  public UserSwapConfigVo org_dromara_okx_domain_UserSwapConfigToUserSwapConfigVo(UserSwapConfig param) {
    return userSwapConfigToUserSwapConfigVoMapper.convert(param);}

  public InstPushInfo org_dromara_okx_domain_vo_InstPushInfoVoToInstPushInfo(InstPushInfoVo param) {
    return instPushInfoVoToInstPushInfoMapper.convert(param);}
}
