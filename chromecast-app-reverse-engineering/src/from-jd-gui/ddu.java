import java.io.Serializable;
import java.lang.reflect.Field;

final class ddu
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  private final String a;
  private final byte[] b;
  
  ddu(dea paramdea)
  {
    this.a = paramdea.getClass().getName();
    this.b = paramdea.e();
  }
  
  protected final Object readResolve()
  {
    try
    {
      localObject = Class.forName(this.a).getDeclaredField("DEFAULT_INSTANCE");
      ((Field)localObject).setAccessible(true);
      localObject = ((dea)((Field)localObject).get(null)).j().a(this.b).d();
      return localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject = String.valueOf(this.a);
      if (((String)localObject).length() != 0) {}
      for (localObject = "Unable to find proto buffer class: ".concat((String)localObject);; localObject = new String("Unable to find proto buffer class: ")) {
        throw new RuntimeException((String)localObject, localClassNotFoundException);
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      localObject = String.valueOf(this.a);
      if (((String)localObject).length() != 0) {}
      for (localObject = "Unable to find DEFAULT_INSTANCE in ".concat((String)localObject);; localObject = new String("Unable to find DEFAULT_INSTANCE in ")) {
        throw new RuntimeException((String)localObject, localNoSuchFieldException);
      }
    }
    catch (SecurityException localSecurityException)
    {
      Object localObject = String.valueOf(this.a);
      if (((String)localObject).length() != 0) {}
      for (localObject = "Unable to call DEFAULT_INSTANCE in ".concat((String)localObject);; localObject = new String("Unable to call DEFAULT_INSTANCE in ")) {
        throw new RuntimeException((String)localObject, localSecurityException);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException("Unable to call parsePartialFrom", localIllegalAccessException);
    }
    catch (ddx localddx)
    {
      throw new RuntimeException("Unable to understand proto buffer", localddx);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */