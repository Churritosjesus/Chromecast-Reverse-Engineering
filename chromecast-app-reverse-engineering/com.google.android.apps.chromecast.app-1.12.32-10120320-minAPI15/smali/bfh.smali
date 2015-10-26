.class public final Lbfh;
.super Lbfp;
.source "PG"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 29
    iput p2, p0, Lbfh;->a:I

    .line 30
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    const/4 v0, -0x1

    const/4 v1, -0x3

    .line 35
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 38
    :try_start_0
    const-string v3, "sound_id"

    iget v4, p0, Lbfh;->a:I

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    .line 42
    :goto_0
    :try_start_1
    const-string v3, "play_sound"

    .line 43
    invoke-static {v2}, Lbfc;->a(Lorg/json/JSONObject;)Lbfc;

    move-result-object v2

    sget v4, Lbfh;->c:I

    .line 42
    invoke-virtual {p0, v3, v2, v4}, Lbfh;->a(Ljava/lang/String;Lbfc;I)Lbfq;

    move-result-object v2

    .line 44
    invoke-interface {v2}, Lbfq;->b()I

    move-result v3

    const/16 v4, 0xc8

    if-eq v3, v4, :cond_0

    .line 71
    :goto_1
    return v0

    .line 47
    :cond_0
    invoke-interface {v2}, Lbfq;->c()Lbfc;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 55
    if-eqz v0, :cond_1

    const-string v2, "application/json"

    .line 1092
    iget-object v3, v0, Lbfc;->b:Ljava/lang/String;

    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    move v0, v1

    .line 56
    goto :goto_1

    .line 49
    :catch_0
    move-exception v0

    const/4 v0, -0x2

    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {v0}, Lbfc;->a()Ljava/lang/String;

    move-result-object v0

    .line 59
    if-nez v0, :cond_3

    move v0, v1

    .line 60
    goto :goto_1

    .line 64
    :cond_3
    :try_start_2
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 66
    const-string v0, "volume"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 67
    const-string v0, "duration"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 69
    const/4 v0, 0x0

    goto :goto_1

    .line 71
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_1

    .line 51
    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v3

    goto :goto_0
.end method
