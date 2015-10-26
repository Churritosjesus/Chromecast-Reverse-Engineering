	public static final java.nio.charset.Charset a
	
	    static dky()
	    {
	        dky.a = java.nio.charset.Charset.forName("UTF-8");
	        return;
	    }
	
	
	    public static int a(int p2)
	    {
	        return (((((-16777216 & p2) >> 24) | ((16711680 & p2) >> 8)) | ((65280 & p2) << 8)) | ((p2 & 255) << 24));
	    }
	
	
	    public static short a(short p2)
	    {
	        short v0_1 = (65535 & p2);
	        return ((short) (((v0_1 & 255) << 8) | ((v0_1 >> 8) & 255)));
	    }
	
	
	    public static void a(long p6, long p8, long p10)
	    {
	        if (((p8 | p10) >= 0) && ((p8 <= p6) && ((p6 - p8) >= p10))) {
	            return;
	        } else {
	            Object[] v2_2 = new Object[3];
	            v2_2[0] = Long.valueOf(p6);
	            v2_2[1] = Long.valueOf(p8);
	            v2_2[2] = Long.valueOf(p10);
	            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", v2_2));
	        }
	    }
	
	
	    public static void a(Throwable p0)
	    {
	        throw p0;
	    }
	
	
	    public static boolean a(byte[] p4, int p5, byte[] p6, int p7, int p8)
	    {
	        int v0 = 0;
	        int v1 = 0;
	        while (v1 < p8) {
	            if (p4[(v1 + p5)] == p6[(v1 + p7)]) {
	                v1++;
	            }
	            return v0;
	        }
	        v0 = 1;
	        return v0;
	    }
	
