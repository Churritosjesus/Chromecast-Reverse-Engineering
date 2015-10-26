	final abw a
	final  b
	public final  c
	 abj d
	 java.util.LinkedHashMap e
	 java.util.List f
	 java.util.Set g
	 java.util.List h
	  i
	public java.lang.CharSequence j
	 abr k
	final aay l
	 abc m
	private final android.content.Context n
	private final android.content.ContentResolver o
	private java.util.List p
	
	    public aav(android.content.Context p3)
	    {
	        this(p3, 10, 0);
	        return;
	    }
	
	
	    private aav(android.content.Context p3, int p4, int p5)
	    {
	        this.l = new aay(this);
	        this.n = p3;
	        this.o = p3.getContentResolver();
	        this.c = 10;
	        this.k = new abg(this.o);
	        this.b = 0;
	        this.a = abt.b;
	        return;
	    }
	
	
	    static synthetic android.content.Context a(aav p1)
	    {
	        return p1.n;
	    }
	
	
	    static synthetic android.database.Cursor a(aav p6, CharSequence p7, int p8, Long p9)
	    {
	        android.database.Cursor v3 = 0;
	        if (abe.a(p6.n, 0)) {
	            android.net.Uri v1_2 = p6.a.b.buildUpon().appendPath(p7.toString()).appendQueryParameter("limit", String.valueOf((p8 + 5)));
	            if (p9 != null) {
	                v1_2.appendQueryParameter("directory", String.valueOf(p9));
	            }
	            System.currentTimeMillis();
	            v3 = p6.o.query(v1_2.build(), p6.a.a, 0, 0, 0);
	            System.currentTimeMillis();
	        }
	        return v3;
	    }
	
	
	    static synthetic java.util.LinkedHashMap a(aav p0, java.util.LinkedHashMap p1)
	    {
	        p0.e = p1;
	        return p1;
	    }
	
	
	    static synthetic java.util.List a(aav p1, java.util.LinkedHashMap p2, java.util.List p3)
	    {
	        return p1.a(p2, p3);
	    }
	
	
	    static synthetic java.util.List a(aav p0, java.util.List p1)
	    {
	        p0.f = p1;
	        return p1;
	    }
	
	
	    public static java.util.List a(android.content.Context p11, android.database.Cursor p12, android.accounts.Account p13)
	    {
	        android.content.pm.PackageManager v3 = p11.getPackageManager();
	        java.util.ArrayList v4_1 = new java.util.ArrayList();
	        abb v0 = 0;
	        while (p12.moveToNext()) {
	            String v6_0 = p12.getLong(0);
	            if (v6_0 != 1) {
	                abb v1_4 = new abb();
	                String v5_0 = p12.getString(4);
	                String v8_1 = p12.getInt(5);
	                v1_4.a = v6_0;
	                p12.getString(3);
	                v1_4.c = p12.getString(1);
	                v1_4.d = p12.getString(2);
	                if ((v5_0 != null) && (v8_1 != null)) {
	                    try {
	                        v1_4.b = v3.getResourcesForApplication(v5_0).getString(v8_1);
	                    } catch (boolean v2_10) {
	                        android.util.Log.e("BaseRecipientAdapter", new StringBuilder((String.valueOf(v5_0).length() + 43)).append("Cannot resolve directory name: ").append(v8_1).append("@").append(v5_0).toString(), v2_10);
	                    }
	                    if (v1_4.b == null) {
	                        android.util.Log.e("BaseRecipientAdapter", new StringBuilder((String.valueOf(v5_0).length() + 43)).append("Cannot resolve directory name: ").append(v8_1).append("@").append(v5_0).toString());
	                    }
	                }
	                if ((p13 == null) || ((!p13.name.equals(v1_4.c)) || (!p13.type.equals(v1_4.d)))) {
	                    v4_1.add(v1_4);
	                } else {
	                    v0 = v1_4;
	                }
	            }
	        }
	        if (v0 != null) {
	            v4_1.add(1, v0);
	        }
	        return v4_1;
	    }
	
	
	    private java.util.List a(java.util.LinkedHashMap p10, java.util.List p11)
	    {
	        java.util.ArrayList v5_1 = new java.util.ArrayList();
	        java.util.Iterator v6 = p10.entrySet().iterator();
	        int v1_0 = 0;
	        while (v6.hasNext()) {
	            acx v0_5 = ((java.util.List) ((java.util.Map$Entry) v6.next()).getValue());
	            int v7 = v0_5.size();
	            int v4 = 0;
	            int v3 = v1_0;
	            while (v4 < v7) {
	                int v1_3 = ((acx) v0_5.get(v4));
	                v5_1.add(v1_3);
	                this.k.a(v1_3, this);
	                v3++;
	                v4++;
	            }
	            if (v3 <= this.c) {
	                v1_0 = v3;
	            }
	            if (v3 <= this.c) {
	                int v1_1 = p11.iterator();
	                while (v1_1.hasNext()) {
	                    acx v0_10 = ((acx) v1_1.next());
	                    if (v3 > this.c) {
	                        break;
	                    }
	                    v5_1.add(v0_10);
	                    this.k.a(v0_10, this);
	                    v3++;
	                }
	            }
	            return v5_1;
	        }
	        v3 = v1_0;
	    }
	
	
	    static synthetic java.util.Set a(aav p0, java.util.Set p1)
	    {
	        p0.g = p1;
	        return p1;
	    }
	
	
	    static void a(abd p16, boolean p17, java.util.LinkedHashMap p18, java.util.List p19, java.util.Set p20)
	    {
	        if (!p20.contains(p16.b)) {
	            p20.add(p16.b);
	            if (p17) {
	                if (!p18.containsKey(Long.valueOf(p16.e))) {
	                    java.util.ArrayList v15_1 = new java.util.ArrayList();
	                    v15_1.add(acx.a(p16.a, p16.i, p16.b, p16.c, p16.d, p16.e, p16.f, p16.g, p16.h, 1, p16.j));
	                    p18.put(Long.valueOf(p16.e), v15_1);
	                } else {
	                    ((java.util.List) p18.get(Long.valueOf(p16.e))).add(acx.b(p16.a, p16.i, p16.b, p16.c, p16.d, p16.e, p16.f, p16.g, p16.h, 1, p16.j));
	                }
	            } else {
	                p19.add(acx.a(p16.a, p16.i, p16.b, p16.c, p16.d, p16.e, p16.f, p16.g, p16.h, 1, p16.j));
	            }
	        }
	        return;
	    }
	
	
	    static synthetic s b(aav p1)
	    {
	        return 0;
	    }
	
	
	    static synthetic void b(abd p1, boolean p2, java.util.LinkedHashMap p3, java.util.List p4, java.util.Set p5)
	    {
	        aav.a(p1, 1, p3, p4, p5);
	        return;
	    }
	
	
	    static synthetic aay c(aav p1)
	    {
	        return p1.l;
	    }
	
	
	    static synthetic int d(aav p2)
	    {
	        int v0 = p2.i;
	        p2.i = (v0 - 1);
	        return v0;
	    }
	
	
	    static synthetic int e(aav p1)
	    {
	        return p1.i;
	    }
	
	
	    private java.util.List e()
	    {
	        java.util.List v0_1;
	        if (this.h == null) {
	            v0_1 = this.p;
	        } else {
	            v0_1 = this.h;
	        }
	        return v0_1;
	    }
	
	
	    public final acx a(int p2)
	    {
	        return ((acx) this.e().get(p2));
	    }
	
	
	    protected final java.util.List a()
	    {
	        return this.a(this.e, this.f);
	    }
	
	
	    protected final java.util.List a(java.util.Set p8)
	    {
	        Throwable v0_4;
	        if (abe.a(this.n, 0)) {
	            if ((this.c - p8.size()) <= 0) {
	                v0_4 = 0;
	            } else {
	                try {
	                    android.database.Cursor v6_1 = this.o.query(aba.a, aba.b, 0, 0, 0);
	                    v0_4 = aav.a(this.n, v6_1, 0);
	                } catch (Throwable v0_7) {
	                    if (v6_1 != null) {
	                        v6_1.close();
	                    }
	                    throw v0_7;
	                }
	                if (v6_1 != null) {
	                    v6_1.close();
	                }
	            }
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    protected final void a(int p2, int p3)
	    {
	        if ((p2 == 0) && (p3 > 1)) {
	            this.h = this.p;
	        }
	        return;
	    }
	
	
	    public final void a(java.util.ArrayList p7, aca p8)
	    {
	        aby.a(this.n, this, p7, 0, p8, 0);
	        return;
	    }
	
	
	    protected final void a(java.util.List p2)
	    {
	        this.p = p2;
	        this.m.a(p2);
	        this.notifyDataSetChanged();
	        return;
	    }
	
	
	    public final void b()
	    {
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.notifyDataSetChanged();
	        return;
	    }
	
	
	    public final void d()
	    {
	        return;
	    }
	
	
	    public final int getCount()
	    {
	        int v0_1;
	        int v0_0 = this.e();
	        if (v0_0 == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = v0_0.size();
	        }
	        return v0_1;
	    }
	
	
	    public final android.widget.Filter getFilter()
	    {
	        return new aaw(this);
	    }
	
	
	    public final synthetic Object getItem(int p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final long getItemId(int p3)
	    {
	        return ((long) p3);
	    }
	
	
	    public final int getItemViewType(int p2)
	    {
	        return ((acx) this.e().get(p2)).a;
	    }
	
	
	    public final android.view.View getView(int p9, android.view.View p10, android.view.ViewGroup p11)
	    {
	        String v6;
	        acx v3_1 = ((acx) this.e().get(p9));
	        if (this.j != null) {
	            v6 = this.j.toString();
	        } else {
	            v6 = 0;
	        }
	        return this.d.a(p10, p11, v3_1, p9, abn.a, v6, 0);
	    }
	
	
	    public final int getViewTypeCount()
	    {
	        return 2;
	    }
	
	
	    public final boolean isEnabled(int p4)
	    {
	        int v0_4;
	        int v0_2 = ((acx) this.e().get(p4));
	        if ((v0_2.a != 0) && (v0_2.a != 1)) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
