/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */
enum NodeTypes {

	FACILITY(1),CUSTOMER(2),COLLATERAL(3);//,CREDIT_APPROVAL,DOCUMENT,ALLOCATION_TO,ALLOCATION_FROM;
	int value;
	NodeTypes(int value){
		this.value = value;
	};
};

