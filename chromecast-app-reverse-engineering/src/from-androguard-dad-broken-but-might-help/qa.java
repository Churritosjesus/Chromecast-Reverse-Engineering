	private static final I k
	final android.content.Context a
	public qb b
	 java.util.ArrayList c
	public java.util.ArrayList d
	public  e
	 java.lang.CharSequence f
	 android.graphics.drawable.Drawable g
	 android.view.View h
	 qe i
	public  j
	private final android.content.res.Resources l
	private  m
	private  n
	private java.util.ArrayList o
	private  p
	private java.util.ArrayList q
	private  r
	private  s
	private  t
	private  u
	private  v
	private java.util.ArrayList w
	private java.util.concurrent.CopyOnWriteArrayList x
	
	    static qa()
	    {
	        int[] v0_1 = new int[6];
	        v0_1 = {1, 4, 5, 3, 2, 0};
	        qa.k = v0_1;
	        return;
	    }
	
	
	    public qa(android.content.Context p5)
	    {
	        int v0 = 1;
	        this.e = 0;
	        this.s = 0;
	        this.t = 0;
	        this.u = 0;
	        this.v = 0;
	        this.w = new java.util.ArrayList();
	        this.x = new java.util.concurrent.CopyOnWriteArrayList();
	        this.a = p5;
	        this.l = p5.getResources();
	        this.c = new java.util.ArrayList();
	        this.o = new java.util.ArrayList();
	        this.p = 1;
	        this.d = new java.util.ArrayList();
	        this.q = new java.util.ArrayList();
	        this.r = 1;
	        if ((this.l.getConfiguration().keyboard == 1) || (!this.l.getBoolean(a.X))) {
	            v0 = 0;
	        }
	        this.n = v0;
	        return;
	    }
	
	
	    private static int a(java.util.ArrayList p2, int p3)
	    {
	        int v1 = (p2.size() - 1);
	        while (v1 >= 0) {
	            if (((qe) p2.get(v1)).a > p3) {
	                v1--;
	            } else {
	                int v0_2 = (v1 + 1);
	            }
	            return v0_2;
	        }
	        v0_2 = 0;
	        return v0_2;
	    }
	
	
	    private android.view.MenuItem a(int p9, int p10, int p11, CharSequence p12)
	    {
	        qe v0_0 = (p11 >> 16);
	        if ((v0_0 >= null) && (v0_0 < qa.k.length)) {
	            int v5 = ((qa.k[v0_0] << 16) | (65535 & p11));
	            qe v0_4 = new qe(this, p9, p10, p11, v5, p12, this.e);
	            this.c.add(qa.a(this.c, v5), v0_4);
	            this.b(1);
	            return v0_4;
	        } else {
	            throw new IllegalArgumentException("order does not contain a valid category.");
	        }
	    }
	
	
	    private qe a(int p13, android.view.KeyEvent p14)
	    {
	        int v0_2;
	        java.util.ArrayList v5 = this.w;
	        v5.clear();
	        this.a(v5, p13, p14);
	        if (!v5.isEmpty()) {
	            int v6 = p14.getMetaState();
	            android.view.KeyCharacterMap$KeyData v7_1 = new android.view.KeyCharacterMap$KeyData();
	            p14.getKeyData(v7_1);
	            int v8 = v5.size();
	            if (v8 != 1) {
	                boolean v9 = this.b();
	                int v3 = 0;
	                while (v3 < v8) {
	                    int v1_0;
	                    v0_2 = ((qe) v5.get(v3));
	                    if (!v9) {
	                        v1_0 = v0_2.getNumericShortcut();
	                    } else {
	                        v1_0 = v0_2.getAlphabeticShortcut();
	                    }
	                    if (((v1_0 != v7_1.meta[0]) || ((v6 & 2) != 0)) && (((v1_0 != v7_1.meta[2]) || ((v6 & 2) == 0)) && ((!v9) || ((v1_0 != 8) || (p13 != 67))))) {
	                        v3++;
	                    }
	                }
	                v0_2 = 0;
	            } else {
	                v0_2 = ((qe) v5.get(0));
	            }
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    private void a(int p2, boolean p3)
	    {
	        if ((p2 >= 0) && (p2 < this.c.size())) {
	            this.c.remove(p2);
	            if (p3) {
	                this.b(1);
	            }
	        }
	        return;
	    }
	
	
	    private void a(java.util.List p12, int p13, android.view.KeyEvent p14)
	    {
	        boolean v4 = this.b();
	        int v5 = p14.getMetaState();
	        android.view.KeyCharacterMap$KeyData v6_1 = new android.view.KeyCharacterMap$KeyData();
	        if ((p14.getKeyData(v6_1)) || (p13 == 67)) {
	            int v7 = this.c.size();
	            int v2 = 0;
	            while (v2 < v7) {
	                int v0_4 = ((qe) this.c.get(v2));
	                if (v0_4.hasSubMenu()) {
	                    ((qa) v0_4.getSubMenu()).a(p12, p13, p14);
	                }
	                boolean v1_3;
	                if (!v4) {
	                    v1_3 = v0_4.getNumericShortcut();
	                } else {
	                    v1_3 = v0_4.getAlphabeticShortcut();
	                }
	                if ((((v5 & 5) == 0) && ((v1_3) && ((v1_3 == v6_1.meta[0]) || ((v1_3 == v6_1.meta[2]) || ((v4) && ((v1_3 == 8) && (p13 == 67))))))) && (v0_4.isEnabled())) {
	                    p12.add(v0_4);
	                }
	                v2++;
	            }
	        }
	        return;
	    }
	
	
	    protected String a()
	    {
	        return "android:menu:actionviewstates";
	    }
	
	
	    protected final qa a(android.graphics.drawable.Drawable p7)
	    {
	        this.a(0, 0, 0, p7, 0);
	        return this;
	    }
	
	
	    protected final qa a(CharSequence p7)
	    {
	        this.a(0, p7, 0, 0, 0);
	        return this;
	    }
	
	
	    void a(int p2, CharSequence p3, int p4, android.graphics.drawable.Drawable p5, android.view.View p6)
	    {
	        if (p6 == null) {
	            if (p3 != null) {
	                this.f = p3;
	            }
	            if (p5 != null) {
	                this.g = p5;
	            }
	            this.h = 0;
	        } else {
	            this.h = p6;
	            this.f = 0;
	            this.g = 0;
	        }
	        this.b(0);
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p8)
	    {
	        int v3 = this.size();
	        int v2 = 0;
	        android.util.SparseArray v0_1 = 0;
	        while (v2 < v3) {
	            android.view.MenuItem v4 = this.getItem(v2);
	            String v1_2 = fx.a(v4);
	            if ((v1_2 != null) && (v1_2.getId() != -1)) {
	                if (v0_1 == null) {
	                    v0_1 = new android.util.SparseArray();
	                }
	                v1_2.saveHierarchyState(v0_1);
	                if (fx.c(v4)) {
	                    p8.putInt("android:menu:expandedactionview", v4.getItemId());
	                }
	            }
	            String v1_5 = v0_1;
	            if (v4.hasSubMenu()) {
	                ((qu) v4.getSubMenu()).a(p8);
	            }
	            v2++;
	            v0_1 = v1_5;
	        }
	        if (v0_1 != null) {
	            p8.putSparseParcelableArray(this.a(), v0_1);
	        }
	        return;
	    }
	
	
	    public void a(qb p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public final void a(qp p2)
	    {
	        this.a(p2, this.a);
	        return;
	    }
	
	
	    public final void a(qp p3, android.content.Context p4)
	    {
	        this.x.add(new ref.WeakReference(p3));
	        p3.a(p4, this);
	        this.r = 1;
	        return;
	    }
	
	
	    public final void a(boolean p4)
	    {
	        if (!this.v) {
	            this.v = 1;
	            java.util.Iterator v2 = this.x.iterator();
	            while (v2.hasNext()) {
	                int v0_6 = ((ref.WeakReference) v2.next());
	                java.util.concurrent.CopyOnWriteArrayList v1_1 = ((qp) v0_6.get());
	                if (v1_1 != null) {
	                    v1_1.a(this, p4);
	                } else {
	                    this.x.remove(v0_6);
	                }
	            }
	            this.v = 0;
	        }
	        return;
	    }
	
	
	    public final boolean a(android.view.MenuItem p8, qp p9, int p10)
	    {
	        int v0_5;
	        boolean v2_0 = 0;
	        if ((((qe) p8) != null) && (((qe) p8).isEnabled())) {
	            ref.WeakReference v1_0;
	            boolean v5 = ((qe) p8).b();
	            boolean v4_0 = ((qe) p8).d;
	            if ((!v4_0) || (!v4_0.f())) {
	                v1_0 = 0;
	            } else {
	                v1_0 = 1;
	            }
	            if (!((qe) p8).i()) {
	                if ((!((qe) p8).hasSubMenu()) && (v1_0 == null)) {
	                    if ((p10 & 1) == 0) {
	                        this.a(1);
	                    }
	                    v0_5 = v5;
	                } else {
	                    this.a(0);
	                    if (!((qe) p8).hasSubMenu()) {
	                        ((qe) p8).a(new qu(this.a, this, ((qe) p8)));
	                    }
	                    int v0_10 = ((qu) ((qe) p8).getSubMenu());
	                    if (v1_0 != null) {
	                        v4_0.a(v0_10);
	                    }
	                    if (!this.x.isEmpty()) {
	                        if (p9 != null) {
	                            v2_0 = p9.a(v0_10);
	                        }
	                        java.util.Iterator v6_1 = this.x.iterator();
	                        boolean v4_1 = v2_0;
	                        while (v6_1.hasNext()) {
	                            ref.WeakReference v1_6 = ((ref.WeakReference) v6_1.next());
	                            boolean v2_2 = ((qp) v1_6.get());
	                            if (v2_2) {
	                                boolean v2_3;
	                                if (v4_1) {
	                                    v2_3 = v4_1;
	                                } else {
	                                    v2_3 = v2_2.a(v0_10);
	                                }
	                                v4_1 = v2_3;
	                            } else {
	                                this.x.remove(v1_6);
	                            }
	                        }
	                        v2_0 = v4_1;
	                    }
	                    v0_5 = (v5 | v2_0);
	                    if (v0_5 == 0) {
	                        this.a(1);
	                    }
	                }
	            } else {
	                v0_5 = (((qe) p8).expandActionView() | v5);
	                if (v0_5 != 0) {
	                    this.a(1);
	                }
	            }
	        } else {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    boolean a(qa p2, android.view.MenuItem p3)
	    {
	        if ((this.b == null) || (!this.b.a(p2, p3))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public boolean a(qe p5)
	    {
	        boolean v0_0 = 0;
	        if (!this.x.isEmpty()) {
	            this.d();
	            java.util.Iterator v3 = this.x.iterator();
	            boolean v2 = 0;
	            while (v3.hasNext()) {
	                boolean v0_3 = ((ref.WeakReference) v3.next());
	                java.util.concurrent.CopyOnWriteArrayList v1_4 = ((qp) v0_3.get());
	                if (v1_4 != null) {
	                    v0_0 = v1_4.b(p5);
	                    if (!v0_0) {
	                        v2 = v0_0;
	                    }
	                } else {
	                    this.x.remove(v0_3);
	                }
	                this.e();
	                if (v0_0) {
	                    this.i = p5;
	                }
	            }
	            v0_0 = v2;
	        }
	        return v0_0;
	    }
	
	
	    public android.view.MenuItem add(int p3)
	    {
	        return this.a(0, 0, 0, this.l.getString(p3));
	    }
	
	
	    public android.view.MenuItem add(int p2, int p3, int p4, int p5)
	    {
	        return this.a(p2, p3, p4, this.l.getString(p5));
	    }
	
	
	    public android.view.MenuItem add(int p2, int p3, int p4, CharSequence p5)
	    {
	        return this.a(p2, p3, p4, p5);
	    }
	
	
	    public android.view.MenuItem add(CharSequence p2)
	    {
	        return this.a(0, 0, 0, p2);
	    }
	
	
	    public int addIntentOptions(int p10, int p11, int p12, android.content.ComponentName p13, android.content.Intent[] p14, android.content.Intent p15, int p16, android.view.MenuItem[] p17)
	    {
	        int v3;
	        android.content.pm.PackageManager v4 = this.a.getPackageManager();
	        java.util.List v5 = v4.queryIntentActivityOptions(p13, p14, p15, 0);
	        if (v5 == null) {
	            v3 = 0;
	        } else {
	            v3 = v5.size();
	        }
	        if ((p16 & 1) == 0) {
	            this.removeGroup(p10);
	        }
	        int v2 = 0;
	        while (v2 < v3) {
	            android.view.MenuItem v1_2;
	            int v0_7 = ((android.content.pm.ResolveInfo) v5.get(v2));
	            if (v0_7.specificIndex >= 0) {
	                v1_2 = p14[v0_7.specificIndex];
	            } else {
	                v1_2 = p15;
	            }
	            int v6_1 = new android.content.Intent(v1_2);
	            v6_1.setComponent(new android.content.ComponentName(v0_7.activityInfo.applicationInfo.packageName, v0_7.activityInfo.name));
	            android.view.MenuItem v1_8 = this.add(p10, p11, p12, v0_7.loadLabel(v4)).setIcon(v0_7.loadIcon(v4)).setIntent(v6_1);
	            if ((p17 != null) && (v0_7.specificIndex >= 0)) {
	                p17[v0_7.specificIndex] = v1_8;
	            }
	            v2++;
	        }
	        return v3;
	    }
	
	
	    public android.view.SubMenu addSubMenu(int p3)
	    {
	        return this.addSubMenu(0, 0, 0, this.l.getString(p3));
	    }
	
	
	    public android.view.SubMenu addSubMenu(int p2, int p3, int p4, int p5)
	    {
	        return this.addSubMenu(p2, p3, p4, this.l.getString(p5));
	    }
	
	
	    public android.view.SubMenu addSubMenu(int p4, int p5, int p6, CharSequence p7)
	    {
	        qe v0_1 = ((qe) this.a(p4, p5, p6, p7));
	        qu v1_1 = new qu(this.a, this, v0_1);
	        v0_1.a(v1_1);
	        return v1_1;
	    }
	
	
	    public android.view.SubMenu addSubMenu(CharSequence p2)
	    {
	        return this.addSubMenu(0, 0, 0, p2);
	    }
	
	
	    public final void b(android.os.Bundle p8)
	    {
	        if (p8 != null) {
	            android.util.SparseArray v2 = p8.getSparseParcelableArray(this.a());
	            int v3 = this.size();
	            int v1 = 0;
	            while (v1 < v3) {
	                int v0_5 = this.getItem(v1);
	                boolean v4_0 = fx.a(v0_5);
	                if ((v4_0) && (v4_0.getId() != -1)) {
	                    v4_0.restoreHierarchyState(v2);
	                }
	                if (v0_5.hasSubMenu()) {
	                    ((qu) v0_5.getSubMenu()).b(p8);
	                }
	                v1++;
	            }
	            int v0_3 = p8.getInt("android:menu:expandedactionview");
	            if (v0_3 > 0) {
	                int v0_4 = this.findItem(v0_3);
	                if (v0_4 != 0) {
	                    fx.b(v0_4);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void b(qp p4)
	    {
	        java.util.Iterator v2 = this.x.iterator();
	        while (v2.hasNext()) {
	            ref.WeakReference v0_3 = ((ref.WeakReference) v2.next());
	            java.util.concurrent.CopyOnWriteArrayList v1_1 = ((qp) v0_3.get());
	            if ((v1_1 == null) || (v1_1 == p4)) {
	                this.x.remove(v0_3);
	            }
	        }
	        return;
	    }
	
	
	    public final void b(boolean p4)
	    {
	        if (this.s) {
	            this.t = 1;
	        } else {
	            if (p4) {
	                this.p = 1;
	                this.r = 1;
	            }
	            if (!this.x.isEmpty()) {
	                this.d();
	                java.util.Iterator v2 = this.x.iterator();
	                while (v2.hasNext()) {
	                    ref.WeakReference v0_6 = ((ref.WeakReference) v2.next());
	                    java.util.concurrent.CopyOnWriteArrayList v1_2 = ((qp) v0_6.get());
	                    if (v1_2 != null) {
	                        v1_2.b(p4);
	                    } else {
	                        this.x.remove(v0_6);
	                    }
	                }
	                this.e();
	            }
	        }
	        return;
	    }
	
	
	    boolean b()
	    {
	        return this.m;
	    }
	
	
	    public boolean b(qe p5)
	    {
	        boolean v0_0 = 0;
	        if ((!this.x.isEmpty()) && (this.i == p5)) {
	            this.d();
	            java.util.Iterator v3 = this.x.iterator();
	            boolean v2 = 0;
	            while (v3.hasNext()) {
	                boolean v0_3 = ((ref.WeakReference) v3.next());
	                int v1_5 = ((qp) v0_3.get());
	                if (v1_5 != 0) {
	                    v0_0 = v1_5.c(p5);
	                    if (!v0_0) {
	                        v2 = v0_0;
	                    }
	                } else {
	                    this.x.remove(v0_3);
	                }
	                this.e();
	                if (v0_0) {
	                    this.i = 0;
	                }
	            }
	            v0_0 = v2;
	        }
	        return v0_0;
	    }
	
	
	    public boolean c()
	    {
	        return this.n;
	    }
	
	
	    public void clear()
	    {
	        if (this.i != null) {
	            this.b(this.i);
	        }
	        this.c.clear();
	        this.b(1);
	        return;
	    }
	
	
	    public void clearHeader()
	    {
	        this.g = 0;
	        this.f = 0;
	        this.h = 0;
	        this.b(0);
	        return;
	    }
	
	
	    public void close()
	    {
	        this.a(1);
	        return;
	    }
	
	
	    public final void d()
	    {
	        if (!this.s) {
	            this.s = 1;
	            this.t = 0;
	        }
	        return;
	    }
	
	
	    public final void e()
	    {
	        this.s = 0;
	        if (this.t) {
	            this.t = 0;
	            this.b(1);
	        }
	        return;
	    }
	
	
	    final void f()
	    {
	        this.p = 1;
	        this.b(1);
	        return;
	    }
	
	
	    public android.view.MenuItem findItem(int p5)
	    {
	        int v2 = this.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            int v0_1 = ((qe) this.c.get(v1));
	            if (v0_1.getItemId() != p5) {
	                if (v0_1.hasSubMenu()) {
	                    v0_1 = v0_1.getSubMenu().findItem(p5);
	                    if (v0_1 != 0) {
	                        return v0_1;
	                    }
	                }
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    final void g()
	    {
	        this.r = 1;
	        this.b(1);
	        return;
	    }
	
	
	    public android.view.MenuItem getItem(int p2)
	    {
	        return ((android.view.MenuItem) this.c.get(p2));
	    }
	
	
	    public final java.util.ArrayList h()
	    {
	        int v0_4;
	        if (this.p) {
	            this.o.clear();
	            int v3 = this.c.size();
	            int v1 = 0;
	            while (v1 < v3) {
	                int v0_7 = ((qe) this.c.get(v1));
	                if (v0_7.isVisible()) {
	                    this.o.add(v0_7);
	                }
	                v1++;
	            }
	            this.p = 0;
	            this.r = 1;
	            v0_4 = this.o;
	        } else {
	            v0_4 = this.o;
	        }
	        return v0_4;
	    }
	
	
	    public boolean hasVisibleItems()
	    {
	        int v0_1;
	        if (!this.j) {
	            int v4 = this.size();
	            int v3 = 0;
	            while (v3 < v4) {
	                if (!((qe) this.c.get(v3)).isVisible()) {
	                    v3++;
	                } else {
	                    v0_1 = 1;
	                }
	            }
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final void i()
	    {
	        java.util.ArrayList v4 = this.h();
	        if (this.r) {
	            java.util.ArrayList v5_0 = this.x.iterator();
	            int v2_0 = 0;
	            while (v5_0.hasNext()) {
	                int v0_12 = ((ref.WeakReference) v5_0.next());
	                int v1_3 = ((qp) v0_12.get());
	                if (v1_3 != 0) {
	                    v2_0 = (v1_3.a() | v2_0);
	                } else {
	                    this.x.remove(v0_12);
	                }
	            }
	            if (v2_0 == 0) {
	                this.d.clear();
	                this.q.clear();
	                this.q.addAll(this.h());
	            } else {
	                this.d.clear();
	                this.q.clear();
	                int v2_1 = v4.size();
	                int v1_1 = 0;
	                while (v1_1 < v2_1) {
	                    int v0_9 = ((qe) v4.get(v1_1));
	                    if (!v0_9.f()) {
	                        this.q.add(v0_9);
	                    } else {
	                        this.d.add(v0_9);
	                    }
	                    v1_1++;
	                }
	            }
	            this.r = 0;
	        }
	        return;
	    }
	
	
	    public boolean isShortcutKey(int p2, android.view.KeyEvent p3)
	    {
	        int v0_1;
	        if (this.a(p2, p3) == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final java.util.ArrayList j()
	    {
	        this.i();
	        return this.q;
	    }
	
	
	    public qa k()
	    {
	        return this;
	    }
	
	
	    public boolean performIdentifierAction(int p3, int p4)
	    {
	        return this.a(this.findItem(p3), 0, p4);
	    }
	
	
	    public boolean performShortcut(int p3, android.view.KeyEvent p4, int p5)
	    {
	        int v1_0 = this.a(p3, p4);
	        boolean v0_0 = 0;
	        if (v1_0 != 0) {
	            v0_0 = this.a(v1_0, 0, p5);
	        }
	        if ((p5 & 2) != 0) {
	            this.a(1);
	        }
	        return v0_0;
	    }
	
	
	    public void removeGroup(int p6)
	    {
	        int v3_0 = this.size();
	        int v2_0 = 0;
	        while (v2_0 < v3_0) {
	            if (((qe) this.c.get(v2_0)).getGroupId() != p6) {
	                v2_0++;
	            } else {
	                int v3_1 = v2_0;
	            }
	            if (v3_1 >= 0) {
	                int v4 = (this.c.size() - v3_1);
	                int v0_7 = 0;
	                while(true) {
	                    int v2_1 = (v0_7 + 1);
	                    if ((v0_7 >= v4) || (((qe) this.c.get(v3_1)).getGroupId() != p6)) {
	                        break;
	                    }
	                    this.a(v3_1, 0);
	                    v0_7 = v2_1;
	                }
	                this.b(1);
	            }
	            return;
	        }
	        v3_1 = -1;
	    }
	
	
	    public void removeItem(int p4)
	    {
	        int v2 = this.size();
	        int v1_0 = 0;
	        while (v1_0 < v2) {
	            if (((qe) this.c.get(v1_0)).getItemId() != p4) {
	                v1_0++;
	            } else {
	                int v0_0 = v1_0;
	            }
	            this.a(v0_0, 1);
	            return;
	        }
	        v0_0 = -1;
	        this.a(v0_0, 1);
	        return;
	    }
	
	
	    public void setGroupCheckable(int p5, boolean p6, boolean p7)
	    {
	        int v2 = this.c.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            int v0_4 = ((qe) this.c.get(v1));
	            if (v0_4.getGroupId() == p5) {
	                v0_4.a(p7);
	                v0_4.setCheckable(p6);
	            }
	            v1++;
	        }
	        return;
	    }
	
	
	    public void setGroupEnabled(int p5, boolean p6)
	    {
	        int v2 = this.c.size();
	        int v1 = 0;
	        while (v1 < v2) {
	            int v0_4 = ((qe) this.c.get(v1));
	            if (v0_4.getGroupId() == p5) {
	                v0_4.setEnabled(p6);
	            }
	            v1++;
	        }
	        return;
	    }
	
	
	    public void setGroupVisible(int p7, boolean p8)
	    {
	        int v4 = this.c.size();
	        int v3 = 0;
	        int v2_1 = 0;
	        while (v3 < v4) {
	            int v0_5;
	            int v0_3 = ((qe) this.c.get(v3));
	            if ((v0_3.getGroupId() != p7) || (!v0_3.c(p8))) {
	                v0_5 = v2_1;
	            } else {
	                v0_5 = 1;
	            }
	            v3++;
	            v2_1 = v0_5;
	        }
	        if (v2_1 != 0) {
	            this.b(1);
	        }
	        return;
	    }
	
	
	    public void setQwertyMode(boolean p2)
	    {
	        this.m = p2;
	        this.b(0);
	        return;
	    }
	
	
	    public int size()
	    {
	        return this.c.size();
	    }
	
