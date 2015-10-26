	private static final java.lang.String g
	private static final java.lang.Object h
	private static final java.util.Map i
	final java.lang.Object a
	final java.util.List b
	final java.util.List c
	final java.lang.String d
	  e
	  f
	private final android.content.Context j
	private rn k
	private  l
	private  m
	private  n
	
	    static rl()
	    {
	        rl.g = rl.getSimpleName();
	        rl.h = new Object();
	        rl.i = new java.util.HashMap();
	        return;
	    }
	
	
	    private rl(android.content.Context p4, String p5)
	    {
	        this.a = new Object();
	        this.b = new java.util.ArrayList();
	        this.c = new java.util.ArrayList();
	        this.k = new ro(this);
	        this.l = 50;
	        this.m = 1;
	        this.e = 0;
	        this.f = 1;
	        this.n = 0;
	        this.j = p4.getApplicationContext();
	        if ((android.text.TextUtils.isEmpty(p5)) || (p5.endsWith(".xml"))) {
	            this.d = p5;
	        } else {
	            this.d = new StringBuilder().append(p5).append(".xml").toString();
	        }
	        return;
	    }
	
	
	    static synthetic android.content.Context a(rl p1)
	    {
	        return p1.j;
	    }
	
	
	    public static rl a(android.content.Context p3, String p4)
	    {
	        try {
	            rl v0_2 = ((rl) rl.i.get(p4));
	        } catch (rl v0_4) {
	            throw v0_4;
	        }
	        if (v0_2 == null) {
	            v0_2 = new rl(p3, p4);
	            rl.i.put(p4, v0_2);
	        }
	        return v0_2;
	    }
	
	
	    static synthetic boolean a(rl p1, boolean p2)
	    {
	        p1.m = 1;
	        return 1;
	    }
	
	
	    static synthetic String b(rl p1)
	    {
	        return p1.d;
	    }
	
	
	    static synthetic String f()
	    {
	        return rl.g;
	    }
	
	
	    private void g()
	    {
	        try {
	            java.io.IOException v1_1 = this.j.openFileInput(this.d);
	            try {
	                String v2_0 = android.util.Xml.newPullParser();
	                v2_0.setInput(v1_1, 0);
	                org.xmlpull.v1.XmlPullParserException v0_2 = 0;
	            } catch (org.xmlpull.v1.XmlPullParserException v0_12) {
	                if (v1_1 != null) {
	                    try {
	                        v1_1.close();
	                    } catch (java.io.IOException v1) {
	                    }
	                }
	                throw v0_12;
	            } catch (org.xmlpull.v1.XmlPullParserException v0_11) {
	                android.util.Log.e(rl.g, new StringBuilder("Error reading historical recrod file: ").append(this.d).toString(), v0_11);
	                if (v1_1 == null) {
	                    return;
	                } else {
	                    try {
	                        v1_1.close();
	                    } catch (org.xmlpull.v1.XmlPullParserException v0) {
	                    }
	                    return;
	                }
	            } catch (org.xmlpull.v1.XmlPullParserException v0_10) {
	                android.util.Log.e(rl.g, new StringBuilder("Error reading historical recrod file: ").append(this.d).toString(), v0_10);
	                if (v1_1 == null) {
	                    return;
	                } else {
	                    try {
	                        v1_1.close();
	                    } catch (org.xmlpull.v1.XmlPullParserException v0) {
	                    }
	                    return;
	                }
	            }
	            while ((v0_2 != 1) && (v0_2 != 2)) {
	                v0_2 = v2_0.next();
	            }
	            if ("historical-records".equals(v2_0.getName())) {
	                org.xmlpull.v1.XmlPullParserException v0_5 = this.c;
	                v0_5.clear();
	                while(true) {
	                    String v3_2 = v2_0.next();
	                    if (v3_2 == 1) {
	                        if (v1_1 == null) {
	                            return;
	                        } else {
	                            try {
	                                v1_1.close();
	                            } catch (org.xmlpull.v1.XmlPullParserException v0) {
	                            }
	                            return;
	                        }
	                    } else {
	                        if ((v3_2 != 3) && (v3_2 != 4)) {
	                            if (!"historical-record".equals(v2_0.getName())) {
	                                break;
	                            }
	                            v0_5.add(new rp(v2_0.getAttributeValue(0, "activity"), Long.parseLong(v2_0.getAttributeValue(0, "time")), Float.parseFloat(v2_0.getAttributeValue(0, "weight"))));
	                        }
	                    }
	                }
	                throw new org.xmlpull.v1.XmlPullParserException("Share records file not well-formed.");
	            } else {
	                throw new org.xmlpull.v1.XmlPullParserException("Share records file does not start with historical-records tag.");
	            }
	        } catch (org.xmlpull.v1.XmlPullParserException v0) {
	            return;
	        }
	    }
	
	
	    public final int a()
	    {
	        try {
	            this.d();
	            return this.b.size();
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
	
	    public final int a(android.content.pm.ResolveInfo p6)
	    {
	        try {
	            this.d();
	            java.util.List v3 = this.b;
	            int v4 = v3.size();
	            int v1 = 0;
	        } catch (int v0_4) {
	            throw v0_4;
	        }
	        while (v1 < v4) {
	            if (((rm) v3.get(v1)).a != p6) {
	                v1++;
	            } else {
	                int v0_0 = v1;
	            }
	            return v0_0;
	        }
	        v0_0 = -1;
	        return v0_0;
	    }
	
	
	    public final android.content.pm.ResolveInfo a(int p3)
	    {
	        try {
	            this.d();
	            return ((rm) this.b.get(p3)).a;
	        } catch (Throwable v0_4) {
	            throw v0_4;
	        }
	    }
	
	
	    public final android.content.Intent b(int p3)
	    {
	        try {
	            return 0;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public final android.content.pm.ResolveInfo b()
	    {
	        try {
	            int v0_2;
	            this.d();
	        } catch (int v0_6) {
	            throw v0_6;
	        }
	        if (this.b.isEmpty()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = ((rm) this.b.get(0)).a;
	        }
	        return v0_2;
	    }
	
	
	    public final int c()
	    {
	        try {
	            this.d();
	            return this.c.size();
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
	
	    void d()
	    {
	        int v0_0 = 1;
	        if ((!this.m) || ((!this.f) || (android.text.TextUtils.isEmpty(this.d)))) {
	            v0_0 = 0;
	        } else {
	            this.m = 0;
	            this.e = 1;
	            this.g();
	        }
	        int v0_1 = (v0_0 | 0);
	        this.e();
	        if (v0_1 != 0) {
	            this.notifyChanged();
	        }
	        return;
	    }
	
	
	    void e()
	    {
	        int v2_1 = (this.c.size() - this.l);
	        if (v2_1 > 0) {
	            this.f = 1;
	            int v0_3 = 0;
	            while (v0_3 < v2_1) {
	                this.c.remove(0);
	                v0_3++;
	            }
	        }
	        return;
	    }
	
