.class public final Lbys;
.super Lbzj;


# instance fields
.field private a:Lbyo;


# direct methods
.method public constructor <init>(Lbyo;)V
    .locals 0

    invoke-direct {p0}, Lbzj;-><init>()V

    iput-object p1, p0, Lbys;->a:Lbyo;

    return-void
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 0
    iget-object v0, p0, Lbys;->a:Lbyo;

    const-string v1, "onAccountValidationComplete can be called only once per call to validateAccount"

    invoke-static {v0, v1}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbys;->a:Lbyo;

    .line 1000
    iget-object v1, v0, Lbyo;->i:Landroid/os/Handler;

    iget-object v2, v0, Lbyo;->i:Landroid/os/Handler;

    const/4 v3, 0x5

    new-instance v4, Lbyw;

    invoke-direct {v4, v0, p1, p2}, Lbyw;-><init>(Lbyo;ILandroid/os/Bundle;)V

    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2000
    const/4 v0, 0x0

    iput-object v0, p0, Lbys;->a:Lbyo;

    .line 0
    return-void
.end method

.method public final a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbys;->a:Lbyo;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbys;->a:Lbyo;

    invoke-virtual {v0, p1, p2, p3}, Lbyo;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    .line 3000
    const/4 v0, 0x0

    iput-object v0, p0, Lbys;->a:Lbyo;

    .line 0
    return-void
.end method
