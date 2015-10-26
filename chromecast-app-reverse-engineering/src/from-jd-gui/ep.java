import java.util.Map;

public class ep
{
  private static Object[] d;
  private static int e;
  private static Object[] f;
  private static int g;
  int[] a;
  Object[] b;
  int c;
  
  public ep()
  {
    this.a = ef.a;
    this.b = ef.b;
    this.c = 0;
  }
  
  public ep(int paramInt)
  {
    a(10);
    this.c = 0;
  }
  
  private int a()
  {
    int m = this.c;
    int i;
    if (m == 0) {
      i = -1;
    }
    for (;;)
    {
      return i;
      int k = ef.a(this.a, m, 0);
      i = k;
      if (k >= 0)
      {
        i = k;
        if (this.b[(k << 1)] != null)
        {
          for (int j = k + 1;; j++)
          {
            if ((j >= m) || (this.a[j] != 0)) {
              break label86;
            }
            if (this.b[(j << 1)] == null)
            {
              i = j;
              break;
            }
          }
          label86:
          k--;
          for (;;)
          {
            if ((k < 0) || (this.a[k] != 0)) {
              break label121;
            }
            i = k;
            if (this.b[(k << 1)] == null) {
              break;
            }
            k--;
          }
          label121:
          i = j ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  private int a(Object paramObject, int paramInt)
  {
    int m = this.c;
    int i;
    if (m == 0) {
      i = -1;
    }
    for (;;)
    {
      return i;
      int k = ef.a(this.a, m, paramInt);
      i = k;
      if (k >= 0)
      {
        i = k;
        if (!paramObject.equals(this.b[(k << 1)]))
        {
          for (int j = k + 1;; j++)
          {
            if ((j >= m) || (this.a[j] != paramInt)) {
              break label106;
            }
            if (paramObject.equals(this.b[(j << 1)]))
            {
              i = j;
              break;
            }
          }
          label106:
          k--;
          for (;;)
          {
            if ((k < 0) || (this.a[k] != paramInt)) {
              break label150;
            }
            i = k;
            if (paramObject.equals(this.b[(k << 1)])) {
              break;
            }
            k--;
          }
          label150:
          i = j ^ 0xFFFFFFFF;
        }
      }
    }
  }
  
  static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {}
    for (;;)
    {
      try
      {
        if (g < 10)
        {
          paramArrayOfObject[0] = f;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          if (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
            continue;
          }
          f = paramArrayOfObject;
          g += 1;
        }
        return;
      }
      finally {}
      if (paramArrayOfInt.length != 4) {
        continue;
      }
      try
      {
        if (e < 10)
        {
          paramArrayOfObject[0] = d;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
            paramArrayOfObject[paramInt] = null;
          }
          d = paramArrayOfObject;
          e += 1;
        }
      }
      finally {}
    }
  }
  
  public final int a(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = a();; i = a(paramObject, paramObject.hashCode())) {
      return i;
    }
  }
  
  public final Object a(int paramInt, Object paramObject)
  {
    paramInt = (paramInt << 1) + 1;
    Object localObject = this.b[paramInt];
    this.b[paramInt] = paramObject;
    return localObject;
  }
  
  void a(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (f != null)
        {
          Object[] arrayOfObject1 = f;
          this.b = arrayOfObject1;
          f = (Object[])arrayOfObject1[0];
          this.a = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          g -= 1;
          return;
        }
        this.a = new int[paramInt];
        this.b = new Object[paramInt << 1];
        continue;
        if (paramInt != 4) {
          continue;
        }
      }
      finally {}
      try
      {
        if (d != null)
        {
          Object[] arrayOfObject2 = d;
          this.b = arrayOfObject2;
          d = (Object[])arrayOfObject2[0];
          this.a = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          e -= 1;
          continue;
        }
      }
      finally {}
    }
  }
  
  final int b(Object paramObject)
  {
    int i = 1;
    int j = 1;
    int k = this.c << 1;
    Object[] arrayOfObject = this.b;
    if (paramObject == null)
    {
      i = j;
      if (i >= k) {
        break label75;
      }
      if (arrayOfObject[i] == null) {
        i >>= 1;
      }
    }
    for (;;)
    {
      return i;
      i += 2;
      break;
      do
      {
        i += 2;
        if (i >= k) {
          break;
        }
      } while (!paramObject.equals(arrayOfObject[i]));
      i >>= 1;
      continue;
      label75:
      i = -1;
    }
  }
  
  public final Object b(int paramInt)
  {
    return this.b[(paramInt << 1)];
  }
  
  public final Object c(int paramInt)
  {
    return this.b[((paramInt << 1) + 1)];
  }
  
  public void clear()
  {
    if (this.c != 0)
    {
      a(this.a, this.b, this.c);
      this.a = ef.a;
      this.b = ef.b;
      this.c = 0;
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    if (a(paramObject) >= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean containsValue(Object paramObject)
  {
    if (b(paramObject) >= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final Object d(int paramInt)
  {
    int i = 8;
    Object localObject = this.b[((paramInt << 1) + 1)];
    if (this.c <= 1)
    {
      a(this.a, this.b, this.c);
      this.a = ef.a;
      this.b = ef.b;
      this.c = 0;
    }
    for (;;)
    {
      return localObject;
      if ((this.a.length > 8) && (this.c < this.a.length / 3))
      {
        if (this.c > 8) {
          i = this.c + (this.c >> 1);
        }
        int[] arrayOfInt = this.a;
        Object[] arrayOfObject = this.b;
        a(i);
        this.c -= 1;
        if (paramInt > 0)
        {
          System.arraycopy(arrayOfInt, 0, this.a, 0, paramInt);
          System.arraycopy(arrayOfObject, 0, this.b, 0, paramInt << 1);
        }
        if (paramInt < this.c)
        {
          System.arraycopy(arrayOfInt, paramInt + 1, this.a, paramInt, this.c - paramInt);
          System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.b, paramInt << 1, this.c - paramInt << 1);
        }
      }
      else
      {
        this.c -= 1;
        if (paramInt < this.c)
        {
          System.arraycopy(this.a, paramInt + 1, this.a, paramInt, this.c - paramInt);
          System.arraycopy(this.b, paramInt + 1 << 1, this.b, paramInt << 1, this.c - paramInt << 1);
        }
        this.b[(this.c << 1)] = null;
        this.b[((this.c << 1) + 1)] = null;
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (this == paramObject) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      if ((paramObject instanceof Map))
      {
        Map localMap = (Map)paramObject;
        if (size() != localMap.size())
        {
          bool1 = false;
        }
        else
        {
          int i = 0;
          bool1 = bool2;
          try
          {
            if (i >= this.c) {
              continue;
            }
            paramObject = b(i);
            Object localObject2 = c(i);
            Object localObject1 = localMap.get(paramObject);
            if (localObject2 == null)
            {
              if ((localObject1 != null) || (!localMap.containsKey(paramObject))) {
                bool1 = false;
              }
            }
            else
            {
              bool1 = localObject2.equals(localObject1);
              if (!bool1)
              {
                bool1 = false;
                continue;
              }
            }
            i++;
          }
          catch (NullPointerException paramObject)
          {
            bool1 = false;
            continue;
          }
          catch (ClassCastException paramObject)
          {
            bool1 = false;
          }
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public Object get(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {}
    for (paramObject = this.b[((i << 1) + 1)];; paramObject = null) {
      return paramObject;
    }
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.a;
    Object[] arrayOfObject = this.b;
    int n = this.c;
    int j = 1;
    int i = 0;
    int k = 0;
    if (i < n)
    {
      Object localObject = arrayOfObject[j];
      int i1 = arrayOfInt[i];
      if (localObject == null) {}
      for (int m = 0;; m = localObject.hashCode())
      {
        k += (m ^ i1);
        i++;
        j += 2;
        break;
      }
    }
    return k;
  }
  
  public boolean isEmpty()
  {
    if (this.c <= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    int k = 8;
    int i;
    int j;
    if (paramObject1 == null)
    {
      i = a();
      j = 0;
    }
    while (i >= 0)
    {
      i = (i << 1) + 1;
      paramObject1 = this.b[i];
      this.b[i] = paramObject2;
      return paramObject1;
      j = paramObject1.hashCode();
      i = a(paramObject1, j);
    }
    int m = i ^ 0xFFFFFFFF;
    if (this.c >= this.a.length)
    {
      if (this.c < 8) {
        break label276;
      }
      i = this.c + (this.c >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = this.a;
      Object[] arrayOfObject = this.b;
      a(i);
      if (this.a.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.a, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.b, 0, arrayOfObject.length);
      }
      a(arrayOfInt, arrayOfObject, this.c);
      if (m < this.c)
      {
        System.arraycopy(this.a, m, this.a, m + 1, this.c - m);
        System.arraycopy(this.b, m << 1, this.b, m + 1 << 1, this.c - m << 1);
      }
      this.a[m] = j;
      this.b[(m << 1)] = paramObject1;
      this.b[((m << 1) + 1)] = paramObject2;
      this.c += 1;
      paramObject1 = null;
      break;
      label276:
      i = k;
      if (this.c < 4) {
        i = 4;
      }
    }
  }
  
  public Object remove(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {}
    for (paramObject = d(i);; paramObject = null) {
      return paramObject;
    }
  }
  
  public int size()
  {
    return this.c;
  }
  
  public String toString()
  {
    if (isEmpty()) {}
    for (Object localObject1 = "{}";; localObject1 = ((StringBuilder)localObject1).toString())
    {
      return (String)localObject1;
      localObject1 = new StringBuilder(this.c * 28);
      ((StringBuilder)localObject1).append('{');
      int i = 0;
      if (i < this.c)
      {
        if (i > 0) {
          ((StringBuilder)localObject1).append(", ");
        }
        Object localObject2 = b(i);
        if (localObject2 != this)
        {
          ((StringBuilder)localObject1).append(localObject2);
          label72:
          ((StringBuilder)localObject1).append('=');
          localObject2 = c(i);
          if (localObject2 == this) {
            break label112;
          }
          ((StringBuilder)localObject1).append(localObject2);
        }
        for (;;)
        {
          i++;
          break;
          ((StringBuilder)localObject1).append("(this Map)");
          break label72;
          label112:
          ((StringBuilder)localObject1).append("(this Map)");
        }
      }
      ((StringBuilder)localObject1).append('}');
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */