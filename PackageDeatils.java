package com.techouts.day3;

public class PackageDeatils
{
	// while getting details of pacackage we have to use package class which is inbuilt.
	public static void main(String[] args) {
		
	
	Package package1=Package.getPackage("java.lang");
	System.out.println(package1);
	System.out.println(package1.getName());
	System.out.println(package1.getSpecificationTitle());
	System.out.println(package1.getSpecificationVendor());
	System.out.println(package1.getImplementationVendor());
	System.out.println(package1.getImplementationVersion());
	System.out.println(package1.isSealed());
	
	}
}
