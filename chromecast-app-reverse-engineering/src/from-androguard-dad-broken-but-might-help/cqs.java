	private static final  f
	public cqj a
	public  b
	public  c
	public  d
	public cqe e
	private cqv g
	private s h
	private  i
	private android.view.LayoutInflater j
	private  k
	private android.content.Context l
	private java.util.ArrayList m
	
	    static cqs()
	    {
	        cqs.f = a.ip;
	        return;
	    }
	
	
	    public cqs(android.content.Context p5, int p6, cqv p7, s p8)
	    {
	        this.m = new java.util.ArrayList();
	        this.b = 1;
	        this.c = 1;
	        this.l = p5;
	        if (p6 == -1) {
	            p6 = cqs.f;
	        }
	        this.i = p6;
	        this.j = android.view.LayoutInflater.from(p5);
	        if (p7 == null) {
	            p7 = new cqt(this);
	        }
	        this.g = p7;
	        this.h = p8;
	        cqe v0_4 = new int[1];
	        v0_4[0] = a.hI;
	        cqe v0_5 = p5.obtainStyledAttributes(new android.util.TypedValue().data, v0_4);
	        this.k = v0_5.getColor(0, p5.getResources().getColor(a.hK));
	        v0_5.recycle();
	        this.e = new cqe(p5);
	        return;
	    }
	
	
	    public static java.util.List a(java.util.List p7, csq p8, csq p9)
	    {
	        int v5;
	        if (p9 == null) {
	            v5 = 0;
	        } else {
	            v5 = p9.a();
	        }
	        String v1_1;
	        if (p8 == null) {
	            v1_1 = 0;
	        } else {
	            v1_1 = p8.a();
	        }
	        int v3 = -1;
	        int v4 = -1;
	        int v2_1 = 0;
	        while (v2_1 < p7.size()) {
	            boolean v0_6 = ((csq) p7.get(v2_1));
	            if ((v4 < 0) && (v0_6.a().equals(v5))) {
	                v4 = v2_1;
	            }
	            if ((v3 < 0) && (v0_6.a().equals(v1_1))) {
	                v3 = v2_1;
	            }
	            v2_1++;
	        }
	        if (v4 >= 0) {
	            p7.remove(v4);
	        }
	        if ((v3 < 0) && ((v1_1 != null) && (!v1_1.equals(v5)))) {
	            p7.add(p8);
	        }
	        return p7;
	    }
	
	
	    private boolean b(int p3)
	    {
	        int v0_1;
	        if (!this.b) {
	            v0_1 = -1;
	        } else {
	            v0_1 = -2;
	        }
	        if ((!this.c) || (p3 != (v0_1 + this.getCount()))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    private boolean c(int p2)
	    {
	        if ((!this.b) || (p2 != (this.getCount() - 1))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final csq a(int p3)
	    {
	        csq v0_0 = 0;
	        if ((!this.b(p3)) && ((!this.c(p3)) && (this.m != null))) {
	            v0_0 = ((csq) this.m.get(p3));
	        }
	        return v0_0;
	    }
	
	
	    public final void a(java.util.List p7)
	    {
	        if (!this.d) {
	            java.util.ArrayList v2_0 = this.e;
	            if ((p7 != null) && (!p7.isEmpty())) {
	                if (v2_0.e == null) {
	                    v2_0.e = android.accounts.AccountManager.get(v2_0.a);
	                }
	                v2_0.c = v2_0.e.getAccountsByType("com.google");
	                v2_0.d.clear();
	                if (p7 != null) {
	                    int v1_1 = p7.iterator();
	                    while (v1_1.hasNext()) {
	                        int v0_19 = ((csq) v1_1.next());
	                        v2_0.d.put(v0_19.a(), v0_19);
	                    }
	                }
	                if (!v2_0.d.isEmpty()) {
	                    v2_0.b.clear();
	                    java.util.HashMap v3_0 = v2_0.c;
	                    String v4_0 = v3_0.length;
	                    int v1_2 = 0;
	                    while (v1_2 < v4_0) {
	                        int v0_16 = ((csq) v2_0.d.get(v3_0[v1_2].name));
	                        if (v0_16 != 0) {
	                            v2_0.b.add(v0_16);
	                        }
	                        v1_2++;
	                    }
	                } else {
	                    v2_0.a();
	                }
	            } else {
	                v2_0.a();
	            }
	            this.m = v2_0.b;
	        } else {
	            this.m.clear();
	            if (p7 != null) {
	                int v1_3 = p7.iterator();
	                while (v1_3.hasNext()) {
	                    this.m.add(((csq) v1_3.next()));
	                }
	            }
	            this.notifyDataSetChanged();
	        }
	        this.notifyDataSetChanged();
	        return;
	    }
	
	
	    public final int getCount()
	    {
	        int v0_1;
	        java.util.ArrayList v1_0 = 1;
	        int v2 = 0;
	        if (!this.b) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        if (!this.c) {
	            v1_0 = 0;
	        }
	        int v0_2 = (v0_1 + v1_0);
	        if (this.m != null) {
	            v2 = this.m.size();
	        }
	        return (v0_2 + v2);
	    }
	
	
	    public final synthetic Object getItem(int p2)
	    {
	        return this.a(p2);
	    }
	
	
	    public final long getItemId(int p4)
	    {
	        long v0_0 = -1;
	        if (!this.c(p4)) {
	            if ((!this.b(p4)) && (this.m != null)) {
	                v0_0 = ((long) ((csq) this.m.get(p4)).a().hashCode());
	            }
	        } else {
	            v0_0 = -2;
	        }
	        return v0_0;
	    }
	
	
	    public final int getItemViewType(int p2)
	    {
	        int v0_2;
	        if (!this.c(p2)) {
	            if (!this.b(p2)) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	        } else {
	            v0_2 = 2;
	        }
	        return v0_2;
	    }
	
	
	    public final android.view.View getView(int p10, android.view.View p11, android.view.ViewGroup p12)
	    {
	        if (this.getItemViewType(p10) != 2) {
	            if (this.getItemViewType(p10) != 1) {
	                if (p11 == null) {
	                    p11 = this.j.inflate(this.i, 0);
	                }
	                android.widget.TextView v0_5;
	                String v1_2 = this.a(p10);
	                android.widget.ImageView v2_0 = this.a;
	                int v3_0 = this.k;
	                if (p11.getTag() != null) {
	                    v0_5 = ((cqu) p11.getTag());
	                } else {
	                    v0_5 = this.g.a(p11);
	                    p11.setTag(v0_5);
	                }
	                if ((v0_5.b != null) && (v2_0 != null)) {
	                    v0_5.b.setImageDrawable(0);
	                    if (android.text.TextUtils.isEmpty(v1_2.c())) {
	                        v2_0.a(v0_5.b);
	                        android.widget.ImageView v2_1 = v0_5.b;
	                        android.graphics.Bitmap v4_6 = p11.getContext();
	                        v1_2.a();
	                        v1_2.d();
	                        v2_1.setImageBitmap(cqj.a(v4_6));
	                    } else {
	                        v2_0.a(v0_5.b);
	                        v2_0.a(v0_5.b, v1_2.a(), v1_2.d(), 1);
	                    }
	                }
	                if (v0_5.a != null) {
	                    v0_5.a.setTextColor(v3_0);
	                    v0_5.a.setVisibility(0);
	                    v0_5.a.setText(v1_2.a());
	                    android.widget.TextView v0_6 = v0_5.a;
	                    android.widget.ImageView v2_7 = this.l.getResources();
	                    android.graphics.Bitmap v4_10 = new Object[1];
	                    v4_10[0] = v1_2.a();
	                    v0_6.setContentDescription(v2_7.getString(b.eB, v4_10));
	                }
	            } else {
	                if (p11 == null) {
	                    p11 = this.j.inflate(a.ir, 0);
	                }
	            }
	        } else {
	            if (p11 == null) {
	                p11 = this.j.inflate(a.is, 0);
	            }
	        }
	        return p11;
	    }
	
	
	    public final int getViewTypeCount()
	    {
	        return 3;
	    }
	
