package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class FooTest {

  @Test
  public void canRunATest() {
    Foo foo = new Foo();
    assertNotNull(foo);
    ;
  }

}