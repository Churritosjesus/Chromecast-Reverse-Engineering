	private final dkd a
	private final  b
	private final dis c
	
	    diz(dkd p3, boolean p4)
	    {
	        this.a = p3;
	        this.c = new dis(this.a);
	        this.b = p4;
	        return;
	    }
	
	
	    private static varargs java.io.IOException a(String p2, Object[] p3)
	    {
	        throw new java.io.IOException(String.format(p2, p3));
	    }
	
	
	    private void a(dic p10, int p11, int p12)
	    {
	        Integer v0_0 = 1;
	        int v3 = this.a.i();
	        if (p12 == ((v3 * 8) + 4)) {
	            dix v4_1 = new dix();
	            int v2_3 = 0;
	            while (v2_3 < v3) {
	                int v5_1 = this.a.i();
	                v4_1.a((v5_1 & 16777215), ((-16777216 & v5_1) >> 24), this.a.i());
	                v2_3++;
	            }
	            if ((p11 & 1) == 0) {
	                v0_0 = 0;
	            }
	            p10.a(v0_0, v4_1);
	            return;
	        } else {
	            dix v4_3 = new Object[2];
	            v4_3[0] = Integer.valueOf(p12);
	            v4_3[1] = Integer.valueOf(v3);
	            throw diz.a("TYPE_SETTINGS length: %d != 4 + 8 * %d", v4_3);
	        }
	    }
	
	
	    public final void a()
	    {
	        return;
	    }
	
	
	    public final boolean a(dic p10)
	    {
	        int v1_0 = 0;
	        int v6 = 1;
	        try {
	            int v0_4;
	            Long v2_0 = this.a.i();
	            Object[] v3_0 = this.a.i();
	        } catch (int v0) {
	            v6 = 0;
	            return v6;
	        }
	        if ((-2147483648 & v2_0) == 0) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        dif v5_0 = ((-16777216 & v3_0) >> 24);
	        Object[] v4_3 = (16777215 & v3_0);
	        if (v0_4 == 0) {
	            if ((v5_0 & 1) != 0) {
	                v1_0 = 1;
	            }
	            p10.a(v1_0, (v2_0 & 2147483647), this.a, v4_3);
	            return v6;
	        } else {
	            int v0_8 = ((2147418112 & v2_0) >> 16);
	            if (v0_8 == 3) {
	                switch ((v2_0 & 65535)) {
	                    case 1:
	                        Long v2_26;
	                        int v0_47 = this.a.i();
	                        this.a.i();
	                        Object[] v3_14 = (v0_47 & 2147483647);
	                        this.a.h();
	                        Object[] v4_9 = this.c.a((v4_3 - 10));
	                        if ((v5_0 & 1) == 0) {
	                            v2_26 = 0;
	                        } else {
	                            v2_26 = 1;
	                        }
	                        if ((v5_0 & 2) != 0) {
	                            v1_0 = 1;
	                        }
	                        p10.a(v1_0, v2_26, v3_14, v4_9, dif.a);
	                        return v6;
	                    case 2:
	                        Long v2_23;
	                        Object[] v3_13 = (this.a.i() & 2147483647);
	                        Object[] v4_8 = this.c.a((v4_3 - 4));
	                        if ((v5_0 & 1) == 0) {
	                            v2_23 = 0;
	                        } else {
	                            v2_23 = 1;
	                        }
	                        p10.a(0, v2_23, v3_13, v4_8, dif.b);
	                        return v6;
	                    case 3:
	                        if (v4_3 == 8) {
	                            int v0_36 = (this.a.i() & 2147483647);
	                            Long v2_19 = this.a.i();
	                            Object[] v3_10 = dia.a(v2_19);
	                            if (v3_10 != null) {
	                                p10.a(v0_36, v3_10);
	                                return v6;
	                            } else {
	                                Object[] v3_11 = new Object[1];
	                                v3_11[0] = Integer.valueOf(v2_19);
	                                throw diz.a("TYPE_RST_STREAM unexpected error code: %d", v3_11);
	                            }
	                        } else {
	                            Long v2_21 = new Object[1];
	                            v2_21[0] = Integer.valueOf(v4_3);
	                            throw diz.a("TYPE_RST_STREAM length: %d != 8", v2_21);
	                        }
	                    case 4:
	                        this.a(p10, v5_0, v4_3);
	                        return v6;
	                    case 5:
	                    default:
	                        this.a.f(((long) v4_3));
	                        return v6;
	                    case 6:
	                        if (v4_3 == 4) {
	                            int v0_30;
	                            Long v2_16 = this.a.i();
	                            if ((v2_16 & 1) != 1) {
	                                v0_30 = 0;
	                            } else {
	                                v0_30 = 1;
	                            }
	                            int v0_31;
	                            if (this.b != v0_30) {
	                                v0_31 = 0;
	                            } else {
	                                v0_31 = 1;
	                            }
	                            p10.a(v0_31, v2_16, 0);
	                            return v6;
	                        } else {
	                            Long v2_17 = new Object[1];
	                            v2_17[0] = Integer.valueOf(v4_3);
	                            throw diz.a("TYPE_PING length: %d != 4", v2_17);
	                        }
	                    case 7:
	                        if (v4_3 == 8) {
	                            int v0_22 = (this.a.i() & 2147483647);
	                            Long v2_13 = this.a.i();
	                            if (dia.c(v2_13) != null) {
	                                p10.a(v0_22, dke.a);
	                                return v6;
	                            } else {
	                                Object[] v3_6 = new Object[1];
	                                v3_6[0] = Integer.valueOf(v2_13);
	                                throw diz.a("TYPE_GOAWAY unexpected error code: %d", v3_6);
	                            }
	                        } else {
	                            Long v2_15 = new Object[1];
	                            v2_15[0] = Integer.valueOf(v4_3);
	                            throw diz.a("TYPE_GOAWAY length: %d != 8", v2_15);
	                        }
	                    case 8:
	                        p10.a(0, 0, (this.a.i() & 2147483647), this.c.a((v4_3 - 4)), dif.c);
	                        return v6;
	                    case 9:
	                        if (v4_3 == 8) {
	                            int v0_10 = this.a.i();
	                            Long v2_7 = ((long) (this.a.i() & 2147483647));
	                            if (v2_7 != 0) {
	                                p10.a((v0_10 & 2147483647), v2_7);
	                                return v6;
	                            } else {
	                                Object[] v4_6 = new Object[1];
	                                v4_6[0] = Long.valueOf(v2_7);
	                                throw diz.a("windowSizeIncrement was 0", v4_6);
	                            }
	                        } else {
	                            Long v2_9 = new Object[1];
	                            v2_9[0] = Integer.valueOf(v4_3);
	                            throw diz.a("TYPE_WINDOW_UPDATE length: %d != 8", v2_9);
	                        }
	                }
	            } else {
	                throw new java.net.ProtocolException(new StringBuilder("version != 3: ").append(v0_8).toString());
	            }
	        }
	    }
	
	
	    public final void close()
	    {
	        this.c.b.close();
	        return;
	    }
	
