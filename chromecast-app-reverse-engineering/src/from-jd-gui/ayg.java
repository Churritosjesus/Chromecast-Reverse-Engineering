import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import java.util.List;

final class ayg
  implements BluetoothAdapter.LeScanCallback
{
  ayg(ayf paramayf) {}
  
  public final void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = awd.a(paramArrayOfByte);
    if (paramArrayOfByte.b.contains(awd.a)) {}
    for (paramInt = 1;; paramInt = 0)
    {
      if (paramInt != 0)
      {
        ayf.a(this.a);
        paramBluetoothDevice.getAddress();
        paramBluetoothDevice.getName();
        ayf.b(this.a).a(paramBluetoothDevice, paramArrayOfByte);
        ayf.a(this.a, paramBluetoothDevice.getAddress());
      }
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */