	private final java.io.OutputStream a
	private final aiw b
	private  c
	private  d
	
	    public agk(java.io.OutputStream p2, aiw p3, boolean p4)
	    {
	        this.c = 1;
	        this.d = 0;
	        this.a = p2;
	        this.b = p3;
	        this.d = p4;
	        return;
	    }
	
	
	    private static RuntimeException a()
	    {
	        return new IllegalArgumentException("value is not a supported type.");
	    }
	
	
	    private void a(String p8, android.net.Uri p9, String p10)
	    {
	        if (p10 == null) {
	            p10 = "content/unknown";
	        }
	        String v0_4;
	        this.a(p8, p8, p10);
	        String v0_2 = afv.f().getContentResolver().openInputStream(p9);
	        if (!(this.a instanceof agy)) {
	            v0_4 = (aji.a(v0_2, this.a) + 0);
	        } else {
	            ((agy) this.a).a(aji.a(p9));
	            v0_4 = 0;
	        }
	        aiw v3_0 = new Object[0];
	        this.b("", v3_0);
	        this.b();
	        if (this.b != null) {
	            String v2_8;
	            aiw v3_1 = this.b;
	            String v2_6 = String.valueOf(p8);
	            if (v2_6.length() == 0) {
	                v2_8 = new String("    ");
	            } else {
	                v2_8 = "    ".concat(v2_6);
	            }
	            Object[] v6_1 = new Object[1];
	            v6_1[0] = Integer.valueOf(v0_4);
	            v3_1.a(v2_8, String.format(java.util.Locale.ROOT, "<Data: %d>", v6_1));
	        }
	        return;
	    }
	
	
	    private void a(String p8, android.os.ParcelFileDescriptor p9, String p10)
	    {
	        if (p10 == null) {
	            p10 = "content/unknown";
	        }
	        String v0_5;
	        this.a(p8, p8, p10);
	        if (!(this.a instanceof agy)) {
	            v0_5 = (aji.a(new android.os.ParcelFileDescriptor$AutoCloseInputStream(p9), this.a) + 0);
	        } else {
	            ((agy) this.a).a(p9.getStatSize());
	            v0_5 = 0;
	        }
	        aiw v3_0 = new Object[0];
	        this.b("", v3_0);
	        this.b();
	        if (this.b != null) {
	            String v2_6;
	            aiw v3_1 = this.b;
	            String v2_4 = String.valueOf(p8);
	            if (v2_4.length() == 0) {
	                v2_6 = new String("    ");
	            } else {
	                v2_6 = "    ".concat(v2_4);
	            }
	            Object[] v6_1 = new Object[1];
	            v6_1[0] = Integer.valueOf(v0_5);
	            v3_1.a(v2_6, String.format(java.util.Locale.ROOT, "<Data: %d>", v6_1));
	        }
	        return;
	    }
	
	
	    private void a(String p6, String p7, String p8)
	    {
	        if (this.d) {
	            String v0_1 = this.a;
	            String v2_0 = new Object[1];
	            v2_0[0] = p6;
	            v0_1.write(String.format("%s=", v2_0).getBytes());
	        } else {
	            Object[] v1_3 = new Object[1];
	            v1_3[0] = p6;
	            this.a("Content-Disposition: form-data; name=\"%s\"", v1_3);
	            if (p7 != null) {
	                Object[] v1_4 = new Object[1];
	                v1_4[0] = p7;
	                this.a("; filename=\"%s\"", v1_4);
	            }
	            Object[] v1_5 = new Object[0];
	            this.b("", v1_5);
	            if (p8 != null) {
	                Object[] v1_7 = new Object[2];
	                v1_7[0] = "Content-Type";
	                v1_7[1] = p8;
	                this.b("%s: %s", v1_7);
	            }
	            Object[] v1_8 = new Object[0];
	            this.b("", v1_8);
	        }
	        return;
	    }
	
	
	    private varargs void a(String p4, Object[] p5)
	    {
	        if (this.d) {
	            this.a.write(java.net.URLEncoder.encode(String.format(java.util.Locale.US, p4, p5), "UTF-8").getBytes());
	        } else {
	            if (this.c) {
	                this.a.write("--".getBytes());
	                this.a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
	                this.a.write("\r\n".getBytes());
	                this.c = 0;
	            }
	            this.a.write(String.format(p4, p5).getBytes());
	        }
	        return;
	    }
	
	
	    private void b()
	    {
	        if (this.d) {
	            this.a.write("&".getBytes());
	        } else {
	            byte[] v1_3 = new Object[1];
	            v1_3[0] = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f";
	            this.b("--%s", v1_3);
	        }
	        return;
	    }
	
	
	    private varargs void b(String p3, Object[] p4)
	    {
	        this.a(p3, p4);
	        if (!this.d) {
	            Object[] v1_1 = new Object[0];
	            this.a("\r\n", v1_1);
	        }
	        return;
	    }
	
	
	    public final void a(String p8, Object p9, aga p10)
	    {
	        if ((this.a instanceof ahb)) {
	            ((ahb) this.a).a(p10);
	        }
	        if (!aga.a(p9)) {
	            if (!(p9 instanceof android.graphics.Bitmap)) {
	                if (!(p9 instanceof byte[])) {
	                    if (!(p9 instanceof android.net.Uri)) {
	                        if (!(p9 instanceof android.os.ParcelFileDescriptor)) {
	                            if (!(p9 instanceof agi)) {
	                                throw agk.a();
	                            } else {
	                                RuntimeException v0_11 = ((agi) p9).b;
	                                String v1_1 = ((agi) p9).a;
	                                if (!(v0_11 instanceof android.os.ParcelFileDescriptor)) {
	                                    if (!(v0_11 instanceof android.net.Uri)) {
	                                        throw agk.a();
	                                    } else {
	                                        this.a(p8, ((android.net.Uri) v0_11), v1_1);
	                                    }
	                                } else {
	                                    this.a(p8, ((android.os.ParcelFileDescriptor) v0_11), v1_1);
	                                }
	                            }
	                        } else {
	                            this.a(p8, ((android.os.ParcelFileDescriptor) p9), 0);
	                        }
	                    } else {
	                        this.a(p8, ((android.net.Uri) p9), 0);
	                    }
	                } else {
	                    this.a(p8, p8, "content/unknown");
	                    this.a.write(((byte[]) p9));
	                    String v1_2 = new Object[0];
	                    this.b("", v1_2);
	                    this.b();
	                    if (this.b != null) {
	                        RuntimeException v0_21;
	                        String v1_3 = this.b;
	                        RuntimeException v0_19 = String.valueOf(p8);
	                        if (v0_19.length() == 0) {
	                            v0_21 = new String("    ");
	                        } else {
	                            v0_21 = "    ".concat(v0_19);
	                        }
	                        Object[] v4_1 = new Object[1];
	                        v4_1[0] = Integer.valueOf(((byte[]) p9).length);
	                        v1_3.a(v0_21, String.format(java.util.Locale.ROOT, "<Data: %d>", v4_1));
	                    }
	                }
	            } else {
	                this.a(p8, p8, "image/png");
	                ((android.graphics.Bitmap) p9).compress(android.graphics.Bitmap$CompressFormat.PNG, 100, this.a);
	                String v1_5 = new Object[0];
	                this.b("", v1_5);
	                this.b();
	                if (this.b != null) {
	                    RuntimeException v0_28;
	                    String v1_6 = this.b;
	                    RuntimeException v0_26 = String.valueOf(p8);
	                    if (v0_26.length() == 0) {
	                        v0_28 = new String("    ");
	                    } else {
	                        v0_28 = "    ".concat(v0_26);
	                    }
	                    v1_6.a(v0_28, "<Image>");
	                }
	            }
	        } else {
	            this.a(p8, aga.b(p9));
	        }
	        return;
	    }
	
	
	    public final void a(String p5, String p6)
	    {
	        this.a(p5, 0, 0);
	        aiw v1_1 = new Object[1];
	        v1_1[0] = p6;
	        this.b("%s", v1_1);
	        this.b();
	        if (this.b != null) {
	            String v0_5;
	            aiw v1_2 = this.b;
	            String v0_3 = String.valueOf(p5);
	            if (v0_3.length() == 0) {
	                v0_5 = new String("    ");
	            } else {
	                v0_5 = "    ".concat(v0_3);
	            }
	            v1_2.a(v0_5, p6);
	        }
	        return;
	    }
	
	
	    public final void a(String p9, org.json.JSONArray p10, java.util.Collection p11)
	    {
	        if ((this.a instanceof ahb)) {
	            String v0_3 = ((ahb) this.a);
	            this.a(p9, 0, 0);
	            String v2_0 = new Object[0];
	            this.a("[", v2_0);
	            java.util.Iterator v4 = p11.iterator();
	            String v2_1 = 0;
	            while (v4.hasNext()) {
	                int v1_6 = ((aga) v4.next());
	                String v5_0 = p10.getJSONObject(v2_1);
	                v0_3.a(v1_6);
	                if (v2_1 <= null) {
	                    Object[] v6_0 = new Object[1];
	                    v6_0[0] = v5_0.toString();
	                    this.a("%s", v6_0);
	                } else {
	                    Object[] v6_1 = new Object[1];
	                    v6_1[0] = v5_0.toString();
	                    this.a(",%s", v6_1);
	                }
	                v2_1++;
	            }
	            int v1_3 = new Object[0];
	            this.a("]", v1_3);
	            if (this.b != null) {
	                String v0_8;
	                int v1_4 = this.b;
	                String v0_6 = String.valueOf(p9);
	                if (v0_6.length() == 0) {
	                    v0_8 = new String("    ");
	                } else {
	                    v0_8 = "    ".concat(v0_6);
	                }
	                v1_4.a(v0_8, p10.toString());
	            }
	        } else {
	            this.a(p9, p10.toString());
	        }
	        return;
	    }
	
