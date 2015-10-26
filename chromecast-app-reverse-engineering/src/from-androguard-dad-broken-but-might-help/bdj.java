	public static final enum bdj a
	public static final enum bdj b
	public static final enum bdj c
	public static final enum bdj d
	public static final enum bdj e
	public static final enum bdj f
	public static final enum bdj g
	public static final enum bdj h
	public static final enum bdj i
	public static final enum bdj j
	public static final enum bdj k
	public static final enum bdj l
	public static final enum bdj m
	public static final enum bdj n
	public static final enum bdj o
	public static final enum bdj p
	public static final enum bdj q
	private static final synthetic Lbdj s
	public final  r
	
	    static bdj()
	    {
	        bdj.a = new bdj("UNKNOWN", 0, 0);
	        bdj.b = new bdj("DISCONNECTED", 1, 10);
	        bdj.c = new bdj("DISCONNECTED_EXTERNAL_CLIENT_ACCESSED", 2, 11);
	        bdj.d = new bdj("SCANNING", 3, 20);
	        bdj.e = new bdj("SCANNING_WRONG_SSID", 4, 21);
	        bdj.f = new bdj("BEING_CONFIGURED", 5, 30);
	        bdj.g = new bdj("BEING_CONFIGURED_WRONG_PASSWORD", 6, 31);
	        bdj.h = new bdj("BEING_CONFIGURED_POSSIBLY_WRONG_PASSWORD", 7, 32);
	        bdj.i = new bdj("OBTAINING_IP_ADDRESS", 8, 40);
	        bdj.j = new bdj("OBTAINING_IP_ADDRESS_BAD_AP", 9, 41);
	        bdj.k = new bdj("CHECKING_GLOBAL_CONNECTIVITY", 10, 50);
	        bdj.l = new bdj("CHECKING_GLOBAL_CONNECTIVITY_BAD_ROUTER_WIFI_NOT_SAVED", 11, 51);
	        bdj.m = new bdj("CHECKING_GLOBAL_CONNECTIVITY_BAD_ROUTER", 12, 52);
	        bdj.n = new bdj("CONNECTED", 13, 60);
	        bdj.o = new bdj("CONNECTED_NOT_WIFI_SAVED", 14, 61);
	        bdj.p = new bdj("CONNECTED_UPDATE_ONLY", 15, 62);
	        bdj.q = new bdj("CONNECTED_TOS_NOT_ACCEPTED", 16, 63);
	        bdj[] v0_35 = new bdj[17];
	        v0_35[0] = bdj.a;
	        v0_35[1] = bdj.b;
	        v0_35[2] = bdj.c;
	        v0_35[3] = bdj.d;
	        v0_35[4] = bdj.e;
	        v0_35[5] = bdj.f;
	        v0_35[6] = bdj.g;
	        v0_35[7] = bdj.h;
	        v0_35[8] = bdj.i;
	        v0_35[9] = bdj.j;
	        v0_35[10] = bdj.k;
	        v0_35[11] = bdj.l;
	        v0_35[12] = bdj.m;
	        v0_35[13] = bdj.n;
	        v0_35[14] = bdj.o;
	        v0_35[15] = bdj.p;
	        v0_35[16] = bdj.q;
	        bdj.s = v0_35;
	        return;
	    }
	
	
	    private bdj(String p1, int p2, int p3)
	    {
	        this(p1, p2);
	        this.r = p3;
	        return;
	    }
	
	
	    public static bdj a(int p5)
	    {
	        bdj[] v2 = bdj.values();
	        int v1 = 0;
	        while (v1 < v2.length) {
	            int v0_1 = v2[v1];
	            if (v0_1.r != p5) {
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static bdj valueOf(String p1)
	    {
	        return ((bdj) Enum.valueOf(bdj, p1));
	    }
	
	
	    public static bdj[] values()
	    {
	        return ((bdj[]) bdj.s.clone());
	    }
	
