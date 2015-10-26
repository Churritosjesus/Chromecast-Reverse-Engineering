.class public final Lbdp;
.super Lbfp;
.source "PG"


# instance fields
.field a:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 27
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 10

    .prologue
    const/4 v0, -0x1

    const/4 v2, 0x0

    const/4 v1, -0x3

    .line 34
    :try_start_0
    const-string v3, "configured_networks"

    sget v4, Lbdp;->c:I

    invoke-virtual {p0, v3, v4}, Lbdp;->a(Ljava/lang/String;I)Lbfq;

    move-result-object v3

    .line 35
    invoke-interface {v3}, Lbfq;->b()I

    move-result v4

    const/16 v5, 0xc8

    if-eq v4, v5, :cond_0

    .line 76
    :goto_0
    return v0

    .line 38
    :cond_0
    invoke-interface {v3}, Lbfq;->c()Lbfc;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    const-string v3, "application/json"

    .line 1092
    iget-object v4, v0, Lbfc;->b:Ljava/lang/String;

    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    move v0, v1

    .line 47
    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    const/4 v0, -0x2

    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v0}, Lbfc;->a()Ljava/lang/String;

    move-result-object v0

    .line 50
    if-nez v0, :cond_3

    move v0, v1

    .line 51
    goto :goto_0

    .line 54
    :cond_3
    :try_start_1
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 55
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    move v0, v2

    .line 58
    :goto_1
    if-ge v0, v5, :cond_4

    .line 59
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 61
    new-instance v7, Lbfs;

    invoke-direct {v7}, Lbfs;-><init>()V

    .line 62
    const-string v8, "ssid"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1126
    iput-object v8, v7, Lbfs;->a:Ljava/lang/String;

    .line 63
    const-string v8, "wpa_auth"

    sget-object v9, Lbfu;->a:Lbfu;

    iget v9, v9, Lbfu;->j:I

    .line 64
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    .line 63
    invoke-static {v8}, Lbfu;->a(I)Lbfu;

    move-result-object v8

    .line 1134
    iput-object v8, v7, Lbfs;->b:Lbfu;

    .line 65
    const-string v8, "wpa_cipher"

    sget-object v9, Lbfv;->a:Lbfv;

    iget v9, v9, Lbfv;->b:I

    .line 66
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    .line 65
    invoke-static {v8}, Lbfv;->a(I)Lbfv;

    move-result-object v8

    .line 1142
    iput-object v8, v7, Lbfs;->c:Lbfv;

    .line 67
    const-string v8, "wpa_id"

    const/4 v9, 0x0

    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 1150
    iput v6, v7, Lbfs;->d:I

    .line 68
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 71
    :cond_4
    iput-object v4, p0, Lbdp;->a:Ljava/util/List;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move v0, v2

    .line 76
    goto :goto_0

    .line 73
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 42
    :catch_2
    move-exception v1

    goto :goto_0
.end method
