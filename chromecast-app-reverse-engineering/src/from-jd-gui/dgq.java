import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

final class dgq
  implements InvocationHandler
{
  private final List a;
  private boolean b;
  private String c;
  
  public dgq(List paramList)
  {
    this.a = paramList;
  }
  
  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    String str = paramMethod.getName();
    Class localClass = paramMethod.getReturnType();
    paramObject = paramArrayOfObject;
    if (paramArrayOfObject == null) {
      paramObject = dgs.b;
    }
    if ((str.equals("supports")) && (Boolean.TYPE == localClass)) {
      paramObject = Boolean.valueOf(true);
    }
    for (;;)
    {
      return paramObject;
      if ((str.equals("unsupported")) && (Void.TYPE == localClass))
      {
        this.b = true;
        paramObject = null;
      }
      else if ((str.equals("protocols")) && (paramObject.length == 0))
      {
        paramObject = this.a;
      }
      else if (((str.equals("selectProtocol")) || (str.equals("select"))) && (String.class == localClass) && (paramObject.length == 1) && ((paramObject[0] instanceof List)))
      {
        paramObject = (List)paramObject[0];
        int j = ((List)paramObject).size();
        for (int i = 0;; i++)
        {
          if (i >= j) {
            break label211;
          }
          if (this.a.contains(((List)paramObject).get(i)))
          {
            paramObject = (String)((List)paramObject).get(i);
            this.c = ((String)paramObject);
            break;
          }
        }
        label211:
        paramObject = (String)this.a.get(0);
        this.c = ((String)paramObject);
      }
      else if (((str.equals("protocolSelected")) || (str.equals("selected"))) && (paramObject.length == 1))
      {
        this.c = ((String)paramObject[0]);
        paramObject = null;
      }
      else
      {
        paramObject = paramMethod.invoke(this, (Object[])paramObject);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */