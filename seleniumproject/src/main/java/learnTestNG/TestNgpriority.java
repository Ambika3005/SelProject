package learnTestNG;

import org.testng.annotations.Test;

public class TestNgpriority {
	//Case1: Less priority method would be executed first
		//Case2: If the methods are of same priority then method would be executed based on ASCII values of Method names
		//Case3: Methods without any defined priority is considered as Zero Priority by default.
			
		@Test (priority =0, enabled=true)
		public void amethod1() {
		System.out.println("This is first method");

		}
		@Test (priority =0, alwaysRun=true)
		public void Amethod2() {
		System.out.println("This is second method");

		}
		@Test (priority =1)
		public void method3() {
		System.out.println("This is third method");

		}
		@Test (invocationCount =4)
		public void method0() {
		System.out.println("This is fourth method");

		}
		/*@Test
		public void method5() {
		System.out.println("This is fifth method");

		} */
		@Test
		public void method6() {

		//throws IO exception
		System.out.println("This is sixth method");
		}
		@Test
		public void method7() {
		System.out.println("This is seventh method");
		}
		@Test
		public void method8() {
		System.out.println("This is eighth method");
		}
		@Test
		public void method9() {
		System.out.println("This is ninth method");
		}

		}

