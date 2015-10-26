	private static final java.util.logging.Logger a
	private static final dke b
	
	    static dij()
	    {
	        dij.a = java.util.logging.Logger.getLogger(dil.getName());
	        dij.b = dke.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
	        return;
	    }
	
	
	    public dij()
	    {
	        return;
	    }
	
	
	    static synthetic int a(int p4, byte p5, short p6)
	    {
	        if ((p5 & 8) != 0) {
	            p4--;
	        }
	        if (p6 <= p4) {
	            return ((short) (p4 - p6));
	        } else {
	            Object[] v1_1 = new Object[2];
	            v1_1[0] = Short.valueOf(p6);
	            v1_1[1] = Integer.valueOf(p4);
	            throw dij.c("PROTOCOL_ERROR padding %s > remaining length %s", v1_1);
	        }
	    }
	
	
	    static synthetic int a(dkd p2)
	    {
	        return ((((p2.g() & 255) << 16) | ((p2.g() & 255) << 8)) | (p2.g() & 255));
	    }
	
	
	    static synthetic dke a()
	    {
	        return dij.b;
	    }
	
	
	    static synthetic java.io.IOException a(String p1, Object[] p2)
	    {
	        return dij.c(p1, p2);
	    }
	
	
	    static synthetic void a(dkc p1, int p2)
	    {
	        p1.h(((p2 >> 16) & 255));
	        p1.h(((p2 >> 8) & 255));
	        p1.h((p2 & 255));
	        return;
	    }
	
	
	    static synthetic IllegalArgumentException b(String p2, Object[] p3)
	    {
	        throw new IllegalArgumentException(String.format(p2, p3));
	    }
	
	
	    static synthetic java.util.logging.Logger b()
	    {
	        return dij.a;
	    }
	
	
	    private static varargs java.io.IOException c(String p2, Object[] p3)
	    {
	        throw new java.io.IOException(String.format(p2, p3));
	    }
	
	
	    public final dib a(dkd p3, boolean p4)
	    {
	        return new dim(p3, 4096, p4);
	    }
	
	
	    public final did a(dkc p2, boolean p3)
	    {
	        return new din(p2, p3);
	    }
	
