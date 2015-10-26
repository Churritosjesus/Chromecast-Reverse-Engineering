	private static android.os.ParcelUuid a
	private static android.os.ParcelUuid b
	private static android.os.ParcelUuid c
	private static android.os.ParcelUuid d
	private static android.os.ParcelUuid e
	private static android.os.ParcelUuid f
	private static android.os.ParcelUuid g
	private static android.os.ParcelUuid h
	private static android.os.ParcelUuid i
	private static android.os.ParcelUuid j
	private static android.os.ParcelUuid k
	private static android.os.ParcelUuid l
	private static android.os.ParcelUuid m
	private static android.os.ParcelUuid n
	
	    static avq()
	    {
	        avq.a = android.os.ParcelUuid.fromString("0000110B-0000-1000-8000-00805F9B34FB");
	        avq.b = android.os.ParcelUuid.fromString("0000110A-0000-1000-8000-00805F9B34FB");
	        avq.c = android.os.ParcelUuid.fromString("0000110D-0000-1000-8000-00805F9B34FB");
	        avq.d = android.os.ParcelUuid.fromString("00001108-0000-1000-8000-00805F9B34FB");
	        android.os.ParcelUuid.fromString("00001112-0000-1000-8000-00805F9B34FB");
	        avq.e = android.os.ParcelUuid.fromString("0000111E-0000-1000-8000-00805F9B34FB");
	        android.os.ParcelUuid.fromString("0000111F-0000-1000-8000-00805F9B34FB");
	        avq.f = android.os.ParcelUuid.fromString("0000110E-0000-1000-8000-00805F9B34FB");
	        avq.g = android.os.ParcelUuid.fromString("0000110C-0000-1000-8000-00805F9B34FB");
	        avq.h = android.os.ParcelUuid.fromString("00001105-0000-1000-8000-00805f9b34fb");
	        android.os.ParcelUuid.fromString("00001124-0000-1000-8000-00805f9b34fb");
	        android.os.ParcelUuid.fromString("00001812-0000-1000-8000-00805f9b34fb");
	        avq.i = android.os.ParcelUuid.fromString("00001115-0000-1000-8000-00805F9B34FB");
	        avq.j = android.os.ParcelUuid.fromString("00001116-0000-1000-8000-00805F9B34FB");
	        android.os.ParcelUuid.fromString("0000000f-0000-1000-8000-00805F9B34FB");
	        android.os.ParcelUuid.fromString("0000112e-0000-1000-8000-00805F9B34FB");
	        android.os.ParcelUuid.fromString("0000112f-0000-1000-8000-00805F9B34FB");
	        avq.k = android.os.ParcelUuid.fromString("00001134-0000-1000-8000-00805F9B34FB");
	        avq.l = android.os.ParcelUuid.fromString("00001133-0000-1000-8000-00805F9B34FB");
	        avq.m = android.os.ParcelUuid.fromString("00001132-0000-1000-8000-00805F9B34FB");
	        avq.n = android.os.ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
	        android.os.ParcelUuid[] v0_36 = new android.os.ParcelUuid[13];
	        v0_36[0] = avq.a;
	        v0_36[1] = avq.b;
	        v0_36[2] = avq.c;
	        v0_36[3] = avq.d;
	        v0_36[4] = avq.e;
	        v0_36[5] = avq.f;
	        v0_36[6] = avq.g;
	        v0_36[7] = avq.h;
	        v0_36[8] = avq.i;
	        v0_36[9] = avq.j;
	        v0_36[10] = avq.k;
	        v0_36[11] = avq.l;
	        v0_36[12] = avq.m;
	        return;
	    }
	
	
	    public static android.os.ParcelUuid a(byte[] p6)
	    {
	        if (p6 != null) {
	            android.os.ParcelUuid v0_0 = p6.length;
	            if ((v0_0 == 2) || ((v0_0 == 4) || (v0_0 == 16))) {
	                android.os.ParcelUuid v0_14;
	                if (v0_0 != 16) {
	                    android.os.ParcelUuid v0_6;
	                    if (v0_0 != 2) {
	                        v0_6 = (((((long) (p6[0] & 255)) + ((long) ((p6[1] & 255) << 8))) + ((long) ((p6[2] & 255) << 16))) + ((long) ((p6[3] & 255) << 24)));
	                    } else {
	                        v0_6 = (((long) (p6[0] & 255)) + ((long) ((p6[1] & 255) << 8)));
	                    }
	                    v0_14 = new android.os.ParcelUuid(new java.util.UUID((avq.n.getUuid().getMostSignificantBits() + (v0_6 << 32)), avq.n.getUuid().getLeastSignificantBits()));
	                } else {
	                    android.os.ParcelUuid v0_16 = java.nio.ByteBuffer.wrap(p6).order(java.nio.ByteOrder.LITTLE_ENDIAN);
	                    v0_14 = new android.os.ParcelUuid(new java.util.UUID(v0_16.getLong(8), v0_16.getLong(0)));
	                }
	                return v0_14;
	            } else {
	                throw new IllegalArgumentException(new StringBuilder(38).append("uuidBytes length invalid - ").append(v0_0).toString());
	            }
	        } else {
	            throw new IllegalArgumentException("uuidBytes cannot be null");
	        }
	    }
	
