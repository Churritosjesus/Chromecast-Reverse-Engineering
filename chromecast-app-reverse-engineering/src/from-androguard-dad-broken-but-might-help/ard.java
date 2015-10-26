	final java.util.HashMap a
	final ash b
	 arh c
	 arg d
	final asz e
	  f
	final java.lang.String g
	  h
	final java.util.Set i
	private java.util.List j
	private final  k
	private final  l
	private final blp m
	private final android.content.Context n
	private  o
	private final dcj p
	private final  q
	private final java.lang.Boolean r
	private final java.lang.String s
	
	    public ard(android.content.Context p6, ash p7, asz p8, dcj p9, String p10, int p11, int p12)
	    {
	        dca[] v0_27;
	        this.a = new java.util.HashMap();
	        this.m = new blp("PhotosAlbumAdapter", 0);
	        this.o = 0;
	        this.i = new java.util.HashSet();
	        dca[] v0_9 = ((android.view.LayoutInflater) p6.getSystemService("layout_inflater")).inflate(a.gx, 0);
	        this.k = p11;
	        this.l = ((p11 * 6) / 16);
	        v0_9.setLayoutParams(new android.view.ViewGroup$LayoutParams(this.k, -2));
	        v0_9.measure(android.view.View$MeasureSpec.makeMeasureSpec(0, 0), android.view.View$MeasureSpec.makeMeasureSpec(0, 0));
	        this.h = p12;
	        this.b = p7;
	        this.n = p6;
	        this.p = p9;
	        this.q = this.p.i[0].b.intValue();
	        this.g = this.p.i[0].j;
	        if (this.p.i[0].q != null) {
	            v0_27 = this.p.i[0].q.booleanValue();
	        } else {
	            v0_27 = 0;
	        }
	        this.r = Boolean.valueOf(v0_27);
	        this.s = p10;
	        this.e = p8;
	        this.j = this.b.a(this.q, this.s);
	        if (this.j == null) {
	            this.a();
	        }
	        this.a(this.b.s().b(this.g));
	        return;
	    }
	
	
	    static synthetic arh a(ard p1)
	    {
	        return p1.c;
	    }
	
	
	    private void a(dca[] p7)
	    {
	        if (p7 != null) {
	            int v1 = p7.length;
	            int v0 = 0;
	            while (v0 < v1) {
	                dca v2 = p7[v0];
	                this.a.put(this.a(v2.a, v2.b), v2);
	                v0++;
	            }
	        }
	        return;
	    }
	
	
	    static synthetic String b(ard p1)
	    {
	        return p1.g;
	    }
	
	
	    String a(String p2, String p3)
	    {
	        if (!android.text.TextUtils.isEmpty(p3)) {
	            p2 = p3;
	        } else {
	            this.i.add(p2);
	        }
	        return p2;
	    }
	
	
	    public final void a()
	    {
	        this.f = 1;
	        this.b.a(100, this.k, this.l, 1, this.q, this.s, this.h);
	        if (this.d != null) {
	            this.d.b();
	        }
	        return;
	    }
	
	
	    public final void a_(int p10)
	    {
	        String v0_0 = 1;
	        if (p10 != 3) {
	            if (p10 == 2) {
	                try {
	                    dca[] v4_2 = this.b.s().b(this.p.j);
	                    java.util.HashMap v5 = this.a;
	                } catch (String v0_6) {
	                    throw v0_6;
	                }
	                if (v4_2.length == v5.size()) {
	                    int v2_5 = 0;
	                    while (v2_5 < v4_2.length) {
	                        boolean v7_0 = v4_2[v2_5];
	                        if (v5.containsKey(this.a(v7_0.a, v7_0.b))) {
	                            v2_5++;
	                        }
	                    }
	                    v0_0 = 0;
	                }
	                if (v0_0 != null) {
	                    this.a.clear();
	                    this.i.clear();
	                    this.a(this.b.s().b(this.g));
	                    this.notifyDataSetChanged();
	                } else {
	                }
	            }
	        } else {
	            this.f = 0;
	            this.o = 0;
	            this.j = this.b.a(this.q, this.s);
	            if (this.j != null) {
	                this.notifyDataSetChanged();
	            }
	            if (this.d != null) {
	                this.d.c();
	            }
	        }
	        return;
	    }
	
	
	    public final boolean areAllItemsEnabled()
	    {
	        boolean v0_1;
	        if (!this.f) {
	            v0_1 = super.areAllItemsEnabled();
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final dbq b(int p2)
	    {
	        if ((this.getItemViewType(p2) != 0) || (this.j == null)) {
	            dbq v0_2 = 0;
	        } else {
	            v0_2 = ((dbq) this.j.get(p2));
	        }
	        return v0_2;
	    }
	
	
	    public final int getCount()
	    {
	        int v0_2;
	        if (this.j != null) {
	            v0_2 = this.j.size();
	        } else {
	            v0_2 = 0;
	        }
	        if (this.o) {
	            v0_2++;
	        }
	        return v0_2;
	    }
	
	
	    public final synthetic Object getItem(int p2)
	    {
	        return this.b(p2);
	    }
	
	
	    public final long getItemId(int p3)
	    {
	        return ((long) p3);
	    }
	
	
	    public final int getItemViewType(int p2)
	    {
	        if ((!this.f) || (p2 != (this.getCount() - 1))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final android.view.View getView(int p11, android.view.View p12, android.view.ViewGroup p13)
	    {
	        if (!this.f) {
	            ash v0_4;
	            ash v0_1 = this.b;
	            aex v1_0 = this.q;
	            atf v2_0 = this.s;
	            if ((v0_1.a.a(v1_0, v2_0) != null) && (v0_1.a.b(v1_0, v2_0) == null)) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            if ((v0_4 != null) && (p11 >= (this.getCount() - 20))) {
	                this.f = 1;
	                this.b.a(100, this.k, this.l, 0, this.q, this.s, this.h);
	                this.o = 1;
	                this.notifyDataSetChanged();
	            }
	        }
	        switch (this.getItemViewType(p11)) {
	            case 0:
	                ash v0_13;
	                if (p12 != null) {
	                    v0_13 = ((arf) p12.getTag());
	                } else {
	                    p12 = ((android.view.LayoutInflater) this.n.getSystemService("layout_inflater")).inflate(a.gx, p13, 0);
	                    ash v0_19 = ((android.widget.ImageView) p12.findViewById(f.j));
	                    aex v1_6 = v0_19.getLayoutParams();
	                    v1_6.width = this.k;
	                    v1_6.height = this.l;
	                    v0_19.setLayoutParams(v1_6);
	                    v0_13 = new arf(this, p12);
	                    p12.setTag(v0_13);
	                }
	                atf v2_4 = this.b(p11);
	                if (!this.i.contains(String.valueOf(v2_4.a))) {
	                    if (android.text.TextUtils.isEmpty(v2_4.e)) {
	                        v0_13.a.setChecked(0);
	                    } else {
	                        v0_13.a.setChecked(this.a.containsKey(v2_4.e));
	                    }
	                } else {
	                    v0_13.a.setChecked(this.a.containsKey(String.valueOf(v2_4.a)));
	                }
	                aex v1_17;
	                v0_13.b.setText(v2_4.b);
	                if (v2_4.d != null) {
	                    v1_17 = v2_4.d.intValue();
	                } else {
	                    v1_17 = 0;
	                }
	                android.widget.ImageView v3_10 = v0_13.c;
	                String v5_5 = this.n.getResources();
	                Object[] v7_1 = new Object[1];
	                v7_1[0] = Integer.valueOf(v1_17);
	                v3_10.setText(v5_5.getQuantityString(a.he, v1_17, v7_1));
	                aex v1_19 = v0_13.d;
	                v1_19.setImageResource(17170445);
	                android.widget.ImageView v3_12 = new Object[1];
	                v3_12[0] = this.b(p11).a;
	                android.widget.ImageView v3_13 = new Object[1];
	                v3_13[0] = this.b(p11).e;
	                if ((blf.c(this.n)) && (this.r.booleanValue())) {
	                    v1_19.setOnClickListener(new are(this, v2_4, p11));
	                }
	                if (v2_4.c == null) {
	                } else {
	                    aex v1_22 = bks.a(this.k, this.l, v2_4.c);
	                    if (v0_13.e != null) {
	                        v0_13.e.a();
	                    }
	                    v0_13.e = this.b.c.a(v1_22, v0_13.d, 1);
	                }
	                break;
	            case 1:
	                if (p12 != null) {
	                } else {
	                    p12 = ((android.view.LayoutInflater) this.n.getSystemService("layout_inflater")).inflate(a.gv, p13, 0);
	                }
	                break;
	        }
	        return p12;
	    }
	
	
	    public final int getViewTypeCount()
	    {
	        return 2;
	    }
	
	
	    public final boolean isEnabled(int p3)
	    {
	        boolean v0_1;
	        if (this.getItemViewType(p3) != 1) {
	            v0_1 = super.isEnabled(p3);
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
