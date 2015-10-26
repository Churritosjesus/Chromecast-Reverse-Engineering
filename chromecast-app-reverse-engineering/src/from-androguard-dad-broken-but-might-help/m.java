	final android.os.Handler a
	public final t b
	  c
	  d
	private q e
	private  f
	private  g
	private  h
	private  i
	private  j
	private  k
	private ep l
	private ar m
	
	    public m()
	    {
	        this.a = new n(this);
	        this.b = new t();
	        this.e = new o(this);
	        return;
	    }
	
	
	    private static String a(android.view.View p7)
	    {
	        String v1_0 = 70;
	        String v2_0 = 46;
	        StringBuilder v4_1 = new StringBuilder(128);
	        v4_1.append(p7.getClass().getName());
	        v4_1.append(123);
	        v4_1.append(Integer.toHexString(System.identityHashCode(p7)));
	        v4_1.append(32);
	        switch (p7.getVisibility()) {
	            case 0:
	                v4_1.append(86);
	                break;
	            case 4:
	                v4_1.append(73);
	                break;
	            case 8:
	                v4_1.append(71);
	                break;
	            default:
	                v4_1.append(46);
	        }
	        String v0_10;
	        if (!p7.isFocusable()) {
	            v0_10 = 46;
	        } else {
	            v0_10 = 70;
	        }
	        String v0_12;
	        v4_1.append(v0_10);
	        if (!p7.isEnabled()) {
	            v0_12 = 46;
	        } else {
	            v0_12 = 69;
	        }
	        String v0_14;
	        v4_1.append(v0_12);
	        if (!p7.willNotDraw()) {
	            v0_14 = 68;
	        } else {
	            v0_14 = 46;
	        }
	        String v0_16;
	        v4_1.append(v0_14);
	        if (!p7.isHorizontalScrollBarEnabled()) {
	            v0_16 = 46;
	        } else {
	            v0_16 = 72;
	        }
	        String v0_18;
	        v4_1.append(v0_16);
	        if (!p7.isVerticalScrollBarEnabled()) {
	            v0_18 = 46;
	        } else {
	            v0_18 = 86;
	        }
	        String v0_20;
	        v4_1.append(v0_18);
	        if (!p7.isClickable()) {
	            v0_20 = 46;
	        } else {
	            v0_20 = 67;
	        }
	        String v0_22;
	        v4_1.append(v0_20);
	        if (!p7.isLongClickable()) {
	            v0_22 = 46;
	        } else {
	            v0_22 = 76;
	        }
	        v4_1.append(v0_22);
	        v4_1.append(32);
	        if (!p7.isFocused()) {
	            v1_0 = 46;
	        }
	        String v0_25;
	        v4_1.append(v1_0);
	        if (!p7.isSelected()) {
	            v0_25 = 46;
	        } else {
	            v0_25 = 83;
	        }
	        v4_1.append(v0_25);
	        if (p7.isPressed()) {
	            v2_0 = 80;
	        }
	        v4_1.append(v2_0);
	        v4_1.append(32);
	        v4_1.append(p7.getLeft());
	        v4_1.append(44);
	        v4_1.append(p7.getTop());
	        v4_1.append(45);
	        v4_1.append(p7.getRight());
	        v4_1.append(44);
	        v4_1.append(p7.getBottom());
	        String v1_1 = p7.getId();
	        if (v1_1 != -1) {
	            v4_1.append(" #");
	            v4_1.append(Integer.toHexString(v1_1));
	            String v2_1 = p7.getResources();
	            if ((v1_1 != null) && (v2_1 != null)) {
	                try {
	                    String v0_37;
	                    switch ((-16777216 & v1_1)) {
	                        case 16777216:
	                            v0_37 = "android";
	                            String v3_1 = v2_1.getResourceTypeName(v1_1);
	                            String v1_2 = v2_1.getResourceEntryName(v1_1);
	                            v4_1.append(" ");
	                            v4_1.append(v0_37);
	                            v4_1.append(":");
	                            v4_1.append(v3_1);
	                            v4_1.append("/");
	                            v4_1.append(v1_2);
	                            break;
	                        case 2130706432:
	                            v0_37 = "app";
	                            break;
	                        default:
	                            v0_37 = v2_1.getResourcePackageName(v1_1);
	                    }
	                } catch (String v0) {
	                }
	            }
	        }
	        v4_1.append("}");
	        return v4_1.toString();
	    }
	
	
	    private void a(String p5, java.io.PrintWriter p6, android.view.View p7)
	    {
	        p6.print(p5);
	        if (p7 != null) {
	            p6.println(m.a(p7));
	            if ((p7 instanceof android.view.ViewGroup)) {
	                int v1 = ((android.view.ViewGroup) p7).getChildCount();
	                if (v1 > 0) {
	                    String v2_1 = new StringBuilder().append(p5).append("  ").toString();
	                    int v0_6 = 0;
	                    while (v0_6 < v1) {
	                        this.a(v2_1, p6, ((android.view.ViewGroup) p7).getChildAt(v0_6));
	                        v0_6++;
	                    }
	                }
	            }
	        } else {
	            p6.println("null");
	        }
	        return;
	    }
	
	
	    final ar a(String p3, boolean p4, boolean p5)
	    {
	        if (this.l == null) {
	            this.l = new ep();
	        }
	        ar v0_5 = ((ar) this.l.get(p3));
	        if (v0_5 != null) {
	            v0_5.e = this;
	        } else {
	            if (p5) {
	                v0_5 = new ar(p3, this, p4);
	                this.l.put(p3, v0_5);
	            }
	        }
	        return v0_5;
	    }
	
	
	    public final void a(j p3, android.content.Intent p4, int p5)
	    {
	        if (p5 != -1) {
	            if ((-65536 & p5) == 0) {
	                super.startActivityForResult(p4, (((p3.k + 1) << 16) + (65535 & p5)));
	            } else {
	                throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
	            }
	        } else {
	            super.startActivityForResult(p4, -1);
	        }
	        return;
	    }
	
	
	    final void a(String p3)
	    {
	        if (this.l != null) {
	            ep v0_3 = ((ar) this.l.get(p3));
	            if ((v0_3 != null) && (!v0_3.g)) {
	                v0_3.g();
	                this.l.remove(p3);
	            }
	        }
	        return;
	    }
	
	
	    final void a(boolean p4)
	    {
	        if (!this.h) {
	            this.h = 1;
	            this.d = p4;
	            this.a.removeMessages(1);
	            if (this.k) {
	                this.k = 0;
	                if (this.m != null) {
	                    if (this.d) {
	                        this.m.d();
	                    } else {
	                        this.m.c();
	                    }
	                }
	            }
	            this.b.a(2, 0);
	        }
	        return;
	    }
	
	
	    public void a_()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 11) {
	            this.i = 1;
	        } else {
	            this.invalidateOptionsMenu();
	        }
	        return;
	    }
	
	
	    public void dump(String p4, java.io.FileDescriptor p5, java.io.PrintWriter p6, String[] p7)
	    {
	        p6.print(p4);
	        p6.print("Local FragmentActivity ");
	        p6.print(Integer.toHexString(System.identityHashCode(this)));
	        p6.println(" State:");
	        String v0_8 = new StringBuilder().append(p4).append("  ").toString();
	        p6.print(v0_8);
	        p6.print("mCreated=");
	        p6.print(this.f);
	        p6.print("mResumed=");
	        p6.print(this.g);
	        p6.print(" mStopped=");
	        p6.print(this.c);
	        p6.print(" mReallyStopped=");
	        p6.println(this.h);
	        p6.print(v0_8);
	        p6.print("mLoadersStarted=");
	        p6.println(this.k);
	        if (this.m != null) {
	            p6.print(p4);
	            p6.print("Loader Manager ");
	            p6.print(Integer.toHexString(System.identityHashCode(this.m)));
	            p6.println(":");
	            this.m.a(new StringBuilder().append(p4).append("  ").toString(), p5, p6, p7);
	        }
	        this.b.a(p4, p5, p6, p7);
	        p6.print(p4);
	        p6.println("View Hierarchy:");
	        this.a(new StringBuilder().append(p4).append("  ").toString(), p6, this.getWindow().getDecorView());
	        return;
	    }
	
	
	    public void onActivityResult(int p4, int p5, android.content.Intent p6)
	    {
	        this.b.j = 0;
	        String v0_1 = (p4 >> 16);
	        if (v0_1 == null) {
	            super.onActivityResult(p4, p5, p6);
	        } else {
	            String v0_2 = (v0_1 - 1);
	            if ((this.b.b != null) && ((v0_2 >= null) && (v0_2 < this.b.b.size()))) {
	                String v0_4 = ((j) this.b.b.get(v0_2));
	                if (v0_4 != null) {
	                    v0_4.a((65535 & p4), p5, p6);
	                } else {
	                    android.util.Log.w("FragmentActivity", new StringBuilder("Activity result no fragment exists for index: 0x").append(Integer.toHexString(p4)).toString());
	                }
	            } else {
	                android.util.Log.w("FragmentActivity", new StringBuilder("Activity result fragment index out of range: 0x").append(Integer.toHexString(p4)).toString());
	            }
	        }
	        return;
	    }
	
	
	    public void onBackPressed()
	    {
	        if (!this.b.d()) {
	            if (android.os.Build$VERSION.SDK_INT < 21) {
	                this.finish();
	            } else {
	                this.finishAfterTransition();
	            }
	        }
	        return;
	    }
	
	
	    public void onConfigurationChanged(android.content.res.Configuration p2)
	    {
	        super.onConfigurationChanged(p2);
	        this.b.a(p2);
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p5)
	    {
	        this.b.a(this, this.e, 0);
	        if (this.getLayoutInflater().getFactory() == null) {
	            this.getLayoutInflater().setFactory(this);
	        }
	        super.onCreate(p5);
	        int v0_5 = ((p) this.getLastNonConfigurationInstance());
	        if (v0_5 != 0) {
	            this.l = v0_5.b;
	        }
	        if (p5 != null) {
	            int v0_6;
	            android.os.Parcelable v2_3 = p5.getParcelable("android:support:fragments");
	            if (v0_5 == 0) {
	                v0_6 = 0;
	            } else {
	                v0_6 = v0_5.a;
	            }
	            this.b.a(v2_3, v0_6);
	        }
	        this.b.j();
	        return;
	    }
	
	
	    public boolean onCreatePanelMenu(int p4, android.view.Menu p5)
	    {
	        int v0_0;
	        if (p4 != 0) {
	            v0_0 = super.onCreatePanelMenu(p4, p5);
	        } else {
	            v0_0 = (super.onCreatePanelMenu(p4, p5) | this.b.a(p5, this.getMenuInflater()));
	            if (android.os.Build$VERSION.SDK_INT < 11) {
	                v0_0 = 1;
	            }
	        }
	        return v0_0;
	    }
	
	
	    public android.view.View onCreateView(String p3, android.content.Context p4, android.util.AttributeSet p5)
	    {
	        android.view.View v0_3;
	        if ("fragment".equals(p3)) {
	            v0_3 = this.b.a(0, p3, p4, p5);
	            if (v0_3 == null) {
	                v0_3 = super.onCreateView(p3, p4, p5);
	            }
	        } else {
	            v0_3 = super.onCreateView(p3, p4, p5);
	        }
	        return v0_3;
	    }
	
	
	    public void onDestroy()
	    {
	        super.onDestroy();
	        this.a(0);
	        this.b.p();
	        if (this.m != null) {
	            this.m.g();
	        }
	        return;
	    }
	
	
	    public boolean onKeyDown(int p3, android.view.KeyEvent p4)
	    {
	        if ((android.os.Build$VERSION.SDK_INT >= 5) || ((p3 != 4) || (p4.getRepeatCount() != 0))) {
	            int v0_3 = super.onKeyDown(p3, p4);
	        } else {
	            this.onBackPressed();
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public void onLowMemory()
	    {
	        super.onLowMemory();
	        this.b.q();
	        return;
	    }
	
	
	    public boolean onMenuItemSelected(int p2, android.view.MenuItem p3)
	    {
	        boolean v0_2;
	        if (!super.onMenuItemSelected(p2, p3)) {
	            switch (p2) {
	                case 0:
	                    v0_2 = this.b.a(p3);
	                    break;
	                case 6:
	                    v0_2 = this.b.b(p3);
	                    break;
	                default:
	                    v0_2 = 0;
	            }
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void onNewIntent(android.content.Intent p3)
	    {
	        super.onNewIntent(p3);
	        this.b.j = 0;
	        return;
	    }
	
	
	    public void onPanelClosed(int p2, android.view.Menu p3)
	    {
	        switch (p2) {
	            case 0:
	                this.b.b(p3);
	                break;
	        }
	        super.onPanelClosed(p2, p3);
	        return;
	    }
	
	
	    public void onPause()
	    {
	        super.onPause();
	        this.g = 0;
	        if (this.a.hasMessages(2)) {
	            this.a.removeMessages(2);
	            this.b.m();
	        }
	        this.b.a(4, 0);
	        return;
	    }
	
	
	    public void onPostResume()
	    {
	        super.onPostResume();
	        this.a.removeMessages(2);
	        this.b.m();
	        this.b.h();
	        return;
	    }
	
	
	    public boolean onPreparePanel(int p3, android.view.View p4, android.view.Menu p5)
	    {
	        if ((p3 != 0) || (p5 == null)) {
	            int v0_0 = super.onPreparePanel(p3, p4, p5);
	        } else {
	            if (this.i) {
	                this.i = 0;
	                p5.clear();
	                this.onCreatePanelMenu(p3, p5);
	            }
	            v0_0 = (super.onPreparePanel(0, p4, p5) | this.b.a(p5));
	        }
	        return v0_0;
	    }
	
	
	    public void onResume()
	    {
	        super.onResume();
	        this.a.sendEmptyMessage(2);
	        this.g = 1;
	        this.b.h();
	        return;
	    }
	
	
	    public final Object onRetainNonConfigurationInstance()
	    {
	        p v5_0 = 0;
	        int v4 = 0;
	        if (this.c) {
	            this.a(1);
	        }
	        java.util.ArrayList v1_0;
	        ar[] v7_0 = this.b;
	        if (v7_0.b == null) {
	            v1_0 = 0;
	        } else {
	            int v3_0 = 0;
	            v1_0 = 0;
	            while (v3_0 < v7_0.b.size()) {
	                int v0_15 = ((j) v7_0.b.get(v3_0));
	                if ((v0_15 != 0) && (v0_15.G)) {
	                    if (v1_0 == null) {
	                        v1_0 = new java.util.ArrayList();
	                    }
	                    String v2_5;
	                    v1_0.add(v0_15);
	                    v0_15.H = 1;
	                    if (v0_15.n == null) {
	                        v2_5 = -1;
	                    } else {
	                        v2_5 = v0_15.n.k;
	                    }
	                    v0_15.o = v2_5;
	                }
	                v3_0++;
	            }
	        }
	        int v0_5;
	        if (this.l == null) {
	            v0_5 = 0;
	        } else {
	            int v3_1 = this.l.size();
	            ar[] v7_1 = new ar[v3_1];
	            String v2_0 = (v3_1 - 1);
	            while (v2_0 >= null) {
	                v7_1[v2_0] = ((ar) this.l.c(v2_0));
	                v2_0--;
	            }
	            v0_5 = 0;
	            while (v4 < v3_1) {
	                String v2_1 = v7_1[v4];
	                if (!v2_1.g) {
	                    v2_1.g();
	                    this.l.remove(v2_1.d);
	                } else {
	                    v0_5 = 1;
	                }
	                v4++;
	            }
	        }
	        if ((v1_0 != null) || (v0_5 != 0)) {
	            v5_0 = new p();
	            v5_0.a = v1_0;
	            v5_0.b = this.l;
	        }
	        return v5_0;
	    }
	
	
	    public void onSaveInstanceState(android.os.Bundle p3)
	    {
	        super.onSaveInstanceState(p3);
	        android.os.Parcelable v0_1 = this.b.i();
	        if (v0_1 != null) {
	            p3.putParcelable("android:support:fragments", v0_1);
	        }
	        return;
	    }
	
	
	    public void onStart()
	    {
	        super.onStart();
	        this.c = 0;
	        this.h = 0;
	        this.a.removeMessages(1);
	        if (!this.f) {
	            this.f = 1;
	            this.b.k();
	        }
	        this.b.j = 0;
	        this.b.h();
	        if (!this.k) {
	            this.k = 1;
	            if (this.m == null) {
	                if (!this.j) {
	                    this.m = this.a("(root)", this.k, 0);
	                    if ((this.m != null) && (!this.m.f)) {
	                        this.m.b();
	                    }
	                }
	            } else {
	                this.m.b();
	            }
	            this.j = 1;
	        }
	        this.b.l();
	        if (this.l != null) {
	            int v4 = this.l.size();
	            ar[] v5 = new ar[v4];
	            int v1_1 = (v4 - 1);
	            while (v1_1 >= 0) {
	                v5[v1_1] = ((ar) this.l.c(v1_1));
	                v1_1--;
	            }
	            int v2_1 = 0;
	            while (v2_1 < v4) {
	                ar v6 = v5[v2_1];
	                if (v6.g) {
	                    if (ar.a) {
	                        new StringBuilder("Finished Retaining in ").append(v6);
	                    }
	                    v6.g = 0;
	                    int v1_3 = (v6.b.a() - 1);
	                    while (v1_3 >= 0) {
	                        int v0_29 = ((as) v6.b.d(v1_3));
	                        if (v0_29.h) {
	                            if (ar.a) {
	                                new StringBuilder("  Finished Retaining: ").append(v0_29);
	                            }
	                            v0_29.h = 0;
	                            if ((v0_29.g != v0_29.i) && (!v0_29.g)) {
	                                v0_29.b();
	                            }
	                        }
	                        if ((v0_29.g) && ((v0_29.d) && (!v0_29.j))) {
	                            v0_29.b(v0_29.c, v0_29.f);
	                        }
	                        v1_3--;
	                    }
	                }
	                v6.f();
	                v2_1++;
	            }
	        }
	        return;
	    }
	
	
	    public void onStop()
	    {
	        super.onStop();
	        this.c = 1;
	        this.a.sendEmptyMessage(1);
	        this.b.o();
	        return;
	    }
	
	
	    public void startActivityForResult(android.content.Intent p3, int p4)
	    {
	        if ((p4 == -1) || ((-65536 & p4) == 0)) {
	            super.startActivityForResult(p3, p4);
	            return;
	        } else {
	            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
	        }
	    }
	
