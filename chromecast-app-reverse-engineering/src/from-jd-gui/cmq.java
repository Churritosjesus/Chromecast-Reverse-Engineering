import java.util.Arrays;

public final class cmq
{
  public static final Object a = new Object();
  
  public static int a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {}
    for (int i = 0;; i = Arrays.hashCode(paramArrayOfInt)) {
      return i;
    }
  }
  
  public static int a(Object[] paramArrayOfObject)
  {
    int m = 0;
    if (paramArrayOfObject == null) {}
    for (int i = 0;; i = paramArrayOfObject.length)
    {
      int j = 0;
      while (j < i)
      {
        Object localObject = paramArrayOfObject[j];
        int k = m;
        if (localObject != null) {
          k = m * 31 + localObject.hashCode();
        }
        j++;
        m = k;
      }
    }
    return m;
  }
  
  public static int a(byte[][] paramArrayOfByte)
  {
    int k = 0;
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      int j = 0;
      while (j < i)
      {
        byte[] arrayOfByte = paramArrayOfByte[j];
        int m = k;
        if (arrayOfByte != null) {
          m = k * 31 + Arrays.hashCode(arrayOfByte);
        }
        j++;
        k = m;
      }
    }
    return k;
  }
  
  public static void a(cmm paramcmm1, cmm paramcmm2)
  {
    if (paramcmm1.m != null) {
      paramcmm2.m = paramcmm1.m.b();
    }
  }
  
  public static boolean a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    boolean bool;
    if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length == 0)) {
      if ((paramArrayOfInt2 == null) || (paramArrayOfInt2.length == 0)) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      bool = Arrays.equals(paramArrayOfInt1, paramArrayOfInt2);
    }
  }
  
  public static boolean a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    boolean bool2 = false;
    int k;
    if (paramArrayOfObject1 == null)
    {
      k = 0;
      if (paramArrayOfObject2 != null) {
        break label46;
      }
    }
    int j;
    int i;
    label46:
    for (int m = 0;; m = paramArrayOfObject2.length)
    {
      j = 0;
      for (i = 0; (i < k) && (paramArrayOfObject1[i] == null); i++) {}
      k = paramArrayOfObject1.length;
      break;
    }
    for (;;)
    {
      if ((j < m) && (paramArrayOfObject2[j] == null))
      {
        j++;
      }
      else
      {
        int n;
        int i1;
        label89:
        boolean bool1;
        if (i >= k)
        {
          n = 1;
          if (j < m) {
            break label111;
          }
          i1 = 1;
          if ((n == 0) || (i1 == 0)) {
            break label117;
          }
          bool1 = true;
        }
        label111:
        label117:
        do
        {
          do
          {
            return bool1;
            n = 0;
            break;
            i1 = 0;
            break label89;
            bool1 = bool2;
          } while (n != i1);
          bool1 = bool2;
        } while (!paramArrayOfObject1[i].equals(paramArrayOfObject2[j]));
        j++;
        i++;
        break;
      }
    }
  }
  
  public static boolean a(byte[][] paramArrayOfByte1, byte[][] paramArrayOfByte2)
  {
    boolean bool2 = false;
    int k;
    if (paramArrayOfByte1 == null)
    {
      k = 0;
      if (paramArrayOfByte2 != null) {
        break label46;
      }
    }
    int j;
    int i;
    label46:
    for (int m = 0;; m = paramArrayOfByte2.length)
    {
      j = 0;
      for (i = 0; (i < k) && (paramArrayOfByte1[i] == null); i++) {}
      k = paramArrayOfByte1.length;
      break;
    }
    for (;;)
    {
      if ((j < m) && (paramArrayOfByte2[j] == null))
      {
        j++;
      }
      else
      {
        int n;
        int i1;
        label89:
        boolean bool1;
        if (i >= k)
        {
          n = 1;
          if (j < m) {
            break label111;
          }
          i1 = 1;
          if ((n == 0) || (i1 == 0)) {
            break label117;
          }
          bool1 = true;
        }
        label111:
        label117:
        do
        {
          do
          {
            return bool1;
            n = 0;
            break;
            i1 = 0;
            break label89;
            bool1 = bool2;
          } while (n != i1);
          bool1 = bool2;
        } while (!Arrays.equals(paramArrayOfByte1[i], paramArrayOfByte2[j]));
        j++;
        i++;
        break;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */