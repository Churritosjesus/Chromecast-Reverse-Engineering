.class public final Lbfi;
.super Lbfp;
.source "PG"


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 46
    iput p2, p0, Lbfi;->a:I

    .line 47
    return-void
.end method

.method public static a(I)Lorg/json/JSONObject;
    .locals 3

    .prologue
    .line 66
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 68
    sget-object v0, Lbfj;->a:[I

    add-int/lit8 v2, p0, -0x1

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    .line 83
    const-string v0, "now"

    .line 87
    :goto_0
    :try_start_0
    const-string v2, "params"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :goto_1
    return-object v1

    .line 70
    :pswitch_0
    const-string v0, "fdr"

    goto :goto_0

    .line 73
    :pswitch_1
    const-string v0, "ota"

    goto :goto_0

    .line 76
    :pswitch_2
    const-string v0, "idle"

    goto :goto_0

    .line 79
    :pswitch_3
    const-string v0, "set recovery"

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    .line 68
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    const/4 v0, -0x1

    .line 51
    iget v1, p0, Lbfi;->a:I

    invoke-static {v1}, Lbfi;->a(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 54
    :try_start_0
    const-string v2, "reboot"

    invoke-static {v1}, Lbfc;->a(Lorg/json/JSONObject;)Lbfc;

    move-result-object v1

    sget v3, Lbfi;->c:I

    invoke-virtual {p0, v2, v1, v3}, Lbfi;->a(Ljava/lang/String;Lbfc;I)Lbfq;

    move-result-object v1

    .line 56
    invoke-interface {v1}, Lbfq;->b()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    .line 57
    const/4 v0, 0x0

    .line 61
    :cond_0
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, -0x2

    goto :goto_0

    .line 59
    :catch_1
    move-exception v1

    goto :goto_0
.end method
