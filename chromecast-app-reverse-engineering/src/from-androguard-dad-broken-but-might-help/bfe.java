	private static final Ljava.lang.Object b
	public bff a
	private Lbfd c
	private bfd d
	private final blp e
	
	    static bfe()
	    {
	        Void[] v0_1 = new Void[0];
	        bfe.b = v0_1;
	        return;
	    }
	
	
	    public varargs bfe(bfd[] p4)
	    {
	        this.c = p4;
	        this.e = new blp("NetworkTask", 0);
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 11) {
	            reflect.InvocationTargetException v0_7 = new Void[0];
	            super.execute(v0_7);
	        } else {
	            try {
	                reflect.InvocationTargetException v0_1 = this.getClass();
	                String v2_1 = new Class[2];
	                v2_1[0] = java.util.concurrent.Executor;
	                v2_1[1] = Object[];
	                reflect.InvocationTargetException v0_2 = v0_1.getMethod("executeOnExecutor", v2_1);
	                blp v1_3 = new Object[2];
	                v1_3[0] = bfe.THREAD_POOL_EXECUTOR;
	                v1_3[1] = bfe.b;
	                v0_2.invoke(this, v1_3);
	            } catch (reflect.InvocationTargetException v0_3) {
	                Object[] v3_4 = new Object[0];
	                this.e.b(v0_3, "reflection failed", v3_4);
	            } catch (reflect.InvocationTargetException v0_6) {
	                Object[] v3_7 = new Object[0];
	                this.e.b(v0_6, "reflection failed", v3_7);
	            } catch (reflect.InvocationTargetException v0_4) {
	                Object[] v3_5 = new Object[0];
	                this.e.b(v0_4, "reflection failed", v3_5);
	            } catch (reflect.InvocationTargetException v0_5) {
	                Object[] v3_6 = new Object[0];
	                this.e.b(v0_5, "reflection failed", v3_6);
	            }
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        if (this.d != null) {
	            bfq v0_1 = this.d;
	            v0_1.f = 1;
	            if (v0_1.d != null) {
	                v0_1.d.a();
	            }
	        }
	        super.cancel(1);
	        return;
	    }
	
	
	    protected final synthetic Object doInBackground(Object[] p6)
	    {
	        int v0_0 = 0;
	        bfd[] v2 = this.c;
	        int v3 = v2.length;
	        int v1_0 = 0;
	        while (v1_0 < v3) {
	            if (!this.isCancelled()) {
	                this.d = v2[v1_0];
	                v0_0 = this.d.a();
	                if (v0_0 != 0) {
	                    break;
	                }
	                v1_0++;
	            } else {
	                v0_0 = -99;
	                break;
	            }
	        }
	        this.d = 0;
	        return Integer.valueOf(v0_0);
	    }
	
	
	    protected final synthetic void onCancelled(Object p2)
	    {
	        if (this.a != null) {
	            this.a.b();
	        }
	        return;
	    }
	
	
	    protected final synthetic void onPostExecute(Object p3)
	    {
	        bff v0_1 = new Object[1];
	        v0_1[0] = ((Integer) p3);
	        if (this.a != null) {
	            switch (((Integer) p3).intValue()) {
	                case -99:
	                    this.a.b();
	                    break;
	                case 0:
	                    this.a.a();
	                    break;
	                default:
	                    this.a.a(((Integer) p3).intValue());
	            }
	        }
	        return;
	    }
	
