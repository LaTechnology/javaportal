package com.erp.lt.portal;

public class ERPConstants {
	public static final String URL_BASE = "/api/v1";

	public static final String EMPLOYEEHISTORY_ADD_URL = "/erp/emphistory/add/";
	public static final String EMPLOYEEHISTORY_GET_URL = "/erp/emphistory/get/{employeeCode}";
	public static final String EMPLOYEEHISTORY_EDIT_URL=  "/erp/emphistory/edit/";
	public static final String EMPLOYEEHISTORY_PATCHING_URL="/erp/emphistory/patching/";
	public static final String EMPLOYEEHISTORY_DELETE_URL="/erp/emphistory/delete/{employeeCode}";	
	
	public static final String EMPLOYEE_ADD_URL = "/employee/add/";
	public static final String EMPLOYEE_GET_URL = "/get/empinfo/{employeeCode}";
	public static final String EMPLOYEE_GETALL_URL="/employee/getall/";
	public static final String EMPLOYEE_EDIT_URL="/employee/edit/";
	public static final String EMPLOYEE_PATCHING_URL="/employee/patching/";
	public static final String EMPLOYEE_DELETE_URL="/delete/{employeeCode}";

	public static final String EMPLOYEEEDUCATION_ADD_URL ="/add/educationdetails";
	public static final String EMPLOYEEEDUCATION_GET_URL ="/get/educationdetails/{eduId}";
	public static final String EMPLOYEEEDUCATION_EDIT_URL ="/edit/educationdetails";
	public static final String EMPLOYEEEDUCATION_SOFTDELETE_URL ="/delete/educationdetails/{empId}";
	

	public static final String COMMUNICATION_DETAILS_ADD_URL = "/add/com/details/";
	public static final String COMMUNICATION_DETAILS_GET_URL = "/get/com/details/{empId}";
	public static final String COMMUNICATION_DETAILS_EDIT_URL = "/edit/com/details";
	public static final String COMMUNICATION_DETAILS_PATCHING_URL = "/patching/com/details";
	public static final String COMMUNICATION_DETAILS_DELETE_URL = "/delete/com/details/{empId}";
	
	public static final String MOBILE_DETAILS_ADD_URL = "/add/mob/details";
	public static final String MOBILE_DETAILS_GET_URL = "/get/mob/details/{code}";
	public static final String MOBILE_DETAILS_EDIT_URL = "/edit/mob/details";
	public static final String MOBILE_DETAILS_PATCHING_URL = "/patching/mob/details";
	public static final String MOBILE_DETAILS_DELETE_URL = "/delete/mobile/{empCode}";
	
	public static final String EMPLOYEE_DETAILS_GET_URL = "/get/address/{Id}";
	public static final String EMPLOYEE_ADDRESS_PATCHING_URL = "/patching/Address/";
	//public static final String EMPLOYEE_GETALL_URL="/employee/address/getall/";
	public static final String EMPLOYEE_ADDRESS_DELETE_URL = "/delete/Address/{employeeNumber}";
    public static final String EMPLOYEE_ADDRESS_ADD_URL = "/add/address/";
    public static final String EMPLOYEE_ADDRESS_EDIT_URL = "/edit/employee/address/";
    
	public static final String EMPLOYEE_ADDRESS_TYPE_GET_URL = "/get/employeetype/address/{addTypeCode}";

	



}
