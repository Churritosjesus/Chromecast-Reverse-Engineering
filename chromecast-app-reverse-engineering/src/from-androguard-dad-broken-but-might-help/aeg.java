	public static  a
	private static java.lang.String b
	
	    static aeg()
	    {
	        aeg.b = "Volley";
	        aeg.a = android.util.Log.isLoggable("Volley", 2);
	        return;
	    }
	
	
	    public aeg()
	    {
	        return;
	    }
	
	
	    public static varargs void a(String p1, Object[] p2)
	    {
	        if (aeg.a) {
	            aeg.d(p1, p2);
	        }
	        return;
	    }
	
	
	    public static varargs void a(Throwable p2, String p3, Object[] p4)
	    {
	        android.util.Log.e(aeg.b, aeg.d(p3, p4), p2);
	        return;
	    }
	
	
	    public static varargs void b(String p0, Object[] p1)
	    {
	        aeg.d(p0, p1);
	        return;
	    }
	
	
	    public static varargs void c(String p2, Object[] p3)
	    {
	        android.util.Log.e(aeg.b, aeg.d(p2, p3));
	        return;
	    }
	
	
	    private static varargs String d(String p8, Object[] p9)
	    {
	        if (p9 != null) {
	            p8 = String.format(java.util.Locale.US, p8, p9);
	        }
	        String v3_0 = new Throwable().fillInStackTrace().getStackTrace();
	        String v0_4 = 2;
	        while (v0_4 < v3_0.length) {
	            if (v3_0[v0_4].getClass().equals(aeg)) {
	                v0_4++;
	            } else {
	                java.util.Locale v2_2 = v3_0[v0_4].getClassName();
	                java.util.Locale v2_3 = v2_2.substring((v2_2.lastIndexOf(46) + 1));
	                String v0_5 = new StringBuilder().append(v2_3.substring((v2_3.lastIndexOf(36) + 1))).append(".").append(v3_0[v0_4].getMethodName()).toString();
	            }
	            Object[] v4_14 = new Object[3];
	            v4_14[0] = Long.valueOf(Thread.currentThread().getId());
	            v4_14[1] = v0_5;
	            v4_14[2] = p8;
	            return String.format(java.util.Locale.US, "[%d] %s: %s", v4_14);
	        }
	        v0_5 = "<unknown>";
	        v4_14 = new Object[3];
	        v4_14[0] = Long.valueOf(Thread.currentThread().getId());
	        v4_14[1] = v0_5;
	        v4_14[2] = p8;
	        return String.format(java.util.Locale.US, "[%d] %s: %s", v4_14);
	    }
	
