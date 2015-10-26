	private static final Ljava.lang.Class a
	private static final Ljava.lang.Class b
	private final Ljava.lang.Object c
	private final Ljava.lang.Object d
	private android.content.Context e
	private java.lang.Object f
	
	    static pm()
	    {
	        Class[] v0_1 = new Class[1];
	        v0_1[0] = android.content.Context;
	        pm.a = v0_1;
	        pm.b = v0_1;
	        return;
	    }
	
	
	    public pm(android.content.Context p3)
	    {
	        this(p3);
	        this.e = p3;
	        Object[] v0_1 = new Object[1];
	        v0_1[0] = p3;
	        this.c = v0_1;
	        this.d = this.c;
	        return;
	    }
	
	
	    static synthetic android.content.Context a(pm p1)
	    {
	        return p1.e;
	    }
	
	
	    private Object a(Object p3)
	    {
	        android.content.Context v0_0 = p3;
	        while ((!(v0_0 instanceof android.app.Activity)) && ((v0_0 instanceof android.content.ContextWrapper))) {
	            v0_0 = ((android.content.ContextWrapper) v0_0).getBaseContext();
	        }
	        return v0_0;
	    }
	
	
	    private void a(org.xmlpull.v1.XmlPullParser p11, android.util.AttributeSet p12, android.view.Menu p13)
	    {
	        po v4_1 = new po(this, p13);
	        String v0_0 = p11.getEventType();
	        String v3_0 = 0;
	        String v2_0 = 0;
	        while (v0_0 != 2) {
	            v0_0 = p11.next();
	            if (v0_0 == 1) {
	            }
	            String v1_6 = 0;
	            while (v1_6 == null) {
	                String v2_3;
	                String v1_7;
	                String v0_6;
	                switch (v0_0) {
	                    case 1:
	                        throw new RuntimeException("Unexpected end of document");
	                        break;
	                    case 2:
	                        if (v3_0 != null) {
	                            v0_6 = v1_6;
	                            v1_7 = v2_0;
	                            v2_3 = v3_0;
	                        } else {
	                            String v0_15 = p11.getName();
	                            if (!v0_15.equals("group")) {
	                                if (!v0_15.equals("item")) {
	                                    if (!v0_15.equals("menu")) {
	                                        v2_3 = 1;
	                                        v1_7 = v0_15;
	                                        v0_6 = v1_6;
	                                    } else {
	                                        this.a(p11, p12, v4_1.b());
	                                        v0_6 = v1_6;
	                                        v1_7 = v2_0;
	                                        v2_3 = v3_0;
	                                    }
	                                } else {
	                                    int v5_14 = v4_1.z.e.obtainStyledAttributes(p12, oq.ax);
	                                    v4_1.i = v5_14.getResourceId(oq.aG, 0);
	                                    v4_1.j = ((v5_14.getInt(oq.aH, v4_1.c) & -65536) | (v5_14.getInt(oq.aK, v4_1.d) & 65535));
	                                    v4_1.k = v5_14.getText(oq.aL);
	                                    v4_1.l = v5_14.getText(oq.aM);
	                                    v4_1.m = v5_14.getResourceId(oq.aF, 0);
	                                    v4_1.n = po.a(v5_14.getString(oq.aB));
	                                    v4_1.o = po.a(v5_14.getString(oq.aI));
	                                    if (!v5_14.hasValue(oq.aC)) {
	                                        v4_1.p = v4_1.e;
	                                    } else {
	                                        String v0_42;
	                                        if (!v5_14.getBoolean(oq.aC, 0)) {
	                                            v0_42 = 0;
	                                        } else {
	                                            v0_42 = 1;
	                                        }
	                                        v4_1.p = v0_42;
	                                    }
	                                    String v0_60;
	                                    v4_1.q = v5_14.getBoolean(oq.aD, 0);
	                                    v4_1.r = v5_14.getBoolean(oq.aN, v4_1.f);
	                                    v4_1.s = v5_14.getBoolean(oq.aE, v4_1.g);
	                                    v4_1.t = v5_14.getInt(oq.aO, -1);
	                                    v4_1.x = v5_14.getString(oq.aJ);
	                                    v4_1.u = v5_14.getResourceId(oq.ay, 0);
	                                    v4_1.v = v5_14.getString(oq.aA);
	                                    v4_1.w = v5_14.getString(oq.az);
	                                    if (v4_1.w == null) {
	                                        v0_60 = 0;
	                                    } else {
	                                        v0_60 = 1;
	                                    }
	                                    if ((v0_60 == null) || ((v4_1.u != 0) || (v4_1.v != null))) {
	                                        if (v0_60 != null) {
	                                            android.util.Log.w("SupportMenuInflater", "Ignoring attribute \'actionProviderClass\'. Action view already specified.");
	                                        }
	                                        v4_1.y = 0;
	                                    } else {
	                                        v4_1.y = ((fb) v4_1.a(v4_1.w, pm.b, v4_1.z.d));
	                                    }
	                                    v5_14.recycle();
	                                    v4_1.h = 0;
	                                    v0_6 = v1_6;
	                                    v1_7 = v2_0;
	                                    v2_3 = v3_0;
	                                }
	                            } else {
	                                String v0_69 = v4_1.z.e.obtainStyledAttributes(p12, oq.aq);
	                                v4_1.b = v0_69.getResourceId(oq.at, 0);
	                                v4_1.c = v0_69.getInt(oq.au, 0);
	                                v4_1.d = v0_69.getInt(oq.av, 0);
	                                v4_1.e = v0_69.getInt(oq.ar, 0);
	                                v4_1.f = v0_69.getBoolean(oq.aw, 1);
	                                v4_1.g = v0_69.getBoolean(oq.as, 1);
	                                v0_69.recycle();
	                                v0_6 = v1_6;
	                                v1_7 = v2_0;
	                                v2_3 = v3_0;
	                            }
	                        }
	                        break;
	                    case 3:
	                        String v0_4 = p11.getName();
	                        if ((v3_0 == null) || (!v0_4.equals(v2_0))) {
	                            if (!v0_4.equals("group")) {
	                                if (!v0_4.equals("item")) {
	                                    if (!v0_4.equals("menu")) {
	                                    } else {
	                                        v0_6 = 1;
	                                        v1_7 = v2_0;
	                                        v2_3 = v3_0;
	                                    }
	                                } else {
	                                    if (v4_1.h) {
	                                    } else {
	                                        if ((v4_1.y == null) || (!v4_1.y.f())) {
	                                            v4_1.h = 1;
	                                            v4_1.a(v4_1.a.add(v4_1.b, v4_1.i, v4_1.j, v4_1.k));
	                                            v0_6 = v1_6;
	                                            v1_7 = v2_0;
	                                            v2_3 = v3_0;
	                                        } else {
	                                            v4_1.b();
	                                            v0_6 = v1_6;
	                                            v1_7 = v2_0;
	                                            v2_3 = v3_0;
	                                        }
	                                    }
	                                }
	                            } else {
	                                v4_1.a();
	                                v0_6 = v1_6;
	                                v1_7 = v2_0;
	                                v2_3 = v3_0;
	                            }
	                        } else {
	                            v2_3 = 0;
	                            v1_7 = 0;
	                            v0_6 = v1_6;
	                        }
	                        break;
	                    default:
	                }
	                v0_0 = p11.next();
	                v3_0 = v2_3;
	                v2_0 = v1_7;
	                v1_6 = v0_6;
	            }
	            return;
	        }
	        String v0_1 = p11.getName();
	        if (!v0_1.equals("menu")) {
	            throw new RuntimeException(new StringBuilder("Expecting menu, got ").append(v0_1).toString());
	        } else {
	            v0_0 = p11.next();
	        }
	    }
	
	
	    static synthetic Class[] a()
	    {
	        return pm.a;
	    }
	
	
	    static synthetic Object b(pm p1)
	    {
	        if (p1.f == null) {
	            p1.f = p1.a(p1.e);
	        }
	        return p1.f;
	    }
	
	
	    static synthetic Object[] c(pm p1)
	    {
	        return p1.c;
	    }
	
	
	    public final void inflate(int p5, android.view.Menu p6)
	    {
	        if ((p6 instanceof cc)) {
	            try {
	                android.content.res.XmlResourceParser v1 = this.e.getResources().getLayout(p5);
	                this.a(v1, android.util.Xml.asAttributeSet(v1), p6);
	            } catch (java.io.IOException v0_5) {
	                throw new android.view.InflateException("Error inflating menu XML", v0_5);
	            } catch (java.io.IOException v0_6) {
	                if (v1 != null) {
	                    v1.close();
	                }
	                throw v0_6;
	            } catch (java.io.IOException v0_4) {
	                throw new android.view.InflateException("Error inflating menu XML", v0_4);
	            }
	            if (v1 != null) {
	                v1.close();
	            }
	        } else {
	            super.inflate(p5, p6);
	        }
	        return;
	    }
	
