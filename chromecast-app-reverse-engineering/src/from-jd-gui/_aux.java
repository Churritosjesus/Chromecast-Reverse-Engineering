import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Build.VERSION;
import android.os.Handler;
import java.util.LinkedList;

final class aux
  extends BluetoothGattCallback
{
  aux(auv paramauv) {}
  
  public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
  {
    paramBluetoothGattCharacteristic.getUuid();
  }
  
  public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    paramBluetoothGatt = (avr)this.a.f.poll();
    if (paramInt == 0)
    {
      paramBluetoothGattCharacteristic.getUuid();
      paramBluetoothGatt = (awb)paramBluetoothGatt;
      paramBluetoothGattCharacteristic = paramBluetoothGattCharacteristic.getValue();
      paramBluetoothGatt.b.a(paramBluetoothGattCharacteristic);
      this.a.b();
    }
    for (;;)
    {
      return;
      ((awb)paramBluetoothGatt).a();
    }
  }
  
  public final void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    paramBluetoothGatt = (avr)this.a.f.poll();
    if (paramInt == 0)
    {
      paramBluetoothGattCharacteristic.getUuid();
      ((awi)paramBluetoothGatt).c.b();
      this.a.b();
    }
    for (;;)
    {
      return;
      ((awi)paramBluetoothGatt).a();
    }
  }
  
  public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      if (paramInt2 == 2) {
        this.a.b();
      }
    }
    for (;;)
    {
      return;
      paramBluetoothGatt.close();
      auv.a(this.a);
    }
  }
  
  public final void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    ((avw)this.a.g.poll()).b.a(paramInt1, paramInt2);
    this.a.b();
  }
  
  public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    avu localavu = (avu)this.a.g.poll();
    if (paramInt == 0)
    {
      this.a.d = this.a.b.getService(avp.v);
      if (this.a.d != null)
      {
        this.a.c = true;
        this.a.e.removeCallbacksAndMessages(null);
        if (Build.VERSION.SDK_INT >= 21) {
          paramBluetoothGatt.requestConnectionPriority(1);
        }
        this.a.b();
      }
    }
    for (;;)
    {
      return;
      localavu.a();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */