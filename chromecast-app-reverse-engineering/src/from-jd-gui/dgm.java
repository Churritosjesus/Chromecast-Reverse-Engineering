import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class dgm
{
  private final Class a;
  private final String b;
  private final Class[] c;
  
  public dgm(Class paramClass, String paramString, Class... paramVarArgs)
  {
    this.a = paramClass;
    this.b = paramString;
    this.c = paramVarArgs;
  }
  
  private Method a(Class paramClass)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (this.b != null)
    {
      localObject1 = a(paramClass, this.b, this.c);
      if ((localObject1 == null) || (this.a == null) || (this.a.isAssignableFrom(((Method)localObject1).getReturnType()))) {
        break label53;
      }
      localObject1 = localObject2;
    }
    label53:
    for (;;)
    {
      return (Method)localObject1;
    }
  }
  
  private static Method a(Class paramClass, String paramString, Class[] paramArrayOfClass)
  {
    localObject = null;
    try
    {
      paramClass = paramClass.getMethod(paramString, paramArrayOfClass);
    }
    catch (NoSuchMethodException paramClass)
    {
      for (;;)
      {
        int i;
        label24:
        paramClass = (Class)localObject;
      }
    }
    try
    {
      i = paramClass.getModifiers();
      if ((i & 0x1) != 0) {
        break label36;
      }
      paramClass = (Class)localObject;
    }
    catch (NoSuchMethodException paramString)
    {
      break label24;
      break label24;
    }
    return paramClass;
  }
  
  private Object c(Object paramObject, Object... paramVarArgs)
  {
    Object localObject = null;
    Method localMethod = a(paramObject.getClass());
    if (localMethod == null) {
      paramObject = localObject;
    }
    for (;;)
    {
      return paramObject;
      try
      {
        paramObject = localMethod.invoke(paramObject, paramVarArgs);
      }
      catch (IllegalAccessException paramObject)
      {
        paramObject = localObject;
      }
    }
  }
  
  private Object d(Object paramObject, Object... paramVarArgs)
  {
    Method localMethod = a(paramObject.getClass());
    if (localMethod == null) {
      throw new AssertionError("Method " + this.b + " not supported for object " + paramObject);
    }
    try
    {
      paramObject = localMethod.invoke(paramObject, paramVarArgs);
      return paramObject;
    }
    catch (IllegalAccessException paramObject)
    {
      paramVarArgs = new AssertionError("Unexpectedly could not call: " + localMethod);
      paramVarArgs.initCause((Throwable)paramObject);
      throw paramVarArgs;
    }
  }
  
  public final Object a(Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramObject = c(paramObject, paramVarArgs);
      return paramObject;
    }
    catch (InvocationTargetException paramObject)
    {
      paramVarArgs = ((InvocationTargetException)paramObject).getTargetException();
      if ((paramVarArgs instanceof RuntimeException)) {
        throw ((RuntimeException)paramVarArgs);
      }
      paramObject = new AssertionError("Unexpected exception");
      ((AssertionError)paramObject).initCause(paramVarArgs);
      throw ((Throwable)paramObject);
    }
  }
  
  public final boolean a(Object paramObject)
  {
    if (a(paramObject.getClass()) != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final Object b(Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramObject = d(paramObject, paramVarArgs);
      return paramObject;
    }
    catch (InvocationTargetException paramObject)
    {
      paramObject = ((InvocationTargetException)paramObject).getTargetException();
      if ((paramObject instanceof RuntimeException)) {
        throw ((RuntimeException)paramObject);
      }
      paramVarArgs = new AssertionError("Unexpected exception");
      paramVarArgs.initCause((Throwable)paramObject);
      throw paramVarArgs;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */