import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

public final class avq
{
  private static ParcelUuid a = ParcelUuid.fromString("0000110B-0000-1000-8000-00805F9B34FB");
  private static ParcelUuid b = ParcelUuid.fromString("0000110A-0000-1000-8000-00805F9B34FB");
  private static ParcelUuid c = ParcelUuid.fromString("0000110D-0000-1000-8000-00805F9B34FB");
  private static ParcelUuid d = ParcelUuid.fromString("00001108-0000-1000-8000-00805F9B34FB");
  private static ParcelUuid e;
  private static ParcelUuid f;
  private static ParcelUuid g;
  private static ParcelUuid h;
  private static ParcelUuid i;
  private static ParcelUuid j;
  private static ParcelUuid k;
  private static ParcelUuid l;
  private static ParcelUuid m;
  private static ParcelUuid n;
  
  static
  {
    ParcelUuid.fromString("00001112-0000-1000-8000-00805F9B34FB");
    e = ParcelUuid.fromString("0000111E-0000-1000-8000-00805F9B34FB");
    ParcelUuid.fromString("0000111F-0000-1000-8000-00805F9B34FB");
    f = ParcelUuid.fromString("0000110E-0000-1000-8000-00805F9B34FB");
    g = ParcelUuid.fromString("0000110C-0000-1000-8000-00805F9B34FB");
    h = ParcelUuid.fromString("00001105-0000-1000-8000-00805f9b34fb");
    ParcelUuid.fromString("00001124-0000-1000-8000-00805f9b34fb");
    ParcelUuid.fromString("00001812-0000-1000-8000-00805f9b34fb");
    i = ParcelUuid.fromString("00001115-0000-1000-8000-00805F9B34FB");
    j = ParcelUuid.fromString("00001116-0000-1000-8000-00805F9B34FB");
    ParcelUuid.fromString("0000000f-0000-1000-8000-00805F9B34FB");
    ParcelUuid.fromString("0000112e-0000-1000-8000-00805F9B34FB");
    ParcelUuid.fromString("0000112f-0000-1000-8000-00805F9B34FB");
    k = ParcelUuid.fromString("00001134-0000-1000-8000-00805F9B34FB");
    l = ParcelUuid.fromString("00001133-0000-1000-8000-00805F9B34FB");
    m = ParcelUuid.fromString("00001132-0000-1000-8000-00805F9B34FB");
    n = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    ParcelUuid localParcelUuid = a;
    localParcelUuid = b;
    localParcelUuid = c;
    localParcelUuid = d;
    localParcelUuid = e;
    localParcelUuid = f;
    localParcelUuid = g;
    localParcelUuid = h;
    localParcelUuid = i;
    localParcelUuid = j;
    localParcelUuid = k;
    localParcelUuid = l;
    localParcelUuid = m;
  }
  
  public static ParcelUuid a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("uuidBytes cannot be null");
    }
    int i1 = paramArrayOfByte.length;
    if ((i1 != 2) && (i1 != 4) && (i1 != 16)) {
      throw new IllegalArgumentException(38 + "uuidBytes length invalid - " + i1);
    }
    if (i1 == 16)
    {
      paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.LITTLE_ENDIAN);
      paramArrayOfByte = new ParcelUuid(new UUID(paramArrayOfByte.getLong(8), paramArrayOfByte.getLong(0)));
      return paramArrayOfByte;
    }
    if (i1 == 2) {}
    for (long l1 = (paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8);; l1 = (paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8) + ((paramArrayOfByte[2] & 0xFF) << 16) + ((paramArrayOfByte[3] & 0xFF) << 24))
    {
      paramArrayOfByte = new ParcelUuid(new UUID(n.getUuid().getMostSignificantBits() + (l1 << 32), n.getUuid().getLeastSignificantBits()));
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\avq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */