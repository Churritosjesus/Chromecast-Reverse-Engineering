	public static final enum bfu a
	public static final enum bfu b
	public static final enum bfu c
	public static final enum bfu d
	public static final enum bfu e
	public static final enum bfu f
	public static final enum bfu g
	public static final enum bfu h
	public static final enum bfu i
	private static final synthetic Lbfu l
	public final  j
	public final  k
	
	    static bfu()
	    {
	        bfu.a = new bfu("UNKNOWN", 0, 0, 0);
	        bfu.b = new bfu("NONE_OPEN", 1, 1, 0);
	        bfu.c = new bfu("NONE_WEP", 2, 2, 1);
	        bfu.d = new bfu("NONE_WEP_SHARED", 3, 3, 1);
	        bfu.e = new bfu("IEEE_8021X", 4, 4, 0);
	        bfu.f = new bfu("WPA_PSK", 5, 5, 1);
	        bfu.g = new bfu("WPA_EAP", 6, 6, 1);
	        bfu.h = new bfu("WPA2_PSK", 7, 7, 1);
	        bfu.i = new bfu("WPA2_EAP", 8, 8, 1);
	        bfu[] v0_19 = new bfu[9];
	        v0_19[0] = bfu.a;
	        v0_19[1] = bfu.b;
	        v0_19[2] = bfu.c;
	        v0_19[3] = bfu.d;
	        v0_19[4] = bfu.e;
	        v0_19[5] = bfu.f;
	        v0_19[6] = bfu.g;
	        v0_19[7] = bfu.h;
	        v0_19[8] = bfu.i;
	        bfu.l = v0_19;
	        return;
	    }
	
	
	    private bfu(String p1, int p2, int p3, boolean p4)
	    {
	        this(p1, p2);
	        this.j = p3;
	        this.k = p4;
	        return;
	    }
	
	
	    public static bfu a(int p5)
	    {
	        bfu[] v2 = bfu.values();
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
	
	
	    public static bfu valueOf(String p1)
	    {
	        return ((bfu) Enum.valueOf(bfu, p1));
	    }
	
	
	    public static bfu[] values()
	    {
	        return ((bfu[]) bfu.l.clone());
	    }
	
