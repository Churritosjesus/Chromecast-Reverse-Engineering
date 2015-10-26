	private static final Ljava.lang.String a
	private ayw b
	private final blp c
	
	    static ayy()
	    {
	        String[] v0_1 = new String[4];
	        v0_1[0] = "Chromecast";
	        v0_1[1] = "Chromecast Audio";
	        v0_1[2] = "Chromekey";
	        v0_1[3] = "Eureka Dongle";
	        ayy.a = v0_1;
	        return;
	    }
	
	
	    public ayy(ayw p3)
	    {
	        this.c = new blp("SetupDeviceFilteringListener");
	        this.b = p3;
	        return;
	    }
	
	
	    public static boolean a(com.google.android.gms.cast.CastDevice p6)
	    {
	        int v0 = 0;
	        String[] v2 = ayy.a;
	        int v1 = 0;
	        while (v1 < v2.length) {
	            if (!v2[v1].equals(p6.f)) {
	                v1++;
	            } else {
	                v0 = 1;
	                break;
	            }
	        }
	        return v0;
	    }
	
	
	    private static boolean c(aym p6)
	    {
	        int v0 = 0;
	        if (p6.e != null) {
	            String[] v2 = ayy.a;
	            int v1_1 = 0;
	            while (v1_1 < v2.length) {
	                if (!v2[v1_1].equals(p6.d)) {
	                    v1_1++;
	                } else {
	                    v0 = 1;
	                    break;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public final void a(int p2)
	    {
	        this.b.a(p2);
	        return;
	    }
	
	
	    public final void a(aym p4)
	    {
	        if (!ayy.c(p4)) {
	            Object[] v0_2 = new Object[1];
	            v0_2[0] = p4.d;
	        } else {
	            this.b.a(p4);
	        }
	        return;
	    }
	
	
	    public final void b(aym p2)
	    {
	        if (ayy.c(p2)) {
	            this.b.b(p2);
	        }
	        return;
	    }
	
