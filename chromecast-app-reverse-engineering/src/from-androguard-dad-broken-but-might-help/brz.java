	private final brb a
	private java.lang.Boolean b
	private java.lang.String c
	private java.util.Set d
	
	    protected brz(brb p1)
	    {
	        a.c(p1);
	        this.a = p1;
	        return;
	    }
	
	
	    public static boolean b()
	    {
	        return ((Boolean) bqd.a.a()).booleanValue();
	    }
	
	
	    public static int c()
	    {
	        return ((Integer) bqd.r.a()).intValue();
	    }
	
	
	    public static long d()
	    {
	        return ((Long) bqd.f.a()).longValue();
	    }
	
	
	    public static long e()
	    {
	        return ((Long) bqd.g.a()).longValue();
	    }
	
	
	    public static int f()
	    {
	        return ((Integer) bqd.i.a()).intValue();
	    }
	
	
	    public static int g()
	    {
	        return ((Integer) bqd.j.a()).intValue();
	    }
	
	
	    public static String h()
	    {
	        return ((String) bqd.l.a());
	    }
	
	
	    public static String i()
	    {
	        return ((String) bqd.k.a());
	    }
	
	
	    public static String j()
	    {
	        return ((String) bqd.m.a());
	    }
	
	
	    public static long l()
	    {
	        return ((Long) bqd.y.a()).longValue();
	    }
	
	
	    public final boolean a()
	    {
	        if (this.b == null) {
	            if (this.b == null) {
	                Boolean v0_3 = this.a.a;
	                String v1_0 = v0_3.getApplicationInfo();
	                if (v1_0 != null) {
	                    String v1_1 = v1_0.processName;
	                    Boolean v0_5 = ((android.app.ActivityManager) v0_3.getSystemService("activity"));
	                    if (v0_5 != null) {
	                        int v2_1 = android.os.Process.myPid();
	                        java.util.Iterator v3 = v0_5.getRunningAppProcesses().iterator();
	                        while (v3.hasNext()) {
	                            Boolean v0_9 = ((android.app.ActivityManager$RunningAppProcessInfo) v3.next());
	                            if (v2_1 == v0_9.pid) {
	                                if ((v1_1 == null) || (!v1_1.equals(v0_9.processName))) {
	                                    Boolean v0_12 = 0;
	                                } else {
	                                    v0_12 = 1;
	                                }
	                                this.b = Boolean.valueOf(v0_12);
	                                break;
	                            }
	                        }
	                    }
	                }
	                if (this.b == null) {
	                    this.b = Boolean.TRUE;
	                    this.a.a().f("My process not in the list of running processes");
	                }
	            }
	        }
	        return this.b.booleanValue();
	    }
	
	
	    public final java.util.Set k()
	    {
	        java.util.Set v0_2 = ((String) bqd.u.a());
	        if ((this.d == null) || ((this.c == null) || (!this.c.equals(v0_2)))) {
	            String[] v2 = android.text.TextUtils.split(v0_2, ",");
	            java.util.HashSet v3_1 = new java.util.HashSet();
	            int v4 = v2.length;
	            int v1_5 = 0;
	            while (v1_5 < v4) {
	                try {
	                    v3_1.add(Integer.valueOf(Integer.parseInt(v2[v1_5])));
	                } catch (NumberFormatException v5) {
	                }
	                v1_5++;
	            }
	            this.c = v0_2;
	            this.d = v3_1;
	        }
	        return this.d;
	    }
	
