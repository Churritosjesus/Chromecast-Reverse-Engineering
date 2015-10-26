.class public final Lauk;
.super Latt;
.source "PG"


# instance fields
.field private final n:Laea;


# direct methods
.method public constructor <init>(Ljava/lang/String;Laea;Ladz;)V
    .locals 2

    .prologue
    .line 27
    const-string v0, "LoadDevices"

    const-string v1, "/devices"

    invoke-static {p1, v1}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p3}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;Ladz;)V

    .line 29
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Lasr;->a(Landroid/content/Context;)Laec;

    move-result-object v0

    .line 1202
    iput-object v0, p0, Lads;->i:Laec;

    .line 30
    iput-object p2, p0, Lauk;->n:Laea;

    .line 31
    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 16
    check-cast p1, [B

    .line 2036
    iget-object v0, p0, Lauk;->n:Laea;

    if-eqz v0, :cond_0

    .line 2039
    const/4 v1, 0x0

    .line 2040
    if-eqz p1, :cond_1

    .line 2042
    :try_start_0
    invoke-static {p1}, Ldbs;->a([B)Ldbs;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 2047
    :goto_0
    iget-object v1, p0, Lauk;->n:Laea;

    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V

    .line 16
    :cond_0
    return-void

    .line 2043
    :catch_0
    move-exception v0

    .line 2044
    const-string v2, "LoadDevices"

    const-string v3, "Could not load backdrop device list: "

    invoke-virtual {v0}, Ldev;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    const-string v0, "oauth2:https://www.google.com/accounts/OAuthLogin"

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    return-object v0
.end method
