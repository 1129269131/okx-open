package io.github.linpeilie;

import org.dromara.common.log.event.OperLogEvent;
import org.dromara.common.log.event.OperLogEventToSysOperLogBoMapper;
import org.dromara.system.domain.SysClient;
import org.dromara.system.domain.SysClientToSysClientVoMapper;
import org.dromara.system.domain.SysConfig;
import org.dromara.system.domain.SysConfigToSysConfigVoMapper;
import org.dromara.system.domain.SysDept;
import org.dromara.system.domain.SysDeptToSysDeptVoMapper;
import org.dromara.system.domain.SysDictData;
import org.dromara.system.domain.SysDictDataToSysDictDataVoMapper;
import org.dromara.system.domain.SysDictType;
import org.dromara.system.domain.SysDictTypeToSysDictTypeVoMapper;
import org.dromara.system.domain.SysLogininfor;
import org.dromara.system.domain.SysLogininforToSysLogininforVoMapper;
import org.dromara.system.domain.SysMenu;
import org.dromara.system.domain.SysMenuToSysMenuVoMapper;
import org.dromara.system.domain.SysNotice;
import org.dromara.system.domain.SysNoticeToSysNoticeVoMapper;
import org.dromara.system.domain.SysOperLog;
import org.dromara.system.domain.SysOperLogToSysOperLogVoMapper;
import org.dromara.system.domain.SysOss;
import org.dromara.system.domain.SysOssConfig;
import org.dromara.system.domain.SysOssConfigToSysOssConfigVoMapper;
import org.dromara.system.domain.SysOssToSysOssVoMapper;
import org.dromara.system.domain.SysPost;
import org.dromara.system.domain.SysPostToSysPostVoMapper;
import org.dromara.system.domain.SysRole;
import org.dromara.system.domain.SysRoleToSysRoleVoMapper;
import org.dromara.system.domain.SysSocial;
import org.dromara.system.domain.SysSocialToSysSocialVoMapper;
import org.dromara.system.domain.SysTenant;
import org.dromara.system.domain.SysTenantPackage;
import org.dromara.system.domain.SysTenantPackageToSysTenantPackageVoMapper;
import org.dromara.system.domain.SysTenantToSysTenantVoMapper;
import org.dromara.system.domain.SysUser;
import org.dromara.system.domain.SysUserToSysUserVoMapper;
import org.dromara.system.domain.bo.SysClientBo;
import org.dromara.system.domain.bo.SysClientBoToSysClientMapper;
import org.dromara.system.domain.bo.SysConfigBo;
import org.dromara.system.domain.bo.SysConfigBoToSysConfigMapper;
import org.dromara.system.domain.bo.SysDeptBo;
import org.dromara.system.domain.bo.SysDeptBoToSysDeptMapper;
import org.dromara.system.domain.bo.SysDictDataBo;
import org.dromara.system.domain.bo.SysDictDataBoToSysDictDataMapper;
import org.dromara.system.domain.bo.SysDictTypeBo;
import org.dromara.system.domain.bo.SysDictTypeBoToSysDictTypeMapper;
import org.dromara.system.domain.bo.SysLogininforBo;
import org.dromara.system.domain.bo.SysLogininforBoToSysLogininforMapper;
import org.dromara.system.domain.bo.SysMenuBo;
import org.dromara.system.domain.bo.SysMenuBoToSysMenuMapper;
import org.dromara.system.domain.bo.SysNoticeBo;
import org.dromara.system.domain.bo.SysNoticeBoToSysNoticeMapper;
import org.dromara.system.domain.bo.SysOperLogBo;
import org.dromara.system.domain.bo.SysOperLogBoToOperLogEventMapper;
import org.dromara.system.domain.bo.SysOperLogBoToSysOperLogMapper;
import org.dromara.system.domain.bo.SysOssBo;
import org.dromara.system.domain.bo.SysOssBoToSysOssMapper;
import org.dromara.system.domain.bo.SysOssConfigBo;
import org.dromara.system.domain.bo.SysOssConfigBoToSysOssConfigMapper;
import org.dromara.system.domain.bo.SysPostBo;
import org.dromara.system.domain.bo.SysPostBoToSysPostMapper;
import org.dromara.system.domain.bo.SysRoleBo;
import org.dromara.system.domain.bo.SysRoleBoToSysRoleMapper;
import org.dromara.system.domain.bo.SysSocialBo;
import org.dromara.system.domain.bo.SysSocialBoToSysSocialMapper;
import org.dromara.system.domain.bo.SysTenantBo;
import org.dromara.system.domain.bo.SysTenantBoToSysTenantMapper;
import org.dromara.system.domain.bo.SysTenantPackageBo;
import org.dromara.system.domain.bo.SysTenantPackageBoToSysTenantPackageMapper;
import org.dromara.system.domain.bo.SysUserBo;
import org.dromara.system.domain.bo.SysUserBoToSysUserMapper;
import org.dromara.system.domain.vo.SysClientVo;
import org.dromara.system.domain.vo.SysClientVoToSysClientMapper;
import org.dromara.system.domain.vo.SysConfigVo;
import org.dromara.system.domain.vo.SysConfigVoToSysConfigMapper;
import org.dromara.system.domain.vo.SysDeptVo;
import org.dromara.system.domain.vo.SysDeptVoToSysDeptMapper;
import org.dromara.system.domain.vo.SysDictDataVo;
import org.dromara.system.domain.vo.SysDictDataVoToSysDictDataMapper;
import org.dromara.system.domain.vo.SysDictTypeVo;
import org.dromara.system.domain.vo.SysDictTypeVoToSysDictTypeMapper;
import org.dromara.system.domain.vo.SysLogininforVo;
import org.dromara.system.domain.vo.SysLogininforVoToSysLogininforMapper;
import org.dromara.system.domain.vo.SysMenuVo;
import org.dromara.system.domain.vo.SysMenuVoToSysMenuMapper;
import org.dromara.system.domain.vo.SysNoticeVo;
import org.dromara.system.domain.vo.SysNoticeVoToSysNoticeMapper;
import org.dromara.system.domain.vo.SysOperLogVo;
import org.dromara.system.domain.vo.SysOperLogVoToSysOperLogMapper;
import org.dromara.system.domain.vo.SysOssConfigVo;
import org.dromara.system.domain.vo.SysOssConfigVoToSysOssConfigMapper;
import org.dromara.system.domain.vo.SysOssVo;
import org.dromara.system.domain.vo.SysOssVoToSysOssMapper;
import org.dromara.system.domain.vo.SysPostVo;
import org.dromara.system.domain.vo.SysPostVoToSysPostMapper;
import org.dromara.system.domain.vo.SysRoleVo;
import org.dromara.system.domain.vo.SysRoleVoToSysRoleMapper;
import org.dromara.system.domain.vo.SysSocialVo;
import org.dromara.system.domain.vo.SysSocialVoToSysSocialMapper;
import org.dromara.system.domain.vo.SysTenantPackageVo;
import org.dromara.system.domain.vo.SysTenantPackageVoToSysTenantPackageMapper;
import org.dromara.system.domain.vo.SysTenantVo;
import org.dromara.system.domain.vo.SysTenantVoToSysTenantMapper;
import org.dromara.system.domain.vo.SysUserExportVo;
import org.dromara.system.domain.vo.SysUserVo;
import org.dromara.system.domain.vo.SysUserVoToSysUserExportVoMapper;
import org.dromara.system.domain.vo.SysUserVoToSysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private SysLogininforVoToSysLogininforMapper sysLogininforVoToSysLogininforMapper;

  @Autowired
  @Lazy
  private SysTenantVoToSysTenantMapper sysTenantVoToSysTenantMapper;

  @Autowired
  @Lazy
  private SysUserVoToSysUserMapper sysUserVoToSysUserMapper;

  @Autowired
  @Lazy
  private SysOperLogBoToOperLogEventMapper sysOperLogBoToOperLogEventMapper;

  @Autowired
  @Lazy
  private SysTenantPackageVoToSysTenantPackageMapper sysTenantPackageVoToSysTenantPackageMapper;

  @Autowired
  @Lazy
  private SysOssConfigToSysOssConfigVoMapper sysOssConfigToSysOssConfigVoMapper;

  @Autowired
  @Lazy
  private SysDeptVoToSysDeptMapper sysDeptVoToSysDeptMapper;

  @Autowired
  @Lazy
  private SysOperLogVoToSysOperLogMapper sysOperLogVoToSysOperLogMapper;

  @Autowired
  @Lazy
  private SysOssVoToSysOssMapper sysOssVoToSysOssMapper;

  @Autowired
  @Lazy
  private SysLogininforBoToSysLogininforMapper sysLogininforBoToSysLogininforMapper;

  @Autowired
  @Lazy
  private SysMenuBoToSysMenuMapper sysMenuBoToSysMenuMapper;

  @Autowired
  @Lazy
  private SysClientBoToSysClientMapper sysClientBoToSysClientMapper;

  @Autowired
  @Lazy
  private SysOssBoToSysOssMapper sysOssBoToSysOssMapper;

  @Autowired
  @Lazy
  private OperLogEventToSysOperLogBoMapper operLogEventToSysOperLogBoMapper;

  @Autowired
  @Lazy
  private SysNoticeBoToSysNoticeMapper sysNoticeBoToSysNoticeMapper;

  @Autowired
  @Lazy
  private SysDictTypeVoToSysDictTypeMapper sysDictTypeVoToSysDictTypeMapper;

  @Autowired
  @Lazy
  private SysConfigBoToSysConfigMapper sysConfigBoToSysConfigMapper;

  @Autowired
  @Lazy
  private SysClientToSysClientVoMapper sysClientToSysClientVoMapper;

  @Autowired
  @Lazy
  private SysClientVoToSysClientMapper sysClientVoToSysClientMapper;

  @Autowired
  @Lazy
  private SysOssConfigVoToSysOssConfigMapper sysOssConfigVoToSysOssConfigMapper;

  @Autowired
  @Lazy
  private SysDictDataVoToSysDictDataMapper sysDictDataVoToSysDictDataMapper;

  @Autowired
  @Lazy
  private SysTenantToSysTenantVoMapper sysTenantToSysTenantVoMapper;

  @Autowired
  @Lazy
  private SysConfigToSysConfigVoMapper sysConfigToSysConfigVoMapper;

  @Autowired
  @Lazy
  private SysOperLogToSysOperLogVoMapper sysOperLogToSysOperLogVoMapper;

  @Autowired
  @Lazy
  private SysDeptToSysDeptVoMapper sysDeptToSysDeptVoMapper;

  @Autowired
  @Lazy
  private SysDictTypeBoToSysDictTypeMapper sysDictTypeBoToSysDictTypeMapper;

  @Autowired
  @Lazy
  private SysMenuToSysMenuVoMapper sysMenuToSysMenuVoMapper;

  @Autowired
  @Lazy
  private SysNoticeToSysNoticeVoMapper sysNoticeToSysNoticeVoMapper;

  @Autowired
  @Lazy
  private SysDictTypeToSysDictTypeVoMapper sysDictTypeToSysDictTypeVoMapper;

  @Autowired
  @Lazy
  private SysDictDataBoToSysDictDataMapper sysDictDataBoToSysDictDataMapper;

  @Autowired
  @Lazy
  private SysPostBoToSysPostMapper sysPostBoToSysPostMapper;

  @Autowired
  @Lazy
  private SysUserToSysUserVoMapper sysUserToSysUserVoMapper;

  @Autowired
  @Lazy
  private SysTenantPackageBoToSysTenantPackageMapper sysTenantPackageBoToSysTenantPackageMapper;

  @Autowired
  @Lazy
  private SysRoleBoToSysRoleMapper sysRoleBoToSysRoleMapper;

  @Autowired
  @Lazy
  private SysDictDataToSysDictDataVoMapper sysDictDataToSysDictDataVoMapper;

  @Autowired
  @Lazy
  private SysOssConfigBoToSysOssConfigMapper sysOssConfigBoToSysOssConfigMapper;

  @Autowired
  @Lazy
  private SysPostToSysPostVoMapper sysPostToSysPostVoMapper;

  @Autowired
  @Lazy
  private SysMenuVoToSysMenuMapper sysMenuVoToSysMenuMapper;

  @Autowired
  @Lazy
  private SysOperLogBoToSysOperLogMapper sysOperLogBoToSysOperLogMapper;

  @Autowired
  @Lazy
  private SysSocialToSysSocialVoMapper sysSocialToSysSocialVoMapper;

  @Autowired
  @Lazy
  private SysSocialBoToSysSocialMapper sysSocialBoToSysSocialMapper;

  @Autowired
  @Lazy
  private SysConfigVoToSysConfigMapper sysConfigVoToSysConfigMapper;

  @Autowired
  @Lazy
  private SysLogininforToSysLogininforVoMapper sysLogininforToSysLogininforVoMapper;

  @Autowired
  @Lazy
  private SysOssToSysOssVoMapper sysOssToSysOssVoMapper;

  @Autowired
  @Lazy
  private SysDeptBoToSysDeptMapper sysDeptBoToSysDeptMapper;

  @Autowired
  @Lazy
  private SysUserVoToSysUserExportVoMapper sysUserVoToSysUserExportVoMapper;

  @Autowired
  @Lazy
  private SysRoleVoToSysRoleMapper sysRoleVoToSysRoleMapper;

  @Autowired
  @Lazy
  private SysNoticeVoToSysNoticeMapper sysNoticeVoToSysNoticeMapper;

  @Autowired
  @Lazy
  private SysUserBoToSysUserMapper sysUserBoToSysUserMapper;

  @Autowired
  @Lazy
  private SysPostVoToSysPostMapper sysPostVoToSysPostMapper;

  @Autowired
  @Lazy
  private SysSocialVoToSysSocialMapper sysSocialVoToSysSocialMapper;

  @Autowired
  @Lazy
  private SysRoleToSysRoleVoMapper sysRoleToSysRoleVoMapper;

  @Autowired
  @Lazy
  private SysTenantBoToSysTenantMapper sysTenantBoToSysTenantMapper;

  @Autowired
  @Lazy
  private SysTenantPackageToSysTenantPackageVoMapper sysTenantPackageToSysTenantPackageVoMapper;

  public SysLogininfor org_dromara_system_domain_vo_SysLogininforVoToSysLogininfor(SysLogininforVo param) {
    return sysLogininforVoToSysLogininforMapper.convert(param);}

  public SysTenant org_dromara_system_domain_vo_SysTenantVoToSysTenant(SysTenantVo param) {
    return sysTenantVoToSysTenantMapper.convert(param);}

  public SysUser org_dromara_system_domain_vo_SysUserVoToSysUser(SysUserVo param) {
    return sysUserVoToSysUserMapper.convert(param);}

  public OperLogEvent org_dromara_system_domain_bo_SysOperLogBoToOperLogEvent(SysOperLogBo param) {
    return sysOperLogBoToOperLogEventMapper.convert(param);}

  public SysTenantPackage org_dromara_system_domain_vo_SysTenantPackageVoToSysTenantPackage(SysTenantPackageVo param) {
    return sysTenantPackageVoToSysTenantPackageMapper.convert(param);}

  public SysOssConfigVo org_dromara_system_domain_SysOssConfigToSysOssConfigVo(SysOssConfig param) {
    return sysOssConfigToSysOssConfigVoMapper.convert(param);}

  public SysDept org_dromara_system_domain_vo_SysDeptVoToSysDept(SysDeptVo param) {
    return sysDeptVoToSysDeptMapper.convert(param);}

  public SysOperLog org_dromara_system_domain_vo_SysOperLogVoToSysOperLog(SysOperLogVo param) {
    return sysOperLogVoToSysOperLogMapper.convert(param);}

  public SysOss org_dromara_system_domain_vo_SysOssVoToSysOss(SysOssVo param) {
    return sysOssVoToSysOssMapper.convert(param);}

  public SysLogininfor org_dromara_system_domain_bo_SysLogininforBoToSysLogininfor(SysLogininforBo param) {
    return sysLogininforBoToSysLogininforMapper.convert(param);}

  public SysMenu org_dromara_system_domain_bo_SysMenuBoToSysMenu(SysMenuBo param) {
    return sysMenuBoToSysMenuMapper.convert(param);}

  public SysClient org_dromara_system_domain_bo_SysClientBoToSysClient(SysClientBo param) {
    return sysClientBoToSysClientMapper.convert(param);}

  public SysOss org_dromara_system_domain_bo_SysOssBoToSysOss(SysOssBo param) {
    return sysOssBoToSysOssMapper.convert(param);}

  public SysOperLogBo org_dromara_common_log_event_OperLogEventToSysOperLogBo(OperLogEvent param) {
    return operLogEventToSysOperLogBoMapper.convert(param);}

  public SysNotice org_dromara_system_domain_bo_SysNoticeBoToSysNotice(SysNoticeBo param) {
    return sysNoticeBoToSysNoticeMapper.convert(param);}

  public SysDictType org_dromara_system_domain_vo_SysDictTypeVoToSysDictType(SysDictTypeVo param) {
    return sysDictTypeVoToSysDictTypeMapper.convert(param);}

  public SysConfig org_dromara_system_domain_bo_SysConfigBoToSysConfig(SysConfigBo param) {
    return sysConfigBoToSysConfigMapper.convert(param);}

  public SysClientVo org_dromara_system_domain_SysClientToSysClientVo(SysClient param) {
    return sysClientToSysClientVoMapper.convert(param);}

  public SysClient org_dromara_system_domain_vo_SysClientVoToSysClient(SysClientVo param) {
    return sysClientVoToSysClientMapper.convert(param);}

  public SysOssConfig org_dromara_system_domain_vo_SysOssConfigVoToSysOssConfig(SysOssConfigVo param) {
    return sysOssConfigVoToSysOssConfigMapper.convert(param);}

  public SysDictData org_dromara_system_domain_vo_SysDictDataVoToSysDictData(SysDictDataVo param) {
    return sysDictDataVoToSysDictDataMapper.convert(param);}

  public SysTenantVo org_dromara_system_domain_SysTenantToSysTenantVo(SysTenant param) {
    return sysTenantToSysTenantVoMapper.convert(param);}

  public SysConfigVo org_dromara_system_domain_SysConfigToSysConfigVo(SysConfig param) {
    return sysConfigToSysConfigVoMapper.convert(param);}

  public SysOperLogVo org_dromara_system_domain_SysOperLogToSysOperLogVo(SysOperLog param) {
    return sysOperLogToSysOperLogVoMapper.convert(param);}

  public SysDeptVo org_dromara_system_domain_SysDeptToSysDeptVo(SysDept param) {
    return sysDeptToSysDeptVoMapper.convert(param);}

  public SysDictType org_dromara_system_domain_bo_SysDictTypeBoToSysDictType(SysDictTypeBo param) {
    return sysDictTypeBoToSysDictTypeMapper.convert(param);}

  public SysMenuVo org_dromara_system_domain_SysMenuToSysMenuVo(SysMenu param) {
    return sysMenuToSysMenuVoMapper.convert(param);}

  public SysNoticeVo org_dromara_system_domain_SysNoticeToSysNoticeVo(SysNotice param) {
    return sysNoticeToSysNoticeVoMapper.convert(param);}

  public SysDictTypeVo org_dromara_system_domain_SysDictTypeToSysDictTypeVo(SysDictType param) {
    return sysDictTypeToSysDictTypeVoMapper.convert(param);}

  public SysDictData org_dromara_system_domain_bo_SysDictDataBoToSysDictData(SysDictDataBo param) {
    return sysDictDataBoToSysDictDataMapper.convert(param);}

  public SysPost org_dromara_system_domain_bo_SysPostBoToSysPost(SysPostBo param) {
    return sysPostBoToSysPostMapper.convert(param);}

  public SysUserVo org_dromara_system_domain_SysUserToSysUserVo(SysUser param) {
    return sysUserToSysUserVoMapper.convert(param);}

  public SysTenantPackage org_dromara_system_domain_bo_SysTenantPackageBoToSysTenantPackage(SysTenantPackageBo param) {
    return sysTenantPackageBoToSysTenantPackageMapper.convert(param);}

  public SysRole org_dromara_system_domain_bo_SysRoleBoToSysRole(SysRoleBo param) {
    return sysRoleBoToSysRoleMapper.convert(param);}

  public SysDictDataVo org_dromara_system_domain_SysDictDataToSysDictDataVo(SysDictData param) {
    return sysDictDataToSysDictDataVoMapper.convert(param);}

  public SysOssConfig org_dromara_system_domain_bo_SysOssConfigBoToSysOssConfig(SysOssConfigBo param) {
    return sysOssConfigBoToSysOssConfigMapper.convert(param);}

  public SysPostVo org_dromara_system_domain_SysPostToSysPostVo(SysPost param) {
    return sysPostToSysPostVoMapper.convert(param);}

  public SysMenu org_dromara_system_domain_vo_SysMenuVoToSysMenu(SysMenuVo param) {
    return sysMenuVoToSysMenuMapper.convert(param);}

  public SysOperLog org_dromara_system_domain_bo_SysOperLogBoToSysOperLog(SysOperLogBo param) {
    return sysOperLogBoToSysOperLogMapper.convert(param);}

  public SysSocialVo org_dromara_system_domain_SysSocialToSysSocialVo(SysSocial param) {
    return sysSocialToSysSocialVoMapper.convert(param);}

  public SysSocial org_dromara_system_domain_bo_SysSocialBoToSysSocial(SysSocialBo param) {
    return sysSocialBoToSysSocialMapper.convert(param);}

  public SysConfig org_dromara_system_domain_vo_SysConfigVoToSysConfig(SysConfigVo param) {
    return sysConfigVoToSysConfigMapper.convert(param);}

  public SysLogininforVo org_dromara_system_domain_SysLogininforToSysLogininforVo(SysLogininfor param) {
    return sysLogininforToSysLogininforVoMapper.convert(param);}

  public SysOssVo org_dromara_system_domain_SysOssToSysOssVo(SysOss param) {
    return sysOssToSysOssVoMapper.convert(param);}

  public SysDept org_dromara_system_domain_bo_SysDeptBoToSysDept(SysDeptBo param) {
    return sysDeptBoToSysDeptMapper.convert(param);}

  public SysUserExportVo org_dromara_system_domain_vo_SysUserVoToSysUserExportVo(SysUserVo param) {
    return sysUserVoToSysUserExportVoMapper.convert(param);}

  public SysRole org_dromara_system_domain_vo_SysRoleVoToSysRole(SysRoleVo param) {
    return sysRoleVoToSysRoleMapper.convert(param);}

  public SysNotice org_dromara_system_domain_vo_SysNoticeVoToSysNotice(SysNoticeVo param) {
    return sysNoticeVoToSysNoticeMapper.convert(param);}

  public SysUser org_dromara_system_domain_bo_SysUserBoToSysUser(SysUserBo param) {
    return sysUserBoToSysUserMapper.convert(param);}

  public SysPost org_dromara_system_domain_vo_SysPostVoToSysPost(SysPostVo param) {
    return sysPostVoToSysPostMapper.convert(param);}

  public SysSocial org_dromara_system_domain_vo_SysSocialVoToSysSocial(SysSocialVo param) {
    return sysSocialVoToSysSocialMapper.convert(param);}

  public SysRoleVo org_dromara_system_domain_SysRoleToSysRoleVo(SysRole param) {
    return sysRoleToSysRoleVoMapper.convert(param);}

  public SysTenant org_dromara_system_domain_bo_SysTenantBoToSysTenant(SysTenantBo param) {
    return sysTenantBoToSysTenantMapper.convert(param);}

  public SysTenantPackageVo org_dromara_system_domain_SysTenantPackageToSysTenantPackageVo(SysTenantPackage param) {
    return sysTenantPackageToSysTenantPackageVoMapper.convert(param);}
}
