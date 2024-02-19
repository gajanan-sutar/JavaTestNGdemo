package demoCode;

import org.testng.annotations.Test;
import org.testng.Assert;

public class GroupsDemo {
  @Test
  public void a() {
	  System.out.println("This is test A");
	  Assert.assertTrue(5>7);
	  System.out.println("this is after assert");
  }
  @Test(enabled = true, groups = {"One"})
  public void b() {
	  System.out.println("This is test B");
	  Assert.assertTrue(7>9);
	  System.out.println("this is after assert");	  
  }
  @Test(groups = {"Two"})
  public void c() {
	  System.out.println("This is test C");
	  Assert.assertTrue(9<5);
	  System.out.println("this is after assert");  
  }
  @Test(groups = {"One", "Two"})
  public void d() {
	  System.out.println("This is test D");
  }
  @Test(groups = {"Three"})
  public void e() {
	  System.out.println("This is test E");
  }
  @Test(groups = {"One", "Three"})
  public void f() {
	  System.out.println("This is test F");
  }
  @Test(groups = {"Two", "Three"})
  public void g() {
	  System.out.println("This is test G");
  }
  @Test(groups = {"One", "Two", "Three"})
  public void h() {
	  System.out.println("This is test H");
  }
  @Test(enabled = true, groups = {"One"})
  public void j() {
	  System.out.println("This is test J");
}
  @Test(enabled = true, groups = {"One"})
  public void k() {
	  System.out.println("This is test K");
  }
  @Test(enabled = true, groups = {"One"})
  public void n() {
	  System.out.println("This is test N ");
  }
  @Test(enabled = true, groups = {"One"})
  public void o() {
	  System.out.println("This is test O");
  }
}
