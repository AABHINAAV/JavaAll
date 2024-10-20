package b_java_se_8.a_Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE)	// applicable on class method enum
@Target({ ElementType.TYPE, ElementType.METHOD }) // applicable on class method enum method
@Retention(RetentionPolicy.RUNTIME) // available at run time
@Inherited
@interface SmartPhone {
  String os() default "android";

  int version() default 1;
}

@SmartPhone
class Nokia {}

@SmartPhone(version = 2)
class Redmi {}

@SmartPhone(os = "ios", version = 3)
class Apple {}

class A5_CustomAnnotation {

  public static void main(String[] args) {
    Nokia obj = new Nokia();
    Class<? extends Nokia> cls = obj.getClass();
    SmartPhone an = (SmartPhone) cls.getAnnotation(SmartPhone.class);
    System.out.println(cls + " " + an.os());

    System.out.println(
      new Nokia().getClass().getAnnotation(SmartPhone.class).os()
    );
    System.out.println(
      new Redmi().getClass().getAnnotation(SmartPhone.class).version()
    );
    System.out.println(
      new Apple().getClass().getAnnotation(SmartPhone.class).os()
    );
    System.out.println(
      new Apple().getClass().getAnnotation(SmartPhone.class).version()
    );
  }
}
