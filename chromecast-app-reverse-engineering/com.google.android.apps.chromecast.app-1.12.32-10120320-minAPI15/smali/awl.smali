.class public final Lawl;
.super Latt;
.source "PG"


# instance fields
.field private n:Laea;


# direct methods
.method public constructor <init>(Lday;Laea;Ladz;)V
    .locals 3

    .prologue
    .line 32
    const-string v0, "ConfigContent"

    const-string v1, "/config"

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-static {p1}, Lday;->a(Ldew;)[B

    move-result-object v2

    .line 32
    invoke-direct {p0, v0, v1, v2, p3}, Latt;-><init>(Ljava/lang/String;Ljava/lang/String;[BLadz;)V

    .line 34
    iput-object p2, p0, Lawl;->n:Laea;

    .line 35
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 18
    check-cast p1, [B

    .line 1050
    :try_start_0
    iget-object v1, p0, Lawl;->n:Laea;

    .line 1358
    new-instance v0, Ldaz;

    invoke-direct {v0}, Ldaz;-><init>()V

    invoke-static {v0, p1}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldaz;

    .line 1050
    invoke-interface {v1, v0}, Laea;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 1053
    :goto_0
    return-void

    .line 1051
    :catch_0
    move-exception v0

    .line 1052
    const-string v1, "AppConfigRequest"

    const-string v2, "Could not read server response"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    return-object v0
.end method
