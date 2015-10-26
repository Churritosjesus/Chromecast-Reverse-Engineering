.class public final Lava;
.super Lbdm;
.source "PG"


# instance fields
.field a:Lauv;

.field b:Lbdf;

.field private final d:Lblp;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lauv;Lbdf;Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 47
    .line 1239
    iget v0, p2, Lbdf;->a:I

    .line 47
    invoke-direct {p0, v0}, Lbdm;-><init>(I)V

    .line 48
    new-instance v0, Lblp;

    const-string v1, "BleDeviceConnector"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lava;->d:Lblp;

    .line 49
    iput-object p1, p0, Lava;->a:Lauv;

    .line 50
    iput-object p2, p0, Lava;->b:Lbdf;

    .line 51
    iput-object p3, p0, Lava;->e:Landroid/content/Context;

    .line 52
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 56
    iget-object v0, p0, Lava;->a:Lauv;

    .line 1337
    iget-object v1, v0, Lauv;->f:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    .line 1338
    iget-object v1, v0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    if-eqz v1, :cond_0

    .line 1339
    iget-object v1, v0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 1340
    iget-object v0, v0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 57
    :cond_0
    return-void
.end method

.method public final a(ILbdn;)V
    .locals 6

    .prologue
    .line 303
    new-instance v0, Lavs;

    new-instance v1, Lave;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, p0, v2, p2}, Lave;-><init>(Lava;Landroid/os/Looper;Lbdn;)V

    invoke-direct {v0, p1, v1}, Lavs;-><init>(ILandroid/os/Handler;)V

    .line 317
    iget-object v1, p0, Lava;->a:Lauv;

    .line 4025
    iget v2, v0, Lavs;->a:I

    invoke-static {v2}, Lbfi;->a(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 4027
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    .line 4028
    iget-object v3, v0, Lavs;->b:Landroid/os/Handler;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    .line 4030
    :cond_0
    new-instance v3, Lawi;

    sget-object v4, Lavp;->u:Ljava/util/UUID;

    new-instance v5, Lavt;

    invoke-direct {v5, v0}, Lavt;-><init>(Lavs;)V

    .line 4042
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-direct {v3, v4, v5, v0}, Lawi;-><init>(Ljava/util/UUID;Lavv;[B)V

    .line 4043
    invoke-virtual {v1, v3}, Lauv;->a(Lavr;)V

    .line 318
    return-void
.end method

.method public final a(ILjava/util/Locale;ZLbdn;)V
    .locals 6

    .prologue
    .line 62
    if-eqz p2, :cond_0

    .line 63
    new-instance v0, Lawj;

    new-instance v1, Lavb;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, p0, v2, p4}, Lavb;-><init>(Lava;Landroid/os/Looper;Lbdn;)V

    sget-object v2, Lavp;->a:Ljava/util/UUID;

    .line 77
    invoke-static {p2}, Lblj;->c(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lawj;-><init>(Landroid/os/Handler;Ljava/util/UUID;[BJ)V

    .line 78
    iget-object v1, p0, Lava;->a:Lauv;

    invoke-virtual {v0, v1}, Lawj;->a(Lauv;)V

    .line 79
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 81
    :cond_0
    new-instance v0, Laus;

    new-instance v1, Lavf;

    .line 82
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, p0, v2, p4}, Lavf;-><init>(Lava;Landroid/os/Looper;Lbdn;)V

    invoke-direct {v0, p1, v1}, Laus;-><init>(ILandroid/os/Handler;)V

    .line 99
    iget-object v1, p0, Lava;->a:Lauv;

    invoke-virtual {v0, v1}, Laus;->a(Lauv;)V

    .line 100
    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Lbdn;)V
    .locals 6

    .prologue
    .line 176
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 177
    new-instance v0, Lawj;

    new-instance v1, Lavi;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, p0, v2, p3}, Lavi;-><init>(Lava;Landroid/os/Looper;Lbdn;)V

    sget-object v2, Lavp;->n:Ljava/util/UUID;

    sget-object v3, Lblj;->a:Ljava/nio/charset/Charset;

    .line 191
    invoke-virtual {p2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    iget-object v4, p0, Lava;->e:Landroid/content/Context;

    .line 192
    invoke-static {v4}, Lblf;->V(Landroid/content/Context;)J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lawj;-><init>(Landroid/os/Handler;Ljava/util/UUID;[BJ)V

    .line 193
    iget-object v1, p0, Lava;->a:Lauv;

    invoke-virtual {v0, v1}, Lawj;->a(Lauv;)V

    .line 197
    :goto_0
    return-void

    .line 195
    :cond_0
    invoke-virtual {p0, p3}, Lava;->c(Lbdn;)V

    goto :goto_0
.end method

.method public final a(Lbdn;)V
    .locals 4

    .prologue
    .line 105
    new-instance v0, Laus;

    const/16 v1, 0xa0

    new-instance v2, Lavg;

    .line 107
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, p0, v3, p1}, Lavg;-><init>(Lava;Landroid/os/Looper;Lbdn;)V

    invoke-direct {v0, v1, v2}, Laus;-><init>(ILandroid/os/Handler;)V

    .line 123
    iget-object v1, p0, Lava;->a:Lauv;

    invoke-virtual {v0, v1}, Laus;->a(Lauv;)V

    .line 124
    return-void
.end method

.method public final a(Lbdn;I)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 265
    new-instance v2, Lawe;

    new-instance v0, Lavc;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lavc;-><init>(Lava;Landroid/os/Looper;Lbdn;)V

    invoke-direct {v2, v0, p2}, Lawe;-><init>(Landroid/os/Handler;I)V

    .line 279
    iget-object v3, p0, Lava;->a:Lauv;

    .line 2035
    const/4 v1, 0x0

    .line 2037
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2038
    const-string v4, "sound_id"

    iget v5, v2, Lawe;->b:I

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 2039
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2040
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v0, v4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2046
    :goto_0
    if-nez v1, :cond_0

    .line 2047
    iget-object v0, v2, Lawe;->a:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 2048
    :goto_1
    return-void

    .line 2041
    :catch_0
    move-exception v0

    .line 2043
    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v7

    .line 2044
    iget-object v0, v2, Lawe;->a:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 2050
    :cond_0
    new-instance v0, Lawi;

    sget-object v4, Lavp;->b:Ljava/util/UUID;

    new-instance v5, Lawf;

    invoke-direct {v5, v2}, Lawf;-><init>(Lawe;)V

    sget-object v2, Lblj;->a:Ljava/nio/charset/Charset;

    .line 2062
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-direct {v0, v4, v5, v1}, Lawi;-><init>(Ljava/util/UUID;Lavv;[B)V

    .line 2063
    invoke-virtual {v3, v0}, Lauv;->a(Lavr;)V

    goto :goto_1
.end method

.method public final a(Lbfs;Lbdn;)V
    .locals 6

    .prologue
    .line 284
    new-instance v0, Lawg;

    new-instance v1, Lavd;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, p0, v2, p2}, Lavd;-><init>(Lava;Landroid/os/Looper;Lbdn;)V

    invoke-direct {v0, v1, p1}, Lawg;-><init>(Landroid/os/Handler;Lbfs;)V

    .line 298
    iget-object v1, p0, Lava;->a:Lauv;

    .line 3029
    iget-object v2, v0, Lawg;->b:Lbfs;

    invoke-static {v2}, Lbdd;->a(Lbfs;)Lorg/json/JSONObject;

    move-result-object v2

    .line 3031
    new-instance v3, Lawi;

    sget-object v4, Lavp;->m:Ljava/util/UUID;

    new-instance v5, Lawh;

    invoke-direct {v5, v0}, Lawh;-><init>(Lawg;)V

    .line 3043
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-direct {v3, v4, v5, v0}, Lawi;-><init>(Ljava/util/UUID;Lavv;[B)V

    .line 3044
    invoke-virtual {v1, v3}, Lauv;->a(Lavr;)V

    .line 299
    return-void
.end method

.method public final b(Lbdn;)V
    .locals 4

    .prologue
    .line 149
    new-instance v0, Laus;

    const/4 v1, 0x1

    new-instance v2, Lavh;

    .line 151
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, p0, v3, p1}, Lavh;-><init>(Lava;Landroid/os/Looper;Lbdn;)V

    invoke-direct {v0, v1, v2}, Laus;-><init>(ILandroid/os/Handler;)V

    .line 165
    iget-object v1, p0, Lava;->a:Lauv;

    invoke-virtual {v0, v1}, Laus;->a(Lauv;)V

    .line 166
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 323
    const/4 v0, 0x0

    return v0
.end method

.method c(Lbdn;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 200
    new-instance v2, Lavm;

    sget-object v0, Lavp;->k:Ljava/util/UUID;

    sget-object v1, Lavp;->j:Ljava/util/UUID;

    new-instance v3, Lavj;

    .line 203
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, p0, v4, p1}, Lavj;-><init>(Lava;Landroid/os/Looper;Lbdn;)V

    invoke-direct {v2, v0, v1, v3}, Lavm;-><init>(Ljava/util/UUID;Ljava/util/UUID;Landroid/os/Handler;)V

    .line 225
    new-instance v0, Lawj;

    new-instance v1, Lavk;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, p0, v3, v2, p1}, Lavk;-><init>(Lava;Landroid/os/Looper;Lavm;Lbdn;)V

    sget-object v2, Lavp;->l:Ljava/util/UUID;

    new-array v3, v7, [B

    aput-byte v7, v3, v8

    iget-object v4, p0, Lava;->e:Landroid/content/Context;

    .line 239
    invoke-static {v4}, Lblf;->U(Landroid/content/Context;)J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lawj;-><init>(Landroid/os/Handler;Ljava/util/UUID;[BJ)V

    .line 240
    new-instance v6, Lawj;

    new-instance v1, Lavl;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, p0, v2, v0, p1}, Lavl;-><init>(Lava;Landroid/os/Looper;Lawj;Lbdn;)V

    sget-object v2, Lavp;->l:Ljava/util/UUID;

    new-array v3, v7, [B

    aput-byte v7, v3, v8

    iget-object v0, p0, Lava;->e:Landroid/content/Context;

    .line 254
    invoke-static {v0}, Lblf;->U(Landroid/content/Context;)J

    move-result-wide v4

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lawj;-><init>(Landroid/os/Handler;Ljava/util/UUID;[BJ)V

    .line 255
    iget-object v0, p0, Lava;->a:Lauv;

    invoke-virtual {v6, v0}, Lawj;->a(Lauv;)V

    .line 256
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 328
    const/4 v0, 0x0

    return v0
.end method

.method public final d(Lbdn;)V
    .locals 1

    .prologue
    .line 260
    const/4 v0, -0x7

    invoke-interface {p1, v0}, Lbdn;->b_(I)V

    .line 261
    return-void
.end method
