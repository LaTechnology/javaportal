/**
 * 
 */
package com.lt.erp.portal.repository.impl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lt.erp.portal.dto.AddressVO;

/**
 * @author admin
 *
 */
@Repository
public interface AddressRepository extends CrudRepository<AddressVO, Integer> {

}
