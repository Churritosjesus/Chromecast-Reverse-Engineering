import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class awd
{
  public static final ParcelUuid a = ParcelUuid.fromString("0000FEA0-0000-1000-8000-00805F9B34FB");
  public final List b;
  public final String c;
  public final byte[] d;
  
  private awd(List paramList, SparseArray paramSparseArray, Map paramMap, int paramInt1, int paramInt2, String paramString, byte[] paramArrayOfByte)
  {
    this.b = paramList;
    this.c = paramString;
    this.d = paramArrayOfByte;
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, List paramList)
  {
    while (paramInt2 > 0)
    {
      paramList.add(avq.a(a(paramArrayOfByte, paramInt1, paramInt3)));
      paramInt2 -= paramInt3;
      paramInt1 += paramInt3;
    }
    return paramInt1;
  }
  
  public static awd a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      return paramArrayOfByte;
    }
    int k = 0;
    ArrayList localArrayList2 = new ArrayList();
    SparseArray localSparseArray = new SparseArray();
    HashMap localHashMap = new HashMap();
    int i = Integer.MIN_VALUE;
    Object localObject1 = null;
    int j = -1;
    int m;
    label196:
    Object localObject2;
    try
    {
      if (k < paramArrayOfByte.length)
      {
        int n = k + 1;
        k = paramArrayOfByte[k] & 0xFF;
        if (k != 0)
        {
          k--;
          m = n + 1;
          switch (paramArrayOfByte[n] & 0xFF)
          {
          default: 
          case 1: 
          case 2: 
          case 3: 
            for (;;)
            {
              k += m;
              break;
              j = paramArrayOfByte[m] & 0xFF;
              continue;
              a(paramArrayOfByte, m, k, 2, localArrayList2);
            }
            localObject2 = "unable to parse scan record: ".concat((String)localObject2);
          }
        }
      }
    }
    catch (Exception localException)
    {
      localObject2 = String.valueOf(Arrays.toString(paramArrayOfByte));
      if (((String)localObject2).length() == 0) {}
    }
    for (;;)
    {
      Log.e("ScanRecord", (String)localObject2);
      paramArrayOfByte = new awd(null, null, null, -1, Integer.MIN_VALUE, null, paramArrayOfByte);
      break;
      a(paramArrayOfByte, m, k, 4, localArrayList2);
      break label196;
      a(paramArrayOfByte, m, k, 16, localArrayList2);
      break label196;
      localObject2 = new String(a(paramArrayOfByte, m, k));
      break label196;
      i = paramArrayOfByte[m];
      break label196;
      localHashMap.put(avq.a(a(paramArrayOfByte, m, 2)), a(paramArrayOfByte, m + 2, k - 2));
      break label196;
      localSparseArray.put(((paramArrayOfByte[(m + 1)] & 0xFF) << 8) + (paramArrayOfByte[m] & 0xFF), a(paramArrayOfByte, m + 2, k - 2));
      break label196;
      ArrayList localArrayList1 = localArrayList2;
      if (localArrayList2.isEmpty()) {
        localArrayList1 = null;
      }
      localObject2 = new awd(localArrayList1, localSparseArray, localHashMap, j, i, (String)localObject2, paramArrayOfByte);
      paramArrayOfByte = (byte[])localObject2;
      break;
      localObject2 = new String("unable to parse scan record: ");
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\awd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */