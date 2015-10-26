.class public final Lcjr;
.super Lbyo;

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field a:Lbve;

.field final b:Lcjz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lbwg;Lbwh;)V
    .locals 6

    const/16 v3, 0x1b

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lbyo;-><init>(Landroid/content/Context;Landroid/os/Looper;ILbwg;Lbwh;)V

    new-instance v0, Lcjs;

    invoke-direct {v0, p0}, Lcjs;-><init>(Lcjr;)V

    iput-object v0, p0, Lcjr;->b:Lcjz;

    return-void
.end method

.method static synthetic a(Lcjr;)Lbve;
    .locals 1

    iget-object v0, p0, Lcjr;->a:Lbve;

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    .prologue
    .line 0
    .line 1000
    invoke-static {p1}, Lcjx;->a(Landroid/os/IBinder;)Lcjw;

    move-result-object v0

    .line 0
    return-object v0
.end method

.method public final a()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcjr;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcjw;

    invoke-interface {v0}, Lcjw;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Lbyo;->a()V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-super {p0}, Lbyo;->a()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-super {p0}, Lbyo;->a()V

    throw v0
.end method

.method public final binderDied()V
    .locals 0

    return-void
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.cast_mirroring.service.START"

    return-object v0
.end method

.method protected final d()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.cast_mirroring.internal.ICastMirroringService"

    return-object v0
.end method
