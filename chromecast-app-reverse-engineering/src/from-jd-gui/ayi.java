import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import java.util.Iterator;
import java.util.List;

final class ayi
  extends ScanCallback
{
  ayi(ayf paramayf) {}
  
  public final void onBatchScanResults(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (ScanResult)localIterator.next();
      ayf.a(this.a);
      paramList.getDevice().getAddress();
      paramList.getDevice().getName();
      ayf.b(this.a).a(paramList.getDevice(), awd.a(paramList.getScanRecord().getBytes()));
      ayf.a(this.a, paramList.getDevice().getAddress());
    }
  }
  
  public final void onScanFailed(int paramInt)
  {
    ayf.a(this.a);
  }
  
  public final void onScanResult(int paramInt, ScanResult paramScanResult)
  {
    ayf.a(this.a);
    paramScanResult.getDevice().getAddress();
    paramScanResult.getDevice().getName();
    ayf.b(this.a).a(paramScanResult.getDevice(), awd.a(paramScanResult.getScanRecord().getBytes()));
    ayf.a(this.a, paramScanResult.getDevice().getAddress());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */