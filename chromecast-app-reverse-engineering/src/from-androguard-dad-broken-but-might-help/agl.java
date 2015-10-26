	private static final java.lang.String a
	private static java.lang.reflect.Method b
	private final java.net.HttpURLConnection c
	private final agm d
	private java.lang.Exception e
	
	    static agl()
	    {
	        agl.a = agl.getCanonicalName();
	        reflect.Method[] v2 = android.os.AsyncTask.getMethods();
	        int v3 = v2.length;
	        int v0_3 = 0;
	        while (v0_3 < v3) {
	            reflect.Method v4 = v2[v0_3];
	            if ("executeOnExecutor".equals(v4.getName())) {
	                boolean v5_2 = v4.getParameterTypes();
	                if ((v5_2.length == 2) && ((v5_2[0] == java.util.concurrent.Executor) && (v5_2[1].isArray()))) {
	                    agl.b = v4;
	                    break;
	                }
	            }
	            v0_3++;
	        }
	        return;
	    }
	
	
	    public agl(agm p2)
	    {
	        this(0, p2);
	        return;
	    }
	
	
	    private agl(java.net.HttpURLConnection p2, agm p3)
	    {
	        this.d = p3;
	        this.c = 0;
	        return;
	    }
	
	
	    private varargs java.util.List b()
	    {
	        try {
	            java.util.List v0_2;
	            if (this.c != null) {
	                v0_2 = aga.a(this.c, this.d);
	            } else {
	                v0_2 = aga.a(this.d);
	            }
	        } catch (java.util.List v0_4) {
	            this.e = v0_4;
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    final agl a()
	    {
	        if (agl.b == null) {
	            IllegalAccessException v0_1 = new Void[0];
	            this.execute(v0_1);
	        } else {
	            try {
	                Object[] v1_2 = new Object[2];
	                v1_2[0] = afv.d();
	                v1_2[1] = 0;
	                agl.b.invoke(this, v1_2);
	            } catch (IllegalAccessException v0) {
	            } catch (IllegalAccessException v0) {
	            }
	        }
	        return this;
	    }
	
	
	    protected synthetic Object doInBackground(Object[] p2)
	    {
	        return this.b();
	    }
	
	
	    protected synthetic void onPostExecute(Object p5)
	    {
	        super.onPostExecute(((java.util.List) p5));
	        if (this.e != null) {
	            Object[] v1_1 = new Object[1];
	            v1_1[0] = this.e.getMessage();
	            String.format("onPostExecute: exception encountered during request: %s", v1_1);
	        }
	        return;
	    }
	
	
	    protected void onPreExecute()
	    {
	        super.onPreExecute();
	        if (this.d.a == null) {
	            this.d.a = new android.os.Handler();
	        }
	        return;
	    }
	
	
	    public String toString()
	    {
	        return new StringBuilder("{RequestAsyncTask: ").append(" connection: ").append(this.c).append(", requests: ").append(this.d).append("}").toString();
	    }
	
