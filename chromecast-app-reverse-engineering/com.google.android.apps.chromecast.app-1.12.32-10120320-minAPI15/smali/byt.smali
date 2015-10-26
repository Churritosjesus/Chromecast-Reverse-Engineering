.class public final Lbyt;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private synthetic a:Lbyo;


# direct methods
.method public constructor <init>(Lbyo;)V
    .locals 0

    iput-object p1, p0, Lbyt;->a:Lbyo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .prologue
    .line 0
    const-string v0, "Expecting a valid IBinder"

    invoke-static {p2, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbyt;->a:Lbyo;

    invoke-static {p2}, Lbzm;->a(Landroid/os/IBinder;)Lbzl;

    move-result-object v1

    invoke-static {v0, v1}, Lbyo;->a(Lbyo;Lbzl;)Lbzl;

    iget-object v0, p0, Lbyt;->a:Lbyo;

    .line 1000
    iget-object v1, v0, Lbyo;->i:Landroid/os/Handler;

    iget-object v2, v0, Lbyo;->i:Landroid/os/Handler;

    const/4 v3, 0x6

    new-instance v4, Lbyv;

    invoke-direct {v4, v0}, Lbyv;-><init>(Lbyo;)V

    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 0
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    iget-object v0, p0, Lbyt;->a:Lbyo;

    iget-object v0, v0, Lbyo;->i:Landroid/os/Handler;

    iget-object v1, p0, Lbyt;->a:Lbyo;

    iget-object v1, v1, Lbyo;->i:Landroid/os/Handler;

    const/4 v2, 0x4

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
