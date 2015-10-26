	final android.os.Handler a
	private final blp b
	private java.util.ArrayList c
	private bdf d
	private  e
	private java.lang.String f
	private java.lang.String g
	private java.lang.String h
	
	    public aus(int p3, android.os.Handler p4)
	    {
	        this.a = p4;
	        this.b = new blp("AttributeReadQueue");
	        bdf v0_3 = new java.util.ArrayList();
	        v0_3.add(avp.c);
	        if ((p3 & 2) != 0) {
	            v0_3.add(avp.d);
	        }
	        if ((p3 & 8) != 0) {
	            v0_3.add(avp.f);
	            v0_3.add(avp.o);
	            v0_3.add(avp.r);
	            v0_3.add(avp.s);
	        }
	        if ((p3 & 32) != 0) {
	            v0_3.add(avp.t);
	        }
	        if ((p3 & 128) != 0) {
	            v0_3.add(avp.e);
	            v0_3.add(avp.p);
	        }
	        if ((p3 & 4096) != 0) {
	            v0_3.add(avp.i);
	            v0_3.add(avp.q);
	            v0_3.add(avp.g);
	            v0_3.add(avp.h);
	        }
	        this.e = v0_3.size();
	        this.c = v0_3;
	        this.d = new bdf();
	        return;
	    }
	
	
	    private static String a(byte[] p6)
	    {
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        String v0_0 = 0;
	        while (v0_0 < p6.length) {
	            Object[] v4_1 = new Object[1];
	            v4_1[0] = Byte.valueOf(p6[v0_0]);
	            v2_1.add(String.format("%02X", v4_1));
	            v0_0++;
	        }
	        return android.text.TextUtils.join(":", v2_1);
	    }
	
	
	    private void a()
	    {
	        if ((this.f != null) && ((this.g != null) && (this.h != null))) {
	            this.d.U = new bcv(this.f, this.g, android.util.Base64.decode(this.h.getBytes(blj.a), 0));
	        }
	        return;
	    }
	
	
	    public final void a(auv p7)
	    {
	        this.d.P = Boolean.valueOf(0);
	        this.d.O = 1;
	        java.util.Iterator v1_3 = this.c.iterator();
	        while (v1_3.hasNext()) {
	            java.util.UUID v0_5 = ((java.util.UUID) v1_3.next());
	            if (!avp.a(v0_5)) {
	                p7.a(new awb(v0_5, new auu(this, v0_5)));
	            } else {
	                new avm(avp.b(v0_5), v0_5, new aut(this, android.os.Looper.getMainLooper(), v0_5)).a(p7);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(byte[] p8, java.util.UUID p9)
	    {
	        if (!p9.equals(avp.c)) {
	            if (!p9.equals(avp.t)) {
	                if (!p9.equals(avp.r)) {
	                    if (!p9.equals(avp.e)) {
	                        if (!p9.equals(avp.o)) {
	                            if (!p9.equals(avp.p)) {
	                                if (!p9.equals(avp.f)) {
	                                    if (!p9.equals(avp.q)) {
	                                        if (!p9.equals(avp.i)) {
	                                            if (!p9.equals(avp.g)) {
	                                                if (!p9.equals(avp.h)) {
	                                                    if (!p9.equals(avp.d)) {
	                                                        if (p9.equals(avp.s)) {
	                                                            this.d.n = new String(p8, blj.a);
	                                                        }
	                                                    } else {
	                                                        this.d.b = new String(p8, blj.a);
	                                                    }
	                                                } else {
	                                                    this.h = new String(p8, blj.a);
	                                                    this.a();
	                                                }
	                                            } else {
	                                                this.g = new String(p8, blj.a);
	                                                this.a();
	                                            }
	                                        } else {
	                                            this.f = new String(p8, blj.a);
	                                            this.a();
	                                        }
	                                    } else {
	                                        try {
	                                            String v3_9 = new org.json.JSONArray(new String(p8, blj.a));
	                                        } catch (bdf v0) {
	                                            this.a.obtainMessage(1).sendToTarget();
	                                            v3_9 = 0;
	                                        }
	                                        if ((v3_9 != null) && (v3_9.length() > 0)) {
	                                            String[] v5_1 = new String[v3_9.length()];
	                                            bdf v0_40 = 0;
	                                            while (v0_40 < v3_9.length()) {
	                                                v5_1[v0_40] = v3_9.optString(v0_40, 0);
	                                                v0_40++;
	                                            }
	                                            this.d.V = v5_1;
	                                        }
	                                    }
	                                } else {
	                                    this.d.r = new String(p8, blj.a);
	                                }
	                            } else {
	                                this.d.G = bdj.a(p8[0]);
	                            }
	                        } else {
	                            bdf v0_44 = aus.a(p8);
	                            String v3_14 = new Object[1];
	                            v3_14[0] = v0_44;
	                            this.d.a(v0_44.toString());
	                        }
	                    } else {
	                        bdf v0_47;
	                        if (p8[0] != 1) {
	                            v0_47 = 0;
	                        } else {
	                            v0_47 = 1;
	                        }
	                        this.d.E = v0_47;
	                    }
	                } else {
	                    bdf v0_48 = aus.a(p8);
	                    String v3_17 = new Object[1];
	                    v3_17[0] = v0_48;
	                    this.d.p = v0_48.toString();
	                }
	            } else {
	                String v3_20 = new java.util.ArrayList();
	                bdf v0_50 = 0;
	                while (v0_50 < p8.length) {
	                    v3_20.add(Integer.toString((p8[v0_50] & 255)));
	                    v0_50++;
	                }
	                bdf v0_52 = android.text.TextUtils.join(".", v3_20);
	                String v3_21 = new Object[1];
	                v3_21[0] = v0_52;
	                this.d.u = v0_52;
	            }
	        } else {
	            this.d.a = p8[0];
	            bdf v0_54 = new Object[1];
	            v0_54[0] = Byte.valueOf(p8[0]);
	        }
	        this.e = (this.e - 1);
	        bdf v0_57 = new Object[1];
	        v0_57[0] = this.c;
	        if (this.e == 0) {
	            this.a.obtainMessage(0, this.d).sendToTarget();
	        }
	        return;
	    }
	
