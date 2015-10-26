	private static java.util.UUID A
	public static final java.util.UUID a
	public static final java.util.UUID b
	public static final java.util.UUID c
	public static final java.util.UUID d
	public static final java.util.UUID e
	public static final java.util.UUID f
	public static final java.util.UUID g
	public static final java.util.UUID h
	public static final java.util.UUID i
	public static final java.util.UUID j
	public static final java.util.UUID k
	public static final java.util.UUID l
	public static final java.util.UUID m
	public static final java.util.UUID n
	public static final java.util.UUID o
	public static final java.util.UUID p
	public static final java.util.UUID q
	public static final java.util.UUID r
	public static final java.util.UUID s
	public static final java.util.UUID t
	public static final java.util.UUID u
	public static final java.util.UUID v
	private static java.util.UUID w
	private static java.util.UUID x
	private static java.util.UUID y
	private static java.util.UUID z
	
	    static avp()
	    {
	        avp.w = java.util.UUID.fromString("0000fea0-0000-1000-8000-00805f9b34fb");
	        avp.a = java.util.UUID.fromString("0028fe40-002f-11e5-87d0-0002a5d5c51b");
	        avp.b = java.util.UUID.fromString("0428fe40-002f-11e5-87d0-0002a5d5c51b");
	        avp.c = java.util.UUID.fromString("007c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.d = java.util.UUID.fromString("017c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.e = java.util.UUID.fromString("037c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.f = java.util.UUID.fromString("047c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.x = java.util.UUID.fromString("046aa300-0576-11e5-b9a5-0002a5d5c51b");
	        avp.g = java.util.UUID.fromString("057c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.h = java.util.UUID.fromString("067c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.y = java.util.UUID.fromString("066aa300-0576-11e5-b9a5-0002a5d5c51b");
	        avp.i = java.util.UUID.fromString("077c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.z = java.util.UUID.fromString("076aa300-0576-11e5-b9a5-0002a5d5c51b");
	        avp.j = java.util.UUID.fromString("0b7c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.k = java.util.UUID.fromString("0b6aa300-0576-11e5-b9a5-0002a5d5c51b");
	        avp.l = java.util.UUID.fromString("0228fe40-002f-11e5-87d0-0002a5d5c51b");
	        avp.m = java.util.UUID.fromString("0328fe40-002f-11e5-87d0-0002a5d5c51b");
	        avp.n = java.util.UUID.fromString("0128fe40-002f-11e5-87d0-0002a5d5c51b");
	        avp.o = java.util.UUID.fromString("0a7c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.p = java.util.UUID.fromString("0c7c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.q = java.util.UUID.fromString("087c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.A = java.util.UUID.fromString("086aa300-0576-11e5-b9a5-0002a5d5c51b");
	        avp.r = java.util.UUID.fromString("027c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.s = java.util.UUID.fromString("097c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.t = java.util.UUID.fromString("0d7c6160-fab2-11e4-9fbb-0002a5d5c51b");
	        avp.u = java.util.UUID.fromString("0528fe40-002f-11e5-87d0-0002a5d5c51b");
	        avp.v = avp.w;
	        return;
	    }
	
	
	    public static boolean a(java.util.UUID p1)
	    {
	        if ((!p1.equals(avp.f)) && ((!p1.equals(avp.h)) && ((!p1.equals(avp.j)) && ((!p1.equals(avp.i)) && (!p1.equals(avp.q)))))) {
	            int v0_10 = 0;
	        } else {
	            v0_10 = 1;
	        }
	        return v0_10;
	    }
	
	
	    public static java.util.UUID b(java.util.UUID p1)
	    {
	        int v0_10;
	        if (!p1.equals(avp.i)) {
	            if (!p1.equals(avp.q)) {
	                if (!p1.equals(avp.f)) {
	                    if (!p1.equals(avp.h)) {
	                        if (!p1.equals(avp.j)) {
	                            v0_10 = 0;
	                        } else {
	                            v0_10 = avp.k;
	                        }
	                    } else {
	                        v0_10 = avp.y;
	                    }
	                } else {
	                    v0_10 = avp.x;
	                }
	            } else {
	                v0_10 = avp.A;
	            }
	        } else {
	            v0_10 = avp.z;
	        }
	        return v0_10;
	    }
	
