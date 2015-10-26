	final  a
	  b
	public final java.lang.String c
	public final java.lang.String d
	final  e
	final java.lang.String f
	public final  g
	public final java.lang.Long h
	public final  i
	final android.net.Uri j
	  k
	public final java.lang.String l
	private B m
	private  n
	private java.lang.String o
	private final Ljava.lang.String p
	
	    private acx(int p3, String p4, String p5, int p6, String p7, long p8, Long p10, long p11, android.net.Uri p13, boolean p14, boolean p15, String p16, String[] p17)
	    {
	        this.a = p3;
	        this.b = p14;
	        this.c = p4;
	        this.d = p5;
	        this.e = p6;
	        this.f = p7;
	        this.g = p8;
	        this.h = p10;
	        this.i = p11;
	        this.j = p13;
	        this.m = 0;
	        this.k = p15;
	        this.l = p16;
	        this.n = 0;
	        this.o = 0;
	        this.p = p17;
	        return;
	    }
	
	
	    public static acx a(String p19, int p20, String p21, int p22, String p23, long p24, Long p26, long p27, String p29, boolean p30, String p31)
	    {
	        int v14;
	        String v5 = acx.a(p20, p19, p21);
	        if (p29 == null) {
	            v14 = 0;
	        } else {
	            v14 = android.net.Uri.parse(p29);
	        }
	        return new acx(0, v5, p21, p22, p23, p24, p26, p27, v14, 1, 1, p31, 0);
	    }
	
	
	    public static acx a(String p16, String p17, boolean p18)
	    {
	        return new acx(0, p16, p17, -1, 0, -2, 0, -2, 0, 1, p18, 0, 0);
	    }
	
	
	    public static acx a(String p16, boolean p17)
	    {
	        String v2;
	        acx v0_0 = android.text.util.Rfc822Tokenizer.tokenize(p16);
	        if (v0_0.length <= 0) {
	            v2 = p16;
	        } else {
	            v2 = v0_0[0].getAddress();
	        }
	        return new acx(0, v2, v2, -1, 0, -1, 0, -1, 0, 1, p17, 0, 0);
	    }
	
	
	    private static String a(int p1, String p2, String p3)
	    {
	        if (p1 <= 20) {
	            p2 = p3;
	        }
	        return p2;
	    }
	
	
	    public static boolean a(long p2)
	    {
	        if ((p2 != -1) && (p2 != -2)) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public static acx b(String p19, int p20, String p21, int p22, String p23, long p24, Long p26, long p27, String p29, boolean p30, String p31)
	    {
	        int v14;
	        String v5 = acx.a(p20, p19, p21);
	        if (p29 == null) {
	            v14 = 0;
	        } else {
	            v14 = android.net.Uri.parse(p29);
	        }
	        return new acx(0, v5, p21, p22, p23, p24, p26, p27, v14, 0, 1, p31, 0);
	    }
	
	
	    public static acx b(String p16, boolean p17)
	    {
	        return new acx(0, p16, p16, -1, 0, -1, 0, -1, 0, 1, 1, 0, 0);
	    }
	
	
	    public final declared_synchronized void a(byte[] p2)
	    {
	        try {
	            this.m = p2;
	            return;
	        } catch (Throwable v0) {
	            throw v0;
	        }
	    }
	
	
	    public final declared_synchronized byte[] a()
	    {
	        try {
	            return this.m;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public final String toString()
	    {
	        String v0_0 = this.c;
	        String v1_0 = this.d;
	        return new StringBuilder(((String.valueOf(v0_0).length() + 18) + String.valueOf(v1_0).length())).append(v0_0).append(" <").append(v1_0).append(">, isValid=").append(this.k).toString();
	    }
	
