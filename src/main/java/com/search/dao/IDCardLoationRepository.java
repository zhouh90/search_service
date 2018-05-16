package com.search.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.beans.bizs.IDCardLoation;

/**
 * @author 周 浩
 * @email zhou_eric90@163.com
 * @date 2018年5月16日 上午9:51:53
 * @描述
 */
@Repository
public interface IDCardLoationRepository extends JpaRepository<IDCardLoation, Long> {

	List<IDCardLoation> findByIdcard(String idcard);

}
