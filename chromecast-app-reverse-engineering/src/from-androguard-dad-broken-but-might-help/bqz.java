	public final brb d
	
	    public bqz(brb p1)
	    {
	        a.c(p1);
	        this.d = p1;
	        return;
	    }
	
	
	    private static String a(Object p1)
	    {
	        String v1_1;
	        if (p1 != null) {
	            if (!(p1 instanceof String)) {
	                if (!(p1 instanceof Boolean)) {
	                    if (!(p1 instanceof Throwable)) {
	                        v1_1 = p1.toString();
	                    } else {
	                        v1_1 = ((Throwable) p1).toString();
	                    }
	                } else {
	                    if (p1 != Boolean.TRUE) {
	                        v1_1 = "false";
	                    } else {
	                        v1_1 = "true";
	                    }
	                }
	            } else {
	                v1_1 = ((String) p1);
	            }
	        } else {
	            v1_1 = "";
	        }
	        return v1_1;
	    }
	
	
	    private void a(int p7, String p8, Object p9, Object p10, Object p11)
	    {
	        String v0_0 = 0;
	        if (this.d != null) {
	            v0_0 = this.d.e;
	        }
	        if (v0_0 == null) {
	            String v0_4 = ((String) bqd.b.a());
	            if (android.util.Log.isLoggable(v0_4, p7)) {
	                android.util.Log.println(p7, v0_4, bqz.c(p8, p9, p10, p11));
	            }
	        } else {
	            v0_0.a(p7, p8, p9, p10, p11);
	        }
	        return;
	    }
	
	
	    protected static String c(String p6, Object p7, Object p8, Object p9)
	    {
	        if (p6 == null) {
	            p6 = "";
	        }
	        boolean v1_0 = bqz.a(p7);
	        String v2 = bqz.a(p8);
	        String v3 = bqz.a(p9);
	        StringBuilder v4_1 = new StringBuilder();
	        String v0_0 = "";
	        if (!android.text.TextUtils.isEmpty(p6)) {
	            v4_1.append(p6);
	            v0_0 = ": ";
	        }
	        if (!android.text.TextUtils.isEmpty(v1_0)) {
	            v4_1.append(v0_0);
	            v4_1.append(v1_0);
	            v0_0 = ", ";
	        }
	        if (!android.text.TextUtils.isEmpty(v2)) {
	            v4_1.append(v0_0);
	            v4_1.append(v2);
	            v0_0 = ", ";
	        }
	        if (!android.text.TextUtils.isEmpty(v3)) {
	            v4_1.append(v0_0);
	            v4_1.append(v3);
	        }
	        return v4_1.toString();
	    }
	
	
	    public static boolean p()
	    {
	        return android.util.Log.isLoggable(((String) bqd.b.a()), 2);
	    }
	
	
	    public final void a(String p7, Object p8)
	    {
	        this.a(2, p7, p8, 0, 0);
	        return;
	    }
	
	
	    public final void a(String p7, Object p8, Object p9)
	    {
	        this.a(2, p7, p8, p9, 0);
	        return;
	    }
	
	
	    public final void a(String p7, Object p8, Object p9, Object p10)
	    {
	        this.a(3, p7, p8, p9, p10);
	        return;
	    }
	
	
	    public final void b(String p7)
	    {
	        this.a(2, p7, 0, 0, 0);
	        return;
	    }
	
	
	    public final void b(String p7, Object p8)
	    {
	        this.a(3, p7, p8, 0, 0);
	        return;
	    }
	
	
	    public final void b(String p7, Object p8, Object p9)
	    {
	        this.a(3, p7, p8, p9, 0);
	        return;
	    }
	
	
	    public final void b(String p7, Object p8, Object p9, Object p10)
	    {
	        this.a(5, p7, p8, p9, p10);
	        return;
	    }
	
	
	    public final void c(String p7)
	    {
	        this.a(3, p7, 0, 0, 0);
	        return;
	    }
	
	
	    public final void c(String p7, Object p8)
	    {
	        this.a(4, p7, p8, 0, 0);
	        return;
	    }
	
	
	    public final void c(String p7, Object p8, Object p9)
	    {
	        this.a(5, p7, p8, p9, 0);
	        return;
	    }
	
	
	    public final void d(String p7)
	    {
	        this.a(4, p7, 0, 0, 0);
	        return;
	    }
	
	
	    public final void d(String p7, Object p8)
	    {
	        this.a(5, p7, p8, 0, 0);
	        return;
	    }
	
	
	    public final void d(String p7, Object p8, Object p9)
	    {
	        this.a(6, p7, p8, p9, 0);
	        return;
	    }
	
	
	    public final void e(String p7)
	    {
	        this.a(5, p7, 0, 0, 0);
	        return;
	    }
	
	
	    public final void e(String p7, Object p8)
	    {
	        this.a(6, p7, p8, 0, 0);
	        return;
	    }
	
	
	    public final void f(String p7)
	    {
	        this.a(6, p7, 0, 0, 0);
	        return;
	    }
	
	
	    protected final void j()
	    {
	        if (!byk.a) {
	            return;
	        } else {
	            throw new IllegalStateException("Call only supported on the client side");
	        }
	    }
	
	
	    public final cac k()
	    {
	        return this.d.c;
	    }
	
	
	    protected final android.content.Context l()
	    {
	        return this.d.a;
	    }
	
	
	    protected final brz m()
	    {
	        return this.d.d;
	    }
	
	
	    protected final bse n()
	    {
	        bse v0_0 = this.d;
	        brb.a(v0_0.f);
	        return v0_0.f;
	    }
	
	
	    protected final bqp o()
	    {
	        bqp v0_0 = this.d;
	        brb.a(v0_0.g);
	        return v0_0.g;
	    }
	
