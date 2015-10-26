	private static final ep a
	static final java.lang.Object e
	 j A
	  B
	  C
	 java.lang.String D
	  E
	  F
	public  G
	  H
	  I
	  J
	  K
	  L
	 android.view.ViewGroup M
	public android.view.View N
	 android.view.View O
	  P
	  Q
	 ar R
	  S
	  T
	 java.lang.Object U
	 java.lang.Object V
	 java.lang.Object W
	 ax X
	 ax Y
	private java.lang.Object b
	private java.lang.Object c
	private java.lang.Object d
	  f
	 android.view.View g
	  h
	 android.os.Bundle i
	 android.util.SparseArray j
	  k
	 java.lang.String l
	public android.os.Bundle m
	public j n
	  o
	public  p
	  q
	public  r
	public  s
	  t
	  u
	  v
	  w
	public t x
	public m y
	 t z
	
	    static j()
	    {
	        j.a = new ep();
	        j.e = new Object();
	        return;
	    }
	
	
	    public j()
	    {
	        this.f = 0;
	        this.k = -1;
	        this.o = -1;
	        this.J = 1;
	        this.Q = 1;
	        this.b = 0;
	        this.U = j.e;
	        this.c = 0;
	        this.V = j.e;
	        this.d = 0;
	        this.W = j.e;
	        this.X = 0;
	        this.Y = 0;
	        return;
	    }
	
	
	    public static j a(android.content.Context p1, String p2)
	    {
	        return j.a(p1, p2, 0);
	    }
	
	
	    public static j a(android.content.Context p4, String p5, android.os.Bundle p6)
	    {
	        try {
	            j v0_2 = ((Class) j.a.get(p5));
	        } catch (j v0_6) {
	            throw new l(new StringBuilder("Unable to instantiate fragment ").append(p5).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), v0_6);
	        } catch (j v0_8) {
	            throw new l(new StringBuilder("Unable to instantiate fragment ").append(p5).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), v0_8);
	        } catch (j v0_7) {
	            throw new l(new StringBuilder("Unable to instantiate fragment ").append(p5).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), v0_7);
	        }
	        if (v0_2 == null) {
	            v0_2 = p4.getClassLoader().loadClass(p5);
	            j.a.put(p5, v0_2);
	        }
	        j v0_5 = ((j) v0_2.newInstance());
	        if (p6 != null) {
	            p6.setClassLoader(v0_5.getClass().getClassLoader());
	            v0_5.m = p6;
	        }
	        return v0_5;
	    }
	
	
	    static boolean b(android.content.Context p2, String p3)
	    {
	        try {
	            boolean v0_2 = ((Class) j.a.get(p3));
	        } catch (boolean v0) {
	            boolean v0_4 = 0;
	            return v0_4;
	        }
	        if (!v0_2) {
	            v0_2 = p2.getClassLoader().loadClass(p3);
	            j.a.put(p3, v0_2);
	        }
	        v0_4 = j.isAssignableFrom(v0_2);
	        return v0_4;
	    }
	
	
	    public static void g()
	    {
	        return;
	    }
	
	
	    public static android.view.animation.Animation i()
	    {
	        return 0;
	    }
	
	
	    public static void m()
	    {
	        return;
	    }
	
	
	    public android.view.View a(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
	    {
	        return 0;
	    }
	
	
	    public final String a(int p2)
	    {
	        return this.e().getString(p2);
	    }
	
	
	    public final varargs String a(int p2, Object[] p3)
	    {
	        return this.e().getString(p2, p3);
	    }
	
	
	    public void a()
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public void a(int p1, int p2, android.content.Intent p3)
	    {
	        return;
	    }
	
	
	    final void a(int p3, j p4)
	    {
	        this.k = p3;
	        if (p4 == null) {
	            this.l = new StringBuilder("android:fragment:").append(this.k).toString();
	        } else {
	            this.l = new StringBuilder().append(p4.l).append(":").append(this.k).toString();
	        }
	        return;
	    }
	
	
	    public void a(android.app.Activity p2)
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public final void a(android.content.Intent p4)
	    {
	        if (this.y != null) {
	            this.y.a(this, p4, -1);
	            return;
	        } else {
	            throw new IllegalStateException(new StringBuilder("Fragment ").append(this).append(" not attached to Activity").toString());
	        }
	    }
	
	
	    public final void a(android.content.Intent p4, int p5)
	    {
	        if (this.y != null) {
	            this.y.a(this, p4, p5);
	            return;
	        } else {
	            throw new IllegalStateException(new StringBuilder("Fragment ").append(this).append(" not attached to Activity").toString());
	        }
	    }
	
	
	    public void a(android.os.Bundle p2)
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public void a(android.view.Menu p1)
	    {
	        return;
	    }
	
	
	    public void a(android.view.Menu p1, android.view.MenuInflater p2)
	    {
	        return;
	    }
	
	
	    public void a(android.view.View p1, android.os.Bundle p2)
	    {
	        return;
	    }
	
	
	    public void a(String p4, java.io.FileDescriptor p5, java.io.PrintWriter p6, String[] p7)
	    {
	        p6.print(p4);
	        p6.print("mFragmentId=#");
	        p6.print(Integer.toHexString(this.B));
	        p6.print(" mContainerId=#");
	        p6.print(Integer.toHexString(this.C));
	        p6.print(" mTag=");
	        p6.println(this.D);
	        p6.print(p4);
	        p6.print("mState=");
	        p6.print(this.f);
	        p6.print(" mIndex=");
	        p6.print(this.k);
	        p6.print(" mWho=");
	        p6.print(this.l);
	        p6.print(" mBackStackNesting=");
	        p6.println(this.w);
	        p6.print(p4);
	        p6.print("mAdded=");
	        p6.print(this.q);
	        p6.print(" mRemoving=");
	        p6.print(this.r);
	        p6.print(" mResumed=");
	        p6.print(this.s);
	        p6.print(" mFromLayout=");
	        p6.print(this.t);
	        p6.print(" mInLayout=");
	        p6.println(this.u);
	        p6.print(p4);
	        p6.print("mHidden=");
	        p6.print(this.E);
	        p6.print(" mDetached=");
	        p6.print(this.F);
	        p6.print(" mMenuVisible=");
	        p6.print(this.J);
	        p6.print(" mHasMenu=");
	        p6.println(this.I);
	        p6.print(p4);
	        p6.print("mRetainInstance=");
	        p6.print(this.G);
	        p6.print(" mRetaining=");
	        p6.print(this.H);
	        p6.print(" mUserVisibleHint=");
	        p6.println(this.Q);
	        if (this.x != null) {
	            p6.print(p4);
	            p6.print("mFragmentManager=");
	            p6.println(this.x);
	        }
	        if (this.y != null) {
	            p6.print(p4);
	            p6.print("mActivity=");
	            p6.println(this.y);
	        }
	        if (this.A != null) {
	            p6.print(p4);
	            p6.print("mParentFragment=");
	            p6.println(this.A);
	        }
	        if (this.m != null) {
	            p6.print(p4);
	            p6.print("mArguments=");
	            p6.println(this.m);
	        }
	        if (this.i != null) {
	            p6.print(p4);
	            p6.print("mSavedFragmentState=");
	            p6.println(this.i);
	        }
	        if (this.j != null) {
	            p6.print(p4);
	            p6.print("mSavedViewState=");
	            p6.println(this.j);
	        }
	        if (this.n != null) {
	            p6.print(p4);
	            p6.print("mTarget=");
	            p6.print(this.n);
	            p6.print(" mTargetRequestCode=");
	            p6.println(this.p);
	        }
	        if (this.L != 0) {
	            p6.print(p4);
	            p6.print("mNextAnim=");
	            p6.println(this.L);
	        }
	        if (this.M != null) {
	            p6.print(p4);
	            p6.print("mContainer=");
	            p6.println(this.M);
	        }
	        if (this.N != null) {
	            p6.print(p4);
	            p6.print("mView=");
	            p6.println(this.N);
	        }
	        if (this.O != null) {
	            p6.print(p4);
	            p6.print("mInnerView=");
	            p6.println(this.N);
	        }
	        if (this.g != null) {
	            p6.print(p4);
	            p6.print("mAnimatingAway=");
	            p6.println(this.g);
	            p6.print(p4);
	            p6.print("mStateAfterAnimating=");
	            p6.println(this.h);
	        }
	        if (this.R != null) {
	            p6.print(p4);
	            p6.println("Loader Manager:");
	            this.R.a(new StringBuilder().append(p4).append("  ").toString(), p5, p6, p7);
	        }
	        if (this.z != null) {
	            p6.print(p4);
	            p6.println(new StringBuilder("Child ").append(this.z).append(":").toString());
	            this.z.a(new StringBuilder().append(p4).append("  ").toString(), p5, p6, p7);
	        }
	        return;
	    }
	
	
	    public boolean a(android.view.MenuItem p2)
	    {
	        return 0;
	    }
	
	
	    public android.view.LayoutInflater b(android.os.Bundle p4)
	    {
	        android.view.LayoutInflater v0_2 = this.y.getLayoutInflater().cloneInContext(this.y);
	        if (this.z == null) {
	            this.n();
	            if (this.f < 5) {
	                if (this.f < 4) {
	                    if (this.f < 2) {
	                        if (this.f > 0) {
	                            this.z.j();
	                        }
	                    } else {
	                        this.z.k();
	                    }
	                } else {
	                    this.z.l();
	                }
	            } else {
	                this.z.m();
	            }
	        }
	        fm.a(v0_2, this.z);
	        return v0_2;
	    }
	
	
	    final android.view.View b(android.view.LayoutInflater p3, android.view.ViewGroup p4, android.os.Bundle p5)
	    {
	        if (this.z != null) {
	            this.z.j = 0;
	        }
	        return this.a(p3, p4, p5);
	    }
	
	
	    public final void c(boolean p3)
	    {
	        if (this.A == null) {
	            this.G = 1;
	            return;
	        } else {
	            throw new IllegalStateException("Can\'t retain fragements that are nested in other fragments");
	        }
	    }
	
	
	    public void d()
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public void d(android.os.Bundle p2)
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public final void d(boolean p2)
	    {
	        if (this.I != p2) {
	            this.I = p2;
	            if ((this.f()) && (!this.E)) {
	                this.y.a_();
	            }
	        }
	        return;
	    }
	
	
	    public final android.content.res.Resources e()
	    {
	        if (this.y != null) {
	            return this.y.getResources();
	        } else {
	            throw new IllegalStateException(new StringBuilder("Fragment ").append(this).append(" not attached to Activity").toString());
	        }
	    }
	
	
	    public void e(android.os.Bundle p1)
	    {
	        return;
	    }
	
	
	    public final void e(boolean p2)
	    {
	        if (this.J != p2) {
	            this.J = p2;
	            if ((this.I) && ((this.f()) && (!this.E))) {
	                this.y.a_();
	            }
	        }
	        return;
	    }
	
	
	    public final boolean equals(Object p2)
	    {
	        return super.equals(p2);
	    }
	
	
	    public final void f(android.os.Bundle p3)
	    {
	        if (this.k < 0) {
	            this.m = p3;
	            return;
	        } else {
	            throw new IllegalStateException("Fragment already active");
	        }
	    }
	
	
	    public final void f(boolean p3)
	    {
	        if ((!this.Q) && ((p3) && (this.f < 4))) {
	            this.x.a(this);
	        }
	        t v0_3;
	        this.Q = p3;
	        if (p3) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        this.P = v0_3;
	        return;
	    }
	
	
	    public final boolean f()
	    {
	        if ((this.y == null) || (!this.q)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    final void g(android.os.Bundle p3)
	    {
	        this.e(p3);
	        if (this.z != null) {
	            android.os.Parcelable v0_2 = this.z.i();
	            if (v0_2 != null) {
	                p3.putParcelable("android:support:fragments", v0_2);
	            }
	        }
	        return;
	    }
	
	
	    public void g_()
	    {
	        this.K = 1;
	        if (!this.S) {
	            this.S = 1;
	            if (!this.T) {
	                this.T = 1;
	                this.R = this.y.a(this.l, this.S, 0);
	            }
	            if (this.R != null) {
	                this.R.b();
	            }
	        }
	        return;
	    }
	
	
	    public final ap h()
	    {
	        ar v0_4;
	        if (this.R == null) {
	            if (this.y != null) {
	                this.T = 1;
	                this.R = this.y.a(this.l, this.S, 1);
	                v0_4 = this.R;
	            } else {
	                throw new IllegalStateException(new StringBuilder("Fragment ").append(this).append(" not attached to Activity").toString());
	            }
	        } else {
	            v0_4 = this.R;
	        }
	        return v0_4;
	    }
	
	
	    public void h_()
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public final int hashCode()
	    {
	        return super.hashCode();
	    }
	
	
	    public void j()
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public void k()
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public void l()
	    {
	        this.K = 1;
	        if (!this.T) {
	            this.T = 1;
	            this.R = this.y.a(this.l, this.S, 0);
	        }
	        if (this.R != null) {
	            this.R.g();
	        }
	        return;
	    }
	
	
	    final void n()
	    {
	        this.z = new t();
	        this.z.a(this.y, new k(this), this);
	        return;
	    }
	
	
	    final void o()
	    {
	        if (this.z != null) {
	            this.z.a(2, 0);
	        }
	        if (this.S) {
	            this.S = 0;
	            if (!this.T) {
	                this.T = 1;
	                this.R = this.y.a(this.l, this.S, 0);
	            }
	            if (this.R != null) {
	                if (this.y.d) {
	                    this.R.d();
	                } else {
	                    this.R.c();
	                }
	            }
	        }
	        return;
	    }
	
	
	    public void onConfigurationChanged(android.content.res.Configuration p2)
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public void onCreateContextMenu(android.view.ContextMenu p2, android.view.View p3, android.view.ContextMenu$ContextMenuInfo p4)
	    {
	        this.y.onCreateContextMenu(p2, p3, p4);
	        return;
	    }
	
	
	    public void onLowMemory()
	    {
	        this.K = 1;
	        return;
	    }
	
	
	    public String toString()
	    {
	        String v0_1 = new StringBuilder(128);
	        a.a(this, v0_1);
	        if (this.k >= 0) {
	            v0_1.append(" #");
	            v0_1.append(this.k);
	        }
	        if (this.B != 0) {
	            v0_1.append(" id=0x");
	            v0_1.append(Integer.toHexString(this.B));
	        }
	        if (this.D != null) {
	            v0_1.append(" ");
	            v0_1.append(this.D);
	        }
	        v0_1.append(125);
	        return v0_1.toString();
	    }
	
