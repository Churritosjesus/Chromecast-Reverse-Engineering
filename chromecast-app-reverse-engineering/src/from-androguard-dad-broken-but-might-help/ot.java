	private static Ljava.lang.Class a
	private static final java.util.Map b
	private final Ljava.lang.Object c
	
	    static ot()
	    {
	        ed v0_1 = new Class[2];
	        v0_1[0] = android.content.Context;
	        v0_1[1] = android.util.AttributeSet;
	        ot.a = v0_1;
	        ot.b = new ed();
	        return;
	    }
	
	
	    public ot()
	    {
	        Object[] v0_1 = new Object[2];
	        this.c = v0_1;
	        return;
	    }
	
	
	    public static android.content.Context a(android.content.Context p3, android.util.AttributeSet p4, boolean p5, boolean p6)
	    {
	        pi v0_1;
	        android.content.res.TypedArray v2 = p3.obtainStyledAttributes(p4, oq.cw, 0, 0);
	        if (!p5) {
	            v0_1 = 0;
	        } else {
	            v0_1 = v2.getResourceId(oq.cx, 0);
	        }
	        if ((!p6) || (v0_1 != null)) {
	            int v1_1 = v0_1;
	        } else {
	            v1_1 = v2.getResourceId(oq.cy, 0);
	        }
	        v2.recycle();
	        if ((v1_1 != 0) && ((!(p3 instanceof pi)) || (((pi) p3).a != v1_1))) {
	            p3 = new pi(p3, v1_1);
	        }
	        return p3;
	    }
	
	
	    private android.view.View a(android.content.Context p3, String p4, String p5)
	    {
	        reflect.Constructor v0_2 = ((reflect.Constructor) ot.b.get(p4));
	        try {
	            if (v0_2 != null) {
	                v0_2.setAccessible(1);
	                reflect.Constructor v0_11 = ((android.view.View) v0_2.newInstance(this.c));
	            } else {
	                reflect.Constructor v0_3;
	                java.util.Map v1_0 = p3.getClassLoader();
	                if (p5 == null) {
	                    v0_3 = p4;
	                } else {
	                    v0_3 = new StringBuilder().append(p5).append(p4).toString();
	                }
	                v0_2 = v1_0.loadClass(v0_3).asSubclass(android.view.View).getConstructor(ot.a);
	                ot.b.put(p4, v0_2);
	            }
	        } catch (reflect.Constructor v0) {
	            v0_11 = 0;
	        }
	        return v0_11;
	    }
	
	
	    public android.view.View a(android.content.Context p6, String p7, android.util.AttributeSet p8)
	    {
	        if (p7.equals("view")) {
	            p7 = p8.getAttributeValue(0, "class");
	        }
	        try {
	            android.view.View v0_7;
	            this.c[0] = p6;
	            this.c[1] = p8;
	        } catch (android.view.View v0) {
	            this.c[0] = 0;
	            this.c[1] = 0;
	            v0_7 = 0;
	            return v0_7;
	        } catch (android.view.View v0_10) {
	            this.c[0] = 0;
	            this.c[1] = 0;
	            throw v0_10;
	        }
	        if (-1 != p7.indexOf(46)) {
	            v0_7 = this.a(p6, p7, 0);
	            this.c[0] = 0;
	            this.c[1] = 0;
	            return v0_7;
	        } else {
	            v0_7 = this.a(p6, p7, "android.widget.");
	            this.c[0] = 0;
	            this.c[1] = 0;
	            return v0_7;
	        }
	    }
	
