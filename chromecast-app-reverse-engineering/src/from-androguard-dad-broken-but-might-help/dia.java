	public static final enum dia a
	public static final enum dia b
	public static final enum dia c
	public static final enum dia d
	public static final enum dia e
	public static final enum dia f
	public static final enum dia g
	public static final enum dia h
	private static enum dia l
	private static enum dia m
	private static enum dia n
	private static enum dia o
	private static enum dia p
	private static enum dia q
	private static enum dia r
	private static enum dia s
	private static enum dia t
	private static enum dia u
	private static final synthetic Ldia v
	public final  i
	public final  j
	public final  k
	
	    static dia()
	    {
	        dia.a = new dia("NO_ERROR", 0, 0, -1, 0);
	        dia.b = new dia("PROTOCOL_ERROR", 1, 1, 1, 1);
	        dia.c = new dia("INVALID_STREAM", 2, 1, 2, -1);
	        dia.l = new dia("UNSUPPORTED_VERSION", 3, 1, 4, -1);
	        dia.d = new dia("STREAM_IN_USE", 4, 1, 8, -1);
	        dia.m = new dia("STREAM_ALREADY_CLOSED", 5, 1, 9, -1);
	        dia.e = new dia("INTERNAL_ERROR", 6, 2, 6, 2);
	        dia.f = new dia("FLOW_CONTROL_ERROR", 7, 3, 7, -1);
	        dia.n = new dia("STREAM_CLOSED", 8, 5, -1, -1);
	        dia.o = new dia("FRAME_TOO_LARGE", 9, 6, 11, -1);
	        dia.g = new dia("REFUSED_STREAM", 10, 7, 3, -1);
	        dia.h = new dia("CANCEL", 11, 8, 5, -1);
	        dia.p = new dia("COMPRESSION_ERROR", 12, 9, -1, -1);
	        dia.q = new dia("CONNECT_ERROR", 13, 10, -1, -1);
	        dia.r = new dia("ENHANCE_YOUR_CALM", 14, 11, -1, -1);
	        dia.s = new dia("INADEQUATE_SECURITY", 15, 12, -1, -1);
	        dia.t = new dia("HTTP_1_1_REQUIRED", 16, 13, -1, -1);
	        dia.u = new dia("INVALID_CREDENTIALS", 17, -1, 10, -1);
	        dia[] v0_3 = new dia[18];
	        v0_3[0] = dia.a;
	        v0_3[1] = dia.b;
	        v0_3[2] = dia.c;
	        v0_3[3] = dia.l;
	        v0_3[4] = dia.d;
	        v0_3[5] = dia.m;
	        v0_3[6] = dia.e;
	        v0_3[7] = dia.f;
	        v0_3[8] = dia.n;
	        v0_3[9] = dia.o;
	        v0_3[10] = dia.g;
	        v0_3[11] = dia.h;
	        v0_3[12] = dia.p;
	        v0_3[13] = dia.q;
	        v0_3[14] = dia.r;
	        v0_3[15] = dia.s;
	        v0_3[16] = dia.t;
	        v0_3[17] = dia.u;
	        dia.v = v0_3;
	        return;
	    }
	
	
	    private dia(String p1, int p2, int p3, int p4, int p5)
	    {
	        this(p1, p2);
	        this.i = p3;
	        this.j = p4;
	        this.k = p5;
	        return;
	    }
	
	
	    public static dia a(int p5)
	    {
	        dia[] v2 = dia.values();
	        int v1 = 0;
	        while (v1 < v2.length) {
	            int v0_1 = v2[v1];
	            if (v0_1.j != p5) {
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static dia b(int p5)
	    {
	        dia[] v2 = dia.values();
	        int v1 = 0;
	        while (v1 < v2.length) {
	            int v0_1 = v2[v1];
	            if (v0_1.i != p5) {
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static dia c(int p5)
	    {
	        dia[] v2 = dia.values();
	        int v1 = 0;
	        while (v1 < v2.length) {
	            int v0_1 = v2[v1];
	            if (v0_1.k != p5) {
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static dia valueOf(String p1)
	    {
	        return ((dia) Enum.valueOf(dia, p1));
	    }
	
	
	    public static dia[] values()
	    {
	        return ((dia[]) dia.v.clone());
	    }
	
