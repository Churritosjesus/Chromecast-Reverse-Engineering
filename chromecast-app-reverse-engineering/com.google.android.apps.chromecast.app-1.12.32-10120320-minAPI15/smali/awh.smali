.class final Lawh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lavv;


# instance fields
.field private synthetic a:Lawg;


# direct methods
.method constructor <init>(Lawg;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lawh;->a:Lawg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 41
    iget-object v0, p0, Lawh;->a:Lawg;

    .line 2014
    iget-object v0, v0, Lawg;->a:Landroid/os/Handler;

    .line 41
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 42
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lawh;->a:Lawg;

    .line 1014
    iget-object v0, v0, Lawg;->a:Landroid/os/Handler;

    .line 36
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 37
    return-void
.end method
