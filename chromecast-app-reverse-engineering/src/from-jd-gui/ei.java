import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ei
{
  ek a;
  el b;
  en c;
  
  public static boolean a(Map paramMap, Collection paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext()) {
      if (!paramCollection.contains(localIterator.next())) {
        localIterator.remove();
      }
    }
    if (i != paramMap.size()) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(Set paramSet, Object paramObject)
  {
    boolean bool1 = true;
    if (paramSet == paramObject) {}
    for (;;)
    {
      return bool1;
      if ((paramObject instanceof Set))
      {
        paramObject = (Set)paramObject;
        try
        {
          if (paramSet.size() == ((Set)paramObject).size())
          {
            boolean bool2 = paramSet.containsAll((Collection)paramObject);
            if (bool2) {
              continue;
            }
          }
          bool1 = false;
        }
        catch (NullPointerException paramSet)
        {
          bool1 = false;
        }
        catch (ClassCastException paramSet)
        {
          bool1 = false;
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  protected abstract int a();
  
  protected abstract int a(Object paramObject);
  
  protected abstract Object a(int paramInt1, int paramInt2);
  
  protected abstract Object a(int paramInt, Object paramObject);
  
  protected abstract void a(int paramInt);
  
  protected abstract void a(Object paramObject1, Object paramObject2);
  
  public final Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    int j = a();
    if (paramArrayOfObject.length < j) {
      paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), j);
    }
    for (;;)
    {
      for (int i = 0; i < j; i++) {
        paramArrayOfObject[i] = a(i, paramInt);
      }
      if (paramArrayOfObject.length > j) {
        paramArrayOfObject[j] = null;
      }
      return paramArrayOfObject;
    }
  }
  
  protected abstract int b(Object paramObject);
  
  protected abstract Map b();
  
  public final Object[] b(int paramInt)
  {
    int j = a();
    Object[] arrayOfObject = new Object[j];
    for (int i = 0; i < j; i++) {
      arrayOfObject[i] = a(i, paramInt);
    }
    return arrayOfObject;
  }
  
  protected abstract void c();
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */