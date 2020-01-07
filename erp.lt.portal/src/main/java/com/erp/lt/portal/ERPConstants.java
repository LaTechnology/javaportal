package com.erp.lt.portal;

public class ERPConstants {
	public static final String URL_BASE = "/api/v1";
	public static final String EMPLOYEEHISTORY_ADD_URL = "/erp/emphistory/add/";
	public static final String EMPLOYEEHISTORY_GET_URL = "/erp/emphistory/get/{employeeCode}";
	public static final String EMPLOYEEHISTORY_GETALL_URL="/erp/emphistory/getall/";
	public static final String EMPLOYEEHISTORY_EDIT_URL=  "/erp/emphistory/edit/";
	public static final String EMPLOYEEHISTORY_PATCHING_URL="/erp/emphistory/patching/";
	public static final String EMPLOYEEHISTORY_DELETE_URL="/erp/emphistory/delete/{employeeCode}";
	public static final String EMPLOYEE_ADD_URL = "/employee/add/";
	public static final String EMPLOYEE_GET_URL = "/get/empinfo/{employeeCode}";
	public static final String EMPLOYEE_GETALL_URL="/employee/getall/";
	public static final String EMPLOYEE_EDIT_URL="/employee/edit/";
	public static final String EMPLOYEE_PATCHING_URL="/employee/patching/";
	public static final String EMPLOYEE_DELETE_URL="/delete/{employeeCode}";
	
	// Employee Education URLS:
	public static final String EMPLOYEEEDUCATION_ADD_URL ="/add/educationdetails";
	public static final String EMPLOYEEEDUCATION_GET_URL ="/get/educationdetails/{eduId}";
	public static final String EMPLOYEEEDUCATION_EDIT_URL ="/edit/educationdetails";
	public static final String EMPLOYEEEDUCATION_SOFTDELETE_URL ="/delete/educationdetails/{empId}";
	
	
}
