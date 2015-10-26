	public static final cog CREATOR
	public final  a
	public final java.lang.String b
	public final  c
	public final  d
	public final  e
	public final  f
	public final  g
	public final  h
	public final  i
	public final  j
	
	    static ParcelableGeofence()
	    {
	        com.google.android.gms.location.internal.ParcelableGeofence.CREATOR = new cog();
	        return;
	    }
	
	
	    public ParcelableGeofence(int p6, String p7, int p8, short p9, double p10, double p12, float p14, long p15, int p17, int p18)
	    {
	        if ((p7 != null) && (p7.length() <= 100)) {
	            if (p14 > 0) {
	                if ((p10 <= 90.0) && (p10 >= -90.0)) {
	                    if ((p12 <= 180.0) && (p12 >= -180.0)) {
	                        IllegalArgumentException v2_11 = (p8 & 7);
	                        if (v2_11 != null) {
	                            this.a = p6;
	                            this.d = p9;
	                            this.b = p7;
	                            this.e = p10;
	                            this.f = p12;
	                            this.g = p14;
	                            this.c = p15;
	                            this.h = v2_11;
	                            this.i = p17;
	                            this.j = p18;
	                            return;
	                        } else {
	                            throw new IllegalArgumentException(new StringBuilder("No supported transition specified: ").append(p8).toString());
	                        }
	                    } else {
	                        throw new IllegalArgumentException(new StringBuilder("invalid longitude: ").append(p12).toString());
	                    }
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("invalid latitude: ").append(p10).toString());
	                }
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("invalid radius: ").append(p14).toString());
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("requestId is null or too long: ").append(p7).toString());
	        }
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p7)
	    {
	        int v0 = 1;
	        if (this != p7) {
	            if (p7 != null) {
	                if ((p7 instanceof com.google.android.gms.location.internal.ParcelableGeofence)) {
	                    if (this.g == ((com.google.android.gms.location.internal.ParcelableGeofence) p7).g) {
	                        if (this.e == ((com.google.android.gms.location.internal.ParcelableGeofence) p7).e) {
	                            if (this.f == ((com.google.android.gms.location.internal.ParcelableGeofence) p7).f) {
	                                if (this.d != ((com.google.android.gms.location.internal.ParcelableGeofence) p7).d) {
	                                    v0 = 0;
	                                }
	                            } else {
	                                v0 = 0;
	                            }
	                        } else {
	                            v0 = 0;
	                        }
	                    } else {
	                        v0 = 0;
	                    }
	                } else {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_1 = Double.doubleToLongBits(this.e);
	        int v0_4 = (((int) (v0_1 ^ (v0_1 >> 32))) + 31);
	        long v2_2 = Double.doubleToLongBits(this.f);
	        return ((((((((v0_4 * 31) + ((int) (v2_2 ^ (v2_2 >> 32)))) * 31) + Float.floatToIntBits(this.g)) * 31) + this.d) * 31) + this.h);
	    }
	
	
	    public String toString()
	    {
	        String v0_2;
	        Object[] v3 = new Object[9];
	        switch (this.d) {
	            case 1:
	                v0_2 = "CIRCLE";
	                break;
	            default:
	                v0_2 = 0;
	        }
	        v3[0] = v0_2;
	        v3[1] = this.b;
	        v3[2] = Integer.valueOf(this.h);
	        v3[3] = Double.valueOf(this.e);
	        v3[4] = Double.valueOf(this.f);
	        v3[5] = Float.valueOf(this.g);
	        v3[6] = Integer.valueOf((this.i / 1000));
	        v3[7] = Integer.valueOf(this.j);
	        v3[8] = Long.valueOf(this.c);
	        return String.format(java.util.Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", v3);
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cog.a(this, p1);
	        return;
	    }
	
