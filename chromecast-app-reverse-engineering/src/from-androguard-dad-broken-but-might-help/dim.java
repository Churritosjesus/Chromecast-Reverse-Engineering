	private final dkd a
	private final dik b
	private final  c
	private dih d
	
	    dim(dkd p4, int p5, boolean p6)
	    {
	        this.a = p4;
	        this.c = p6;
	        this.b = new dik(this.a);
	        this.d = new dih(4096, this.b);
	        return;
	    }
	
	
	    private java.util.List a(int p9, short p10, byte p11, int p12)
	    {
	        String v0_0 = this.b;
	        this.b.d = p9;
	        v0_0.a = p9;
	        this.b.e = p10;
	        this.b.b = p11;
	        this.b.c = p12;
	        String v0_4 = this.d;
	        while (!v0_4.b.e()) {
	            dke v1_7 = (v0_4.b.g() & 255);
	            if (v1_7 != 128) {
	                if ((v1_7 & 128) != 128) {
	                    if (v1_7 != 64) {
	                        if ((v1_7 & 64) != 64) {
	                            if ((v1_7 & 32) != 32) {
	                                if ((v1_7 != 16) && (v1_7 != null)) {
	                                    v0_4.a.add(new die(v0_4.b((v0_4.a(v1_7, 15) - 1)), v0_4.b()));
	                                } else {
	                                    v0_4.a.add(new die(dig.a(v0_4.b()), v0_4.b()));
	                                }
	                            } else {
	                                v0_4.d = v0_4.a(v1_7, 31);
	                                if ((v0_4.d >= 0) && (v0_4.d <= v0_4.c)) {
	                                    v0_4.a();
	                                } else {
	                                    throw new java.io.IOException(new StringBuilder("Invalid dynamic table size update ").append(v0_4.d).toString());
	                                }
	                            }
	                        } else {
	                            v0_4.a(-1, new die(v0_4.b((v0_4.a(v1_7, 63) - 1)), v0_4.b()));
	                        }
	                    } else {
	                        v0_4.a(-1, new die(dig.a(v0_4.b()), v0_4.b()));
	                    }
	                } else {
	                    dke v1_24 = (v0_4.a(v1_7, 127) - 1);
	                    if (!dih.c(v1_24)) {
	                        dke v2_20 = v0_4.a((v1_24 - dig.a().length));
	                        if ((v2_20 >= null) && (v2_20 <= (v0_4.e.length - 1))) {
	                            v0_4.a.add(v0_4.e[v2_20]);
	                        } else {
	                            throw new java.io.IOException(new StringBuilder("Header index too large ").append((v1_24 + 1)).toString());
	                        }
	                    } else {
	                        v0_4.a.add(dig.a()[v1_24]);
	                    }
	                }
	            } else {
	                throw new java.io.IOException("index == 0");
	            }
	        }
	        String v0_5 = this.d;
	        dke v1_4 = new java.util.ArrayList(v0_5.a);
	        v0_5.a.clear();
	        return v1_4;
	    }
	
	
	    private void a(dic p2, int p3)
	    {
	        this.a.i();
	        this.a.g();
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (!this.c) {
	            java.io.IOException v0_2 = this.a.c(((long) dij.a().b.length));
	            if (dij.b().isLoggable(java.util.logging.Level.FINE)) {
	                String v1_5 = dij.b();
	                Object[] v3 = new Object[1];
	                v3[0] = v0_2.b();
	                v1_5.fine(String.format("<< CONNECTION %s", v3));
	            }
	            if (!dij.a().equals(v0_2)) {
	                Object[] v2_4 = new Object[1];
	                v2_4[0] = v0_2.a();
	                throw dij.a("Expected a connection header but was %s", v2_4);
	            }
	        }
	        return;
	    }
	
	
	    public final boolean a(dic p12)
	    {
	        int v6 = 1;
	        Object[] v1_0 = 0;
	        try {
	            this.a.a(9);
	            java.io.IOException v0_2 = dij.a(this.a);
	        } catch (java.io.IOException v0) {
	            v6 = 0;
	            return v6;
	        }
	        if ((v0_2 >= null) && (v0_2 <= 16384)) {
	            Object[] v2_3 = ((byte) this.a.g());
	            dif v5_0 = ((byte) this.a.g());
	            Integer v3_4 = (this.a.i() & 2147483647);
	            if (dij.b().isLoggable(java.util.logging.Level.FINE)) {
	                dij.b().fine(dil.a(1, v3_4, v0_2, v2_3, v5_0));
	            }
	            switch (v2_3) {
	                case 0:
	                    java.util.List v4_12;
	                    if ((v5_0 & 1) == 0) {
	                        v4_12 = 0;
	                    } else {
	                        v4_12 = 1;
	                    }
	                    Object[] v2_34;
	                    if ((v5_0 & 32) == 0) {
	                        v2_34 = 0;
	                    } else {
	                        v2_34 = 1;
	                    }
	                    if (v2_34 == null) {
	                        if ((v5_0 & 8) != 0) {
	                            v1_0 = ((short) (this.a.g() & 255));
	                        }
	                        p12.a(v4_12, v3_4, this.a, dij.a(v0_2, v5_0, v1_0));
	                        this.a.f(((long) v1_0));
	                        return v6;
	                    } else {
	                        Object[] v1_18 = new Object[0];
	                        throw dij.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", v1_18);
	                    }
	                case 1:
	                    if (v3_4 != null) {
	                        Object[] v2_31;
	                        if ((v5_0 & 1) == 0) {
	                            v2_31 = 0;
	                        } else {
	                            v2_31 = 1;
	                        }
	                        java.util.List v4_7;
	                        if ((v5_0 & 8) == 0) {
	                            v4_7 = 0;
	                        } else {
	                            v4_7 = ((short) (this.a.g() & 255));
	                        }
	                        if ((v5_0 & 32) != 0) {
	                            this.a(p12, v3_4);
	                            v0_2 -= 5;
	                        }
	                        p12.a(0, v2_31, v3_4, this.a(dij.a(v0_2, v5_0, v4_7), v4_7, v5_0, v3_4), dif.d);
	                        return v6;
	                    } else {
	                        Object[] v1_14 = new Object[0];
	                        throw dij.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", v1_14);
	                    }
	                case 2:
	                    if (v0_2 == 5) {
	                        if (v3_4 != null) {
	                            this.a(p12, v3_4);
	                            return v6;
	                        } else {
	                            Object[] v1_13 = new Object[0];
	                            throw dij.a("TYPE_PRIORITY streamId == 0", v1_13);
	                        }
	                    } else {
	                        Integer v3_19 = new Object[1];
	                        v3_19[0] = Integer.valueOf(v0_2);
	                        throw dij.a("TYPE_PRIORITY length: %d != 5", v3_19);
	                    }
	                case 3:
	                    if (v0_2 == 4) {
	                        if (v3_4 != null) {
	                            java.io.IOException v0_47 = this.a.i();
	                            Object[] v2_25 = dia.b(v0_47);
	                            if (v2_25 != null) {
	                                p12.a(v3_4, v2_25);
	                                return v6;
	                            } else {
	                                Integer v3_17 = new Object[1];
	                                v3_17[0] = Integer.valueOf(v0_47);
	                                throw dij.a("TYPE_RST_STREAM unexpected error code: %d", v3_17);
	                            }
	                        } else {
	                            Object[] v1_12 = new Object[0];
	                            throw dij.a("TYPE_RST_STREAM streamId == 0", v1_12);
	                        }
	                    } else {
	                        Integer v3_18 = new Object[1];
	                        v3_18[0] = Integer.valueOf(v0_2);
	                        throw dij.a("TYPE_RST_STREAM length: %d != 4", v3_18);
	                    }
	                case 4:
	                    if (v3_4 == null) {
	                        if ((v5_0 & 1) == 0) {
	                            if ((v0_2 % 6) == 0) {
	                                dif v5_2 = new dix();
	                                Integer v3_13 = 0;
	                                while (v3_13 < v0_2) {
	                                    Object[] v2_20 = this.a.h();
	                                    int v7_5 = this.a.i();
	                                    switch (v2_20) {
	                                        case 1:
	                                        case 6:
	                                            break;
	                                        case 2:
	                                            if ((v7_5 == 0) || (v7_5 == 1)) {
	                                            } else {
	                                                Object[] v1_9 = new Object[0];
	                                                throw dij.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", v1_9);
	                                            }
	                                            break;
	                                        case 3:
	                                            v2_20 = 4;
	                                            break;
	                                        case 4:
	                                            v2_20 = 7;
	                                            if (v7_5 >= 0) {
	                                            } else {
	                                                Object[] v1_8 = new Object[0];
	                                                throw dij.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", v1_8);
	                                            }
	                                            break;
	                                        case 5:
	                                            if ((v7_5 < 16384) || (v7_5 > 16777215)) {
	                                                Object[] v2_21 = new Object[1];
	                                                v2_21[0] = Integer.valueOf(v7_5);
	                                                throw dij.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", v2_21);
	                                            } else {
	                                            }
	                                            break;
	                                        case 1:
	                                        case 6:
	                                            break;
	                                        default:
	                                            Integer v3_15 = new Object[1];
	                                            v3_15[0] = Short.valueOf(v2_20);
	                                            throw dij.a("PROTOCOL_ERROR invalid settings id: %s", v3_15);
	                                    }
	                                    v5_2.a(v2_20, 0, v7_5);
	                                    v3_13 += 6;
	                                }
	                                p12.a(0, v5_2);
	                                if (v5_2.a() < 0) {
	                                    return v6;
	                                } else {
	                                    java.io.IOException v0_31 = this.d;
	                                    Object[] v1_7 = v5_2.a();
	                                    v0_31.c = v1_7;
	                                    v0_31.d = v1_7;
	                                    v0_31.a();
	                                    return v6;
	                                }
	                            } else {
	                                Integer v3_16 = new Object[1];
	                                v3_16[0] = Integer.valueOf(v0_2);
	                                throw dij.a("TYPE_SETTINGS length %% 6 != 0: %s", v3_16);
	                            }
	                        } else {
	                            if (v0_2 == null) {
	                                return v6;
	                            } else {
	                                Object[] v1_10 = new Object[0];
	                                throw dij.a("FRAME_SIZE_ERROR ack frame should be empty!", v1_10);
	                            }
	                        }
	                    } else {
	                        Object[] v1_11 = new Object[0];
	                        throw dij.a("TYPE_SETTINGS streamId != 0", v1_11);
	                    }
	                case 5:
	                    if (v3_4 != null) {
	                        if ((v5_0 & 8) != 0) {
	                            v1_0 = ((short) (this.a.g() & 255));
	                        }
	                        p12.a((this.a.i() & 2147483647), this.a(dij.a((v0_2 - 4), v5_0, v1_0), v1_0, v5_0, v3_4));
	                        return v6;
	                    } else {
	                        Object[] v1_6 = new Object[0];
	                        throw dij.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", v1_6);
	                    }
	                case 6:
	                    if (v0_2 == 8) {
	                        if (v3_4 == null) {
	                            java.io.IOException v0_20 = this.a.i();
	                            Object[] v2_11 = this.a.i();
	                            if ((v5_0 & 1) != 0) {
	                                v1_0 = 1;
	                            }
	                            p12.a(v1_0, v0_20, v2_11);
	                            return v6;
	                        } else {
	                            Object[] v1_2 = new Object[0];
	                            throw dij.a("TYPE_PING streamId != 0", v1_2);
	                        }
	                    } else {
	                        Integer v3_12 = new Object[1];
	                        v3_12[0] = Integer.valueOf(v0_2);
	                        throw dij.a("TYPE_PING length != 8: %s", v3_12);
	                    }
	                case 7:
	                    if (v0_2 >= 8) {
	                        if (v3_4 == null) {
	                            Object[] v2_7 = this.a.i();
	                            Integer v3_8 = this.a.i();
	                            java.util.List v4_3 = (v0_2 - 8);
	                            if (dia.b(v3_8) != null) {
	                                java.io.IOException v0_11 = dke.a;
	                                if (v4_3 > null) {
	                                    v0_11 = this.a.c(((long) v4_3));
	                                }
	                                p12.a(v2_7, v0_11);
	                                return v6;
	                            } else {
	                                Object[] v2_8 = new Object[1];
	                                v2_8[0] = Integer.valueOf(v3_8);
	                                throw dij.a("TYPE_GOAWAY unexpected error code: %d", v2_8);
	                            }
	                        } else {
	                            Object[] v1_1 = new Object[0];
	                            throw dij.a("TYPE_GOAWAY streamId != 0", v1_1);
	                        }
	                    } else {
	                        Integer v3_10 = new Object[1];
	                        v3_10[0] = Integer.valueOf(v0_2);
	                        throw dij.a("TYPE_GOAWAY length < 8: %s", v3_10);
	                    }
	                case 8:
	                    if (v0_2 == 4) {
	                        java.util.List v4_2 = (((long) this.a.i()) & 2147483647);
	                        if (v4_2 != 0) {
	                            p12.a(v3_4, v4_2);
	                            return v6;
	                        } else {
	                            Object[] v2_4 = new Object[1];
	                            v2_4[0] = Long.valueOf(v4_2);
	                            throw dij.a("windowSizeIncrement was 0", v2_4);
	                        }
	                    } else {
	                        Integer v3_6 = new Object[1];
	                        v3_6[0] = Integer.valueOf(v0_2);
	                        throw dij.a("TYPE_WINDOW_UPDATE length !=4: %s", v3_6);
	                    }
	                default:
	                    this.a.f(((long) v0_2));
	                    return v6;
	            }
	        } else {
	            Integer v3_20 = new Object[1];
	            v3_20[0] = Integer.valueOf(v0_2);
	            throw dij.a("FRAME_SIZE_ERROR: %s", v3_20);
	        }
	    }
	
	
	    public final void close()
	    {
	        this.a.close();
	        return;
	    }
	
