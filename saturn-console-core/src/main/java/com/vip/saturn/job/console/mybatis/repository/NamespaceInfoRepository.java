package com.vip.saturn.job.console.mybatis.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vip.saturn.job.console.mybatis.entity.NamespaceInfo;

/**
 * 
 * @author timmy.hu
 */
@Repository
public interface NamespaceInfoRepository {

	NamespaceInfo selectByNamespace(String namespace);

	List<NamespaceInfo> selectAll();

	List<NamespaceInfo> selectAllByNamespaces(List<String> nsList);

	Integer batchDelete(int limitNum);

	Integer batchInsert(List<NamespaceInfo> namespaceInfo);

}
