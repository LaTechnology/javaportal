/**
 * 
 */
package com.salesforce.update.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.salesforce.update.dto.EmployeeDto;

/**
 * @author admin
 *
 */
public class DefaultSalesforceUpdateImplTest {
	private DefaultSalesforceUpdateImpl salesforceUpdateImpl = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		salesforceUpdateImpl = new DefaultSalesforceUpdateImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getEmployeeFromDB() {
		List<EmployeeDto> employeeDtos = salesforceUpdateImpl.getEmployeeFromDB();
		for (EmployeeDto employeeDto : employeeDtos) {
			assertNotNull(employeeDto);
			assertEquals("Employee ID is ", "2222", employeeDto.getEmpId());
		}
	}

	/**
	 * It is used to mark a method as junit test
	 */
	@Test
	public void getEmployeeTest() {
		List<EmployeeDto> employeeDtos = salesforceUpdateImpl.getEmployee();
		assertNotNull("Employee list is not empty", employeeDtos);
		for (EmployeeDto employeeDto : employeeDtos) {
			assertNotNull(employeeDto);
			assertEquals("Employee ID is ", "Tamil", employeeDto.getLastName());
		}
	}

	@Test
	public void getEmployeeIDCheckTest() {
		List<EmployeeDto> employeeDtos = salesforceUpdateImpl.getEmployee();
		assertNotNull("Employee list is not empty", employeeDtos);
		for (EmployeeDto employeeDto : employeeDtos) {
			assertNotNull(employeeDto);
			assertEquals("Employee ID is ", "1234", employeeDto.getEmpId());
		}
	}

	@Test
	public void getEmployeeFirstNameCheckTest() {
		List<EmployeeDto> employeeDtos = salesforceUpdateImpl.getEmployee();
		assertNotNull("Employee list is not empty", employeeDtos);
		for (EmployeeDto employeeDto : employeeDtos) {
			assertNotNull(employeeDto);
			assertEquals("Employee Name is ", "Ajith Tamil", employeeDto.getFirstName());
		}
	}

	@Test
	public void getEmployeeLastNameCheckTest() {
		List<EmployeeDto> employeeDtos = salesforceUpdateImpl.getEmployee();
		assertNotNull("Employee list is not empty", employeeDtos);
		for (EmployeeDto employeeDto : employeeDtos) {
			assertNotNull(employeeDto);
			assertEquals("Employee  LastName is ", "Tamil", employeeDto.getLastName());
		}
	}

	@Test
	public void getEmployeeCountTest() {
		List<EmployeeDto> employeeDtos = salesforceUpdateImpl.getEmployee();
		assertNotNull("Employee list is not empty", employeeDtos);
		assertEquals("Employee Total count", 2, employeeDtos.size());
	}
}
