	private static bridge bpr a
	
	    static bqk()
	    {
	        bqk.a = new bsa();
	        return;
	    }
	
	
	    public static bpr a()
	    {
	        return bqk.a;
	    }
	
	
	    public static void a(bpr p0)
	    {
	        bqk.a = p0;
	        return;
	    }
	
	
	    public static void a(String p1)
	    {
	        String v0_0 = bql.b();
	        if (v0_0 == null) {
	            if (bqk.a(2)) {
	                android.util.Log.w(((String) bqd.b.a()), p1);
	            }
	        } else {
	            v0_0.e(p1);
	        }
	        String v0_6 = bqk.a;
	        if (v0_6 != null) {
	            v0_6.a(p1);
	        }
	        return;
	    }
	
	
	    public static void a(String p2, Object p3)
	    {
	        String v0_0 = bql.b();
	        if (v0_0 == null) {
	            if (bqk.a(3)) {
	                String v1_0;
	                if (p3 == null) {
	                    v1_0 = p2;
	                } else {
	                    v1_0 = new StringBuilder().append(p2).append(":").append(p3).toString();
	                }
	                android.util.Log.e(((String) bqd.b.a()), v1_0);
	            }
	        } else {
	            v0_0.e(p2, p3);
	        }
	        String v0_12 = bqk.a;
	        if (v0_12 != null) {
	            v0_12.b(p2);
	        }
	        return;
	    }
	
	
	    private static boolean a(int p2)
	    {
	        int v0 = 0;
	        if ((bqk.a != null) && (bqk.a.a() <= p2)) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
