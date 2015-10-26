package com.google.android.gms.location;

import android.os.Parcel;
import cna;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ActivityRecognitionResult
  implements SafeParcelable
{
  public static final cna CREATOR = new cna();
  public final int a;
  public List b;
  public long c;
  public long d;
  public int e;
  
  public ActivityRecognitionResult(int paramInt1, List paramList, long paramLong1, long paramLong2, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "ActivityRecognitionResult [probableActivities=" + this.b + ", timeMillis=" + this.c + ", elapsedRealtimeMillis=" + this.d + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cna.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\ActivityRecognitionResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */