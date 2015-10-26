	public final java.lang.String a
	public final aph b
	public  c
	public java.util.HashMap d
	
	    public azg(String p1, boolean p2, aph p3)
	    {
	        this.a = p1;
	        this.c = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    static synthetic void a(azg p9, apd p10, int p11)
	    {
	        ape v6 = ape.a();
	        if (p10 != null) {
	            v6.a(p10.a(p11));
	        }
	        if (p9.d != null) {
	            java.util.Iterator v7 = p9.d.keySet().iterator();
	            aph v1_0 = 0;
	            while (v7.hasNext()) {
	                apd v0_12 = ((String) v7.next());
	                if (!v0_12.equals("friendly_name")) {
	                    if (!v0_12.equals("timezone")) {
	                        if (!v0_12.equals("locale")) {
	                            if (!v0_12.equals("opt_in_opencast")) {
	                                if (v0_12.equals("opt_in_stats")) {
	                                    java.util.HashMap v4_13;
	                                    if (!p9.c) {
	                                        v4_13 = 56;
	                                    } else {
	                                        v4_13 = 154;
	                                    }
	                                    apd v0_16;
	                                    apd v8_1 = new apd(v4_13);
	                                    v8_1.h = p9.b;
	                                    if (!((Boolean) p9.d.get(v0_12)).booleanValue()) {
	                                        v0_16 = 0;
	                                    } else {
	                                        v0_16 = 1;
	                                    }
	                                    v6.a(v8_1.a(v0_16));
	                                }
	                            } else {
	                                java.util.HashMap v4_17;
	                                if (!p9.c) {
	                                    v4_17 = 72;
	                                } else {
	                                    v4_17 = 107;
	                                }
	                                apd v0_21;
	                                apd v8_3 = new apd(v4_17);
	                                v8_3.h = p9.b;
	                                if (!((Boolean) p9.d.get(v0_12)).booleanValue()) {
	                                    v0_21 = 0;
	                                } else {
	                                    v0_21 = 1;
	                                }
	                                v6.a(v8_3.a(v0_21));
	                            }
	                        } else {
	                            apd v0_24;
	                            if (!p9.c) {
	                                v0_24 = 39;
	                            } else {
	                                v0_24 = 27;
	                            }
	                            java.util.HashMap v4_21 = new apd(v0_24);
	                            v4_21.h = p9.b;
	                            v6.a(v4_21);
	                        }
	                    } else {
	                        apd v0_27;
	                        if (!p9.c) {
	                            v0_27 = 38;
	                        } else {
	                            v0_27 = 26;
	                        }
	                        java.util.HashMap v4_23 = new apd(v0_27);
	                        v4_23.h = p9.b;
	                        v6.a(v4_23);
	                    }
	                } else {
	                    v1_0 = 1;
	                }
	            }
	            apd v0_6;
	            if (!p9.c) {
	                v0_6 = 37;
	            } else {
	                v0_6 = 25;
	            }
	            java.util.HashMap v4_1 = new apd(v0_6, Integer.valueOf(v1_0));
	            v4_1.h = p9.b;
	            v6.a(v4_1);
	            if ((p9.c) && (p11 == 1)) {
	                apd v0_10 = new apd(147, Integer.valueOf(0));
	                v0_10.h = p9.b;
	                v6.a(v0_10);
	            }
	        } else {
	            if (p9.c) {
	                apd v0_31 = new apd(25, Integer.valueOf(0));
	                v0_31.h = p9.b;
	                v6.a(v0_31);
	            }
	        }
	        return;
	    }
	
	
	    private static boolean a(bdf p1)
	    {
	        if ((!bfl.a(p1)) || (p1.w)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final String a()
	    {
	        return ((String) this.d.get("friendly_name"));
	    }
	
	
	    void a(bdu p3, bdf p4, bdj p5, apd p6, bdn p7)
	    {
	        p3.a(this.d, p4, new azi(this, p6, p7, p5));
	        return;
	    }
	
	
	    public final void a(bdu p8, bdf p9, bdn p10)
	    {
	        bfl v4_1;
	        if (azg.a(p9)) {
	            aph v0_2;
	            if (!this.c) {
	                v0_2 = 46;
	            } else {
	                v0_2 = 24;
	            }
	            v4_1 = new apd(v0_2);
	            v4_1.h = this.b;
	        } else {
	            v4_1 = 0;
	        }
	        if (!azg.a(p9)) {
	            this.a(p8, p9, 0, v4_1, p10);
	        } else {
	            aph v0_7 = new azh(this, p8, p9, v4_1, p10);
	            bdf v2_2 = p8.d();
	            bfl v4_3 = new bfl(p8.d);
	            p8.a("saveWifi", v2_2, v4_3, p8.e, new beg(p8, v0_7, v4_3));
	        }
	        return;
	    }
	
	
	    public final void a(String p2, Object p3)
	    {
	        this.d.put(p2, p3);
	        return;
	    }
	
