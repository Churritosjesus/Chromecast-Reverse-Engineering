.class public final Lbdd;
.super Lbfp;
.source "PG"


# instance fields
.field private final a:Lbfs;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbfs;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 32
    iput-object p2, p0, Lbdd;->a:Lbfs;

    .line 33
    return-void
.end method

.method public static a(Lbfs;)Lorg/json/JSONObject;
    .locals 3

    .prologue
    .line 63
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 65
    :try_start_0
    const-string v0, "ssid"

    .line 1130
    iget-object v2, p0, Lbfs;->a:Ljava/lang/String;

    .line 65
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    const-string v0, "wpa_auth"

    .line 1138
    iget-object v2, p0, Lbfs;->b:Lbfu;

    .line 66
    iget v2, v2, Lbfu;->j:I

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1146
    iget-object v0, p0, Lbfs;->c:Lbfv;

    .line 67
    if-eqz v0, :cond_0

    .line 68
    const-string v0, "wpa_cipher"

    .line 2146
    iget-object v2, p0, Lbfs;->c:Lbfv;

    .line 68
    iget v2, v2, Lbfv;->b:I

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 70
    :cond_0
    const-string v0, "wpa_id"

    .line 2154
    iget v2, p0, Lbfs;->d:I

    .line 70
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 71
    const-string v2, "scan_ssid"

    .line 2178
    iget-boolean v0, p0, Lbfs;->g:Z

    .line 71
    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 3162
    iget-object v0, p0, Lbfs;->e:Ljava/lang/String;

    .line 72
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3170
    iget-boolean v0, p0, Lbfs;->f:Z

    .line 73
    if-eqz v0, :cond_3

    .line 74
    const-string v0, "enc_passwd"

    .line 4162
    :goto_1
    iget-object v2, p0, Lbfs;->e:Ljava/lang/String;

    .line 73
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    :cond_1
    :goto_2
    return-object v1

    .line 71
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 75
    :cond_3
    const-string v0, "passwd"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    const/4 v1, -0x1

    const/4 v0, 0x0

    .line 38
    iget-object v2, p0, Lbdd;->a:Lbfs;

    invoke-static {v2}, Lbdd;->a(Lbfs;)Lorg/json/JSONObject;

    move-result-object v2

    .line 41
    :try_start_0
    const-string v3, "connect_wifi"

    .line 42
    invoke-static {v2}, Lbfc;->a(Lorg/json/JSONObject;)Lbfc;

    move-result-object v2

    sget v4, Lbdd;->c:I

    .line 41
    invoke-virtual {p0, v3, v2, v4}, Lbdd;->a(Ljava/lang/String;Lbfc;I)Lbfq;

    move-result-object v2

    .line 43
    invoke-interface {v2}, Lbfq;->b()I
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_0

    .line 57
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 44
    goto :goto_0

    .line 48
    :catch_0
    move-exception v2

    .line 49
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2}, Lorg/apache/http/conn/HttpHostConnectException;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v0

    move v0, v1

    .line 51
    goto :goto_0

    .line 57
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 55
    :catch_2
    move-exception v1

    goto :goto_0

    .line 47
    :catch_3
    move-exception v1

    goto :goto_0
.end method
