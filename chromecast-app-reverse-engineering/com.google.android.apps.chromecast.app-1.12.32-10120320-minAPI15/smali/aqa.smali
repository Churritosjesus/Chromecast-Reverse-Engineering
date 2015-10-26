.class final Laqa;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbtd;


# instance fields
.field private synthetic a:Lapu;


# direct methods
.method constructor <init>(Lapu;)V
    .locals 0

    .prologue
    .line 221
    iput-object p1, p0, Laqa;->a:Lapu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 225
    const-string v0, "ERROR"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Laqa;->a:Lapu;

    invoke-static {v0}, Lapu;->e(Lapu;)Lblp;

    .line 227
    iget-object v0, p0, Laqa;->a:Lapu;

    invoke-static {v0}, Lapu;->c(Lapu;)V

    .line 240
    :goto_0
    return-void

    .line 229
    :cond_0
    iget-object v0, p0, Laqa;->a:Lapu;

    invoke-static {v0}, Lapu;->e(Lapu;)Lblp;

    new-array v0, v3, [Ljava/lang/Object;

    aput-object p2, v0, v2

    .line 230
    iget-object v0, p0, Laqa;->a:Lapu;

    invoke-static {v0, v2}, Lapu;->a(Lapu;Z)Z

    .line 232
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 233
    const-string v1, "code"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 234
    iget-object v1, p0, Laqa;->a:Lapu;

    invoke-static {v1, v0}, Lapu;->b(Lapu;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 236
    :catch_0
    move-exception v0

    iget-object v0, p0, Laqa;->a:Lapu;

    invoke-static {v0}, Lapu;->e(Lapu;)Lblp;

    new-array v0, v3, [Ljava/lang/Object;

    aput-object p2, v0, v2

    .line 237
    iget-object v0, p0, Laqa;->a:Lapu;

    invoke-static {v0}, Lapu;->c(Lapu;)V

    goto :goto_0
.end method
